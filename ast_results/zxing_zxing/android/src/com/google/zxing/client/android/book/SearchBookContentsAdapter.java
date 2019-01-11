// isComment
package com.google.zxing.client.android.book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import com.google.zxing.client.android.R;

/**
 * isComment
 */
final class isClassOrIsInterface extends ArrayAdapter<SearchBookContentsResult> {

    isConstructor(Context isParameter, List<SearchBookContentsResult> isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr);
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        SearchBookContentsListItem isVariable;
        if (isNameExpr == null) {
            LayoutInflater isVariable = isNameExpr.isMethod(isMethod());
            isNameExpr = (SearchBookContentsListItem) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        } else {
            if (isNameExpr instanceof SearchBookContentsListItem) {
                isNameExpr = (SearchBookContentsListItem) isNameExpr;
            } else {
                return isNameExpr;
            }
        }
        SearchBookContentsResult isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }
}
