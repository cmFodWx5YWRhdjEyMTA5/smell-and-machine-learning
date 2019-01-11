// isComment
package com.eleybourn.bookcatalogue.goodreads.api;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.eleybourn.bookcatalogue.goodreads.api.XmlFilter.ElementContext;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultHandler {

    /**
     * isComment
     */
    StringBuilder isVariable = new StringBuilder();

    /**
     * isComment
     */
    ArrayList<ElementContext> isVariable = new ArrayList<ElementContext>();

    /**
     * isComment
     */
    public isConstructor(XmlFilter isParameter) {
        // isComment
        ElementContext isVariable = new ElementContext(null, null, null, null, null);
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(char[] isParameter, int isParameter, int isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        // isComment
        ElementContext isVariable = isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
        // isComment
        XmlFilter isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        ElementContext isVariable = new ElementContext(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
        // isComment
        if (isNameExpr != null) {
            // isComment
            XmlFilter isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isFieldAccessExpr = isNameExpr;
            // isComment
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        ElementContext isVariable = isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
        // isComment
        if (!isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            throw new RuntimeException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        }
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        // isComment
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
