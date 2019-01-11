// isComment
package com.gh4a.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.AttrRes;
import com.gh4a.ServiceFactory;
import com.gh4a.utils.ApiHelpers;
import com.meisolsson.githubsdk.model.GitHubCommentBase;
import com.meisolsson.githubsdk.model.request.CommentRequest;
import com.meisolsson.githubsdk.service.issues.IssueCommentService;
import io.reactivex.Single;

public class isClassOrIsInterface extends EditCommentActivity {

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter, int isParameter, long isParameter, String isParameter, @AttrRes int isParameter) {
        Intent isVariable = new Intent(isNameExpr, EditIssueCommentActivity.class).isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isStringConstant, isNameExpr, isNameExpr);
    }

    @Override
    protected Single<GitHubCommentBase> isMethod(String isParameter, String isParameter, String isParameter, long isParameter) {
        int isVariable = isMethod().isMethod("isStringConstant", isIntegerConstant);
        IssueCommentService isVariable = isNameExpr.isMethod(IssueCommentService.class, true);
        CommentRequest isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
    }

    @Override
    protected Single<GitHubCommentBase> isMethod(String isParameter, String isParameter, long isParameter, String isParameter) {
        IssueCommentService isVariable = isNameExpr.isMethod(IssueCommentService.class, true);
        CommentRequest isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
    }
}
