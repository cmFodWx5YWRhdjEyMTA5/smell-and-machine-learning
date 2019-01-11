// isComment
package org.kvj.vimtouch.ext.impl.read;

import org.kvj.vimtouch.ext.FieldReader;
import org.kvj.vimtouch.ext.FieldReaderException;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public abstract class isClassOrIsInterface<T extends Transferable> implements FieldReader<T> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public T isMethod(IncomingTransfer isParameter) throws FieldReaderException {
        String isVariable = isNameExpr.isMethod();
        T isVariable = isMethod();
        IncomingTransfer isVariable = new IncomingTransfer(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }

    public abstract T isMethod();
}
