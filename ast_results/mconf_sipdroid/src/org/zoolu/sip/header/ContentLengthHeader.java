// isComment
package org.zoolu.sip.header;

import org.zoolu.sip.provider.SipParser;

/**
 * isComment
 */
public class isClassOrIsInterface extends Header {

    public isConstructor(int isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
    }

    public isConstructor(Header isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return (new SipParser(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }
}
