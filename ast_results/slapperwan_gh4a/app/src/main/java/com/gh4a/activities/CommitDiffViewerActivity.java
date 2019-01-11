// isComment
package com.gh4a.activities;

import android.content.Context;
import android.content.Intent;
import com.gh4a.ServiceFactory;
import com.gh4a.utils.ApiHelpers;
import com.gh4a.utils.IntentUtils;
import com.gh4a.utils.RxUtils;
import com.gh4a.widget.ReactionBar;
import com.meisolsson.githubsdk.model.PositionalCommentBase;
import com.meisolsson.githubsdk.model.Reaction;
import com.meisolsson.githubsdk.model.Reactions;
import com.meisolsson.githubsdk.model.git.GitComment;
import com.meisolsson.githubsdk.model.request.ReactionRequest;
import com.meisolsson.githubsdk.service.reactions.ReactionService;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommentService;
import java.util.List;
import io.reactivex.Single;
import retrofit2.Response;

public class isClassOrIsInterface extends DiffViewerActivity<GitComment> {

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter, String isParameter, String isParameter, String isParameter, List<GitComment> isParameter, int isParameter, int isParameter, boolean isParameter, IntentUtils.InitialCommentMarker isParameter) {
        return isNameExpr.isMethod(new Intent(isNameExpr, CommitDiffViewerActivity.class), isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, -isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected Intent isMethod() {
        return isNameExpr.isMethod(this, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod(String isParameter, long isParameter) {
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        if (isNameExpr > isStringConstant) {
            isNameExpr += "isStringConstant" + isNameExpr;
        } else {
            isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr) + isNameExpr;
        }
        return isNameExpr;
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    protected PositionalCommentBase isMethod(PositionalCommentBase isParameter, Reactions isParameter) {
        return ((GitComment) isNameExpr).isMethod().isMethod(isNameExpr).isMethod();
    }

    @Override
    protected void isMethod(long isParameter, long isParameter, String isParameter, int isParameter, int isParameter, int isParameter, PositionalCommentBase isParameter) {
        String isVariable = isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod();
        Intent isVariable = isNameExpr.isMethod(this, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public Single<Response<Void>> isMethod(long isParameter) {
        RepositoryCommentService isVariable = isNameExpr.isMethod(RepositoryCommentService.class, true);
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected Single<List<GitComment>> isMethod(boolean isParameter) {
        final RepositoryCommentService isVariable = isNameExpr.isMethod(RepositoryCommentService.class, isNameExpr);
        return isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr)).isMethod(isNameExpr.isMethod(isParameter -> isNameExpr.isMethod() != null));
    }

    @Override
    public Single<List<Reaction>> isMethod(ReactionBar.Item isParameter, boolean isParameter) {
        final CommitCommentWrapper isVariable = (CommitCommentWrapper) isNameExpr;
        final ReactionService isVariable = isNameExpr.isMethod(ReactionService.class, isNameExpr);
        return isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr));
    }

    @Override
    public Single<Reaction> isMethod(ReactionBar.Item isParameter, String isParameter) {
        CommitCommentWrapper isVariable = (CommitCommentWrapper) isNameExpr;
        final ReactionService isVariable = isNameExpr.isMethod(ReactionService.class, true);
        ReactionRequest isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr).isMethod(ApiHelpers::throwOnFailure);
    }
}
