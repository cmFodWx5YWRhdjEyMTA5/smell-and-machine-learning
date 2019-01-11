// isComment
package com.fsck.k9.mail.store.webdav;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.LinkedList;

/**
 * isComment
 */
class isClassOrIsInterface extends DefaultHandler {

    private DataSet isVariable = new DataSet();

    private final LinkedList<String> isVariable = new LinkedList<>();

    public DataSet isMethod() {
        return this.isFieldAccessExpr;
    }

    @Override
    public void isMethod() throws SAXException {
        this.isFieldAccessExpr = new DataSet();
    }

    @Override
    public void isMethod() throws SAXException {
    /*isComment*/
    }

    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter) {
        isNameExpr.isMethod();
        /**
         * isComment
         */
        if (isNameExpr.isMethod("isStringConstant")) {
            this.isFieldAccessExpr.isMethod();
        }
    }

    @Override
    public void isMethod(char[] isParameter, int isParameter, int isParameter) {
        String isVariable = new String(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
