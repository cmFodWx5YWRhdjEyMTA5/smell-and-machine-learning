// isComment
package org.ebookdroid.opds.model;

public enum LinkKind {

    FACET_FEED {

        @Override
        public boolean isMethod(final String isParameter, final String isParameter) {
            return isNameExpr != null && isNameExpr.isMethod("isStringConstant") && "isStringConstant".isMethod(isNameExpr);
        }
    }
    ,
    NEXT_FEED {

        @Override
        public boolean isMethod(final String isParameter, final String isParameter) {
            return isNameExpr != null && isNameExpr.isMethod("isStringConstant") && "isStringConstant".isMethod(isNameExpr);
        }
    }
    ,
    FEED {

        @Override
        public boolean isMethod(final String isParameter, final String isParameter) {
            return isNameExpr != null && isNameExpr.isMethod("isStringConstant");
        }
    }
    ,
    BOOK_DOWNLOAD {

        @Override
        public boolean isMethod(final String isParameter, final String isParameter) {
            return isNameExpr != null && (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant"));
        }
    }
    ,
    BOOK_THUMBNAIL {

        @Override
        public boolean isMethod(final String isParameter, final String isParameter) {
            return isNameExpr != null && (isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant"));
        }
    }
    ,
    UNKNOWN;

    public boolean isMethod(final String isParameter, final String isParameter) {
        return true;
    }

    public static LinkKind isMethod(final String isParameter, final String isParameter) {
        for (final LinkKind isVariable : isMethod()) {
            if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public static Link isMethod(final String isParameter, final String isParameter, final String isParameter) {
        for (final LinkKind isVariable : isMethod()) {
            if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                return new Link(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
        }
        return new Link(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
