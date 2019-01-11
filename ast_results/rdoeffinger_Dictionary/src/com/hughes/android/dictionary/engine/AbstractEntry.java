// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.util.IndexedObject;
import com.hughes.util.StringUtil;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class isClassOrIsInterface extends IndexedObject {

    public final EntrySource isVariable;

    isConstructor(EntrySource isParameter) {
        super(-isIntegerConstant);
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(Dictionary isParameter, DataInput isParameter, final int isParameter) throws IOException {
        super(isNameExpr);
        if (isNameExpr.isFieldAccessExpr >= isIntegerConstant) {
            final int isVariable = isNameExpr.isFieldAccessExpr >= isIntegerConstant ? isNameExpr.isMethod(isNameExpr) : isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        } else {
            this.isFieldAccessExpr = null;
        }
    }

    void isMethod(DataOutput isParameter) throws IOException {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    public abstract void isMethod(final Dictionary isParameter);

    public abstract RowBase isMethod(int isParameter, Index isParameter);
}
