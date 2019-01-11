// isComment
package com.fsck.k9.mail.filter;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * isComment
 */
public class isClassOrIsInterface extends FilterOutputStream {

    private static final byte[] isVariable = new byte[] { 'isStringConstant', 'isStringConstant', 'isStringConstant' };

    private static final int isVariable = isIntegerConstant;

    private State isVariable = isNameExpr.isFieldAccessExpr;

    private final byte[] isVariable;

    private int isVariable;

    private boolean isVariable = true;

    public isConstructor(OutputStream isParameter) {
        super(isNameExpr);
        isNameExpr = new byte[isNameExpr];
    }

    public void isMethod(byte isParameter) throws IOException {
        State isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isMethod(isNameExpr[isIntegerConstant]);
            isMethod(isNameExpr[isIntegerConstant]);
            isMethod(isNameExpr[isIntegerConstant]);
        } else {
            isNameExpr = isNameExpr;
            isMethod(isNameExpr);
        }
    }

    private void isMethod(byte isParameter) throws IOException {
        isNameExpr[isNameExpr++] = isNameExpr;
        if (isNameExpr >= isNameExpr.isFieldAccessExpr) {
            isMethod();
        }
    }

    void isMethod() throws IOException {
        if (isNameExpr < isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = isIntegerConstant;
    }

    @Override
    public void isMethod(int isParameter) throws IOException {
        if (isNameExpr) {
            throw new IOException("isStringConstant");
        }
        isMethod((byte) isNameExpr);
    }

    @Override
    public void isMethod(byte[] isParameter, int isParameter, int isParameter) throws IOException {
        if (isNameExpr) {
            throw new IOException("isStringConstant");
        }
        for (int isVariable = isNameExpr; isNameExpr < isNameExpr + isNameExpr; isNameExpr++) {
            isMethod(isNameExpr[isNameExpr]);
        }
    }

    @Override
    public void isMethod() throws IOException {
        isMethod();
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() throws IOException {
        if (isNameExpr) {
            return;
        }
        try {
            isMethod();
        } finally {
            isNameExpr = true;
        }
    }

    enum State {

        INIT {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        lf_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        cr_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        F_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        R_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        O_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        M_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ,
        SPACE_FROM {

            @Override
            public State isMethod(int isParameter) {
                switch(isNameExpr) {
                    case 'isStringConstant':
                        return isNameExpr;
                    default:
                        return isNameExpr;
                }
            }
        }
        ;

        public abstract State isMethod(int isParameter);
    }
}
