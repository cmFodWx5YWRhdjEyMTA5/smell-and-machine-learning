// isComment
package org.kvj.vimtouch.ext.impl.read;

import org.kvj.vimtouch.ext.FieldReader;
import org.kvj.vimtouch.ext.FieldReaderException;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public abstract class isClassOrIsInterface implements FieldReader<Number> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public Number isMethod(IncomingTransfer isParameter) throws FieldReaderException {
        String isVariable = isNameExpr.isMethod();
        try {
            return isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        } catch (Exception isParameter) {
        }
        throw new FieldReaderException("isStringConstant" + isNameExpr);
    }
}
