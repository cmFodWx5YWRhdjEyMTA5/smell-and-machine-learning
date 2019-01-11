// isComment
package org.kvj.vimtouch.ext.impl.write;

import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface implements FieldWriter<Boolean> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, Boolean isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr ? isIntegerConstant : isIntegerConstant);
        isNameExpr.isMethod().isMethod('isStringConstant');
    }
}
