// isComment
package org.totschnig.myexpenses.di;

import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.activity.ImageViewIntentProvider;
import org.totschnig.myexpenses.activity.SystemImageViewIntentProvider;
import org.totschnig.myexpenses.preference.PrefHandler;
import org.totschnig.myexpenses.util.ads.AdHandlerFactory;
import org.totschnig.myexpenses.util.ads.DefaultAdHandlerFactory;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    ImageViewIntentProvider isMethod() {
        return new SystemImageViewIntentProvider();
    }

    @Provides
    @Singleton
    AdHandlerFactory isMethod(MyApplication isParameter, PrefHandler isParameter, @Named("isStringConstant") String isParameter) {
        return new DefaultAdHandlerFactory(isNameExpr, isNameExpr, isNameExpr) {

            @Override
            public boolean isMethod() {
                return true;
            }
        };
    }
}
