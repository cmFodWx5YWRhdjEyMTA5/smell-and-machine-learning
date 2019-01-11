// isComment
package fr.gouv.etalab.mastodon.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import fr.gouv.etalab.mastodon.R;
import fr.gouv.etalab.mastodon.activities.BaseMainActivity;
import fr.gouv.etalab.mastodon.activities.MainActivity;
import fr.gouv.etalab.mastodon.client.API;
import fr.gouv.etalab.mastodon.client.Entities.Account;
import fr.gouv.etalab.mastodon.client.Entities.Notification;
import fr.gouv.etalab.mastodon.client.Entities.Status;
import fr.gouv.etalab.mastodon.client.TLSSocketFactory;
import fr.gouv.etalab.mastodon.helper.Helper;
import fr.gouv.etalab.mastodon.sqlite.AccountDAO;
import fr.gouv.etalab.mastodon.sqlite.Sqlite;
import static fr.gouv.etalab.mastodon.helper.Helper.INTENT_ACTION;
import static fr.gouv.etalab.mastodon.helper.Helper.INTENT_TARGETED_ACCOUNT;
import static fr.gouv.etalab.mastodon.helper.Helper.NOTIFICATION_INTENT;
import static fr.gouv.etalab.mastodon.helper.Helper.PREF_KEY_ID;
import static fr.gouv.etalab.mastodon.helper.Helper.notify_user;

public class isClassOrIsInterface extends Service {

    protected Account isVariable;

    private boolean isVariable = true;

    private static HashMap<String, Boolean> isVariable = new HashMap<>();

    private Proxy isVariable;

    public void isMethod() {
        super.isMethod();
    }

    static {
        isNameExpr.isMethod();
    }

    @Override
    public int isMethod(Intent isParameter, int isParameter, int isParameter) {
        SharedPreferences isVariable = isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr = null;
        if (isNameExpr) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            if (isNameExpr == isIntegerConstant)
                isNameExpr = new Proxy(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new InetSocketAddress(isNameExpr, isNameExpr));
            else
                isNameExpr = new Proxy(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new InetSocketAddress(isNameExpr, isNameExpr));
            final String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
            final String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
            if (isNameExpr != null) {
                Authenticator isVariable = new Authenticator() {

                    public PasswordAuthentication isMethod() {
                        assert isNameExpr != null;
                        return (new PasswordAuthentication(isNameExpr, isNameExpr.isMethod()));
                    }
                };
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr == null || isNameExpr.isMethod("isStringConstant", true)) {
            isNameExpr = true;
            isMethod();
        }
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        String isVariable;
        SQLiteDatabase isVariable = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr, null, isNameExpr.isFieldAccessExpr).isMethod();
        if (isNameExpr) {
            if (isNameExpr == null || isNameExpr.isMethod("isStringConstant") == null) {
                List<Account> isVariable = new AccountDAO(isMethod(), isNameExpr).isMethod();
                if (isNameExpr != null) {
                    for (final Account isVariable : isNameExpr) {
                        Thread isVariable = new Thread() {

                            @Override
                            public void isMethod() {
                                isMethod(isNameExpr);
                            }
                        };
                        isNameExpr.isMethod();
                    }
                }
            } else {
                isNameExpr = isNameExpr.isMethod("isStringConstant");
                final Account isVariable = new AccountDAO(isMethod(), isNameExpr).isMethod(isNameExpr);
                if (isNameExpr != null) {
                    Thread isVariable = new Thread() {

                        @Override
                        public void isMethod() {
                            isMethod(isNameExpr);
                        }
                    };
                    isNameExpr.isMethod();
                }
            }
        }
        return isNameExpr;
    }

    @Nullable
    @Override
    public IBinder isMethod(Intent isParameter) {
        return null;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (!isNameExpr)
            isMethod(new Intent("isStringConstant"));
    }

    private void isMethod(Account isParameter) {
        InputStream isVariable = null;
        HttpsURLConnection isVariable = null;
        HttpURLConnection isVariable = null;
        BufferedReader isVariable = null;
        Helper.EventStreaming isVariable = null;
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod());
            if (!isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod()) || !isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod())) {
                if (isNameExpr.isMethod(isNameExpr.isMethod()).isMethod("isStringConstant")) {
                    try {
                        URL isVariable = new URL("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
                        if (isNameExpr != null)
                            isNameExpr = (HttpsURLConnection) isNameExpr.isMethod(isNameExpr);
                        else
                            isNameExpr = (HttpsURLConnection) isNameExpr.isMethod();
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod());
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod(new TLSSocketFactory());
                        isNameExpr.isMethod("isStringConstant");
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr = new BufferedInputStream(isNameExpr.isMethod());
                            isNameExpr = new BufferedReader(new InputStreamReader(isNameExpr));
                            String isVariable;
                            Helper.EventStreaming isVariable;
                            while ((isNameExpr = isNameExpr.isMethod()) != null) {
                                isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                                if ((isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == null) && !isNameExpr.isMethod("isStringConstant")) {
                                    switch(isNameExpr.isMethod()) {
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        default:
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    }
                                } else {
                                    if (!isNameExpr.isMethod("isStringConstant")) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                        continue;
                                    }
                                    isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                                    if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                        isNameExpr = "isStringConstant" + isNameExpr + "isStringConstant";
                                    } else {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    }
                                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    try {
                                        JSONObject isVariable = new JSONObject(isNameExpr);
                                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                                    } catch (JSONException isParameter) {
                                        isNameExpr.isMethod();
                                    }
                                }
                            }
                            isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                        }
                    } catch (Exception isParameter) {
                        isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                        isNameExpr.isMethod();
                    } finally {
                        if (isNameExpr != null) {
                            try {
                                isNameExpr.isMethod();
                            } catch (IOException isParameter) {
                            }
                        }
                        if (isNameExpr != null) {
                            try {
                                isNameExpr.isMethod();
                            } catch (IOException isParameter) {
                            }
                        }
                        if (isNameExpr != null) {
                            isNameExpr.isMethod();
                        }
                        isNameExpr.isMethod(isIntegerConstant);
                        Intent isVariable = new Intent(this, LiveNotificationService.class);
                        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                        try {
                            isMethod(isNameExpr);
                        } catch (Exception isParameter) {
                        }
                    }
                } else {
                    try {
                        URL isVariable = new URL("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
                        if (isNameExpr != null)
                            isNameExpr = (HttpURLConnection) isNameExpr.isMethod(isNameExpr);
                        else
                            isNameExpr = (HttpURLConnection) isNameExpr.isMethod();
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod());
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant", "isStringConstant");
                        isNameExpr.isMethod("isStringConstant");
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr = new BufferedInputStream(isNameExpr.isMethod());
                            isNameExpr = new BufferedReader(new InputStreamReader(isNameExpr));
                            String isVariable;
                            Helper.EventStreaming isVariable;
                            while ((isNameExpr = isNameExpr.isMethod()) != null) {
                                isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                                if ((isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == null) && !isNameExpr.isMethod("isStringConstant")) {
                                    switch(isNameExpr.isMethod()) {
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        case "isStringConstant":
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                            break;
                                        default:
                                            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    }
                                } else {
                                    if (!isNameExpr.isMethod("isStringConstant")) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                        continue;
                                    }
                                    isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                                    if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                        isNameExpr = "isStringConstant" + isNameExpr + "isStringConstant";
                                    } else {
                                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    }
                                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    try {
                                        JSONObject isVariable = new JSONObject(isNameExpr);
                                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                                    } catch (JSONException isParameter) {
                                        isNameExpr.isMethod();
                                    }
                                }
                            }
                            isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                        }
                    } catch (Exception isParameter) {
                        isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isMethod(), true);
                        isNameExpr.isMethod();
                    } finally {
                        if (isNameExpr != null) {
                            try {
                                isNameExpr.isMethod();
                            } catch (IOException isParameter) {
                            }
                        }
                        if (isNameExpr != null) {
                            try {
                                isNameExpr.isMethod();
                            } catch (IOException isParameter) {
                            }
                        }
                        if (isNameExpr != null) {
                            isNameExpr.isMethod();
                        }
                        isNameExpr.isMethod(isIntegerConstant);
                        Intent isVariable = new Intent(this, LiveNotificationService.class);
                        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                        try {
                            isMethod(isNameExpr);
                        } catch (Exception isParameter) {
                        }
                    }
                }
            }
        }
    }

    private void isMethod(Helper.EventStreaming isParameter, final Account isParameter, JSONObject isParameter) {
        if (isNameExpr == null)
            return;
        // isComment
        fr.gouv.etalab.mastodon.client.Entities.Status isVariable;
        final Notification isVariable;
        String isVariable = null;
        Bundle isVariable = new Bundle();
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            boolean isVariable;
            try {
                isNameExpr = isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isNameExpr = true;
            }
            final SharedPreferences isVariable = isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            boolean isVariable = isNameExpr.isMethod(isMethod());
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
            String isVariable = null;
            if ((isNameExpr == null || !isNameExpr.isMethod(isNameExpr.isMethod()) || isNameExpr) && isNameExpr && isNameExpr && isNameExpr) {
                boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                boolean isVariable = (isNameExpr || isNameExpr || isNameExpr || isNameExpr);
                String isVariable = null;
                if (isNameExpr && isNameExpr != null) {
                    switch(isNameExpr.isMethod()) {
                        case "isStringConstant":
                            if (isNameExpr) {
                                if (isNameExpr.isMethod().isMethod() != null && isNameExpr.isMethod().isMethod().isMethod() > isIntegerConstant)
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), true), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                else
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            }
                            break;
                        case "isStringConstant":
                            if (isNameExpr) {
                                if (isNameExpr.isMethod().isMethod() != null && isNameExpr.isMethod().isMethod().isMethod() > isIntegerConstant)
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), true), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                else
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            }
                            break;
                        case "isStringConstant":
                            if (isNameExpr) {
                                if (isNameExpr.isMethod().isMethod() != null && isNameExpr.isMethod().isMethod().isMethod() > isIntegerConstant)
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), true), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                else
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            }
                            break;
                        case "isStringConstant":
                            if (isNameExpr) {
                                if (isNameExpr.isMethod().isMethod() != null && isNameExpr.isMethod().isMethod().isMethod() > isIntegerConstant)
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), true), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                else
                                    isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                                isNameExpr = isNameExpr.isMethod().isMethod();
                            }
                            break;
                        default:
                    }
                    // isComment
                    final Intent isVariable = new Intent(isMethod(), MainActivity.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                    if (isNameExpr != null)
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                    long isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    final int isVariable = ((isNameExpr + isIntegerConstant) > isIntegerConstant) ? (int) (isIntegerConstant - isNameExpr - isIntegerConstant) : (int) (isNameExpr + isIntegerConstant);
                    if (isNameExpr.isMethod().isMethod() != null) {
                        final String isVariable = isNameExpr;
                        Handler isVariable = new Handler(isNameExpr.isMethod());
                        Runnable isVariable = new Runnable() {

                            @Override
                            public void isMethod() {
                                if (isNameExpr != null) {
                                    isNameExpr.isMethod(isMethod()).isMethod().isMethod(isNameExpr.isMethod().isMethod()).isMethod(new RequestListener<Bitmap>() {

                                        @Override
                                        public boolean isMethod(Bitmap isParameter, Object isParameter, Target<Bitmap> isParameter, DataSource isParameter, boolean isParameter) {
                                            return true;
                                        }

                                        @Override
                                        public boolean isMethod(@Nullable GlideException isParameter, Object isParameter, Target isParameter, boolean isParameter) {
                                            isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
                                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isMethod() + isNameExpr.isMethod(), null);
                                            if (isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod()) > isNameExpr.isMethod(isNameExpr)) {
                                                SharedPreferences.Editor isVariable = isNameExpr.isMethod();
                                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isMethod() + isNameExpr.isMethod(), isNameExpr.isMethod());
                                                isNameExpr.isMethod();
                                            }
                                            return true;
                                        }
                                    }).isMethod(new SimpleTarget<Bitmap>() {

                                        @Override
                                        public void isMethod(Bitmap isParameter, Transition<? super Bitmap> isParameter) {
                                            isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
                                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isMethod() + isNameExpr.isMethod(), null);
                                            if (isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod()) > isNameExpr.isMethod(isNameExpr)) {
                                                SharedPreferences.Editor isVariable = isNameExpr.isMethod();
                                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isMethod() + isNameExpr.isMethod(), isNameExpr.isMethod());
                                                isNameExpr.isMethod();
                                            }
                                        }
                                    });
                                }
                            }
                        };
                        isNameExpr.isMethod(isNameExpr);
                    }
                }
            }
        } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr);
            isNameExpr.isMethod(new ArrayList<Status>());
            isNameExpr.isMethod(true);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            try {
                isNameExpr = isNameExpr.isMethod("isStringConstant");
            } catch (JSONException isParameter) {
            }
        }
        if (isNameExpr != null)
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod()).isMethod(isNameExpr);
    }
}
