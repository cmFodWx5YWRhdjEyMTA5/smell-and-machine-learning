// isComment
package org.wordpress.android.models;

import android.support.annotation.StringRes;
import org.wordpress.android.R;
import org.wordpress.android.WordPress;

public enum PeopleListFilter implements FilterCriteria {

    TEAM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), FOLLOWERS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), EMAIL_FOLLOWERS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), VIEWERS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private final int isVariable;

    isConstructor(@StringRes int isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
