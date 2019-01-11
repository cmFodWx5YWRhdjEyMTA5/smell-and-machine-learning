// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.util.raf.RAFListSerializer;
import com.hughes.util.raf.RAFSerializable;
import com.ibm.icu.text.Transliterator;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends AbstractEntry implements RAFSerializable<TextEntry> {

    private final String isVariable;

    private isConstructor(final Dictionary isParameter, final DataInput isParameter, final int isParameter) throws IOException {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        throw new RuntimeException("isStringConstant");
    }

    @Override
    public void isMethod(DataOutput isParameter) throws IOException {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    static final class isClassOrIsInterface implements RAFListSerializer<TextEntry> {

        final Dictionary isVariable;

        isConstructor(Dictionary isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public TextEntry isMethod(DataInput isParameter, final int isParameter) throws IOException {
            return new TextEntry(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(DataOutput isParameter, TextEntry isParameter) throws IOException {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(final Dictionary isParameter) {
        assert isNameExpr == -isIntegerConstant;
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod() - isIntegerConstant;
    }

    @Override
    public RowBase isMethod(int isParameter, Index isParameter) {
        throw new UnsupportedOperationException("isStringConstant");
    }

    public static class isClassOrIsInterface extends RowBase {

        isConstructor(final DataInput isParameter, final int isParameter, final Index isParameter, int isParameter) throws IOException {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }

        TextEntry isMethod() {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }

        @Override
        public void isMethod(PrintStream isParameter) {
            isNameExpr.isMethod("isStringConstant" + isMethod().isFieldAccessExpr);
        }

        @Override
        public String isMethod(boolean isParameter) {
            return isMethod().isFieldAccessExpr;
        }

        @Override
        public RowMatchType isMethod(final List<String> isParameter, final Pattern isParameter, Transliterator isParameter, boolean isParameter) {
            return null;
        }
    }
}
