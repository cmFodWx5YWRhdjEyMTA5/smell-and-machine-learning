// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.repo.RepositoryListFragment;
import com.github.pockethub.android.ui.user.MembersFragment;
import com.github.pockethub.android.ui.user.MyFollowersFragment;
import com.github.pockethub.android.ui.user.MyFollowingFragment;
import com.github.pockethub.android.ui.user.OrganizationNewsFragment;
import com.github.pockethub.android.ui.user.UserReceivedNewsFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    UserReceivedNewsFragment isMethod();

    @ContributesAndroidInjector
    OrganizationNewsFragment isMethod();

    @ContributesAndroidInjector
    RepositoryListFragment isMethod();

    @ContributesAndroidInjector
    MyFollowersFragment isMethod();

    @ContributesAndroidInjector
    MyFollowingFragment isMethod();

    @ContributesAndroidInjector
    MembersFragment isMethod();
}
