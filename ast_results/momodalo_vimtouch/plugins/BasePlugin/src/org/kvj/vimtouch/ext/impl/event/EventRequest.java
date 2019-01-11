// isComment
package org.kvj.vimtouch.ext.impl.event;

import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.impl.read.NumberFieldReader;

public class isClassOrIsInterface implements Transferable {

    private int isVariable = isIntegerConstant;

    @Override
    public void isMethod(IncomingTransfer isParameter) {
        isNameExpr.isMethod("isStringConstant", new NumberFieldReader() {

            @Override
            public void isMethod(Number isParameter) {
                isNameExpr = isNameExpr.isMethod();
            }
        });
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter) {
    }

    public int isMethod() {
        return isNameExpr;
    }
}
