// isComment
package org.qii.weiciyuan.ui.actionmenu;

import org.qii.weiciyuan.bean.MessageBean;
import org.qii.weiciyuan.ui.adapter.StatusListAdapter;
import android.support.v4.app.Fragment;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * isComment
 */
public class isClassOrIsInterface extends StatusSingleChoiceModeListener {

    private LinearLayout isVariable;

    private int isVariable;

    public isConstructor(ListView isParameter, StatusListAdapter isParameter, Fragment isParameter, LinearLayout isParameter, MessageBean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = this.isFieldAccessExpr.isMethod();
    }

    @Override
    public boolean isMethod(ActionMode isParameter, Menu isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ActionMode isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        super.isMethod(isNameExpr);
    }
}
