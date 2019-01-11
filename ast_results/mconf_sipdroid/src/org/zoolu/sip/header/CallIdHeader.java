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
    public isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
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
        return (new Parser(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }
}
