// isComment
package com.gh4a.resolver;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import com.gh4a.ApiRequestException;
import com.gh4a.ServiceFactory;
import com.gh4a.activities.CommitDiffViewerActivity;
import com.gh4a.utils.ApiHelpers;
import com.meisolsson.githubsdk.model.Commit;
import com.meisolsson.githubsdk.model.GitHubFile;
import com.meisolsson.githubsdk.model.git.GitComment;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommentService;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommitService;
import java.util.List;
import io.reactivex.Single;

public class isClassOrIsInterface extends DiffLoadTask<GitComment> {

    @VisibleForTesting
    protected final String isVariable;

    public isConstructor(FragmentActivity isParameter, String isParameter, String isParameter, DiffHighlightId isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Intent isMethod(String isParameter, GitHubFile isParameter, List<GitComment> isParameter, DiffHighlightId isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null);
    }

    @Override
    public Single<String> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected Single<List<GitHubFile>> isMethod() throws ApiRequestException {
        RepositoryCommitService isVariable = isNameExpr.isMethod(RepositoryCommitService.class, true);
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(Commit::files);
    }

    @Override
    protected Single<List<GitComment>> isMethod() throws ApiRequestException {
        final RepositoryCommentService isVariable = isNameExpr.isMethod(RepositoryCommentService.class, true);
        return isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr));
    }
}
