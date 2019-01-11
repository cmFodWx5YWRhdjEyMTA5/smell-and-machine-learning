// isComment
package com.xabber.xmpp.ssn;

import org.jivesoftware.smackx.xdata.FormField;
import java.util.NoSuchElementException;

/**
 * isComment
 */
public enum DisclosureValue {

    never("isStringConstant"), disabled("isStringConstant"), enabled("isStringConstant");

    private final String isVariable;

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public FormField.Option isMethod() {
        return new FormField.Option(isNameExpr, isMethod());
    }

    public static DisclosureValue isMethod(String isParameter) throws NoSuchElementException {
        if (isNameExpr == null)
            throw new NoSuchElementException();
        try {
            return isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            throw new NoSuchElementException();
        }
    }
}
