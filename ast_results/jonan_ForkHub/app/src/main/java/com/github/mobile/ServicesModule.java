// isComment
package com.github.mobile;

import com.github.mobile.api.service.NotificationService;
import com.github.mobile.api.service.ProjectService;
import com.github.mobile.api.service.SearchService;
import com.github.mobile.api.service.TeamService;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import java.io.IOException;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CollaboratorService;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.ContentsService;
import org.eclipse.egit.github.core.service.DataService;
import org.eclipse.egit.github.core.service.EventService;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.LabelService;
import org.eclipse.egit.github.core.service.MarkdownService;
import org.eclipse.egit.github.core.service.MilestoneService;
import org.eclipse.egit.github.core.service.OrganizationService;
import org.eclipse.egit.github.core.service.PullRequestService;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.eclipse.egit.github.core.service.StargazerService;
import org.eclipse.egit.github.core.service.UserService;
import retrofit2.Retrofit;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractModule {

    @Override
    protected void isMethod() {
    }

    @Provides
    @Singleton
    NotificationService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(NotificationService.class);
    }

    @Provides
    @Singleton
    SearchService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(SearchService.class);
    }

    @Provides
    @Singleton
    TeamService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(TeamService.class);
    }

    @Provides
    @Singleton
    ProjectService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(ProjectService.class);
    }

    @Provides
    @Singleton
    com.github.mobile.api.service.IssueService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(com.github.mobile.api.service.IssueService.class);
    }

    @Provides
    IssueService isMethod(GitHubClient isParameter) {
        return new IssueService(isNameExpr);
    }

    @Provides
    PullRequestService isMethod(GitHubClient isParameter) {
        return new PullRequestService(isNameExpr);
    }

    @Provides
    UserService isMethod(GitHubClient isParameter) {
        return new UserService(isNameExpr);
    }

    @Provides
    GistService isMethod(GitHubClient isParameter) {
        return new GistService(isNameExpr);
    }

    @Provides
    OrganizationService isMethod(GitHubClient isParameter) {
        return new OrganizationService(isNameExpr);
    }

    @Provides
    org.eclipse.egit.github.core.service.TeamService isMethod(GitHubClient isParameter) {
        return new org.eclipse.egit.github.core.service.TeamService(isNameExpr);
    }

    @Provides
    RepositoryService isMethod(GitHubClient isParameter) {
        return new RepositoryService(isNameExpr);
    }

    @Provides
    User isMethod(UserService isParameter) throws IOException {
        return isNameExpr.isMethod();
    }

    @Provides
    CollaboratorService isMethod(GitHubClient isParameter) {
        return new CollaboratorService(isNameExpr);
    }

    @Provides
    MilestoneService isMethod(GitHubClient isParameter) {
        return new MilestoneService(isNameExpr);
    }

    @Provides
    LabelService isMethod(GitHubClient isParameter) {
        return new LabelService(isNameExpr);
    }

    @Provides
    EventService isMethod(GitHubClient isParameter) {
        return new EventService(isNameExpr);
    }

    @Provides
    StargazerService isMethod(GitHubClient isParameter) {
        return new StargazerService(isNameExpr);
    }

    @Provides
    CommitService isMethod(GitHubClient isParameter) {
        return new CommitService(isNameExpr);
    }

    @Provides
    @Singleton
    com.github.mobile.api.service.CommitService isMethod(Retrofit isParameter) {
        return isNameExpr.isMethod(com.github.mobile.api.service.CommitService.class);
    }

    @Provides
    DataService isMethod(GitHubClient isParameter) {
        return new DataService(isNameExpr);
    }

    @Provides
    MarkdownService isMethod(GitHubClient isParameter) {
        return new MarkdownService(isNameExpr);
    }

    @Provides
    ContentsService isMethod(GitHubClient isParameter) {
        return new ContentsService(isNameExpr);
    }
}
