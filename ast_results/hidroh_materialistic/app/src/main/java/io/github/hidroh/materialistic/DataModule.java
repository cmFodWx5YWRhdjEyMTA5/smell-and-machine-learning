// isComment
package io.github.hidroh.materialistic;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.content.Context;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.accounts.UserServicesClient;
import io.github.hidroh.materialistic.data.AlgoliaClient;
import io.github.hidroh.materialistic.data.AlgoliaPopularClient;
import io.github.hidroh.materialistic.data.FeedbackClient;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.LocalCache;
import io.github.hidroh.materialistic.data.MaterialisticDatabase;
import io.github.hidroh.materialistic.data.ReadabilityClient;
import io.github.hidroh.materialistic.data.SyncScheduler;
import io.github.hidroh.materialistic.data.UserManager;
import io.github.hidroh.materialistic.data.android.Cache;
import okhttp3.Call;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import static io.github.hidroh.materialistic.ActivityModule.ALGOLIA;
import static io.github.hidroh.materialistic.ActivityModule.HN;
import static io.github.hidroh.materialistic.ActivityModule.POPULAR;

@Module(library = true, complete = true, includes = NetworkModule.class)
public class isClassOrIsInterface {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    @Provides
    @Singleton
    @Named(isNameExpr)
    public ItemManager isMethod(HackerNewsClient isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    @Named(isNameExpr)
    public ItemManager isMethod(AlgoliaClient isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    @Named(isNameExpr)
    public ItemManager isMethod(AlgoliaPopularClient isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public UserManager isMethod(HackerNewsClient isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public FeedbackClient isMethod(FeedbackClient.Impl isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public ReadabilityClient isMethod(ReadabilityClient.Impl isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public UserServices isMethod(Call.Factory isParameter, @Named(isNameExpr) Scheduler isParameter) {
        return new UserServicesClient(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    @Named(isNameExpr)
    public Scheduler isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    @Named(isNameExpr)
    public Scheduler isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    public SyncScheduler isMethod() {
        return new SyncScheduler();
    }

    @Provides
    @Singleton
    public LocalCache isMethod(Cache isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public MaterialisticDatabase isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Provides
    public MaterialisticDatabase.SavedStoriesDao isMethod(MaterialisticDatabase isParameter) {
        return isNameExpr.isMethod();
    }

    @Provides
    public MaterialisticDatabase.ReadStoriesDao isMethod(MaterialisticDatabase isParameter) {
        return isNameExpr.isMethod();
    }

    @Provides
    public MaterialisticDatabase.ReadableDao isMethod(MaterialisticDatabase isParameter) {
        return isNameExpr.isMethod();
    }

    @Provides
    public SupportSQLiteOpenHelper isMethod(MaterialisticDatabase isParameter) {
        return isNameExpr.isMethod();
    }
}
