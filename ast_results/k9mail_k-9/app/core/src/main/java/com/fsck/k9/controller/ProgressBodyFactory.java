// isComment
package com.fsck.k9.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Timer;
import java.util.TimerTask;
import com.fsck.k9.mail.DefaultBodyFactory;
import org.apache.commons.io.output.CountingOutputStream;

class isClassOrIsInterface extends DefaultBodyFactory {

    private final ProgressListener isVariable;

    isConstructor(ProgressListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(InputStream isParameter, OutputStream isParameter) throws IOException {
        final CountingOutputStream isVariable = new CountingOutputStream(isNameExpr);
        Timer isVariable = new Timer();
        try {
            isNameExpr.isMethod(new TimerTask() {

                @Override
                public void isMethod() {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
            }, isIntegerConstant, isIntegerConstant);
            super.isMethod(isNameExpr, isNameExpr);
        } finally {
            isNameExpr.isMethod();
        }
    }

    interface isClassOrIsInterface {

        void isMethod(int isParameter);
    }
}
