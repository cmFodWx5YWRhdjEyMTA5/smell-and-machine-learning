// isComment
package net.bible.android.view.activity.bookmark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import net.bible.android.view.util.UiUtils;
import net.bible.android.view.util.widget.BookmarkStyleAdapterHelper;
import net.bible.service.db.bookmark.LabelDto;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<LabelDto> {

    private int isVariable;

    private BookmarkStyleAdapterHelper isVariable = new BookmarkStyleAdapterHelper();

    private static final String isVariable = "isStringConstant";

    public isConstructor(Context isParameter, int isParameter, List<LabelDto> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        final LabelDto isVariable = isMethod(isNameExpr);
        View isVariable;
        if (isNameExpr == null) {
            LayoutInflater isVariable = (LayoutInflater) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        } else {
            isNameExpr = isNameExpr;
        }
        CheckedTextView isVariable = (CheckedTextView) isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr.isMethod() == null) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isMethod(), true, true);
        }
        return isNameExpr;
    }
}
