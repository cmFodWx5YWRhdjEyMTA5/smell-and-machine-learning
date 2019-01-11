// isComment
package com.github.mobile.ui.project;

import android.app.Activity;
import android.text.TextUtils;
import com.github.kevinsawicki.wishlist.SingleTypeAdapter;
import com.github.mobile.R;
import com.github.mobile.api.model.Project;
import com.github.mobile.util.TimeUtils;

/**
 * isComment
 */
public class isClassOrIsInterface extends SingleTypeAdapter<Project> {

    private final String isVariable;

    /**
     * isComment
     */
    public isConstructor(Activity isParameter, Project[] isParameter) {
        super(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    @Override
    protected int[] isMethod() {
        return new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr };
    }

    @Override
    protected void isMethod(int isParameter, Project isParameter) {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)));
    }
}
