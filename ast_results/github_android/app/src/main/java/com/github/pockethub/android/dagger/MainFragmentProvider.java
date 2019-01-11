// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.gist.GistsPagerFragment;
import com.github.pockethub.android.ui.issue.FilterListFragment;
import com.github.pockethub.android.ui.issue.IssueDashboardPagerFragment;
import com.github.pockethub.android.ui.repo.RepositoryListFragment;
import com.github.pockethub.android.ui.user.HomePagerFragment;
import com.github.pockethub.android.ui.user.MyFollowersFragment;
import com.github.pockethub.android.ui.user.MyFollowingFragment;
import com.github.pockethub.android.ui.user.OrganizationNewsFragment;
import com.github.pockethub.android.ui.user.UserReceivedNewsFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface isClassOrIsInterface {

    @ContributesAndroidInjector(modules = HomePagerFragmentProvider.class)
    HomePagerFragment isMethod();

    @ContributesAndroidInjector(modules = GistsPagerFragmentProvider.class)
    GistsPagerFragment isMethod();

    @ContributesAndroidInjector(modules = IssueDashboardPagerFragmentProvider.class)
    IssueDashboardPagerFragment isMethod();

    @ContributesAndroidInjector
    FilterListFragment isMethod();
}
