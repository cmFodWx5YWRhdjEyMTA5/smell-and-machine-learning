// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.gist.MyGistsFragment;
import com.github.pockethub.android.ui.gist.PublicGistsFragment;
import com.github.pockethub.android.ui.gist.StarredGistsFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    MyGistsFragment isMethod();

    @ContributesAndroidInjector
    PublicGistsFragment isMethod();

    @ContributesAndroidInjector
    StarredGistsFragment isMethod();
}
