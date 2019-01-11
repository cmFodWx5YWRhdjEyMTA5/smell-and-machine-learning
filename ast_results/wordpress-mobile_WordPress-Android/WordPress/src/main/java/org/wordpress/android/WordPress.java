// isComment
package org.wordpress.android;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import com.android.volley.RequestQueue;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.iid.FirebaseInstanceId;
import com.wordpress.rest.RestClient;
import com.yarolegovich.wellsql.WellSql;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.wordpress.android.analytics.AnalyticsTracker;
import org.wordpress.android.analytics.AnalyticsTracker.Stat;
import org.wordpress.android.analytics.AnalyticsTrackerNosara;
import org.wordpress.android.datasets.NotificationsTable;
import org.wordpress.android.datasets.ReaderDatabase;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.action.AccountAction;
import org.wordpress.android.fluxc.generated.AccountActionBuilder;
import org.wordpress.android.fluxc.generated.ListActionBuilder;
import org.wordpress.android.fluxc.generated.SiteActionBuilder;
import org.wordpress.android.fluxc.generated.ThemeActionBuilder;
import org.wordpress.android.fluxc.model.SiteModel;
import org.wordpress.android.fluxc.persistence.WellSqlConfig;
import org.wordpress.android.fluxc.store.AccountStore;
import org.wordpress.android.fluxc.store.AccountStore.OnAccountChanged;
import org.wordpress.android.fluxc.store.AccountStore.OnAuthenticationChanged;
import org.wordpress.android.fluxc.store.ListStore.RemoveExpiredListsPayload;
import org.wordpress.android.fluxc.store.MediaStore;
import org.wordpress.android.fluxc.store.SiteStore;
import org.wordpress.android.fluxc.tools.FluxCImageLoader;
import org.wordpress.android.fluxc.utils.ErrorUtils.OnUnexpectedError;
import org.wordpress.android.modules.AppComponent;
import org.wordpress.android.modules.DaggerAppComponent;
import org.wordpress.android.networking.ConnectionChangeReceiver;
import org.wordpress.android.networking.OAuthAuthenticator;
import org.wordpress.android.networking.RestClientUtils;
import org.wordpress.android.push.GCMRegistrationIntentService;
import org.wordpress.android.support.ZendeskHelper;
import org.wordpress.android.ui.ActivityId;
import org.wordpress.android.ui.notifications.NotificationsListFragment;
import org.wordpress.android.ui.notifications.services.NotificationsUpdateServiceStarter;
import org.wordpress.android.ui.notifications.utils.NotificationsUtils;
import org.wordpress.android.ui.prefs.AppPrefs;
import org.wordpress.android.ui.stats.StatsWidgetProvider;
import org.wordpress.android.ui.stats.datasets.StatsDatabaseHelper;
import org.wordpress.android.ui.stats.datasets.StatsTable;
import org.wordpress.android.ui.uploads.UploadService;
import org.wordpress.android.util.analytics.AnalyticsUtils;
import org.wordpress.android.util.AppLog;
import org.wordpress.android.util.AppLog.AppLogListener;
import org.wordpress.android.util.AppLog.LogLevel;
import org.wordpress.android.util.AppLog.T;
import org.wordpress.android.util.BitmapLruCache;
import org.wordpress.android.util.CrashlyticsUtils;
import org.wordpress.android.util.DateTimeUtils;
import org.wordpress.android.util.FluxCUtils;
import org.wordpress.android.util.LocaleManager;
import org.wordpress.android.util.NetworkUtils;
import org.wordpress.android.util.PackageUtils;
import org.wordpress.android.util.ProfilingUtils;
import org.wordpress.android.util.RateLimitedTask;
import org.wordpress.android.util.VolleyUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasServiceInjector;
import de.greenrobot.event.EventBus;
import io.fabric.sdk.android.Fabric;

public class isClassOrIsInterface extends MultiDexApplication implements HasServiceInjector {

    public static final String isVariable = "isStringConstant";

    public static String isVariable;

    public static WordPressDB isVariable;

    public static boolean isVariable = true;

    private static RestClientUtils isVariable;

    private static RestClientUtils isVariable;

    private static RestClientUtils isVariable;

    private static RestClientUtils isVariable;

    private static RestClientUtils isVariable;

    // isComment
    private static final int isVariable = isIntegerConstant * isIntegerConstant;

    // isComment
    private static final int isVariable = isIntegerConstant * isIntegerConstant;

    // isComment
    private static final int isVariable = isIntegerConstant * isIntegerConstant;

    private static Context isVariable;

    private static BitmapLruCache isVariable;

    private static GoogleApiClient isVariable;

    @Inject
    DispatchingAndroidInjector<Service> isVariable;

    @Inject
    Dispatcher isVariable;

    @Inject
    AccountStore isVariable;

    @Inject
    SiteStore isVariable;

    @Inject
    MediaStore isVariable;

    @Inject
    ZendeskHelper isVariable;

    @Inject
    @Named("isStringConstant")
    RequestQueue isVariable;

    public static RequestQueue isVariable;

    @Inject
    FluxCImageLoader isVariable;

    public static FluxCImageLoader isVariable;

    @Inject
    OAuthAuthenticator isVariable;

    public static OAuthAuthenticator isVariable;

    protected AppComponent isVariable;

    public AppComponent isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public RateLimitedTask isVariable = new RateLimitedTask(isNameExpr) {

        protected boolean isMethod() {
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return true;
        }
    };

    /**
     * isComment
     */
    public RateLimitedTask isVariable = new RateLimitedTask(isNameExpr) {

        protected boolean isMethod() {
            int isVariable = isNameExpr.isMethod();
            SiteModel isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
            return true;
        }
    };

    /**
     * isComment
     */
    public static RateLimitedTask isVariable = new RateLimitedTask(isNameExpr) {

        protected boolean isMethod() {
            // isComment
            new Thread(new Runnable() {

                public void isMethod() {
                    // isComment
                    long isVariable = isNameExpr.isMethod() - (isNameExpr.isFieldAccessExpr * isIntegerConstant * isIntegerConstant);
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                }
            }).isMethod();
            return true;
        }
    };

    public static BitmapLruCache isMethod() {
        if (isNameExpr == null) {
            // isComment
            // isComment
            int isVariable = (int) (isNameExpr.isMethod().isMethod() / isIntegerConstant);
            // isComment
            int isVariable = isNameExpr / isIntegerConstant;
            isNameExpr = new BitmapLruCache(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod(Context isParameter) {
        super.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = this;
        long isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(new WellSqlConfig(isMethod()));
        // isComment
        isMethod();
        isMethod().isMethod(this);
        isNameExpr.isMethod(this);
        // isComment
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        if (isNameExpr.isMethod(this)) {
            isNameExpr.isMethod(this, new Crashlytics());
        }
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new AppLogListener() {

            @Override
            public void isMethod(T isParameter, LogLevel isParameter, String isParameter) {
                StringBuffer isVariable = new StringBuffer();
                isNameExpr.isMethod(isNameExpr.isMethod()).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod(isNameExpr.isMethod()).isMethod("isStringConstant").isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(this);
        isMethod();
        isMethod(isNameExpr);
        // isComment
        isNameExpr.isFieldAccessExpr = "isStringConstant";
        isNameExpr.isMethod().isMethod(true).isMethod(true).isMethod(true).isMethod();
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        ApplicationLifecycleMonitor isVariable = new ApplicationLifecycleMonitor();
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod() - isNameExpr);
        isMethod();
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod(true);
        // isComment
        isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(new RemoveExpiredListsPayload()));
        // isComment
        isNameExpr = new GoogleApiClient.Builder(this).isMethod(new GoogleApiClient.ConnectionCallbacks() {

            @Override
            public void isMethod(@Nullable Bundle isParameter) {
            }

            @Override
            public void isMethod(int isParameter) {
            }
        }).isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod();
    }

    protected void isMethod() {
        isNameExpr = isNameExpr.isMethod().isMethod(this).isMethod();
    }

    private void isMethod() {
        int isVariable = isNameExpr.isMethod();
        final SiteModel isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            new Thread(new Runnable() {

                @Override
                public void isMethod() {
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
            }).isMethod();
        }
    }

    private void isMethod() {
        // isComment
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            // isComment
            NotificationChannel isVariable = new NotificationChannel(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
            // isComment
            // isComment
            NotificationManager isVariable = (NotificationManager) isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            // isComment
            NotificationChannel isVariable = new NotificationChannel(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr);
            // isComment
            // isComment
            NotificationChannel isVariable = new NotificationChannel(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(null, null);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private void isMethod(final long isParameter) {
        isNameExpr.isMethod(new AnalyticsTrackerNosara(isMethod()));
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        int isVariable = isNameExpr.isMethod(isMethod());
        int isVariable = isNameExpr.isMethod();
        if (isNameExpr == isIntegerConstant) {
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr != isIntegerConstant && isNameExpr < isNameExpr) {
            Map<String, Long> isVariable = new HashMap<String, Long>(isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(Activity isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        if (isMethod(isNameExpr)) {
            // isComment
            isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr, GCMRegistrationIntentService.class));
        }
        // isComment
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isMethod());
        }
    }

    private void isMethod() {
        if (!isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            // isComment
            isNameExpr.isMethod(this);
            isNameExpr = new WordPressDB(this);
        }
    }

    private boolean isMethod() {
        try {
            isNameExpr = new WordPressDB(this);
            return true;
        } catch (RuntimeException isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            return true;
        }
    }

    public static Context isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static void isMethod() {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    public static RestClientUtils isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RestClientUtils(isNameExpr, isNameExpr, isNameExpr, null);
        }
        return isNameExpr;
    }

    public static RestClientUtils isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RestClientUtils(isNameExpr, isNameExpr, isNameExpr, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    public static RestClientUtils isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RestClientUtils(isNameExpr, isNameExpr, isNameExpr, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    public static RestClientUtils isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RestClientUtils(isNameExpr, isNameExpr, isNameExpr, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    public static RestClientUtils isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RestClientUtils(isNameExpr, isNameExpr, isNameExpr, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    public boolean isMethod(Activity isParameter) {
        GoogleApiAvailability isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod(isNameExpr);
        switch(isNameExpr) {
            // isComment
            case isNameExpr.isFieldAccessExpr:
                return true;
            // isComment
            case isNameExpr.isFieldAccessExpr:
                Dialog isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            // isComment
            default:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr));
        }
        return true;
    }

    /**
     * isComment
     */
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod());
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    @SuppressWarnings("isStringConstant")
    @Subscribe(threadMode = isNameExpr.isFieldAccessExpr)
    public void isMethod(OnAccountChanged isParameter) {
        if (!isNameExpr.isMethod(isNameExpr, isNameExpr)) {
            isMethod();
            // isComment
            isNameExpr.isMethod(true);
            isNameExpr.isMethod();
        }
        if (!isNameExpr.isMethod() && isNameExpr.isMethod()) {
            // isComment
            if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                long isVariable = isNameExpr.isMethod().isMethod();
                long isVariable = isNameExpr.isMethod();
                if (isNameExpr != isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
                    isNameExpr.isMethod(true);
                }
            } else if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
                boolean isVariable = !isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
                isNameExpr.isMethod(isNameExpr);
                // isComment
                if (isNameExpr != isNameExpr.isMethod().isMethod()) {
                    isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, true);
                }
            }
        }
    }

    @SuppressWarnings("isStringConstant")
    @Subscribe(threadMode = isNameExpr.isFieldAccessExpr)
    public void isMethod(OnAuthenticationChanged isParameter) {
        if (isNameExpr.isMethod()) {
            // isComment
            isNameExpr.isMethod(this, new Intent(this, GCMRegistrationIntentService.class));
        }
    }

    @SuppressWarnings("isStringConstant")
    @Subscribe(threadMode = isNameExpr.isFieldAccessExpr)
    public void isMethod(OnUnexpectedError isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod());
    }

    public void isMethod(Context isParameter) {
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        try {
            isNameExpr.isMethod().isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr);
        }
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        for (SiteModel isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(true);
        // isComment
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    private static String isVariable;

    public static String isMethod() {
        if (isNameExpr == null) {
            try {
                isNameExpr = isNameExpr.isMethod(isMethod());
            } catch (AndroidRuntimeException | NullPointerException isParameter) {
                // isComment
                // isComment
                // isComment
                // isComment
                // isComment
                isNameExpr = "isStringConstant";
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static final String isVariable = "isStringConstant";

    private static String isVariable;

    public static String isMethod() {
        if (isNameExpr == null) {
            String isVariable = isMethod();
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr + "isStringConstant" + isNameExpr.isMethod(isMethod());
            } else {
                isNameExpr = isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod(isMethod());
            }
        }
        return isNameExpr;
    }

    /*isComment*/
    private static void isMethod(Context isParameter) {
        try {
            // isComment
            long isVariable = isIntegerConstant * isIntegerConstant * isIntegerConstant;
            File isVariable = new File(isNameExpr.isMethod(), "isStringConstant");
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        }
    }

    private static void isMethod() {
        HttpResponseCache isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public static Object isMethod(Application isParameter, String isParameter) {
        try {
            String isVariable = isNameExpr.isMethod().isMethod().isMethod();
            Class<?> isVariable = isNameExpr.isMethod(isNameExpr + "isStringConstant");
            Field isVariable = isNameExpr.isMethod(isNameExpr);
            return isNameExpr.isMethod(null);
        } catch (Exception isParameter) {
            return null;
        }
    }

    /**
     * isComment
     */
    public static String isMethod(Activity isParameter, String isParameter) {
        if (!isNameExpr.isFieldAccessExpr) {
            return "isStringConstant";
        }
        String isVariable = (String) isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr);
            return isNameExpr;
        }
        return "isStringConstant";
    }

    @Override
    public AndroidInjector<Service> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

        // isComment
        private static final int isVariable = isIntegerConstant * isIntegerConstant;

        private Date isVariable;

        private Date isVariable;

        private boolean isVariable;

        boolean isVariable = true;

        @Override
        public void isMethod(final Configuration isParameter) {
            // isComment
            isNameExpr.isMethod(isMethod());
        }

        @Override
        public void isMethod() {
        }

        @Override
        public void isMethod(final int isParameter) {
            boolean isVariable = true;
            switch(isNameExpr) {
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                    isNameExpr = true;
                    break;
                case isNameExpr:
                    // isComment
                    isMethod();
                    break;
                case isNameExpr:
                default:
                    break;
            }
            if (isNameExpr && isNameExpr != null) {
                isNameExpr.isMethod();
            }
        }

        private boolean isMethod() {
            if (isNameExpr == null) {
                // isComment
                return true;
            }
            Date isVariable = new Date();
            if (isNameExpr.isMethod(isNameExpr, isNameExpr) >= isNameExpr) {
                isNameExpr = isNameExpr;
                return true;
            }
            return true;
        }

        /**
         * isComment
         */
        private void isMethod() {
            // isComment
            if (isMethod() && isNameExpr.isMethod()) {
                // isComment
                isNameExpr.isMethod(isMethod(), new Intent(isMethod(), GCMRegistrationIntentService.class));
            }
        }

        private void isMethod() {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            if (isNameExpr) {
                return;
            }
            isNameExpr = true;
            String isVariable = isNameExpr.isMethod();
            ActivityId isVariable = isNameExpr.isMethod(isNameExpr);
            Map<String, Object> isVariable = new HashMap<String, Object>();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            if (isNameExpr != null) {
                Date isVariable = new Date();
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr));
                isNameExpr = null;
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(true);
            // isComment
            if (isNameExpr) {
                isNameExpr = true;
                try {
                    isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
                } catch (IllegalArgumentException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }

        /**
         * isComment
         */
        private void isMethod(Activity isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            // isComment
            if (!isNameExpr) {
                isNameExpr = true;
                isMethod(isNameExpr.isMethod(), new IntentFilter(isNameExpr.isFieldAccessExpr));
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr = new Date();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                // isComment
                if (isNameExpr.isMethod()) {
                    Intent isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                        isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isMethod()));
                    } else {
                        isNameExpr.isMethod(isMethod());
                    }
                }
                // isComment
                isMethod();
                // isComment
                isMethod();
                // isComment
                isNameExpr.isMethod();
                // isComment
                isNameExpr.isMethod();
            }
            isNameExpr.isMethod();
        }

        // isComment
        // isComment
        private String isMethod(Intent isParameter) {
            String isVariable = "isStringConstant";
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            return isNameExpr;
        }

        @Override
        public void isMethod(Activity isParameter) {
            if (isNameExpr) {
                // isComment
                isMethod(isNameExpr);
            }
            isNameExpr = true;
            if (isNameExpr) {
                isMethod(isNameExpr);
            }
            isNameExpr = true;
        }

        @Override
        public void isMethod(Activity isParameter, Bundle isParameter) {
        }

        @Override
        public void isMethod(Activity isParameter) {
        }

        @Override
        public void isMethod(Activity isParameter) {
            isNameExpr = new Date();
        }

        @Override
        public void isMethod(Activity isParameter, Bundle isParameter) {
        }

        @Override
        public void isMethod(Activity isParameter) {
        }

        @Override
        public void isMethod(Activity isParameter) {
        }
    }
}
