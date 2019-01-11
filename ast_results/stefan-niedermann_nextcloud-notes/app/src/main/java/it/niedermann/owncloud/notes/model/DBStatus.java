// isComment
package it.niedermann.owncloud.notes.model;

/**
 * isComment
 */
public enum DBStatus {

    /**
     * isComment
     */
    VOID("isStringConstant"),
    /**
     * isComment
     */
    @Deprecated
    LOCAL_CREATED("isStringConstant"),
    /**
     * isComment
     */
    LOCAL_EDITED("isStringConstant"),
    /**
     * isComment
     */
    LOCAL_DELETED("isStringConstant");

    private final String isVariable;

    public String isMethod() {
        return isNameExpr;
    }

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public static DBStatus isMethod(String isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isMethod(isNameExpr);
        }
    }
}
