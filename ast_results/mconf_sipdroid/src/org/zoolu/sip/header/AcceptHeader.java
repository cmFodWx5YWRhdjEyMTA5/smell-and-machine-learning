// isComment
package org.zoolu.sip.header;

/**
 * isComment
 */
public class isClassOrIsInterface extends ParametricHeader {

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, "isStringConstant");
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
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }
}
