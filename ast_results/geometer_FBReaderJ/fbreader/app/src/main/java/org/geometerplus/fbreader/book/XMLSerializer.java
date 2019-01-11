// isComment
package org.geometerplus.fbreader.book;

import java.util.*;
import java.text.DateFormat;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import android.util.Xml;
import org.geometerplus.zlibrary.core.constants.XMLNamespaces;
import org.geometerplus.zlibrary.core.util.RationalNumber;
import org.geometerplus.zlibrary.core.util.ZLColor;
import org.geometerplus.zlibrary.text.view.ZLTextPosition;

class isClassOrIsInterface extends AbstractSerializer {

    private StringBuilder isMethod() {
        return new StringBuilder("isStringConstant");
    }

    @Override
    public String isMethod(BookQuery isParameter) {
        final StringBuilder isVariable = isMethod();
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, "isStringConstant");
        return isNameExpr.isMethod();
    }

    private void isMethod(StringBuilder isParameter, Filter isParameter) {
        if (isNameExpr instanceof Filter.Empty) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant");
        } else if (isNameExpr instanceof Filter.Not) {
            isMethod(isNameExpr, "isStringConstant", true);
            isMethod(isNameExpr, ((Filter.Not) isNameExpr).isFieldAccessExpr);
            isMethod(isNameExpr, "isStringConstant");
        } else if (isNameExpr instanceof Filter.And) {
            isMethod(isNameExpr, "isStringConstant", true);
            isMethod(isNameExpr, ((Filter.And) isNameExpr).isFieldAccessExpr);
            isMethod(isNameExpr, ((Filter.And) isNameExpr).isFieldAccessExpr);
            isMethod(isNameExpr, "isStringConstant");
        } else if (isNameExpr instanceof Filter.Or) {
            isMethod(isNameExpr, "isStringConstant", true);
            isMethod(isNameExpr, ((Filter.Or) isNameExpr).isFieldAccessExpr);
            isMethod(isNameExpr, ((Filter.Or) isNameExpr).isFieldAccessExpr);
            isMethod(isNameExpr, "isStringConstant");
        } else if (isNameExpr instanceof Filter.ByAuthor) {
            final Author isVariable = ((Filter.ByAuthor) isNameExpr).isFieldAccessExpr;
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof Filter.ByTag) {
            final LinkedList<String> isVariable = new LinkedList<String>();
            for (Tag isVariable = ((Filter.ByTag) isNameExpr).isFieldAccessExpr; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
            }
            final String[] isVariable = new String[isNameExpr.isMethod() * isIntegerConstant + isIntegerConstant];
            int isVariable = isIntegerConstant;
            isNameExpr[isNameExpr++] = "isStringConstant";
            isNameExpr[isNameExpr++] = "isStringConstant";
            int isVariable = isIntegerConstant;
            for (String isVariable : isNameExpr) {
                isNameExpr[isNameExpr++] = "isStringConstant" + isNameExpr++;
                isNameExpr[isNameExpr++] = isNameExpr;
            }
            isMethod(isNameExpr, "isStringConstant", true, isNameExpr);
        } else if (isNameExpr instanceof Filter.ByLabel) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant", "isStringConstant", ((Filter.ByLabel) isNameExpr).isFieldAccessExpr);
        } else if (isNameExpr instanceof Filter.BySeries) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant", "isStringConstant", ((Filter.BySeries) isNameExpr).isFieldAccessExpr.isMethod());
        } else if (isNameExpr instanceof Filter.ByPattern) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant", "isStringConstant", ((Filter.ByPattern) isNameExpr).isFieldAccessExpr);
        } else if (isNameExpr instanceof Filter.ByTitlePrefix) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant", "isStringConstant", ((Filter.ByTitlePrefix) isNameExpr).isFieldAccessExpr);
        } else if (isNameExpr instanceof Filter.HasBookmark) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant");
        } else if (isNameExpr instanceof Filter.HasPhysicalFile) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant");
        } else {
            throw new RuntimeException("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Override
    public BookQuery isMethod(String isParameter) {
        try {
            final BookQueryDeserializer isVariable = new BookQueryDeserializer();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod();
        } catch (SAXException isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return null;
        }
    }

    @Override
    public String isMethod(BookmarkQuery isParameter) {
        final StringBuilder isVariable = isMethod();
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        if (isNameExpr.isFieldAccessExpr != null) {
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        isMethod(isNameExpr, "isStringConstant");
        return isNameExpr.isMethod();
    }

    @Override
    public BookmarkQuery isMethod(String isParameter, BookCreator<? extends AbstractBook> isParameter) {
        try {
            final BookmarkQueryDeserializer isVariable = new BookmarkQueryDeserializer(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod();
        } catch (SAXException isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return null;
        }
    }

    @Override
    public String isMethod(AbstractBook isParameter) {
        final StringBuilder isVariable = isMethod();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod();
    }

    private void isMethod(StringBuilder isParameter, AbstractBook isParameter) {
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        for (UID isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr));
            isMethod(isNameExpr, "isStringConstant");
        }
        for (Author isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr, "isStringConstant", true);
            isMethod(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, "isStringConstant");
        }
        for (Tag isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant", isNameExpr.isFieldAccessExpr);
        }
        for (Label isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
        }
        final SeriesInfo isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isMethod(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isMethod());
            if (isNameExpr.isFieldAccessExpr != null) {
                isMethod(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isMethod());
            }
        }
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, "isStringConstant", true);
        }
        // isComment
        // isComment
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", "isStringConstant" + isNameExpr.isMethod(), // isComment
        "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        final RationalNumber isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        isMethod(isNameExpr, "isStringConstant");
    }

    @Override
    public <B extends AbstractBook> B isMethod(String isParameter, BookCreator<B> isParameter) {
        try {
            final BookDeserializer<B> isVariable = new BookDeserializer<B>(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod();
        } catch (SAXException isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return null;
        }
    }

    @Override
    public String isMethod(Bookmark isParameter) {
        final StringBuilder isVariable = isMethod();
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod(), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), // isComment
        "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), "isStringConstant", isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        final ZLTextPosition isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        } else {
            isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        }
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        isMethod(isNameExpr, "isStringConstant");
        return isNameExpr.isMethod();
    }

    @Override
    public Bookmark isMethod(String isParameter) {
        try {
            final BookmarkDeserializer isVariable = new BookmarkDeserializer();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod();
        } catch (SAXException isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return null;
        }
    }

    @Override
    public String isMethod(HighlightingStyle isParameter) {
        final StringBuilder isVariable = isMethod();
        final ZLColor isVariable = isNameExpr.isMethod();
        final ZLColor isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, "isStringConstant", true, "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), "isStringConstant", isNameExpr.isMethod(), "isStringConstant", isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isMethod()) : "isStringConstant", "isStringConstant", isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isMethod()) : "isStringConstant");
        return isNameExpr.isMethod();
    }

    @Override
    public HighlightingStyle isMethod(String isParameter) {
        try {
            final StyleDeserializer isVariable = new StyleDeserializer();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr.isMethod();
        } catch (SAXException isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            return null;
        }
    }

    private static String isMethod(Long isParameter) {
        return isNameExpr != null ? isNameExpr.isMethod(isNameExpr) : null;
    }

    private static Date isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr != null ? new Date(isNameExpr.isMethod(isNameExpr)) : null;
        } catch (Exception isParameter) {
            throw new SAXException("isStringConstant", isNameExpr);
        }
    }

    private static DateFormat isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    private static String isMethod(Long isParameter) {
        return isNameExpr != null ? isNameExpr.isMethod(new Date(isNameExpr)) : null;
    }

    private static long isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr != null ? isNameExpr.isMethod(isNameExpr).isMethod() : null;
        } catch (Exception isParameter) {
            throw new SAXException("isStringConstant", isNameExpr);
        }
    }

    private static Long isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr != null ? isNameExpr.isMethod(isNameExpr).isMethod() : null;
        } catch (Exception isParameter) {
            return null;
        }
    }

    private static int isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            throw new SAXException("isStringConstant", isNameExpr);
        }
    }

    private static int isMethod(String isParameter, int isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            return isNameExpr;
        }
    }

    private static long isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            throw new SAXException("isStringConstant", isNameExpr);
        }
    }

    private static long isMethod(String isParameter, long isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            return isNameExpr;
        }
    }

    private static Long isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            return null;
        }
    }

    private static boolean isMethod(String isParameter) throws SAXException {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            throw new SAXException("isStringConstant", isNameExpr);
        }
    }

    private static void isMethod(StringBuilder isParameter, String isParameter, boolean isParameter, String... isParameter) {
        isNameExpr.isMethod('isStringConstant').isMethod(isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr - isIntegerConstant; isNameExpr += isIntegerConstant) {
            if (isNameExpr[isNameExpr + isIntegerConstant] != null) {
                isNameExpr.isMethod('isStringConstant').isMethod(isMethod(isNameExpr[isNameExpr])).isMethod("isStringConstant").isMethod(isMethod(isNameExpr[isNameExpr + isIntegerConstant])).isMethod('isStringConstant');
            }
        }
        if (isNameExpr) {
            isNameExpr.isMethod('isStringConstant');
        }
        isNameExpr.isMethod("isStringConstant");
    }

    private static void isMethod(StringBuilder isParameter, String isParameter) {
        isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr).isMethod("isStringConstant");
    }

    private static void isMethod(StringBuilder isParameter, String isParameter, String isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod('isStringConstant').isMethod(isNameExpr).isMethod('isStringConstant').isMethod(isMethod(isNameExpr)).isMethod("isStringConstant").isMethod(isNameExpr).isMethod("isStringConstant");
        }
    }

    private static void isMethod(StringBuilder isParameter, String isParameter, Object isParameter) {
        if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
        }
    }

    private static CharSequence isMethod(String isParameter) {
        final StringBuilder isVariable = new StringBuilder();
        final int isVariable = isNameExpr.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
            final char isVariable = isNameExpr.isMethod(isNameExpr);
            switch(isNameExpr) {
                case 'isStringConstant':
                case 'isStringConstant':
                    isNameExpr.isMethod(isNameExpr);
                    break;
                default:
                    if ((isNameExpr >= 'isStringConstant' && isNameExpr <= 'isStringConstant') || (isNameExpr >= 'isStringConstant' && isNameExpr <= 'isStringConstant')) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    break;
                case 'isStringConstant':
                    isNameExpr.isMethod("isStringConstant");
                    break;
                case 'isStringConstant':
                    isNameExpr.isMethod("isStringConstant");
                    break;
                case 'isStringConstant':
                    isNameExpr.isMethod("isStringConstant");
                    break;
                case 'isStringConstant':
                    isNameExpr.isMethod("isStringConstant");
                    break;
                case 'isStringConstant':
                    isNameExpr.isMethod("isStringConstant");
                    break;
            }
        }
        return isNameExpr;
    }

    private static void isMethod(StringBuilder isParameter) {
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    private static String isMethod(StringBuilder isParameter) {
        return isNameExpr.isMethod() != isIntegerConstant ? isNameExpr.isMethod() : null;
    }

    private static final class isClassOrIsInterface<B extends AbstractBook> extends DefaultHandler {

        private static enum State {

            READ_NOTHING,
            READ_ENTRY,
            READ_ID,
            READ_UID,
            READ_TITLE,
            READ_LANGUAGE,
            READ_ENCODING,
            READ_AUTHOR,
            READ_AUTHOR_URI,
            READ_AUTHOR_NAME,
            READ_SERIES_TITLE,
            READ_SERIES_INDEX
        }

        private final BookCreator<B> isVariable;

        private State isVariable = isNameExpr.isFieldAccessExpr;

        private long isVariable = -isIntegerConstant;

        private String isVariable;

        private final StringBuilder isVariable = new StringBuilder();

        private final StringBuilder isVariable = new StringBuilder();

        private final StringBuilder isVariable = new StringBuilder();

        private String isVariable;

        private final StringBuilder isVariable = new StringBuilder();

        private final ArrayList<UID> isVariable = new ArrayList<UID>();

        private final ArrayList<Author> isVariable = new ArrayList<Author>();

        private final ArrayList<Tag> isVariable = new ArrayList<Tag>();

        private final ArrayList<Label> isVariable = new ArrayList<Label>();

        private final StringBuilder isVariable = new StringBuilder();

        private final StringBuilder isVariable = new StringBuilder();

        private final StringBuilder isVariable = new StringBuilder();

        private final StringBuilder isVariable = new StringBuilder();

        private boolean isVariable;

        private RationalNumber isVariable;

        private B isVariable;

        private isConstructor(BookCreator<B> isParameter) {
            isNameExpr = isNameExpr;
        }

        public B isMethod() {
            return isNameExpr == isNameExpr.isFieldAccessExpr ? isNameExpr : null;
        }

        @Override
        public void isMethod() {
            isNameExpr = null;
            isNameExpr = -isIntegerConstant;
            isNameExpr = null;
            isMethod(isNameExpr);
            isMethod(isNameExpr);
            isMethod(isNameExpr);
            isMethod(isNameExpr);
            isMethod(isNameExpr);
            isMethod(isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr = true;
            isNameExpr = null;
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }

        @Override
        public void isMethod() {
            if (isNameExpr == -isIntegerConstant) {
                return;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod(isNameExpr), isMethod(isNameExpr), isMethod(isNameExpr));
            for (Author isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
            for (Tag isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
            for (Label isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
            for (UID isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
            isNameExpr.isMethod(isMethod(isNameExpr), isMethod(isNameExpr));
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
            switch(isNameExpr) {
                case isNameExpr:
                    if (!"isStringConstant".isMethod(isNameExpr)) {
                        throw new SAXException("isStringConstant" + isNameExpr);
                    }
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isNameExpr = isNameExpr.isMethod("isStringConstant");
                    } else if ("isStringConstant".isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isMethod(isNameExpr);
                        isMethod(isNameExpr);
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        final String isVariable = isNameExpr.isMethod("isStringConstant");
                        if (isNameExpr != null) {
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
                        }
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        final String isVariable = isNameExpr.isMethod("isStringConstant");
                        if (isNameExpr != null) {
                            final String isVariable = isNameExpr.isMethod("isStringConstant");
                            if (isNameExpr != null) {
                                isNameExpr.isMethod(new Label(isNameExpr, isNameExpr));
                            } else {
                                isNameExpr.isMethod(new Label(isNameExpr));
                            }
                        }
                    } else if ("isStringConstant".isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = true;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        // isComment
                        isNameExpr = isNameExpr.isMethod("isStringConstant");
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr.isMethod("isStringConstant")), isMethod(isNameExpr.isMethod("isStringConstant")));
                    } else {
                        throw new SAXException("isStringConstant" + isNameExpr);
                    }
                    break;
                case isNameExpr:
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else {
                        throw new SAXException("isStringConstant" + isNameExpr);
                    }
                    break;
            }
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
            switch(isNameExpr) {
                case isNameExpr:
                    throw new SAXException("isStringConstant" + isNameExpr);
                case isNameExpr:
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    }
                    break;
                case isNameExpr:
                case isNameExpr:
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    if (isNameExpr.isMethod() > isIntegerConstant && isNameExpr.isMethod() > isIntegerConstant) {
                        isNameExpr.isMethod(new Author(isNameExpr.isMethod(), isNameExpr.isMethod()));
                    }
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(new UID(isNameExpr, isNameExpr.isMethod()));
                    isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
                default:
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
            }
        }

        @Override
        public void isMethod(char[] isParameter, int isParameter, int isParameter) {
            switch(isNameExpr) {
                case isNameExpr:
                    isNameExpr = isMethod(new String(isNameExpr, isNameExpr, isNameExpr), -isIntegerConstant);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
            }
        }
    }

    private static final class isClassOrIsInterface extends DefaultHandler {

        private static enum State {

            READ_QUERY, READ_FILTER_NOT, READ_FILTER_AND, READ_FILTER_OR, READ_FILTER_SIMPLE
        }

        private LinkedList<State> isVariable = new LinkedList<State>();

        private LinkedList<Filter> isVariable = new LinkedList<Filter>();

        private Filter isVariable;

        private int isVariable = -isIntegerConstant;

        private int isVariable = -isIntegerConstant;

        private BookQuery isVariable;

        public BookQuery isMethod() {
            return isNameExpr;
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod();
        }

        @Override
        public void isMethod() {
            if (isNameExpr != null && isNameExpr > isIntegerConstant && isNameExpr >= isIntegerConstant) {
                isNameExpr = new BookQuery(isNameExpr, isNameExpr, isNameExpr);
            }
        }

        private void isMethod() {
            if (!isNameExpr.isMethod() && isNameExpr.isMethod() == null) {
                isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant, isNameExpr);
            }
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
            if (isNameExpr.isMethod()) {
                if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else {
                    throw new SAXException("isStringConstant" + isNameExpr);
                }
            } else {
                if ("isStringConstant".isMethod(isNameExpr)) {
                    final String isVariable = isNameExpr.isMethod("isStringConstant");
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.Empty();
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.ByAuthor(new Author(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant")));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        final LinkedList<String> isVariable = new LinkedList<String>();
                        int isVariable = isIntegerConstant;
                        String isVariable;
                        while ((isNameExpr = isNameExpr.isMethod("isStringConstant" + isNameExpr++)) != null) {
                            isNameExpr.isMethod(isNameExpr);
                        }
                        isNameExpr = new Filter.ByTag(isNameExpr.isMethod(isNameExpr.isMethod(new String[isNameExpr.isMethod()])));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.ByLabel(isNameExpr.isMethod("isStringConstant"));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.BySeries(new Series(isNameExpr.isMethod("isStringConstant")));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.ByPattern(isNameExpr.isMethod("isStringConstant"));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.ByTitlePrefix(isNameExpr.isMethod("isStringConstant"));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.HasBookmark();
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = new Filter.HasPhysicalFile();
                    } else {
                        // isComment
                        // isComment
                        isNameExpr = new Filter.Empty();
                    }
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr.isMethod(null);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr.isMethod(null);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr.isMethod(null);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else {
                    throw new SAXException("isStringConstant" + isNameExpr);
                }
            }
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
            if (isNameExpr.isMethod()) {
                // isComment
                throw new SAXException("isStringConstant" + isNameExpr);
            }
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    break;
                case isNameExpr:
                    isNameExpr = new Filter.Not(isNameExpr.isMethod());
                    break;
                case isNameExpr:
                    isNameExpr = new Filter.And(isNameExpr.isMethod(), isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr = new Filter.Or(isNameExpr.isMethod(), isNameExpr);
                    break;
                case isNameExpr:
                    break;
            }
            isMethod();
        }
    }

    private static final class isClassOrIsInterface extends DefaultHandler {

        private boolean isVariable;

        private int isVariable;

        private int isVariable;

        private final BookDeserializer<? extends AbstractBook> isVariable;

        private BookmarkQuery isVariable;

        isConstructor(BookCreator<? extends AbstractBook> isParameter) {
            isNameExpr = new BookDeserializer(isNameExpr);
        }

        BookmarkQuery isMethod() {
            return isNameExpr;
        }

        @Override
        public void isMethod() {
            isNameExpr = null;
            isNameExpr.isMethod();
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod();
            isNameExpr = new BookmarkQuery(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
            if ("isStringConstant".isMethod(isNameExpr)) {
                isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
            if (!"isStringConstant".isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }

        @Override
        public void isMethod(char[] isParameter, int isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private static final class isClassOrIsInterface extends DefaultHandler {

        private static enum State {

            READ_NOTHING, READ_BOOKMARK, READ_TEXT, READ_ORIGINAL_TEXT
        }

        private State isVariable = isNameExpr.isFieldAccessExpr;

        private Bookmark isVariable;

        private long isVariable = -isIntegerConstant;

        private String isVariable;

        private String isVariable;

        private long isVariable;

        private String isVariable;

        private final StringBuilder isVariable = new StringBuilder();

        private StringBuilder isVariable;

        private Long isVariable;

        private Long isVariable;

        private Long isVariable;

        private String isVariable;

        private int isVariable;

        private int isVariable;

        private int isVariable;

        private int isVariable;

        private int isVariable;

        private int isVariable;

        private boolean isVariable;

        private int isVariable;

        public Bookmark isMethod() {
            return isNameExpr == isNameExpr.isFieldAccessExpr ? isNameExpr : null;
        }

        @Override
        public void isMethod() {
            isNameExpr = null;
            isNameExpr = -isIntegerConstant;
            isNameExpr = null;
            isNameExpr = null;
            isNameExpr = -isIntegerConstant;
            isNameExpr = null;
            isMethod(isNameExpr);
            isNameExpr = null;
            isNameExpr = null;
            isNameExpr = null;
            isNameExpr = null;
            isNameExpr = null;
            isNameExpr = isIntegerConstant;
            isNameExpr = isIntegerConstant;
            isNameExpr = isIntegerConstant;
            isNameExpr = -isIntegerConstant;
            isNameExpr = -isIntegerConstant;
            isNameExpr = -isIntegerConstant;
            isNameExpr = true;
            isNameExpr = isIntegerConstant;
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }

        @Override
        public void isMethod() {
            if (isNameExpr == -isIntegerConstant) {
                return;
            }
            isNameExpr = new Bookmark(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr != null ? isNameExpr.isMethod() : null, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
            switch(isNameExpr) {
                case isNameExpr:
                    if (!"isStringConstant".isMethod(isNameExpr)) {
                        throw new SAXException("isStringConstant" + isNameExpr);
                    }
                    isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    isNameExpr = isNameExpr.isMethod("isStringConstant");
                    isNameExpr = isNameExpr.isMethod("isStringConstant");
                    isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    break;
                case isNameExpr:
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        isNameExpr = isNameExpr.isMethod("isStringConstant");
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isNameExpr = new StringBuilder();
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        if (isNameExpr.isMethod("isStringConstant") != null) {
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        } else {
                            // isComment
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        }
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isMethod("isStringConstant");
                        isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        final String isVariable = isNameExpr.isMethod("isStringConstant");
                        if (isNameExpr != null) {
                            isNameExpr = isMethod(isNameExpr);
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                        } else {
                            isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                            isNameExpr = -isIntegerConstant;
                            isNameExpr = -isIntegerConstant;
                        }
                    } else if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isMethod(isNameExpr.isMethod("isStringConstant"));
                    } else {
                        throw new SAXException("isStringConstant" + isNameExpr);
                    }
                    break;
                case isNameExpr:
                case isNameExpr:
                    throw new SAXException("isStringConstant" + isNameExpr);
            }
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
            switch(isNameExpr) {
                case isNameExpr:
                    throw new SAXException("isStringConstant" + isNameExpr);
                case isNameExpr:
                    if ("isStringConstant".isMethod(isNameExpr)) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    }
                    break;
                case isNameExpr:
                case isNameExpr:
                    isNameExpr = isNameExpr.isFieldAccessExpr;
            }
        }

        @Override
        public void isMethod(char[] isParameter, int isParameter, int isParameter) {
            switch(isNameExpr) {
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    break;
            }
        }
    }

    private static final class isClassOrIsInterface extends DefaultHandler {

        private HighlightingStyle isVariable;

        public HighlightingStyle isMethod() {
            return isNameExpr;
        }

        @Override
        public void isMethod() {
            isNameExpr = null;
        }

        @Override
        public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
            if ("isStringConstant".isMethod(isNameExpr)) {
                final int isVariable = isMethod(isNameExpr.isMethod("isStringConstant"), -isIntegerConstant);
                if (isNameExpr != -isIntegerConstant) {
                    final long isVariable = isMethod(isNameExpr.isMethod("isStringConstant"), isStringConstant);
                    final int isVariable = isMethod(isNameExpr.isMethod("isStringConstant"), -isIntegerConstant);
                    final int isVariable = isMethod(isNameExpr.isMethod("isStringConstant"), -isIntegerConstant);
                    isNameExpr = new HighlightingStyle(isNameExpr, isNameExpr, isNameExpr.isMethod("isStringConstant"), isNameExpr != -isIntegerConstant ? new ZLColor(isNameExpr) : null, isNameExpr != -isIntegerConstant ? new ZLColor(isNameExpr) : null);
                }
            }
        }
    }
}
