// isComment
package de.tum.in.tumcampusapp.component.ui.barrierfree;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.component.other.generic.adapter.SimpleStickyListHeadersAdapter;
import de.tum.in.tumcampusapp.component.ui.barrierfree.model.BarrierfreeMoreInfo;

public class isClassOrIsInterface extends SimpleStickyListHeadersAdapter<BarrierfreeMoreInfo> {

    public isConstructor(Context isParameter, List<BarrierfreeMoreInfo> isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        final ViewHolder isVariable;
        View isVariable = isNameExpr;
        if (isNameExpr == null) {
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            // isComment
            isNameExpr = new ViewHolder();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (ViewHolder) isNameExpr.isMethod();
        }
        // isComment
        final BarrierfreeMoreInfo isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    // isComment
    static class isClassOrIsInterface {

        TextView isVariable;
    }
}
