// isComment
package com.fsck.k9.mail.filter;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * isComment
 */
public class isClassOrIsInterface extends FilterInputStream {

    private boolean isVariable;

    private int isVariable;

    public isConstructor(InputStream isParameter) {
        super(isNameExpr);
    }

    @Override
    public int isMethod() throws IOException {
        if (!isNameExpr) {
            return isNameExpr.isMethod();
        } else {
            isNameExpr = true;
            return isNameExpr;
        }
    }

    public int isMethod() throws IOException {
        if (!isNameExpr) {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = true;
        }
        return isNameExpr;
    }

    @Override
    public int isMethod(byte[] isParameter, int isParameter, int isParameter) throws IOException {
        if (!isNameExpr) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else {
            isNameExpr[isNameExpr] = (byte) isNameExpr;
            isNameExpr = true;
            int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr + isIntegerConstant, isNameExpr - isIntegerConstant);
            if (isNameExpr == -isIntegerConstant) {
                return isIntegerConstant;
            } else {
                return isNameExpr + isIntegerConstant;
            }
        }
    }

    @Override
    public int isMethod(byte[] isParameter) throws IOException {
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod(), isNameExpr, isNameExpr);
    }
}
