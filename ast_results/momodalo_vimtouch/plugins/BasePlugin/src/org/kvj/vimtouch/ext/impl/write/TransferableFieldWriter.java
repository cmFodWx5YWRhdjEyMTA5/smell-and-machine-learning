// isComment
package org.kvj.vimtouch.ext.impl.write;

import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface implements FieldWriter<Transferable> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, Transferable isParameter) {
        // isComment
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }
}
