// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.accounts.LoginActivity;
import com.github.pockethub.android.accounts.LoginWebViewActivity;
import com.github.pockethub.android.dagger.MainFragmentProvider;
import com.github.pockethub.android.ui.MainActivity;
import com.github.pockethub.android.ui.commit.CommitCompareViewActivity;
import com.github.pockethub.android.ui.commit.CommitFileViewActivity;
import com.github.pockethub.android.ui.commit.CommitViewActivity;
import com.github.pockethub.android.ui.gist.CreateGistActivity;
import com.github.pockethub.android.ui.gist.GistFilesViewActivity;
import com.github.pockethub.android.ui.gist.GistsPagerFragment;
import com.github.pockethub.android.ui.gist.GistsViewActivity;
import com.github.pockethub.android.ui.issue.EditIssueActivity;
import com.github.pockethub.android.ui.issue.EditIssuesFilterActivity;
import com.github.pockethub.android.ui.issue.FiltersViewActivity;
import com.github.pockethub.android.ui.issue.IssueBrowseActivity;
import com.github.pockethub.android.ui.issue.IssueSearchActivity;
import com.github.pockethub.android.ui.issue.IssuesViewActivity;
import com.github.pockethub.android.ui.notification.NotificationActivity;
import com.github.pockethub.android.ui.ref.BranchFileViewActivity;
import com.github.pockethub.android.ui.repo.RepositoryContributorsActivity;
import com.github.pockethub.android.ui.repo.RepositoryViewActivity;
import com.github.pockethub.android.ui.search.SearchActivity;
import com.github.pockethub.android.ui.user.UriLauncherActivity;
import com.github.pockethub.android.ui.user.UserViewActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface isClassOrIsInterface {

    @ContributesAndroidInjector(modules = MainFragmentProvider.class)
    MainActivity isMethod();

    @ContributesAndroidInjector(modules = RepositoryViewFragmentProvider.class)
    RepositoryViewActivity isMethod();

    @ContributesAndroidInjector(modules = IssuesViewFragmentProvider.class)
    IssuesViewActivity isMethod();

    @ContributesAndroidInjector(modules = NotificationFragmentProvider.class)
    NotificationActivity isMethod();

    @ContributesAndroidInjector
    CreateGistActivity isMethod();

    @ContributesAndroidInjector(modules = IssueBrowseFragmentProvider.class)
    IssueBrowseActivity isMethod();

    @ContributesAndroidInjector
    EditIssuesFilterActivity isMethod();

    @ContributesAndroidInjector
    EditIssueActivity isMethod();

    @ContributesAndroidInjector(modules = SearchActivityFragmentProvider.class)
    SearchActivity isMethod();

    @ContributesAndroidInjector(modules = FiltersViewFragmentProvider.class)
    FiltersViewActivity isMethod();

    @ContributesAndroidInjector(modules = GistsViewFragmentProvider.class)
    GistsViewActivity isMethod();

    @ContributesAndroidInjector(modules = GistFilesViewFragmentProvider.class)
    GistFilesViewActivity isMethod();

    @ContributesAndroidInjector(modules = CreateCommentFragmentProvider.class)
    com.github.pockethub.android.ui.gist.CreateCommentActivity isMethod();

    @ContributesAndroidInjector(modules = CreateCommentFragmentProvider.class)
    com.github.pockethub.android.ui.issue.CreateCommentActivity isMethod();

    @ContributesAndroidInjector(modules = CreateCommentFragmentProvider.class)
    com.github.pockethub.android.ui.commit.CreateCommentActivity isMethod();

    @ContributesAndroidInjector(modules = CreateCommentFragmentProvider.class)
    com.github.pockethub.android.ui.gist.EditCommentActivity isMethod();

    @ContributesAndroidInjector(modules = CreateCommentFragmentProvider.class)
    com.github.pockethub.android.ui.issue.EditCommentActivity isMethod();

    @ContributesAndroidInjector(modules = RepositoryContributorsFragmentProvider.class)
    RepositoryContributorsActivity isMethod();

    @ContributesAndroidInjector(modules = UserViewFragmentProvider.class)
    UserViewActivity isMethod();

    @ContributesAndroidInjector
    LoginActivity isMethod();

    @ContributesAndroidInjector
    UriLauncherActivity isMethod();

    @ContributesAndroidInjector(modules = IssueSearchFragmentProvider.class)
    IssueSearchActivity isMethod();

    @ContributesAndroidInjector(modules = CommitCompareViewFragmentProvider.class)
    CommitCompareViewActivity isMethod();

    @ContributesAndroidInjector(modules = CommitViewFragmentProvider.class)
    CommitViewActivity isMethod();

    @ContributesAndroidInjector
    CommitFileViewActivity isMethod();

    @ContributesAndroidInjector
    BranchFileViewActivity isMethod();

    @ContributesAndroidInjector
    LoginWebViewActivity isMethod();
}
