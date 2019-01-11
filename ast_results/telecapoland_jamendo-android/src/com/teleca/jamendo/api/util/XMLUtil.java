// isComment
package com.teleca.jamendo.api.util;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    private static DocumentBuilderFactory isVariable = null;

    /**
     * isComment
     */
    private static DocumentBuilderFactory isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private static DocumentBuilder isMethod() {
        try {
            return isMethod().isMethod();
        } catch (ParserConfigurationException isParameter) {
            return null;
        }
    }

    /**
     * isComment
     */
    public static Document isMethod(String isParameter) {
        if (isNameExpr == null)
            return null;
        DocumentBuilder isVariable = isMethod();
        InputSource isVariable = new InputSource(new StringReader(isNameExpr));
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (SAXException isParameter) {
            isNameExpr.isMethod();
            return null;
        } catch (IOException isParameter) {
            isNameExpr.isMethod();
            return null;
        }
    }
}
