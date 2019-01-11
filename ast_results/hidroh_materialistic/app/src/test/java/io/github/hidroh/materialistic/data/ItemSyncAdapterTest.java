// isComment
package io.github.hidroh.materialistic.data;

import android.accounts.Account;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ServiceController;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowContentResolver;
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowNotification;
import org.robolectric.shadows.ShadowNotificationManager;
import java.io.IOException;
import io.github.hidroh.materialistic.BuildConfig;
import io.github.hidroh.materialistic.R;
import io.github.hidroh.materialistic.test.InMemoryCache;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowWebView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.schedulers.Schedulers;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowWebView.class }, sdk = isIntegerConstant)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private TestItemSyncAdapter isVariable;

    private SharedPreferences isVariable;

    @Captor
    private ArgumentCaptor<Callback<HackerNewsItem>> isVariable;

    private ReadabilityClient isVariable = isMethod(ReadabilityClient.class);

    private ServiceController<ItemSyncService> isVariable;

    private ItemSyncService isVariable;

    @Captor
    private ArgumentCaptor<ReadabilityClient.Callback> isVariable;

    private SyncScheduler isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemSyncService.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr = new TestItemSyncAdapter(isNameExpr, new TestRestServiceFactory(), isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = new SyncScheduler();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = isMethod(HackerNewsItem.class);
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isMethod()).isMethod(isMethod());
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws IOException {
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(IOException.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws IOException {
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(IOException.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws IOException {
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(IOException.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isMethod()).isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        HackerNewsItem isVariable = isMethod(HackerNewsItem.class);
        isMethod(isNameExpr.isMethod()).isMethod(new long[] { isStringConstant, isStringConstant });
        isNameExpr.isMethod().isMethod(null, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = isMethod(HackerNewsItem.class);
        isMethod(isNameExpr.isMethod()).isMethod(new long[] { isStringConstant, isStringConstant });
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(IOException.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod("isStringConstant", true).isMethod("isStringConstant", true).isMethod();
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        ShadowContentResolver.Status isVariable = isNameExpr.isMethod(new Account("isStringConstant", isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod(), isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod(), isMethod("isStringConstant"), isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod(), isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod(), isMethod());
    }

    @Test
    public void isMethod() {
        new FavoriteManager(new InMemoryCache(), isNameExpr.isMethod(), isMethod(MaterialisticDatabase.SavedStoriesDao.class)).isMethod(isNameExpr, new Favorite("isStringConstant", null, "isStringConstant", isNameExpr.isMethod()));
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws IOException {
        isNameExpr.isFieldAccessExpr = null;
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws IOException {
        isNameExpr.isFieldAccessExpr = null;
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        HackerNewsItem isVariable = new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws IOException {
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant, isStringConstant };
            }
        }));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr);
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }
        }));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr);
        Call<HackerNewsItem> isVariable = isMethod(Call.class);
        isMethod(isNameExpr.isMethod()).isMethod(IOException.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isMethod(Account.class), isMethod(), null, null, null);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        ShadowNotificationManager isVariable = isMethod((NotificationManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        ShadowNotification isVariable = isMethod(isNameExpr.isMethod(isIntegerConstant));
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr);
        new ItemSyncWifiReceiver().isMethod(isNameExpr, new Intent(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr);
        new ItemSyncWifiReceiver().isMethod(isNameExpr, new Intent());
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr);
        new ItemSyncWifiReceiver().isMethod(isNameExpr, new Intent(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    private void isMethod(int isParameter) {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr, isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    private Bundle isMethod() {
        return isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr).isFieldAccessExpr;
    }

    @NonNull
    private Account isMethod() {
        return new Account("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    private static class isClassOrIsInterface extends ItemSyncAdapter {

        SyncDelegate isVariable;

        isConstructor(Context isParameter, RestServiceFactory isParameter, ReadabilityClient isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr);
        }

        @NonNull
        @Override
        SyncDelegate isMethod() {
            isNameExpr = super.isMethod();
            return isNameExpr;
        }
    }
}
