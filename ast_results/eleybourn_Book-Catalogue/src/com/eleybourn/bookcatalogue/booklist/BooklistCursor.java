// isComment
package com.eleybourn.bookcatalogue.booklist;

import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import com.eleybourn.bookcatalogue.database.DbSync.Synchronizer;
import com.eleybourn.bookcatalogue.utils.TrackedCursor;
import com.eleybourn.bookcatalogue.utils.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends TrackedCursor implements BooklistSupportProvider {

    /**
     * isComment
     */
    private final BooklistBuilder isVariable;

    /**
     * isComment
     */
    private BooklistRowView isVariable = null;

    /**
     * isComment
     */
    private static Integer isVariable = isIntegerConstant;

    /**
     * isComment
     */
    private final long isVariable;

    /**
     * isComment
     */
    private Utils isVariable = null;

    /**
     * isComment
     */
    public isConstructor(SQLiteDatabase isParameter, SQLiteCursorDriver isParameter, String isParameter, SQLiteQuery isParameter, BooklistBuilder isParameter, Synchronizer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        // isComment
        synchronized (isNameExpr) {
            isNameExpr = ++isNameExpr;
        }
        // isComment
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Utils isMethod() {
        if (isNameExpr == null)
            isNameExpr = new Utils();
        return isNameExpr;
    }

    /**
     * isComment
     */
    public long isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public BooklistBuilder isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public BooklistRowView isMethod() {
        if (isNameExpr == null)
            isNameExpr = new BooklistRowView(this, isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
        super.isMethod();
    }
}
