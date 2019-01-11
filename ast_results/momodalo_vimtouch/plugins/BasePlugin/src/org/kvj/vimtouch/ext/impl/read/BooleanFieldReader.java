// isComment
package org.kvj.vimtouch.ext.impl.read;

import org.kvj.vimtouch.ext.FieldReader;
import org.kvj.vimtouch.ext.FieldReaderException;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public abstract class isClassOrIsInterface implements FieldReader<Boolean> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public Boolean isMethod(IncomingTransfer isParameter) throws FieldReaderException {
        int isVariable = isNameExpr.isMethod();
        return isNameExpr != isIntegerConstant;
    }
}
