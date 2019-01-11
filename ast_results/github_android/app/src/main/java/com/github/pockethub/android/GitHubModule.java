// isComment
package com.github.pockethub.android;

import android.content.Context;
import com.meisolsson.githubsdk.core.ServiceGenerator;
import com.meisolsson.githubsdk.service.gists.GistService;
import com.meisolsson.githubsdk.service.issues.IssueService;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommentService;
import com.meisolsson.githubsdk.service.repositories.RepositoryCommitService;
import com.meisolsson.githubsdk.service.users.UserService;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    RepositoryCommitService isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, RepositoryCommitService.class);
    }

    @Provides
    @Singleton
    UserService isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, UserService.class);
    }

    @Provides
    @Singleton
    RepositoryCommentService isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, RepositoryCommentService.class);
    }

    @Provides
    @Singleton
    GistService isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, GistService.class);
    }

    @Provides
    @Singleton
    IssueService isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, IssueService.class);
    }
}
