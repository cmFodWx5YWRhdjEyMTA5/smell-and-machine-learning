// isComment
package org.kvj.vimtouch.ext.impl.read;

import java.util.ArrayList;
import java.util.List;
import org.kvj.vimtouch.ext.FieldReader;
import org.kvj.vimtouch.ext.FieldReaderException;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.Transferable.FieldType;

public abstract class isClassOrIsInterface<T> implements FieldReader<List<T>> {

    private FieldReader<T> isVariable;

    public isConstructor(FieldReader<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public FieldType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public List<T> isMethod(IncomingTransfer isParameter) throws FieldReaderException {
        int isVariable = isNameExpr.isMethod();
        List<T> isVariable = new ArrayList<T>(isNameExpr);
        isMethod(isNameExpr);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            T isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    public abstract void isMethod(T isParameter);
}
