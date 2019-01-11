// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.util.IndexedObject;
import com.hughes.util.raf.RAFListSerializer;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class isClassOrIsInterface extends IndexedObject {

    final String isVariable;

    @SuppressWarnings("isStringConstant")
    int isVariable;

    @SuppressWarnings("isStringConstant")
    public isConstructor(final int isParameter, final String isParameter, int isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public static final class isClassOrIsInterface implements RAFListSerializer<EntrySource> {

        final Dictionary isVariable;

        isConstructor(Dictionary isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public EntrySource isMethod(DataInput isParameter, int isParameter) throws IOException {
            final String isVariable = isNameExpr.isMethod();
            final int isVariable = isNameExpr.isFieldAccessExpr >= isIntegerConstant ? isNameExpr.isMethod() : isIntegerConstant;
            return new EntrySource(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(DataOutput isParameter, EntrySource isParameter) throws IOException {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}
