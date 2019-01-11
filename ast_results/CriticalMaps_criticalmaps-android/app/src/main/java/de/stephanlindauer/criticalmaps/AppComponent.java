// isComment
package de.stephanlindauer.criticalmaps;

import android.content.SharedPreferences;
import com.squareup.picasso.Picasso;
import dagger.BindsInstance;
import dagger.Component;
import de.stephanlindauer.criticalmaps.fragments.ChatFragment;
import de.stephanlindauer.criticalmaps.fragments.MapFragment;
import de.stephanlindauer.criticalmaps.handler.PrerequisitesChecker;
import de.stephanlindauer.criticalmaps.model.OwnLocationModel;
import de.stephanlindauer.criticalmaps.model.TwitterModel;
import de.stephanlindauer.criticalmaps.service.ServerSyncService;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = { AppModule.class })
public interface isClassOrIsInterface {

    void isMethod(Main isParameter);

    void isMethod(ServerSyncService isParameter);

    void isMethod(MapFragment isParameter);

    void isMethod(ChatFragment isParameter);

    void isMethod(PrerequisitesChecker isParameter);

    App isMethod();

    Picasso isMethod();

    OwnLocationModel isMethod();

    TwitterModel isMethod();

    OkHttpClient isMethod();

    SharedPreferences isMethod();

    @Component.Builder
    interface isClassOrIsInterface {

        AppComponent isMethod();

        @BindsInstance
        Builder isMethod(App isParameter);
    }
}
