// isComment
package org.transdroid.core.gui.rss;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.transdroid.core.rssparser.Channel;
import org.transdroid.core.rssparser.Item;

/**
 * isComment
 */
@EBean
public class isClassOrIsInterface extends BaseAdapter {

    private Channel isVariable = null;

    @RootContext
    protected Context isVariable;

    /**
     * isComment
     */
    public void isMethod(Channel isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public int isMethod() {
        if (isNameExpr == null) {
            return isIntegerConstant;
        }
        return isNameExpr.isMethod().isMethod();
    }

    @Override
    public Item isMethod(int isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        RssitemView isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (RssitemView) isNameExpr;
        }
        isNameExpr.isMethod(isMethod(isNameExpr));
        return isNameExpr;
    }
}
