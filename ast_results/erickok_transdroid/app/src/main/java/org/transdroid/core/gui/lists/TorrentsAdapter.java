// isComment
package org.transdroid.core.gui.lists;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.transdroid.daemon.Torrent;
import java.util.ArrayList;

/**
 * isComment
 */
@EBean
public class isClassOrIsInterface extends BaseAdapter {

    private ArrayList<Torrent> isVariable = null;

    @RootContext
    protected Context isVariable;

    /**
     * isComment
     */
    public void isMethod(ArrayList<Torrent> isParameter) {
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
        return isNameExpr.isMethod();
    }

    @Override
    public Torrent isMethod(int isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        TorrentView isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (TorrentView) isNameExpr;
        }
        isNameExpr.isMethod(isMethod(isNameExpr));
        return isNameExpr;
    }
}
