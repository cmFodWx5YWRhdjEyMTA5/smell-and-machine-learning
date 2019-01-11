// isComment
package com.pindroid.listadapter;

import com.pindroid.providers.TagContent.Tag;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;

public class isClassOrIsInterface extends SimpleCursorAdapter {

    public isConstructor(Context isParameter, int isParameter, Cursor isParameter, String[] isParameter, int[] isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public CharSequence isMethod(Cursor isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }
}
