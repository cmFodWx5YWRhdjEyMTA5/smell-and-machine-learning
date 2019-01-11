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

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod(int isParameter) throws IOException {
        switch(isNameExpr) {
            case 'isStringConstant':
                isNameExpr = true;
                isNameExpr.isMethod('isStringConstant');
                return;
            case 'isStringConstant':
                if (!isNameExpr)
                    isNameExpr.isMethod('isStringConstant');
            // isComment
            default:
                isNameExpr = true;
                isNameExpr.isMethod(isNameExpr);
                return;
        }
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
        while (isNameExpr-- > isIntegerConstant) isMethod(isNameExpr[isNameExpr++]);
    }
}
