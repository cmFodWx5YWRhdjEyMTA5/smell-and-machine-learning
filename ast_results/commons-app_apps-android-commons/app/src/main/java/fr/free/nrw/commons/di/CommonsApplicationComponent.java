// isComment
package fr.free.nrw.commons.di;

import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import fr.free.nrw.commons.CommonsApplication;
import fr.free.nrw.commons.MediaWikiImageView;
import fr.free.nrw.commons.auth.LoginActivity;
import fr.free.nrw.commons.contributions.ContributionsSyncAdapter;
import fr.free.nrw.commons.delete.DeleteTask;
import fr.free.nrw.commons.modifications.ModificationsSyncAdapter;
import fr.free.nrw.commons.nearby.PlaceRenderer;
import fr.free.nrw.commons.settings.SettingsFragment;
import fr.free.nrw.commons.upload.FileProcessor;
import fr.free.nrw.commons.widget.PicOfDayAppWidget;

@Singleton
@Component(modules = { CommonsApplicationModule.class, NetworkingModule.class, AndroidInjectionModule.class, AndroidSupportInjectionModule.class, ActivityBuilderModule.class, FragmentBuilderModule.class, ServiceBuilderModule.class, ContentProviderBuilderModule.class })
public interface isClassOrIsInterface extends AndroidInjector<ApplicationlessInjection> {

    void isMethod(CommonsApplication isParameter);

    void isMethod(ContributionsSyncAdapter isParameter);

    void isMethod(ModificationsSyncAdapter isParameter);

    void isMethod(MediaWikiImageView isParameter);

    void isMethod(LoginActivity isParameter);

    void isMethod(DeleteTask isParameter);

    void isMethod(SettingsFragment isParameter);

    @Override
    void isMethod(ApplicationlessInjection isParameter);

    void isMethod(PlaceRenderer isParameter);

    void isMethod(FileProcessor isParameter);

    void isMethod(PicOfDayAppWidget isParameter);

    @Component.Builder
    @SuppressWarnings({ "isStringConstant", "isStringConstant" })
    interface isClassOrIsInterface {

        Builder isMethod(CommonsApplicationModule isParameter);

        CommonsApplicationComponent isMethod();
    }
}
