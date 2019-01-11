// isComment
package fr.free.nrw.commons.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import fr.free.nrw.commons.AboutActivity;
import fr.free.nrw.commons.WelcomeActivity;
import fr.free.nrw.commons.achievements.AchievementsActivity;
import fr.free.nrw.commons.auth.LoginActivity;
import fr.free.nrw.commons.auth.SignupActivity;
import fr.free.nrw.commons.bookmarks.BookmarksActivity;
import fr.free.nrw.commons.category.CategoryDetailsActivity;
import fr.free.nrw.commons.contributions.MainActivity;
import fr.free.nrw.commons.category.CategoryImagesActivity;
import fr.free.nrw.commons.explore.SearchActivity;
import fr.free.nrw.commons.notification.NotificationActivity;
import fr.free.nrw.commons.settings.SettingsActivity;
import fr.free.nrw.commons.upload.UploadActivity;

@Module
@SuppressWarnings({ "isStringConstant", "isStringConstant" })
public abstract class isClassOrIsInterface {

    @ContributesAndroidInjector
    abstract LoginActivity isMethod();

    @ContributesAndroidInjector
    abstract WelcomeActivity isMethod();

    @ContributesAndroidInjector
    abstract MainActivity isMethod();

    @ContributesAndroidInjector
    abstract SettingsActivity isMethod();

    @ContributesAndroidInjector
    abstract AboutActivity isMethod();

    @ContributesAndroidInjector
    abstract SignupActivity isMethod();

    @ContributesAndroidInjector
    abstract NotificationActivity isMethod();

    @ContributesAndroidInjector
    abstract CategoryImagesActivity isMethod();

    @ContributesAndroidInjector
    abstract UploadActivity isMethod();

    @ContributesAndroidInjector
    abstract SearchActivity isMethod();

    @ContributesAndroidInjector
    abstract CategoryDetailsActivity isMethod();

    @ContributesAndroidInjector
    abstract AchievementsActivity isMethod();

    @ContributesAndroidInjector
    abstract BookmarksActivity isMethod();
}
