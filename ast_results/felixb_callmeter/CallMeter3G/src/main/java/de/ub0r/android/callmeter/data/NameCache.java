// isComment
package de.ub0r.android.callmeter.data;

import android.support.v4.util.LruCache;

/**
 * isComment
 */
public final class isClassOrIsInterface extends LruCache<String, String> {

    /**
     * isComment
     */
    private static final int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    private static NameCache isVariable;

    /**
     * isComment
     */
    public static NameCache isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new NameCache();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private isConstructor() {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod(final String isParameter, final String isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (isNameExpr == null) {
            return null;
        } else {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }
}
