// isComment
package com.app.missednotificationsreminder;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.app.missednotificationsreminder.data.DataModule;
import com.app.missednotificationsreminder.di.qualifiers.ForApplication;
import com.app.missednotificationsreminder.service.RemindJob;
import com.app.missednotificationsreminder.service.ReminderNotificationListenerService;
import com.app.missednotificationsreminder.ui.UiModule;
import com.squareup.leakcanary.RefWatcher;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module(injects = { CustomApplication.class, ReminderNotificationListenerService.class, RemindJob.class }, includes = { UiModule.class, DataModule.class }, library = true)
public class isClassOrIsInterface {

    private final CustomApplication isVariable;

    public isConstructor(CustomApplication isParameter) {
        isNameExpr = isNameExpr;
    }

    @Provides
    @Singleton
    Application isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Provides
    @Singleton
    @ForApplication
    Context isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    RefWatcher isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    Vibrator isMethod() {
        return (Vibrator) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    AudioManager isMethod() {
        return (AudioManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
