// isComment
package org.transdroid.daemon;

public enum OS {

    Windows {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    , Mac {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    , Linux {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ;

    public static String isMethod(OS isParameter) {
        if (isNameExpr == null)
            return null;
        switch(isNameExpr) {
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            default:
                return null;
        }
    }

    public static OS isMethod(String isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        }
        return null;
    }

    public abstract String isMethod();
}
