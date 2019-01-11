// isComment
package com.google.zxing.client.result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ParsedResult {

    private final String isVariable;

    isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }
}
