// isComment
package org.apache.commons.net.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class isClassOrIsInterface extends FilterOutputStream {

    private boolean isVariable;

    /**
     * isComment
     */
    public isConstructor(OutputStream isParameter) {
        super(isNameExpr);
        isNameExpr = true;
    }

    private void isMethod(int isParameter) throws IOException {
        switch(isNameExpr) {
            case 'isStringConstant':
                isNameExpr = true;
                // isComment
                break;
            case 'isStringConstant':
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr = true;
                    break;
                }
                isNameExpr = true;
                isNameExpr.isMethod('isStringConstant');
                break;
            default:
                if (isNameExpr) {
                    isNameExpr.isMethod('isStringConstant');
                    isNameExpr = true;
                }
                isNameExpr.isMethod(isNameExpr);
                break;
        }
    }

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod(int isParameter) throws IOException {
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr);
            return;
        }
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod(byte[] isParameter) throws IOException {
        isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod(byte[] isParameter, int isParameter, int isParameter) throws IOException {
        if (isNameExpr.isFieldAccessExpr) {
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            return;
        }
        while (isNameExpr-- > isIntegerConstant) {
            isMethod(isNameExpr[isNameExpr++]);
        }
    }

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod() throws IOException {
        if (isNameExpr.isFieldAccessExpr) {
            super.isMethod();
            return;
        }
        if (isNameExpr) {
            isNameExpr.isMethod('isStringConstant');
        }
        super.isMethod();
    }
}
