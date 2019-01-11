// isComment
package org.zoolu.sip.header;

import org.zoolu.tools.Parser;

/**
 * isComment
 */
public class isClassOrIsInterface extends ParametricHeader {

    /**
     * isComment
     */
    private static final char[] isVariable = { 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant' };

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr != null)
            this.isMethod("isStringConstant", isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Header isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        return new Parser(isNameExpr).isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        return this.isMethod("isStringConstant");
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return this.isMethod("isStringConstant");
    }
}
