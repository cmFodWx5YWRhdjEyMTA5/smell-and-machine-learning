// isComment
package org.wordpress.android.ui.reader.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class isClassOrIsInterface extends RecyclerView {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(Context isParameter) {
        if (!isMethod()) {
            isMethod(new LinearLayoutManager(isNameExpr));
        }
    }
}
