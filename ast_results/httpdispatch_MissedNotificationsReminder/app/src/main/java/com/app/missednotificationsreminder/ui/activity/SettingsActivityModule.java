// isComment
package com.app.missednotificationsreminder.ui.activity;

import android.content.Context;
import com.app.missednotificationsreminder.ApplicationModule;
import com.app.missednotificationsreminder.binding.model.ReminderViewModel;
import com.app.missednotificationsreminder.binding.model.SchedulerViewModel;
import com.app.missednotificationsreminder.binding.model.SettingsViewModel;
import com.app.missednotificationsreminder.binding.model.SoundViewModel;
import com.app.missednotificationsreminder.di.qualifiers.ForActivity;
import com.app.missednotificationsreminder.ui.fragment.ReminderFragment;
import com.app.missednotificationsreminder.ui.fragment.SchedulerFragment;
import com.app.missednotificationsreminder.ui.fragment.SettingsFragment;
import com.app.missednotificationsreminder.ui.fragment.SoundFragment;
import com.app.missednotificationsreminder.ui.fragment.VibrationFragment;
import com.app.missednotificationsreminder.ui.view.ReminderView;
import com.app.missednotificationsreminder.ui.view.SchedulerView;
import com.app.missednotificationsreminder.ui.view.SettingsView;
import com.app.missednotificationsreminder.ui.view.SoundView;
import com.app.missednotificationsreminder.ui.view.VibrationView;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module(addsTo = ApplicationModule.class, injects = { ReminderFragment.class, ReminderViewModel.class, SettingsViewModel.class, SettingsFragment.class, SchedulerViewModel.class, SchedulerFragment.class, SoundViewModel.class, SoundFragment.class, VibrationFragment.class })
public final class isClassOrIsInterface {

    private final SettingsActivity isVariable;

    isConstructor(SettingsActivity isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Provides
    @Singleton
    ReminderView isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    SchedulerView isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    SoundView isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    VibrationView isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    SettingsView isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @Provides
    @Singleton
    @ForActivity
    Context isMethod() {
        return isNameExpr;
    }
}
