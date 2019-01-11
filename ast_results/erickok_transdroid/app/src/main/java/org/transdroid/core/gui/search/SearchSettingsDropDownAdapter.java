// isComment
package org.transdroid.core.gui.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.transdroid.core.gui.lists.SimpleListItem;
import org.transdroid.core.gui.navigation.FilterListItemAdapter;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends FilterListItemAdapter {

    private final Context isVariable;

    public isConstructor(Context isParameter, List<? extends SimpleListItem> isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        // isComment
        SearchSettingSelectionView isVariable;
        if (isNameExpr == null || !(isNameExpr instanceof SearchSettingSelectionView)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (SearchSettingSelectionView) isNameExpr;
        }
        isNameExpr.isMethod((SearchSetting) isMethod(isNameExpr));
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        // isComment
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
