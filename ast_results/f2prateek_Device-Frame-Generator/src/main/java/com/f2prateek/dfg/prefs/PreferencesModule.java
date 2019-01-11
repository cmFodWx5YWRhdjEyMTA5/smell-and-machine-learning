// isComment
package com.f2prateek.dfg.prefs;

import android.graphics.Color;
import com.f2prateek.dfg.prefs.BackgroundColorOption.Option;
import com.f2prateek.rx.preferences.Preference;
import com.f2prateek.rx.preferences.RxSharedPreferences;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

// isComment
@Module(library = true, complete = true)
public class isClassOrIsInterface {

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @FirstRun
    Preference<Boolean> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", true);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @DefaultDevice
    Preference<String> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @GlareEnabled
    Preference<Boolean> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", true);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @ShadowEnabled
    Preference<Boolean> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", true);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @BlurBackgroundEnabled
    Preference<Boolean> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", true);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @BackgroundBlurRadius
    // isComment
    Preference<Integer> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", isIntegerConstant);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @ColorBackgroundEnabled
    // isComment
    Preference<Boolean> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", true);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @BackgroundColorOption
    // isComment
    Preference<Option> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, Option.class);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @CustomBackgroundColor
    // isComment
    Preference<Integer> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    // isComment
    @Provides
    // isComment
    @Singleton
    // isComment
    @BackgroundPaddingPercentage
    // isComment
    Preference<Integer> isMethod(RxSharedPreferences isParameter) {
        return isNameExpr.isMethod("isStringConstant", isIntegerConstant);
    }
}
