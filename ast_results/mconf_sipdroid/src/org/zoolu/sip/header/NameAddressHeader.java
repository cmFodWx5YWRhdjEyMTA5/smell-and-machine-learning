// isComment
package org.zoolu.sip.header;

import org.zoolu.sip.address.*;
import org.zoolu.sip.provider.SipParser;
import org.zoolu.tools.Parser;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ParametricHeader {

    /**
     * isComment
     */
    public isConstructor(String isParameter, NameAddress isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, SipURL isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
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
    public NameAddress isMethod() {
        NameAddress isVariable = (new SipParser(isNameExpr)).isMethod();
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(NameAddress isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    // isComment
    /**
     * isComment
     */
    protected int isMethod() {
        Parser isVariable = new Parser(isNameExpr);
        isNameExpr.isMethod('isStringConstant');
        if (isNameExpr.isMethod() == isNameExpr.isMethod())
            isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod('isStringConstant');
        if (isNameExpr.isMethod() < isNameExpr.isMethod())
            return isNameExpr.isMethod();
        else
            return -isIntegerConstant;
    }
}
