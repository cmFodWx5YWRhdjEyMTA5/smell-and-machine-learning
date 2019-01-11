// isComment
package com.nilhcem.hostseditor.core.dagger;

import com.squareup.otto.Bus;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    Bus isMethod() {
        return new Bus();
    }
}
