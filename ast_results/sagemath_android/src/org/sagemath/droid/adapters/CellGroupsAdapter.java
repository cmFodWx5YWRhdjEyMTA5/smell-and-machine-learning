// isComment
package org.sagemath.droid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import org.sagemath.droid.R;
import org.sagemath.droid.models.database.Group;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseAdapter {

    private final Context isVariable;

    private List<Group> isVariable;

    private LayoutInflater isVariable;

    public isConstructor(Context isParameter, List<Group> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(List<Group> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
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
        TextView isVariable;
        if (isNameExpr == null) {
            isNameExpr = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        } else {
            isNameExpr = (TextView) isNameExpr;
        }
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
        return isNameExpr;
    }
}
