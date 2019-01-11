// isComment
package com.gh4a.resolver;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import com.gh4a.ServiceFactory;
import com.gh4a.utils.ApiHelpers;
import com.gh4a.utils.Optional;
import com.meisolsson.githubsdk.model.User;
import com.meisolsson.githubsdk.service.users.UserService;
import io.reactivex.Single;

public abstract class isClassOrIsInterface extends UrlLoadTask {

    @VisibleForTesting
    protected final String isVariable;

    public isConstructor(FragmentActivity isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Single<Optional<Intent>> isMethod() {
        UserService isVariable = isNameExpr.isMethod(UserService.class, true);
        return isNameExpr.isMethod(isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(isParameter -> isNameExpr.isMethod(isMethod(isNameExpr)));
    }

    protected abstract Intent isMethod(User isParameter);
}
