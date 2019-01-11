// isComment
package org.wordpress.android.modules;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import org.wordpress.android.ui.news.LocalNewsService;
import org.wordpress.android.ui.news.NewsService;
import org.wordpress.android.viewmodel.helpers.ConnectionStatus;
import org.wordpress.android.viewmodel.helpers.ConnectionStatusLiveData;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class isClassOrIsInterface {

    // isComment
    @Binds
    abstract Context isMethod(Application isParameter);

    @Provides
    public static NewsService isMethod(Context isParameter) {
        return new LocalNewsService(isNameExpr);
    }

    @Provides
    public static LiveData<ConnectionStatus> isMethod(Context isParameter) {
        return new ConnectionStatusLiveData(isNameExpr);
    }
}
