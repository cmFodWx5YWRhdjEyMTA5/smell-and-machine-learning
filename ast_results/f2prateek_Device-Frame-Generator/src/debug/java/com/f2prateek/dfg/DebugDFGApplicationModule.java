// isComment
package com.f2prateek.dfg;

import android.content.Context;
import com.f2prateek.dfg.prefs.DebugPreferencesModule;
import com.f2prateek.dfg.ui.DebugUiModule;
import com.segment.analytics.Analytics;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(addsTo = DFGApplicationModule.class, includes = { DebugUiModule.class, DebugPreferencesModule.class }, // isComment
overrides = true)
public final class isClassOrIsInterface {

    @Provides
    @Singleton
    @AnalyticsKey
    String isMethod() {
        return "isStringConstant";
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    Analytics isMethod(@ForApplication Context isParameter, @AnalyticsKey String isParameter) {
        return new Analytics.Builder(isNameExpr, isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
    }
}
