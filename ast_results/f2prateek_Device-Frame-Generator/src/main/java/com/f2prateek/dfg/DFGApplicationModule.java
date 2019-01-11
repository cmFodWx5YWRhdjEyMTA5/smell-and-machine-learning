// isComment
package com.f2prateek.dfg;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.WindowManager;
import com.f2prateek.dfg.core.AbstractGenerateFrameService;
import com.f2prateek.dfg.core.GenerateFrameService;
import com.f2prateek.dfg.core.GenerateMultipleFramesService;
import com.f2prateek.dfg.model.Device;
import com.f2prateek.dfg.prefs.DefaultDevice;
import com.f2prateek.dfg.prefs.PreferencesModule;
import com.f2prateek.dfg.ui.UiModule;
import com.f2prateek.rx.preferences.Preference;
import com.f2prateek.rx.preferences.RxSharedPreferences;
import com.segment.analytics.Analytics;
import com.squareup.otto.Bus;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Singleton;

@Module(includes = { DeviceModule.class, PreferencesModule.class, UiModule.class }, injects = { DFGApplication.class, AbstractGenerateFrameService.class, GenerateFrameService.class, GenerateMultipleFramesService.class })
public class isClassOrIsInterface {

    private final DFGApplication isVariable;

    public isConstructor(DFGApplication isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Provides
    @Singleton
    @ForApplication
    Context isMethod() {
        return isNameExpr;
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    SharedPreferences isMethod(@ForApplication Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    RxSharedPreferences isMethod(SharedPreferences isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Provides
    @Singleton
    Resources isMethod(@ForApplication Context isParameter) {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    PackageInfo isMethod(@ForApplication Context isParameter) {
        try {
            return isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isIntegerConstant);
        } catch (PackageManager.NameNotFoundException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }

    // isComment
    @SuppressWarnings("isStringConstant")
    <T> T isMethod(final Context isParameter, final String isParameter) {
        return (T) isNameExpr.isMethod(isNameExpr);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    NotificationManager isMethod(@ForApplication Context isParameter) {
        return isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    WindowManager isMethod(@ForApplication Context isParameter) {
        return isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    Bus isMethod() {
        return new Bus();
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    DeviceProvider isMethod(Set<Device> isParameter, @DefaultDevice Preference<String> isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    @AnalyticsKey
    String isMethod() {
        // isComment
        return "isStringConstant";
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    Analytics isMethod(@ForApplication Context isParameter, @AnalyticsKey String isParameter) {
        return new Analytics.Builder(isNameExpr, isNameExpr).isMethod();
    }
}
