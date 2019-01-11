// isComment
package org.transdroid.core.gui.remoterss;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import org.transdroid.core.gui.remoterss.data.RemoteRssItem;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface extends BaseAdapter {

    protected Context isVariable;

    protected List<RemoteRssItem> isVariable;

    public isConstructor(Context isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new ArrayList<>();
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Object isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        RemoteRssItemView isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (RemoteRssItemView) isNameExpr;
        }
        isNameExpr.isMethod((RemoteRssItem) isMethod(isNameExpr));
        return isNameExpr;
    }

    public void isMethod(List<RemoteRssItem> isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
    }
}
