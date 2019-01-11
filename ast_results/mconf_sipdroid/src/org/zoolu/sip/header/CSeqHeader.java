// isComment
package org.zoolu.sip.header;

import org.zoolu.sip.provider.SipParser;

/**
 * isComment
 */
public class isClassOrIsInterface extends Header {

    public isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public isConstructor(Header isParameter) {
        super(isNameExpr);
    }

    public isConstructor(long isParameter, String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        SipParser isVariable = new SipParser(isNameExpr);
        // isComment
        isNameExpr.isMethod();
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public long isMethod() {
        return (new SipParser(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        isNameExpr = isMethod() + "isStringConstant" + isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(long isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isMethod();
    }

    /**
     * isComment
     */
    public CSeqHeader isMethod() {
        isNameExpr = isNameExpr.isMethod(isMethod() + isIntegerConstant) + "isStringConstant" + isMethod();
        return this;
    }
}
