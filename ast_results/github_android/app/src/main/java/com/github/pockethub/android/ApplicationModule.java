// isComment
package com.github.pockethub.android;

import android.app.Application;
import android.content.Context;
import javax.inject.Singleton;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;

@Module
abstract class isClassOrIsInterface {

    @Binds
    @Singleton
    abstract Context isMethod(Application isParameter);
}
