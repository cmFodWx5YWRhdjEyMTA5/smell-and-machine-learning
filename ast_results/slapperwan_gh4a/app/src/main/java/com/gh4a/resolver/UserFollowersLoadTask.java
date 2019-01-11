// isComment
package com.gh4a.resolver;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import com.gh4a.activities.FollowerFollowingListActivity;
import com.gh4a.activities.UserActivity;
import com.meisolsson.githubsdk.model.User;
import com.meisolsson.githubsdk.model.UserType;

public class isClassOrIsInterface extends UserLoadTask {

    @VisibleForTesting
    protected final boolean isVariable;

    public isConstructor(FragmentActivity isParameter, String isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Intent isMethod(User isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
    }
}
