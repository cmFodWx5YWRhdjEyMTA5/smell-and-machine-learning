// isComment
package net.bible.android.view.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import net.bible.android.activity.R;
import net.bible.android.control.bookmark.BookmarkStyle;
import net.bible.android.view.util.widget.BookmarkStyleAdapterHelper;
import net.bible.android.view.util.widget.ListPrefWrapperAdapter;
import net.bible.service.common.CommonUtils;

/**
 * isComment
 */
class isClassOrIsInterface extends ListPrefWrapperAdapter {

    private Context isVariable;

    private String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private BookmarkStyleAdapterHelper isVariable;

    public isConstructor(Context isParameter, ListAdapter isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = new BookmarkStyleAdapterHelper();
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        TextView isVariable = (TextView) super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        final BookmarkStyle isVariable = isNameExpr.isMethod()[isNameExpr];
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, true, true);
        return isNameExpr;
    }
}
