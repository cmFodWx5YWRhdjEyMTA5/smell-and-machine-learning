// isComment
package org.transdroid.core.gui.navigation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import org.transdroid.core.gui.lists.SimpleListItem;
import org.transdroid.core.gui.lists.SimpleListItemView;
import java.util.List;

public class isClassOrIsInterface extends BaseAdapter {

    private final Context isVariable;

    private List<? extends SimpleListItem> isVariable;

    public isConstructor(Context isParameter, List<? extends SimpleListItem> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(List<? extends SimpleListItem> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public SimpleListItem isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        FilterListItemView isVariable;
        if (isNameExpr == null || !(isNameExpr instanceof SimpleListItemView)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (FilterListItemView) isNameExpr;
        }
        isNameExpr.isMethod(isMethod(isNameExpr));
        return isNameExpr;
    }
}
