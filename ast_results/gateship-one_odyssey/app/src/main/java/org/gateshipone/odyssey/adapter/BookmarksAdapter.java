// isComment
package org.gateshipone.odyssey.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.gateshipone.odyssey.models.BookmarkModel;
import org.gateshipone.odyssey.viewitems.ListViewItem;

public class isClassOrIsInterface extends GenericSectionAdapter<BookmarkModel> {

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        super();
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        BookmarkModel isVariable = isMethod(isNameExpr);
        ListViewItem isVariable;
        // isComment
        if (isNameExpr != null) {
            isNameExpr = (ListViewItem) isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = new ListViewItem(isNameExpr, isNameExpr, this);
        }
        return isNameExpr;
    }
}
