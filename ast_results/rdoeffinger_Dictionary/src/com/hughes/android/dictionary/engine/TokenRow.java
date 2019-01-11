// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.android.dictionary.engine.Index.IndexEntry;
import com.ibm.icu.text.Transliterator;
import java.io.DataInput;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends RowBase {

    public final boolean isVariable;

    isConstructor(final DataInput isParameter, final int isParameter, final Index isParameter, final boolean isParameter, int isParameter) throws IOException {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(final int isParameter, final int isParameter, final Index isParameter, final boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isMethod() + "isStringConstant" + isNameExpr;
    }

    @Override
    public TokenRow isMethod(final boolean isParameter) {
        return this;
    }

    @Override
    public void isMethod(TokenRow isParameter) {
        throw new RuntimeException("isStringConstant");
    }

    public String isMethod() {
        return isMethod().isFieldAccessExpr;
    }

    public IndexEntry isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final PrintStream isParameter) {
        final String isVariable = isNameExpr ? "isStringConstant" : "isStringConstant";
        isNameExpr.isMethod(isNameExpr + isMethod() + isNameExpr);
        for (final HtmlEntry isVariable : isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isFieldAccessExpr) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
    }

    @Override
    public String isMethod(boolean isParameter) {
        return isMethod();
    }

    @Override
    public RowMatchType isMethod(List<String> isParameter, final Pattern isParameter, Transliterator isParameter, boolean isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }
}
