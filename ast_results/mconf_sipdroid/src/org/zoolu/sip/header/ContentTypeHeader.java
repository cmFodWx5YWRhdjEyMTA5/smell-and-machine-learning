// isComment
package org.zoolu.sip.header;

import org.zoolu.sip.provider.SipParser;

/**
 * isComment
 */
public class isClassOrIsInterface extends ParametricHeader {

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
        String isVariable;
        int isVariable = (new SipParser(isNameExpr)).isMethod('isStringConstant');
        if (isNameExpr < isIntegerConstant)
            isNameExpr = isNameExpr;
        else
            isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        return (new SipParser(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }
}
