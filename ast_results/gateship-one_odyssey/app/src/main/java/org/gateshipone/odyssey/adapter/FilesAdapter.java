// isComment
package org.gateshipone.odyssey.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.gateshipone.odyssey.models.FileModel;
import org.gateshipone.odyssey.viewitems.ListViewItem;

public class isClassOrIsInterface extends GenericSectionAdapter<FileModel> {

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        super();
        isNameExpr = isNameExpr;
        isMethod(true);
    }

    /**
     * isComment
     */
    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        FileModel isVariable = isMethod(isNameExpr);
        ListViewItem isVariable;
        // isComment
        if (isNameExpr != null) {
            isNameExpr = (ListViewItem) isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        } else {
            // isComment
            isNameExpr = new ListViewItem(isNameExpr, isNameExpr, this);
        }
        return isNameExpr;
    }
}
