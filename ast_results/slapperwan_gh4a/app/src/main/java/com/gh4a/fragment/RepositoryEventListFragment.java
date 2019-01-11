// isComment
package com.gh4a.fragment;

import android.os.Bundle;
import com.gh4a.ServiceFactory;
import com.meisolsson.githubsdk.model.GitHubEvent;
import com.meisolsson.githubsdk.model.Page;
import com.meisolsson.githubsdk.model.Repository;
import com.meisolsson.githubsdk.service.activity.EventService;
import io.reactivex.Single;
import retrofit2.Response;

public class isClassOrIsInterface extends EventListFragment {

    private Repository isVariable;

    public static RepositoryEventListFragment isMethod(Repository isParameter) {
        RepositoryEventListFragment isVariable = new RepositoryEventListFragment();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod().isMethod("isStringConstant");
    }

    @Override
    protected Single<Response<Page<GitHubEvent>>> isMethod(int isParameter, boolean isParameter) {
        final EventService isVariable = isNameExpr.isMethod(EventService.class, isNameExpr);
        return isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(), isNameExpr);
    }
}
