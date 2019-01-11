// isComment
package budo.budoist.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<Integer> {

    private Context isVariable;

    private LayoutInflater isVariable;

    private int isVariable;

    public isConstructor(Context isParameter, int isParameter, Integer[] isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        }
        isNameExpr.isMethod((isIntegerConstant << isIntegerConstant) | this.isMethod(isNameExpr));
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, null);
        }
        isNameExpr.isMethod((isIntegerConstant << isIntegerConstant) | this.isMethod(isNameExpr));
        return isNameExpr;
    }
}
