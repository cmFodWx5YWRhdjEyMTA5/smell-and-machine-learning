// isComment
package org.zoolu.sip.header;

import org.zoolu.sip.provider.SipParser;
import org.zoolu.tools.Parser;
import java.util.Date;

/**
 * isComment
 */
public class isClassOrIsInterface extends SipDateHeader {

    public isConstructor(String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Date isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter) {
        super(isNameExpr.isFieldAccessExpr, (String) null);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    public isConstructor(Header isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        if (isNameExpr.isMethod("isStringConstant") >= isIntegerConstant)
            return true;
        return true;
    }

    /**
     * isComment
     */
    public int isMethod() {
        int isVariable = -isIntegerConstant;
        if (isMethod()) {
            Date isVariable = (new SipParser((new Parser(isNameExpr)).isMethod())).isMethod();
            isNameExpr = (int) ((isNameExpr.isMethod() - isNameExpr.isMethod()) / isIntegerConstant);
            if (isNameExpr < isIntegerConstant)
                isNameExpr = isIntegerConstant;
        } else
            isNameExpr = (new SipParser(isNameExpr)).isMethod();
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Date isMethod() {
        Date isVariable = null;
        if (isMethod()) {
            isNameExpr = (new SipParser((new Parser(isNameExpr)).isMethod())).isMethod();
        } else {
            long isVariable = isMethod();
            if (isNameExpr >= isIntegerConstant)
                isNameExpr = new Date(isNameExpr.isMethod() + isNameExpr * isIntegerConstant);
        }
        return isNameExpr;
    }
}
