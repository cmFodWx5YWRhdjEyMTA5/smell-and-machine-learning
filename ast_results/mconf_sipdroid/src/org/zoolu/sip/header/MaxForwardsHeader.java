// isComment
package org.zoolu.sip.header;

import org.zoolu.tools.Parser;

/**
 * isComment
 */
public class isClassOrIsInterface extends Header {

    /**
     * isComment
     */
    public isConstructor(int isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
    }

    public isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public isConstructor(Header isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return (new Parser(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(isMethod() - isIntegerConstant);
    }
}
