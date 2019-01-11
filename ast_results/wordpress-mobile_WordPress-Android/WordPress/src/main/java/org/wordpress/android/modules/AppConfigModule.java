// isComment
package org.wordpress.android.modules;

import android.content.Context;
import org.wordpress.android.BuildConfig;
import org.wordpress.android.WordPress;
import org.wordpress.android.fluxc.network.UserAgent;
import org.wordpress.android.fluxc.network.rest.wpcom.auth.AppSecrets;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    public AppSecrets isMethod() {
        return new AppSecrets(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Provides
    public UserAgent isMethod(Context isParameter) {
        return new UserAgent(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
