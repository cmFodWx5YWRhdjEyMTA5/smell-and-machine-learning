// isComment
package com.xabber.xmpp.ssn;

import org.jivesoftware.smackx.xdata.FormField;
import java.util.NoSuchElementException;

/**
 * isComment
 */
public enum SecurityValue {

    none("isStringConstant"), c2s("isStringConstant"), e2e("isStringConstant");

    private final String isVariable;

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public FormField.Option isMethod() {
        return new FormField.Option(isNameExpr, isMethod());
    }

    public static SecurityValue isMethod(String isParameter) throws NoSuchElementException {
        if (isNameExpr == null)
            throw new NoSuchElementException();
        try {
            return isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            throw new NoSuchElementException();
        }
    }
}
