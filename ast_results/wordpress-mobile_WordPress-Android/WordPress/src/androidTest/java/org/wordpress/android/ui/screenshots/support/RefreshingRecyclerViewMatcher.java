// isComment
package org.wordpress.android.ui.screenshots.support;

import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.wordpress.android.ui.FilteredRecyclerView;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private final boolean isVariable;

    public isConstructor(boolean isParameter) {
        super(View.class);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected boolean isMethod(View isParameter) {
        if (isNameExpr instanceof FilteredRecyclerView) {
            FilteredRecyclerView isVariable = (FilteredRecyclerView) isNameExpr;
            return isNameExpr.isMethod() == isNameExpr;
        }
        return true;
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }
}
