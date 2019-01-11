// isComment
package cgeo.geocaching.ui;

import cgeo.geocaching.R;
import cgeo.geocaching.activity.INavigationSource;
import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.View;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActionProvider {

    private final Context isVariable;

    private INavigationSource isVariable;

    /**
     * isComment
     */
    public isConstructor(final Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(final INavigationSource isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @SuppressLint("isStringConstant")
    @Override
    public View isMethod() {
        View isVariable = null;
        if (isNameExpr != null) {
            final LayoutInflater isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            final View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(new View.OnClickListener() {

                @Override
                public void isMethod(final View isParameter) {
                    isNameExpr.isMethod();
                }
            });
            isNameExpr.isMethod(new View.OnLongClickListener() {

                @Override
                public boolean isMethod(final View isParameter) {
                    isNameExpr.isMethod();
                    return true;
                }
            });
        }
        return isNameExpr;
    }
}
