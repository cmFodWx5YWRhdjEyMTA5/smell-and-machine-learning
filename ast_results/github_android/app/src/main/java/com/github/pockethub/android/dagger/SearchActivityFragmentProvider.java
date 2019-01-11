// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.search.SearchRepositoryListFragment;
import com.github.pockethub.android.ui.search.SearchUserListFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    SearchRepositoryListFragment isMethod();

    @ContributesAndroidInjector
    SearchUserListFragment isMethod();
}
