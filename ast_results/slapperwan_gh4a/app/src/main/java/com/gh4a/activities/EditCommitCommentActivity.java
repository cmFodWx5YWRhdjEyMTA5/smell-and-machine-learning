// isComment
package com.gh4a.activities;

import android.content.Context;
import android.content.Intent;
import com.gh4a.ServiceFactory;
import com.gh4a.utils.ApiHelpers;
import com.meisolsson.githubsdk.model.GitHubCommentBase;
import com.meisolsson.githubsdk.model.request.CommentRequest;
import com.meisolsson.githubsdk.model.request.repository.CreateCommitComment;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommentService;
import io.reactivex.Single;

public class isClassOrIsInterface extends EditCommentActivity {

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter, String isParameter, long isParameter, String isParameter) {
        Intent isVariable = new Intent(isNameExpr, EditCommitCommentActivity.class).isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isStringConstant, isNameExpr, isIntegerConstant);
    }

    @Override
    protected Single<GitHubCommentBase> isMethod(String isParameter, String isParameter, String isParameter, long isParameter) {
        RepositoryCommentService isVariable = isNameExpr.isMethod(RepositoryCommentService.class, true);
        CreateCommitComment isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        String isVariable = isMethod().isMethod("isStringConstant");
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
    }

    @Override
    protected Single<GitHubCommentBase> isMethod(String isParameter, String isParameter, long isParameter, String isParameter) {
        RepositoryCommentService isVariable = isNameExpr.isMethod(RepositoryCommentService.class, true);
        CommentRequest isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
    }
}
