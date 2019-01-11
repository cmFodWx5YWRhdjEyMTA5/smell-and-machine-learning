// isComment
package org.kvj.vimtouch.ext.impl.read;

import org.kvj.vimtouch.ext.FieldReader;
import org.kvj.vimtouch.ext.FieldReaderException;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public abstract class isClassOrIsInterface implements FieldReader<String> {

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(IncomingTransfer isParameter) throws FieldReaderException {
        return isNameExpr.isMethod();
    }
}
