// isComment
package org.kvj.vimtouch.ext.manager;

import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.impl.read.StringFieldReader;

public class isClassOrIsInterface implements Transferable {

    private String isVariable = null;

    public isConstructor() {
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(IncomingTransfer isParameter) {
        isNameExpr.isMethod("isStringConstant", new StringFieldReader() {

            @Override
            public void isMethod(String isParameter) {
                isNameExpr = isNameExpr;
            }
        });
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    public String isMethod() {
        return isNameExpr;
    }
}
