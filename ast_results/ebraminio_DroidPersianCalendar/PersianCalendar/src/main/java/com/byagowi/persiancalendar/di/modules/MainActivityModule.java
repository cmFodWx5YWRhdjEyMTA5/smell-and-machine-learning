// isComment
package com.byagowi.persiancalendar.di.modules;

import com.byagowi.persiancalendar.di.scopes.PerFragment;
import com.byagowi.persiancalendar.view.dialog.preferredcalendars.CalendarPreferenceDialog;
import com.byagowi.persiancalendar.view.fragment.AboutFragment;
import com.byagowi.persiancalendar.view.fragment.CalendarFragment;
import com.byagowi.persiancalendar.view.fragment.CompassFragment;
import com.byagowi.persiancalendar.view.fragment.ConverterFragment;
import com.byagowi.persiancalendar.view.preferences.FragmentInterfaceCalendar;
import com.byagowi.persiancalendar.view.preferences.FragmentLocationAthan;
import com.byagowi.persiancalendar.view.preferences.GPSLocationDialog;
import com.byagowi.persiancalendar.view.preferences.SettingsFragment;
import net.androgames.level.LevelFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class isClassOrIsInterface {

    @PerFragment
    @ContributesAndroidInjector(modules = CalendarFragmentModule.class)
    abstract CalendarFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract SettingsFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract CompassFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract LevelFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract AboutFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract ConverterFragment isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract FragmentLocationAthan isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract FragmentInterfaceCalendar isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract CalendarPreferenceDialog isMethod();

    @PerFragment
    @ContributesAndroidInjector
    abstract GPSLocationDialog isMethod();
}
