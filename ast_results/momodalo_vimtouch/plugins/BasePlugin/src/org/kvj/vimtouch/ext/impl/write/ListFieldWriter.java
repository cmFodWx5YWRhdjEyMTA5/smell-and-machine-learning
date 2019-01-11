// isComment
package org.kvj.vimtouch.ext.impl.write;

import java.util.List;
import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface<T> implements FieldWriter<List<T>> {

    private FieldWriter<T> isVariable;

    public isConstructor(FieldWriter<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, List<T> isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        for (T isVariable : isNameExpr) {
            isNameExpr.isMethod(null, isNameExpr, isNameExpr);
        }
    }
}
