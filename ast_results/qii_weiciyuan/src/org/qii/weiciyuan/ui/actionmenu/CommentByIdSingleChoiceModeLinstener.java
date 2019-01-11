// isComment
package org.qii.weiciyuan.ui.actionmenu;

import org.qii.weiciyuan.bean.CommentBean;
import android.support.v4.app.Fragment;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommentSingleChoiceModeListener {

    private LinearLayout isVariable;

    private int isVariable;

    public isConstructor(ListView isParameter, BaseAdapter isParameter, Fragment isParameter, LinearLayout isParameter, CommentBean isParameter) {
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
    public boolean isMethod(ActionMode isParameter, Menu isParameter) {
        isMethod(isNameExpr, isNameExpr);
        // isComment
        return true;
    }

    @Override
    public void isMethod(ActionMode isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        super.isMethod(isNameExpr);
    }
}
