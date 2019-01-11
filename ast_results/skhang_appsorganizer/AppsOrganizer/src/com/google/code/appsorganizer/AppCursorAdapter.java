// isComment
package com.google.code.appsorganizer;

import android.content.Context;
import android.database.Cursor;
import android.widget.AlphabetIndexer;
import android.widget.SectionIndexer;
import android.widget.SimpleCursorAdapter;

public final class isClassOrIsInterface extends SimpleCursorAdapter implements SectionIndexer {

    private final AlphabetIndexer isVariable;

    public isConstructor(Context isParameter, int isParameter, Cursor isParameter, String[] isParameter, int[] isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = new AlphabetIndexer(isNameExpr, isIntegerConstant, "isStringConstant");
    }

    public int isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public int isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public Object[] isMethod() {
        return isNameExpr.isMethod();
    }
}
