// isComment
package com.gh4a.resolver;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import com.gh4a.ServiceFactory;
import com.gh4a.activities.PullRequestDiffViewerActivity;
import com.gh4a.utils.ApiHelpers;
import com.gh4a.utils.RxUtils;
import com.meisolsson.githubsdk.model.GitHubFile;
import com.meisolsson.githubsdk.model.ReviewComment;
import com.meisolsson.githubsdk.service.pull_request.PullRequestReviewCommentService;
import com.meisolsson.githubsdk.service.pull_request.PullRequestService;
import java.util.List;
import io.reactivex.Single;

public class isClassOrIsInterface extends DiffLoadTask<ReviewComment> {

    @VisibleForTesting
    protected final int isVariable;

    public isConstructor(FragmentActivity isParameter, String isParameter, String isParameter, DiffHighlightId isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Intent isMethod(String isParameter, GitHubFile isParameter, List<ReviewComment> isParameter, DiffHighlightId isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, -isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null);
    }

    @Override
    protected Single<String> isMethod() {
        PullRequestService isVariable = isNameExpr.isMethod(PullRequestService.class, true);
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(isParameter -> isNameExpr.isMethod().isMethod());
    }

    @Override
    protected Single<List<GitHubFile>> isMethod() {
        final PullRequestService isVariable = isNameExpr.isMethod(PullRequestService.class, true);
        return isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr));
    }

    @Override
    protected Single<List<ReviewComment>> isMethod() {
        final PullRequestReviewCommentService isVariable = isNameExpr.isMethod(PullRequestReviewCommentService.class, true);
        return isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr)).isMethod(isNameExpr.isMethod(isParameter -> isNameExpr.isMethod() != null));
    }
}
