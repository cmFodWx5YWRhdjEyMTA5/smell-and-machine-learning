// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.code.RepositoryCodeFragment;
import com.github.pockethub.android.ui.commit.CommitListFragment;
import com.github.pockethub.android.ui.issue.IssuesFragment;
import com.github.pockethub.android.ui.repo.RepositoryNewsFragment;
import com.github.pockethub.android.ui.repo.RepositoryReadmeFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    RepositoryReadmeFragment isMethod();

    @ContributesAndroidInjector
    RepositoryNewsFragment isMethod();

    @ContributesAndroidInjector
    RepositoryCodeFragment isMethod();

    @ContributesAndroidInjector
    CommitListFragment isMethod();

    @ContributesAndroidInjector
    IssuesFragment isMethod();
}
