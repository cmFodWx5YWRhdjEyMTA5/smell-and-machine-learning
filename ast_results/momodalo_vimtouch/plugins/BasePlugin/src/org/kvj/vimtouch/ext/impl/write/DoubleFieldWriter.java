// isComment
package org.kvj.vimtouch.ext.impl.write;

import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface implements FieldWriter<Double> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, Double isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod('isStringConstant');
    }
}
