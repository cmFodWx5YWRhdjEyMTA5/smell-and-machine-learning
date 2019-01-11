// isComment
package org.kvj.vimtouch.ext.impl.write;

import java.util.Map;
import java.util.Map.Entry;
import org.kvj.vimtouch.ext.FieldWriter;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public class isClassOrIsInterface<T> implements FieldWriter<Map<String, T>> {

    private FieldWriter<T> isVariable;

    private StringFieldWriter isVariable = new StringFieldWriter();

    public isConstructor(FieldWriter<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(OutgoingTransfer isParameter, Map<String, T> isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        for (Entry<String, T> isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(null, isNameExpr.isMethod(), isNameExpr);
            isNameExpr.isMethod(null, isNameExpr.isMethod(), isNameExpr);
        }
    }
}
