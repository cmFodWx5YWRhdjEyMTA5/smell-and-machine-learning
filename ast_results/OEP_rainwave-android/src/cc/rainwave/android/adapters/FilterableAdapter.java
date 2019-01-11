// isComment
package cc.rainwave.android.adapters;

import java.util.Arrays;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import cc.rainwave.android.widget.SubsequenceFilter;

/**
 * isComment
 */
public class isClassOrIsInterface<T> extends ArrayAdapter<T> {

    private Filter isVariable;

    private List<T> isVariable;

    public isConstructor(Context isParameter, int isParameter, T[] isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    public isConstructor(Context isParameter, int isParameter, List<T> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    public T isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Filter isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new SubsequenceFilter<T>(true, isNameExpr) {

                @SuppressWarnings("isStringConstant")
                @Override
                protected void isMethod(CharSequence isParameter, FilterResults isParameter) {
                    isNameExpr = (List<T>) isNameExpr.isFieldAccessExpr;
                    if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                        isMethod();
                    } else {
                        isMethod();
                    }
                }
            };
        }
        return isNameExpr;
    }
}
