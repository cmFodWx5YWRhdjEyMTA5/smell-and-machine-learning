// isComment
package org.kvj.vimtouch.ext.impl.write;

import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface implements FieldWriter<String> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
