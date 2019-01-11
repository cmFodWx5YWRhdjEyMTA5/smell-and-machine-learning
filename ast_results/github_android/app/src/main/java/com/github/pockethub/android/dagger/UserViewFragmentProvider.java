// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.repo.UserRepositoryListFragment;
import com.github.pockethub.android.ui.user.UserCreatedNewsFragment;
import com.github.pockethub.android.ui.user.UserFollowersFragment;
import com.github.pockethub.android.ui.user.UserFollowingFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    UserCreatedNewsFragment isMethod();

    @ContributesAndroidInjector
    UserRepositoryListFragment isMethod();

    @ContributesAndroidInjector
    UserFollowersFragment isMethod();

    @ContributesAndroidInjector
    UserFollowingFragment isMethod();
}
