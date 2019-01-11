// isComment
package io.github.hidroh.materialistic;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.support.annotation.IdRes;
import android.support.annotation.MenuRes;
import android.support.annotation.StringRes;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;
import android.view.View;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowAccountManager;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.appwidget.WidgetConfigActivity;
import io.github.hidroh.materialistic.appwidget.WidgetConfigActivityTest;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.FavoriteManagerTest;
import io.github.hidroh.materialistic.data.FeedbackClient;
import io.github.hidroh.materialistic.data.FileDownloader;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ItemSyncJobServiceTest;
import io.github.hidroh.materialistic.data.ItemSyncService;
import io.github.hidroh.materialistic.data.MaterialisticDatabase;
import io.github.hidroh.materialistic.data.ReadabilityClient;
import io.github.hidroh.materialistic.data.RestServiceFactory;
import io.github.hidroh.materialistic.data.SessionManager;
import io.github.hidroh.materialistic.data.SyncDelegate;
import io.github.hidroh.materialistic.data.SyncScheduler;
import io.github.hidroh.materialistic.data.UserManager;
import io.github.hidroh.materialistic.test.InMemoryDatabase;
import io.github.hidroh.materialistic.test.TestFavoriteActivity;
import io.github.hidroh.materialistic.test.TestListActivity;
import io.github.hidroh.materialistic.test.TestReadabilityActivity;
import io.github.hidroh.materialistic.test.WebActivity;
import io.github.hidroh.materialistic.widget.FavoriteRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.MultiPageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.PopupMenu;
import io.github.hidroh.materialistic.widget.SinglePageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.StoryRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.SubmissionRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.ThreadPreviewRecyclerViewAdapter;
import okhttp3.Call;
import rx.Scheduler;
import rx.schedulers.Schedulers;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Module(injects = { // isComment
LoginActivity.class, SettingsActivity.class, AskActivity.class, AboutActivity.class, FavoriteActivity.class, FeedbackActivity.class, ItemActivity.class, JobsActivity.class, ListActivity.class, BestActivity.class, NewActivity.class, SearchActivity.class, ShowActivity.class, WebActivity.class, PopularActivity.class, ComposeActivity.class, SubmitActivity.class, UserActivity.class, ThreadPreviewActivity.class, WidgetConfigActivity.class, FavoriteFragment.class, ItemFragment.class, ListFragment.class, WebFragment.class, ReleaseNotesActivity.class, StoryRecyclerViewAdapter.class, FavoriteRecyclerViewAdapter.class, SinglePageItemRecyclerViewAdapter.class, MultiPageItemRecyclerViewAdapter.class, SubmissionRecyclerViewAdapter.class, ThreadPreviewRecyclerViewAdapter.class, ItemSyncService.class, // isComment
AppUtilsTest.class, SettingsActivityTest.class, SearchActivityTest.class, ItemActivityTest.class, ItemFragmentMultiPageTest.class, ItemFragmentSinglePageTest.class, ItemFragmentMultiPageTest.TestItemActivity.class, TestReadabilityActivity.class, TestListActivity.class, io.github.hidroh.materialistic.test.ListActivity.class, ListFragmentViewHolderTest.class, ListFragmentViewHolderEdgeTest.class, FavoriteActivityTest.class, FavoriteActivityEmptyTest.class, FavoriteManagerTest.class, TestFavoriteActivity.class, WebFragmentLocalTest.class, WebFragmentTest.class, FeedbackActivityTest.class, ListFragmentTest.class, PopularActivityTest.class, ReadabilityFragmentTest.class, ReadabilityFragmentLazyLoadTest.class, DrawerActivityLoginTest.class, ComposeActivityTest.class, SubmitActivityTest.class, UserActivityTest.class, ThreadPreviewActivityTest.class, WidgetConfigActivityTest.class, BaseListActivityLandTest.class, PreferencesActivityTest.class, ItemSyncJobServiceTest.TestItemSyncJobService.class }, library = true, overrides = true)
public class isClassOrIsInterface {

    private final ItemManager isVariable = isMethod(ItemManager.class);

    private final ItemManager isVariable = isMethod(ItemManager.class);

    private final ItemManager isVariable = isMethod(ItemManager.class);

    private final UserManager isVariable = isMethod(UserManager.class);

    private final FavoriteManager isVariable = isMethod(FavoriteManager.class);

    private final SessionManager isVariable = isMethod(SessionManager.class);

    private final SearchView isVariable = isMethod(SearchView.class);

    private final FeedbackClient isVariable = isMethod(FeedbackClient.class);

    private final ReadabilityClient isVariable = isMethod(ReadabilityClient.class);

    private final UserServices isVariable = isMethod(UserServices.class);

    private final CustomTabsDelegate isVariable = isMethod(CustomTabsDelegate.class);

    private final KeyDelegate isVariable = isMethod(KeyDelegate.class);

    private final RestServiceFactory isVariable = isMethod(RestServiceFactory.class);

    private final ResourcesProvider isVariable = isMethod(ResourcesProvider.class);

    private final SyncDelegate isVariable = isMethod(SyncDelegate.class);

    private final Call.Factory isVariable = isMethod(Call.Factory.class);

    private final FileDownloader isVariable = isMethod(FileDownloader.class);

    private final SyncScheduler isVariable = isMethod(SyncScheduler.class);

    {
        TypedArray isVariable = isMethod(TypedArray.class);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod())).isMethod(isNameExpr);
    }

    @Provides
    @Singleton
    @Named(isNameExpr.isFieldAccessExpr)
    public ItemManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    @Named(isNameExpr.isFieldAccessExpr)
    public ItemManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    @Named(isNameExpr.isFieldAccessExpr)
    public ItemManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public FavoriteManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public SessionManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public FeedbackClient isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public ReadabilityClient isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public UserManager isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public RestServiceFactory isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public FileDownloader isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public Call.Factory isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public ActionViewResolver isMethod() {
        ActionViewResolver isVariable = isMethod(ActionViewResolver.class);
        isMethod(isNameExpr.isMethod(isMethod(MenuItem.class))).isMethod(isNameExpr);
        return isNameExpr;
    }

    @Provides
    public AlertDialogBuilder isMethod() {
        return new AlertDialogBuilder() {

            private AlertDialog.Builder isVariable;

            @Override
            public AlertDialogBuilder isMethod(Context isParameter) {
                isNameExpr = new AlertDialog.Builder(isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(int isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(@StringRes int isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(View isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(CharSequence[] isParameter, int isParameter, DialogInterface.OnClickListener isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(@StringRes int isParameter, DialogInterface.OnClickListener isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(@StringRes int isParameter, DialogInterface.OnClickListener isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public AlertDialogBuilder isMethod(@StringRes int isParameter, DialogInterface.OnClickListener isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public Dialog isMethod() {
                return isNameExpr.isMethod();
            }

            @Override
            public Dialog isMethod() {
                return isNameExpr.isMethod();
            }
        };
    }

    @Provides
    @Singleton
    public UserServices isMethod() {
        return isNameExpr;
    }

    @Provides
    public AccountManager isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    public KeyDelegate isMethod() {
        return isNameExpr;
    }

    @Provides
    public PopupMenu isMethod() {
        return new PopupMenu() {

            private android.widget.PopupMenu isVariable;

            @SuppressLint("isStringConstant")
            @Override
            public PopupMenu isMethod(Context isParameter, View isParameter, int isParameter) {
                isNameExpr = new android.widget.PopupMenu(isNameExpr, isNameExpr == null ? new View(isNameExpr) : isNameExpr, isNameExpr);
                return this;
            }

            @SuppressLint("isStringConstant")
            @Override
            public PopupMenu isMethod(@MenuRes int isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return this;
            }

            @SuppressLint("isStringConstant")
            @Override
            public PopupMenu isMethod(@IdRes int isParameter, boolean isParameter) {
                isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr);
                return this;
            }

            @SuppressLint("isStringConstant")
            @Override
            public PopupMenu isMethod(@IdRes int isParameter, @StringRes int isParameter) {
                isNameExpr.isMethod().isMethod(isNameExpr).isMethod(isNameExpr);
                return this;
            }

            @SuppressLint("isStringConstant")
            @Override
            public PopupMenu isMethod(final OnMenuItemClickListener isParameter) {
                isNameExpr.isMethod(new android.widget.PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean isMethod(MenuItem isParameter) {
                        return isNameExpr.isMethod(isNameExpr);
                    }
                });
                return this;
            }

            @SuppressLint("isStringConstant")
            @Override
            public void isMethod() {
                isNameExpr.isMethod();
            }
        };
    }

    @Provides
    @Singleton
    public CustomTabsDelegate isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public ResourcesProvider isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public SyncDelegate isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    public SyncScheduler isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    @Named(isNameExpr.isFieldAccessExpr)
    public Scheduler isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    @Named(isNameExpr.isFieldAccessExpr)
    public Scheduler isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    public MaterialisticDatabase isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
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
