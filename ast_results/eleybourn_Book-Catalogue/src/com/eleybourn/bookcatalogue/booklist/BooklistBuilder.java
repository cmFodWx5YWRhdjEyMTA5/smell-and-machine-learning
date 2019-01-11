// isComment
package com.eleybourn.bookcatalogue.booklist;

import static com.eleybourn.bookcatalogue.CatalogueDBAdapter.EMPTY_STRING_ARRAY;
import static com.eleybourn.bookcatalogue.CatalogueDBAdapter.KEY_DATE_PUBLISHED;
import static com.eleybourn.bookcatalogue.CatalogueDBAdapter.KEY_LOANED_TO;
import static com.eleybourn.bookcatalogue.CatalogueDBAdapter.encodeString;
import static com.eleybourn.bookcatalogue.booklist.BooklistGroup.RowKinds.*;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ABSOLUTE_POSITION;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ADDED_DATE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ADDED_DAY;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ADDED_MONTH;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ADDED_YEAR;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_AUTHOR_FORMATTED;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_AUTHOR_ID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_AUTHOR_POSITION;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_AUTHOR_SORT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_BOOK;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_BOOKSHELF_ID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_BOOKSHELF_NAME;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_BOOK_COUNT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_BOOK_UUID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_EXPANDED;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_FAMILY_NAME;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_FORMAT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_GENRE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_GIVEN_NAMES;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_KIND;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LANGUAGE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LAST_UPDATE_DATE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LEVEL;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LOANED_TO;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LOANED_TO_SORT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_LOCATION;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_MARK;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_PRIMARY_SERIES_COUNT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_PUBLICATION_MONTH;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_PUBLICATION_YEAR;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_PUBLISHER;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_RATING;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ_DAY;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ_END;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ_MONTH;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ_STATUS;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_READ_YEAR;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_REAL_ROW_ID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_ROOT_KEY;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_SERIES_ID;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_SERIES_NAME;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_SERIES_NUM;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_SERIES_NUM_FLOAT;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_SERIES_POSITION;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_TITLE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_TITLE_LETTER;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_UPDATE_DAY;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_UPDATE_YEAR;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_UPDATE_MONTH;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.DOM_VISIBLE;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_AUTHORS;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOKS;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOKSHELF;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOKS_FTS;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOK_AUTHOR;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOK_BOOKSHELF;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOK_LIST_DEFN;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOK_LIST_NODE_SETTINGS;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_BOOK_SERIES;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_LOAN;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_ROW_NAVIGATOR_DEFN;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_ROW_NAVIGATOR_FLATTENED_DEFN;
import static com.eleybourn.bookcatalogue.booklist.DatabaseDefinitions.TBL_SERIES;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map.Entry;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import com.eleybourn.bookcatalogue.BookCatalogueApp;
import com.eleybourn.bookcatalogue.CatalogueDBAdapter;
import com.eleybourn.bookcatalogue.OtherPreferences;
import com.eleybourn.bookcatalogue.R;
import com.eleybourn.bookcatalogue.booklist.BooklistGroup.BooklistAuthorGroup;
import com.eleybourn.bookcatalogue.booklist.BooklistGroup.BooklistSeriesGroup;
import com.eleybourn.bookcatalogue.booklist.BooklistStyle.CompoundKey;
import com.eleybourn.bookcatalogue.database.DbSync.SynchronizedDb;
import com.eleybourn.bookcatalogue.database.DbSync.SynchronizedStatement;
import com.eleybourn.bookcatalogue.database.DbSync.Synchronizer.SyncLock;
import com.eleybourn.bookcatalogue.database.DbUtils.DomainDefinition;
import com.eleybourn.bookcatalogue.database.DbUtils.JoinContext;
import com.eleybourn.bookcatalogue.database.DbUtils.TableDefinition;
import com.eleybourn.bookcatalogue.database.DbUtils.TableDefinition.TableTypes;
import com.eleybourn.bookcatalogue.database.SqlStatementManager;
import com.eleybourn.bookcatalogue.debug.Tracker;
import com.eleybourn.bookcatalogue.utils.Logger;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    private static Integer isVariable = isIntegerConstant;

    /**
     * isComment
     */
    private class isClassOrIsInterface {

        /**
         * isComment
         */
        DomainDefinition isVariable;

        /**
         * isComment
         */
        String isVariable;

        /**
         * isComment
         */
        boolean isVariable;
    }

    /**
     * isComment
     */
    private final SqlStatementManager isVariable;

    /**
     * isComment
     */
    private final SynchronizedDb isVariable;

    /**
     * isComment
     */
    private final int isVariable;

    /**
     * isComment
     */
    // isComment
    /**
     * isComment
     */
    private Hashtable<String, ExtraDomainDetails> isVariable = new Hashtable<String, ExtraDomainDetails>();

    /**
     * isComment
     */
    private final BooklistStyle isVariable;

    /**
     * isComment
     */
    private TableDefinition isVariable;

    /**
     * isComment
     */
    private TableDefinition isVariable;

    /**
     * isComment
     */
    private SummaryBuilder isVariable = null;

    /**
     * isComment
     */
    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    private ArrayList<SynchronizedStatement> isVariable = null;

    /**
     * isComment
     */
    private static Integer isVariable = isIntegerConstant;

    /**
     * isComment
     */
    public isConstructor(CatalogueDBAdapter isParameter, BooklistStyle isParameter) {
        synchronized (isNameExpr) {
            isNameExpr++;
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
        }
        // isComment
        synchronized (isNameExpr) {
            isNameExpr = ++isNameExpr;
        }
        // isComment
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = new SqlStatementManager(isNameExpr);
        // isComment
        isNameExpr = isNameExpr;
        // isComment
        // isComment
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    private static Integer isVariable = isIntegerConstant;

    /**
     * isComment
     */
    public FlattenedBooklist isMethod() {
        int isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isNameExpr++;
        }
        TableDefinition isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, true);
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod() + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return new FlattenedBooklist(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public BooklistBuilder isMethod(DomainDefinition isParameter, String isParameter, boolean isParameter) {
        // isComment
        ExtraDomainDetails isVariable = new ExtraDomainDetails();
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        // isComment
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            // isComment
            boolean isVariable = true;
            ExtraDomainDetails isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr == null) {
                if (isNameExpr.isFieldAccessExpr == null) {
                    isNameExpr = true;
                } else {
                    isNameExpr = isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
                }
            } else {
                if (isNameExpr.isFieldAccessExpr == null) {
                    isNameExpr = isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
                } else {
                    isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
            }
            if (!isNameExpr)
                throw new RuntimeException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        } else
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return this;
    }

    public static class isClassOrIsInterface {

        DomainDefinition isVariable;

        boolean isVariable;

        isConstructor(DomainDefinition isParameter, boolean isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    /**
     * isComment
     */
    private static class isClassOrIsInterface {

        public String isVariable;

        public String isVariable;

        public String isVariable;

        public String isVariable;

        public String isVariable;

        public String isVariable;

        public String isVariable;

        public String isVariable;
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface {

        /**
         * isComment
         */
        public static final int isVariable = isIntegerConstant;

        /**
         * isComment
         */
        public static final int isVariable = isIntegerConstant;

        /**
         * isComment
         */
        public static final int isVariable = isIntegerConstant;

        // isComment
        // isComment
        // isComment
        /**
         * isComment
         */
        public static final int isVariable = isIntegerConstant;

        /**
         * isComment
         */
        private ArrayList<DomainDefinition> isVariable = new ArrayList<DomainDefinition>();

        /**
         * isComment
         */
        private ArrayList<String> isVariable = new ArrayList<String>();

        /**
         * isComment
         */
        private Hashtable<DomainDefinition, String> isVariable = new Hashtable<DomainDefinition, String>();

        /**
         * isComment
         */
        private ArrayList<DomainDefinition> isVariable = new ArrayList<DomainDefinition>();

        // isComment
        // isComment
        // isComment
        /**
         * isComment
         */
        private ArrayList<SortedDomainInfo> isVariable = new ArrayList<SortedDomainInfo>();

        private HashSet<DomainDefinition> isVariable = new HashSet<DomainDefinition>();

        /**
         * isComment
         */
        public void isMethod(DomainDefinition isParameter, String isParameter, int isParameter) {
            // isComment
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr);
            // isComment
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            // isComment
            if ((isNameExpr & isNameExpr) != isIntegerConstant)
                isNameExpr.isMethod(isNameExpr);
            if ((isNameExpr & isNameExpr) != isIntegerConstant && !isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(new SortedDomainInfo(isNameExpr, (isNameExpr & isNameExpr) != isIntegerConstant));
                isNameExpr.isMethod(isNameExpr);
            }
        // isComment
        // isComment
        // isComment
        }

        /**
         * isComment
         */
        @SuppressWarnings("isStringConstant")
        public ArrayList<DomainDefinition> isMethod() {
            return (ArrayList<DomainDefinition>) isNameExpr.isMethod();
        }

        /**
         * isComment
         */
        public ArrayList<SortedDomainInfo> isMethod() {
            return isNameExpr;
        }

        /**
         * isComment
         */
        public void isMethod() {
            // isComment
            long isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            long isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, true);
            long isVariable = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
        }

        /**
         * isComment
         */
        public SqlComponents isMethod(CompoundKey isParameter) {
            SqlComponents isVariable = new SqlComponents();
            // isComment
            isMethod();
            // isComment
            StringBuilder isVariable = new StringBuilder();
            // isComment
            StringBuilder isVariable = new StringBuilder();
            // isComment
            StringBuilder isVariable = new StringBuilder();
            // isComment
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                DomainDefinition isVariable = isNameExpr.isMethod(isNameExpr);
                String isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr > isIntegerConstant) {
                    isNameExpr.isMethod("isStringConstant");
                    isNameExpr.isMethod("isStringConstant");
                    isNameExpr.isMethod("isStringConstant");
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
                // isComment
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            // isComment
            String isVariable = "isStringConstant" + isNameExpr.isFieldAccessExpr;
            for (DomainDefinition isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
            }
            // isComment
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod() + "isStringConstant" + isNameExpr;
            isNameExpr.isFieldAccessExpr = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
            isNameExpr.isFieldAccessExpr = "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    /**
     * isComment
     */
    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, true);
        // isComment
        isNameExpr.isMethod();
        // isComment
        for (SynchronizedStatement isVariable : isNameExpr) isNameExpr.isMethod();
    }

    private String isVariable = null;

    /**
     * isComment
     */
    private String isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    private String isMethod(String isParameter) {
        // isComment
        return "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    /**
     * isComment
     */
    private String isMethod(String isParameter, boolean isParameter) {
        if (isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
        }
        return "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isMethod() + "isStringConstant";
    }

    /**
     * isComment
     */
    private String isMethod(String isParameter, boolean isParameter) {
        if (isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
        }
        return "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isMethod() + "isStringConstant";
    }

    /**
     * isComment
     */
    private String isMethod(String isParameter, boolean isParameter) {
        if (isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
        }
        // isComment
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, long isParameter, String isParameter, String isParameter, String isParameter, String isParameter, String isParameter, String isParameter) {
        isNameExpr.isMethod(this, "isStringConstant" + isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        try {
            long isVariable = isNameExpr.isMethod();
            // isComment
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            }
            // isComment
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isMethod());
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isMethod());
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            SummaryBuilder isVariable = new SummaryBuilder();
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod() + isIntegerConstant), isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
            // isComment
            BooklistSeriesGroup isVariable = null;
            // isComment
            BooklistAuthorGroup isVariable = null;
            // isComment
            boolean isVariable = true;
            // isComment
            boolean isVariable = true;
            // isComment
            // isComment
            final int isVariable = isNameExpr.isMethod();
            boolean isVariable;
            boolean isVariable = true;
            // isComment
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = true;
                    break;
                case isNameExpr.isFieldAccessExpr:
                    if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr < isIntegerConstant) {
                        isNameExpr = true;
                    } else {
                        isNameExpr = true;
                    }
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = true;
                    isNameExpr = true;
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr = true;
                    isNameExpr = true;
                    break;
                default:
                    isNameExpr = true;
                    break;
            }
            // isComment
            // isComment
            final int isVariable = (isNameExpr ? isNameExpr.isFieldAccessExpr : isIntegerConstant);
            long isVariable = isNameExpr.isMethod();
            // isComment
            for (BooklistGroup isVariable : isNameExpr) {
                // isComment
                switch(isNameExpr.isFieldAccessExpr) {
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        isNameExpr = (BooklistSeriesGroup) isNameExpr;
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        isNameExpr = (BooklistAuthorGroup) isNameExpr;
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
                        // isComment
                        if (isNameExpr.isMethod())
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
                        else
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        // isComment
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        isNameExpr = true;
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        String isVariable = "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant";
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        // isComment
                        isNameExpr = true;
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        String isVariable = "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        isNameExpr.isMethod(isNameExpr, null, isNameExpr.isFieldAccessExpr | isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        isNameExpr.isMethod(isNameExpr, null, isNameExpr.isFieldAccessExpr | isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        String isVariable = isMethod(isNameExpr.isMethod(isNameExpr), true);
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        isNameExpr.isMethod(isNameExpr, null, isNameExpr.isFieldAccessExpr | isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr), true), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr), true), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr), true), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod("isStringConstant", isNameExpr);
                        break;
                    default:
                        throw new RuntimeException("isStringConstant" + isNameExpr.isFieldAccessExpr);
                }
                // isComment
                // isComment
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            }
            long isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr, isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr != null) {
                // isComment
                // isComment
                // isComment
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr.isFieldAccessExpr);
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr, null, isNameExpr.isFieldAccessExpr);
            // isComment
            for (Entry<String, ExtraDomainDetails> isVariable : isNameExpr.isMethod()) {
                ExtraDomainDetails isVariable = isNameExpr.isMethod();
                int isVariable;
                if (isNameExpr.isFieldAccessExpr)
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                else
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
            }
            long isVariable = isNameExpr.isMethod();
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            // isComment
            SqlComponents isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod());
            long isVariable = isNameExpr.isMethod();
            // isComment
            // isComment
            // isComment
            JoinContext isVariable;
            // isComment
            if (isNameExpr || !isNameExpr.isMethod("isStringConstant")) {
                isNameExpr = new JoinContext(isNameExpr).isMethod().isMethod(isNameExpr).isMethod(isNameExpr);
            } else {
                isNameExpr = new JoinContext(isNameExpr).isMethod();
            }
            // isComment
            if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            // isComment
            if (isNameExpr == null || !isNameExpr.isMethod()) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant");
            }
            // isComment
            isNameExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            // isComment
            if (isNameExpr == null || !isNameExpr.isMethod()) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant");
            }
            // isComment
            isNameExpr.isMethod(isNameExpr);
            /*isComment*/
            // isComment
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            // isComment
            // isComment
            // isComment
            long isVariable = isNameExpr.isMethod();
            String isVariable = "isStringConstant";
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                if (isNameExpr) {
                    isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
                } else {
                    isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
                }
            }
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
            }
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
            }
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                isNameExpr += "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
            // isComment
            }
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isMethod(isNameExpr) + "isStringConstant";
            }
            if (!isNameExpr.isMethod("isStringConstant")) {
                if (!isNameExpr.isMethod("isStringConstant"))
                    isNameExpr += "isStringConstant";
                isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isMethod(isNameExpr.isMethod(isNameExpr)) + "isStringConstant";
            }
            // isComment
            {
                String isVariable = null;
                switch(isNameExpr.isMethod()) {
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr.isMethod(isNameExpr) + "isStringConstant";
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr.isMethod(isNameExpr) + "isStringConstant";
                        break;
                    default:
                        break;
                }
                if (isNameExpr != null) {
                    if (!isNameExpr.isMethod("isStringConstant"))
                        isNameExpr += "isStringConstant";
                    isNameExpr += "isStringConstant" + isNameExpr;
                }
            }
            // isComment
            if (!isNameExpr.isMethod("isStringConstant")) {
                isNameExpr.isFieldAccessExpr = "isStringConstant" + isNameExpr.isMethod();
            } else {
                isNameExpr.isFieldAccessExpr = "isStringConstant";
            }
            long isVariable = isNameExpr.isMethod();
            // isComment
            // isComment
            // isComment
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            // isComment
            String isVariable;
            // isComment
            String isVariable;
            // isComment
            {
                final ArrayList<SortedDomainInfo> isVariable = isNameExpr.isMethod();
                final StringBuilder isVariable = new StringBuilder();
                final StringBuilder isVariable = new StringBuilder();
                for (SortedDomainInfo isVariable : isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod().isMethod("isStringConstant")) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        // isComment
                        if (isNameExpr)
                            isNameExpr.isMethod("isStringConstant");
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        if (isNameExpr)
                            isNameExpr.isMethod("isStringConstant");
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    } else {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    if (isNameExpr.isFieldAccessExpr) {
                        isNameExpr.isMethod("isStringConstant");
                        isNameExpr.isMethod("isStringConstant");
                    }
                    isNameExpr.isMethod("isStringConstant");
                    isNameExpr.isMethod("isStringConstant");
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr = isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod();
            }
            // isComment
            {
                final ArrayList<DomainDefinition> isVariable = isNameExpr.isMethod();
                final StringBuilder isVariable = new StringBuilder();
                ;
                for (DomainDefinition isVariable : isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod("isStringConstant");
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            }
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            /*isComment*/
            // isComment
            long isVariable = isNameExpr.isMethod();
            // isComment
            SyncLock isVariable = isNameExpr.isMethod(true);
            long isVariable = isNameExpr.isMethod();
            try {
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                isNameExpr = new ArrayList<SynchronizedStatement>();
                // isComment
                long isVariable;
                long[] isVariable = new long[isNameExpr.isMethod()];
                long isVariable;
                if (isNameExpr) {
                    // isComment
                    // isComment
                    String isVariable = isMethod(isNameExpr, isNameExpr);
                    isNameExpr = isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr);
                    // isComment
                    isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod();
                    isNameExpr = isNameExpr;
                } else {
                    // isComment
                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
                    // isComment
                    isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod();
                    // isComment
                    // isComment
                    int isVariable = isIntegerConstant;
                    // isComment
                    for (int isVariable = isNameExpr.isMethod() - isIntegerConstant; isNameExpr >= isIntegerConstant; isNameExpr--) {
                        final BooklistGroup isVariable = isNameExpr.isMethod(isNameExpr);
                        final int isVariable = isNameExpr + isIntegerConstant;
                        // isComment
                        String isVariable = "isStringConstant";
                        // isComment
                        String isVariable = "isStringConstant";
                        // isComment
                        for (DomainDefinition isVariable : isNameExpr.isFieldAccessExpr) {
                            if (!isNameExpr.isMethod("isStringConstant"))
                                isNameExpr += "isStringConstant";
                            isNameExpr += "isStringConstant" + isNameExpr.isFieldAccessExpr;
                            isNameExpr += "isStringConstant" + isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr;
                        }
                        // isComment
                        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + (isNameExpr + isIntegerConstant) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + isNameExpr.isFieldAccessExpr;
                        // isComment
                        // isComment
                        SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant" + isNameExpr, isNameExpr);
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod();
                        isNameExpr[isNameExpr++] = isNameExpr.isMethod();
                    }
                    // isComment
                    isNameExpr = isNameExpr.isMethod();
                    // isComment
                    if (!isNameExpr) {
                        SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod();
                    }
                }
                // isComment
                long isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
                long isVariable = isNameExpr.isMethod();
                // isComment
                // isComment
                // isComment
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr, true);
                String isVariable;
                if (isNameExpr) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                } else {
                    isNameExpr = isNameExpr;
                }
                // isComment
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr + "isStringConstant" + isNameExpr;
                // isComment
                SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                // isComment
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr;
                    isNameExpr.isMethod(isNameExpr);
                } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr;
                    isNameExpr.isMethod(isNameExpr);
                } else {
                    // isComment
                    isNameExpr.isMethod();
                }
                long isVariable = isNameExpr.isMethod();
                // isComment
                {
                    String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                    SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod();
                }
                long isVariable = isNameExpr.isMethod();
                {
                    // isComment
                    String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                    SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod();
                }
                long isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
                long isVariable = isNameExpr.isMethod();
                long isVariable = isNameExpr.isMethod();
                // isComment
                // isComment
                // isComment
                long isVariable = isNameExpr.isMethod();
                // isComment
                long isVariable = isNameExpr.isMethod();
                // isComment
                long isVariable = isNameExpr.isMethod();
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr[isIntegerConstant] - isNameExpr));
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr[isNameExpr] - isNameExpr[isNameExpr - isIntegerConstant]));
                }
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr[isNameExpr.isMethod() - isIntegerConstant]));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                // isComment
                // isComment
                // isComment
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + (isNameExpr - isNameExpr));
                isNameExpr.isMethod();
                isNameExpr = isNameExpr;
                return;
            } finally {
                isNameExpr.isMethod(isNameExpr);
            // isComment
            }
        } finally {
            isNameExpr.isMethod(this, "isStringConstant" + isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    private void isMethod() {
        SyncLock isVariable = null;
        try {
            if (!isNameExpr.isMethod())
                isNameExpr = isNameExpr.isMethod(true);
            int isVariable = isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr;
            if (isNameExpr == null) {
                String isVariable = "isStringConstant" + isNameExpr + "isStringConstant";
                isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod();
            if (isNameExpr != null)
                isNameExpr.isMethod();
        } finally {
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    private String isMethod(SummaryBuilder isParameter, boolean isParameter) {
        if (isNameExpr) {
            // isComment
            return isMethod(isNameExpr);
        } else {
            // isComment
            // isComment
            // isComment
            isMethod(isNameExpr);
            return isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    private String isMethod(SummaryBuilder isParameter) {
        // isComment
        final String isVariable = isNameExpr + "isStringConstant";
        final String isVariable = isNameExpr + "isStringConstant";
        /*isComment*/
        // isComment
        final String isVariable = isNameExpr + "isStringConstant";
        // isComment
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant";
        {
            String isVariable = "isStringConstant";
            boolean isVariable = true;
            for (DomainDefinition isVariable : isNameExpr.isMethod()) {
                if (!isNameExpr.isMethod(isNameExpr)) {
                    if (isNameExpr)
                        isNameExpr = true;
                    else {
                        isNameExpr += "isStringConstant";
                        isNameExpr += "isStringConstant";
                    }
                    isNameExpr += isNameExpr;
                    isNameExpr += "isStringConstant" + isNameExpr;
                }
            }
            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
        }
        // isComment
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant";
        // isComment
        String isVariable = "isStringConstant";
        // isComment
        String isVariable = "isStringConstant";
        // isComment
        HashSet<String> isVariable = new HashSet<String>();
        // isComment
        for (SortedDomainInfo isVariable : isNameExpr.isMethod()) {
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (!isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr += "isStringConstant";
                    isNameExpr += "isStringConstant";
                }
                isNameExpr += isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr += "isStringConstant" + isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
        }
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            // isComment
            final BooklistGroup isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            final int isVariable = isNameExpr + isIntegerConstant;
            // isComment
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            // isComment
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
            // isComment
            // isComment
            String isVariable = "isStringConstant";
            // isComment
            for (DomainDefinition isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr += "isStringConstant" + isNameExpr;
                isNameExpr += "isStringConstant" + isNameExpr;
                // isComment
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    if (!isNameExpr.isMethod("isStringConstant"))
                        isNameExpr += "isStringConstant";
                    isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
                }
            }
            // isComment
            // isComment
            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
        }
        // isComment
        isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant";
        {
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
            SynchronizedStatement isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private void isMethod(SummaryBuilder isParameter) {
        // isComment
        final String isVariable = isNameExpr + "isStringConstant";
        // isComment
        String isVariable = "isStringConstant";
        // isComment
        String isVariable = "isStringConstant";
        // isComment
        HashSet<String> isVariable = new HashSet<String>();
        // isComment
        for (SortedDomainInfo isVariable : isNameExpr.isMethod()) {
            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (!isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr += "isStringConstant";
                    isNameExpr += "isStringConstant";
                }
                isNameExpr += isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr += "isStringConstant" + isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
        }
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        // isComment
        for (int isVariable = isNameExpr.isMethod() - isIntegerConstant; isNameExpr >= isIntegerConstant; isNameExpr--) {
            // isComment
            final BooklistGroup isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            final int isVariable = isNameExpr + isIntegerConstant;
            // isComment
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            // isComment
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
            // isComment
            // isComment
            String isVariable = "isStringConstant";
            // isComment
            for (DomainDefinition isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr += "isStringConstant" + isNameExpr;
                isNameExpr += "isStringConstant" + isNameExpr;
                // isComment
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    if (!isNameExpr.isMethod("isStringConstant"))
                        isNameExpr += "isStringConstant";
                    isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
                }
            }
            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
            String isVariable = "isStringConstant" + isNameExpr;
            // isComment
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
            // isComment
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr + isIntegerConstant) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant";
            SynchronizedStatement isVariable = isNameExpr.isMethod("isStringConstant" + isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        }
        // isComment
        String isVariable = isNameExpr + "isStringConstant";
        isNameExpr.isMethod("isStringConstant" + isNameExpr);
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + // isComment
        "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant";
        SynchronizedStatement isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    public void isMethod() {
        SyncLock isVariable = null;
        try {
            if (!isNameExpr.isMethod())
                isNameExpr = isNameExpr.isMethod(true);
            isMethod();
            if (isNameExpr == null) {
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            int isVariable = isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr;
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod();
            if (isNameExpr != null)
                isNameExpr.isMethod();
        } finally {
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    private void isMethod(long isParameter) {
        SyncLock isVariable = null;
        try {
            if (!isNameExpr.isMethod())
                isNameExpr = isNameExpr.isMethod(true);
            int isVariable = isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr;
            if (isNameExpr == null) {
                String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod();
        } finally {
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    private void isMethod(long isParameter, boolean isParameter) {
        SyncLock isVariable = null;
        try {
            if (!isNameExpr.isMethod())
                isNameExpr = isNameExpr.isMethod(true);
            isMethod(isNameExpr);
            if (isNameExpr == null) {
                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            int isVariable = isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr;
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        } finally {
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static class isClassOrIsInterface {

        public int isVariable;

        public boolean isVariable;

        public int isVariable;

        isConstructor(int isParameter, int isParameter, int isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
            isNameExpr = (isNameExpr == isIntegerConstant);
        }
    }

    /**
     * isComment
     */
    public ArrayList<BookRowInfo> isMethod(long isParameter) {
        String isVariable = "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr;
        Cursor isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        try {
            ArrayList<BookRowInfo> isVariable = new ArrayList<BookRowInfo>();
            if (isNameExpr.isMethod()) {
                do {
                    int isVariable = isNameExpr.isMethod(isIntegerConstant) - isIntegerConstant;
                    isNameExpr.isMethod(new BookRowInfo(isNameExpr, isMethod(isNameExpr), isNameExpr.isMethod(isIntegerConstant)));
                } while (isNameExpr.isMethod());
                return isNameExpr;
            } else {
                return null;
            }
        } finally {
            isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public String[] isMethod() {
        // isComment
        ArrayList<DomainDefinition> isVariable = isNameExpr.isMethod();
        // isComment
        String[] isVariable = new String[isNameExpr.isMethod() + isIntegerConstant];
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
        // isComment
        isNameExpr[isNameExpr.isMethod()] = isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }

    /**
     * isComment
     */
    public BooklistCursor isMethod(int isParameter, int isParameter) {
        // isComment
        StringBuilder isVariable = new StringBuilder();
        final String isVariable = isNameExpr.isMethod() + "isStringConstant";
        for (DomainDefinition isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant");
        }
        // isComment
        final String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        // isComment
        return (BooklistCursor) isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, "isStringConstant");
    }

    /**
     * isComment
     */
    public BooklistPseudoCursor isMethod() {
        return new BooklistPseudoCursor(this);
    }

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    /**
     * isComment
     */
    public int isMethod() {
        return isMethod("isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isMethod("isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr.isMethod() + isIntegerConstant));
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isMethod("isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr.isMethod() + isIntegerConstant));
    }

    /**
     * isComment
     */
    private int isMethod(String isParameter, String isParameter) {
        long isVariable = isNameExpr.isMethod();
        SynchronizedStatement isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = (int) isNameExpr.isMethod();
        isNameExpr.isMethod();
        long isVariable = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr - isNameExpr) + "isStringConstant");
        return isNameExpr;
    }

    /**
     * isComment
     */
    public DomainDefinition isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr - isIntegerConstant).isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isMethod() + isIntegerConstant;
    }

    private SynchronizedStatement isVariable = null;

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    public int isMethod(int isParameter) {
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        // isComment
        final long isVariable = isNameExpr + isIntegerConstant;
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        long isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (SQLiteDoneException isParameter) {
            // isComment
            isNameExpr = isIntegerConstant;
        }
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        int isVariable = (int) isNameExpr.isMethod();
        // isComment
        if (isNameExpr == isIntegerConstant)
            return isNameExpr;
        else
            return isNameExpr > isIntegerConstant ? isNameExpr - isIntegerConstant : isIntegerConstant;
    }

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    public void isMethod(long isParameter) {
        // isComment
        if (isNameExpr < isIntegerConstant)
            return;
        final long isVariable = isNameExpr + isIntegerConstant;
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        String[] isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        long isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        long isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        // isComment
        if (isNameExpr != isNameExpr && isNameExpr == isIntegerConstant)
            isMethod(isNameExpr - isIntegerConstant);
    }

    private SynchronizedStatement isVariable = null;

    private SynchronizedStatement isVariable = null;

    private SynchronizedStatement isVariable = null;

    private SynchronizedStatement isVariable = null;

    /**
     * isComment
     */
    private void isMethod() {
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        if (isNameExpr == null) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    /**
     * isComment
     */
    public void isMethod(boolean isParameter) {
        long isVariable = isNameExpr.isMethod();
        if (isNameExpr) {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr.isMethod(isNameExpr);
            isMethod();
        } else {
            String isVariable = "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr.isMethod(isNameExpr);
            isMethod();
        }
        long isVariable = isNameExpr.isMethod() - isNameExpr;
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(long isParameter) {
        // isComment
        // isComment
        isMethod();
        // isComment
        final long isVariable = isNameExpr + isIntegerConstant;
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        String[] isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        long isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        int isVariable = (isNameExpr.isMethod(isNameExpr[isIntegerConstant]) == isIntegerConstant) ? isIntegerConstant : isIntegerConstant;
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        long isVariable = isNameExpr.isMethod();
        if (isNameExpr < isIntegerConstant)
            isNameExpr = isNameExpr.isFieldAccessExpr;
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr, isNameExpr == isIntegerConstant);
    }

    /**
     * isComment
     */
    private final CursorFactory isVariable = new CursorFactory() {

        @Override
        public Cursor isMethod(SQLiteDatabase isParameter, SQLiteCursorDriver isParameter, String isParameter, SQLiteQuery isParameter) {
            return new BooklistCursor(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.this, isNameExpr.isMethod());
        }
    };

    /**
     * isComment
     */
    public BooklistStyle isMethod() {
        return isNameExpr;
    }

    private boolean isVariable = true;

    /**
     * isComment
     */
    private void isMethod(final boolean isParameter) {
        if (isNameExpr.isMethod() != isIntegerConstant) {
            if (isNameExpr) {
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            }
            try {
                isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
            ;
        }
        if (isNameExpr != null) {
            if (isNameExpr) {
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            }
            try {
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
            ;
        }
        if (isNameExpr != null) {
            if (isNameExpr) {
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            }
            try {
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
            ;
        }
        if (!isNameExpr) {
            // isComment
            synchronized (isNameExpr) {
                isNameExpr--;
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
            }
            isNameExpr = true;
        }
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(true);
    }

    public void isMethod() {
        isMethod(true);
    }
}
/*isComment*/
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
// isComment
