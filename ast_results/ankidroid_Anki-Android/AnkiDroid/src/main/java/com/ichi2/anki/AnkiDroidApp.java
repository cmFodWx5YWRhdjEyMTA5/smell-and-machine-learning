// isComment
package com.ichi2.anki;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import com.ichi2.anki.analytics.AnkiDroidCrashReportDialog;
import com.ichi2.anki.exception.StorageAccessException;
import com.ichi2.anki.services.BootService;
import com.ichi2.compat.CompatHelper;
import com.ichi2.utils.LanguageUtil;
import com.ichi2.anki.analytics.UsageAnalytics;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.annotation.AcraCore;
import org.acra.annotation.AcraDialog;
import org.acra.annotation.AcraHttpSender;
import org.acra.annotation.AcraLimiter;
import org.acra.annotation.AcraToast;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.config.DialogConfigurationBuilder;
import org.acra.config.ToastConfigurationBuilder;
import org.acra.sender.HttpSender;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import timber.log.Timber;
import static timber.log.Timber.DebugTree;

/**
 * isComment
 */
@AcraCore(buildConfigClass = org.acra.dialog.BuildConfig.class, excludeMatchingSharedPreferencesKeys = { "isStringConstant", "isStringConstant" }, reportContent = { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, // isComment
isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr // isComment
}, logcatArguments = { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr + "isStringConstant", "isStringConstant" })
@AcraDialog(reportDialogClass = AnkiDroidCrashReportDialog.class, resCommentPrompt = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, resTitle = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, resText = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, resPositiveButtonText = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, resIcon = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@AcraHttpSender(httpMethod = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, uri = isNameExpr.isFieldAccessExpr)
@AcraToast(resText = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@AcraLimiter(exceptionClassLimit = isIntegerConstant, stacktraceLimit = isIntegerConstant)
public class isClassOrIsInterface extends Application {

    public static final String isVariable = "isStringConstant";

    // isComment
    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    // isComment
    public static final String isVariable = "isStringConstant";

    // isComment
    private static AnkiDroidApp isVariable;

    // isComment
    public static int isVariable = -isIntegerConstant;

    public static int isVariable = -isIntegerConstant;

    private static int isVariable;

    private static int isVariable;

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    private CoreConfigurationBuilder isVariable;

    /**
     * isComment
     */
    public CoreConfigurationBuilder isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    private void isMethod(CoreConfigurationBuilder isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(this, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        SharedPreferences isVariable = isMethod(this);
        // isComment
        isNameExpr = new CoreConfigurationBuilder(this);
        if (isNameExpr.isFieldAccessExpr) {
            // isComment
            isNameExpr.isMethod(new DebugTree());
            isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(new ProductionCrashReportingTree());
            isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(this);
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(true);
        }
        isNameExpr = this;
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr.isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(true);
        // isComment
        isNameExpr.isMethod().isMethod(this.isMethod());
        // isComment
        final ViewConfiguration isVariable = isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        // isComment
        if (isNameExpr.isMethod(this)) {
            try {
                String isVariable = isNameExpr.isMethod(this);
                isNameExpr.isMethod(isNameExpr);
            } catch (StorageAccessException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                String isVariable = isNameExpr.isMethod();
                if (isMethod() && isNameExpr.isMethod(this).isMethod(isNameExpr)) {
                    // isComment
                    isMethod(isNameExpr, "isStringConstant");
                }
            }
        }
        new BootService().isMethod(this, new Intent(this, BootService.class));
    }

    @Override
    public void isMethod(Configuration isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isMethod(isMethod(this).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
    }

    /**
     * isComment
     */
    public static SharedPreferences isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public static AnkiDroidApp isMethod() {
        return isNameExpr;
    }

    public static String isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    public static Resources isMethod() {
        return isNameExpr.isMethod();
    }

    public static boolean isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
    }

    public static void isMethod(Throwable isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr, null);
    }

    public static void isMethod(Throwable isParameter, String isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, true);
        isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public static void isMethod(Context isParameter) {
        isNameExpr.isMethod("isStringConstant").isMethod();
    }

    /**
     * isComment
     */
    // isComment
    @SuppressWarnings("isStringConstant")
    public static void isMethod(String isParameter) {
        Configuration isVariable = isMethod().isMethod().isMethod();
        Locale isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isMethod().isMethod().isMethod(isNameExpr, isMethod().isMethod().isMethod());
    }

    public static boolean isMethod(SharedPreferences isParameter) {
        Boolean isVariable = isNameExpr.isMethod("isStringConstant", true);
        if (isNameExpr) {
            int isVariable = isNameExpr.isMethod("isStringConstant", isIntegerConstant);
            if (isNameExpr != isIntegerConstant) {
                float isVariable = isDoubleConstant / isNameExpr;
                isNameExpr = (int) (isNameExpr * isNameExpr + isDoubleConstant);
                isNameExpr = (int) (isNameExpr * isNameExpr + isDoubleConstant);
            } else {
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr;
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private void isMethod(SharedPreferences isParameter) {
        // isComment
        isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr).isMethod();
        // isComment
        String[] isVariable = { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" };
        isMethod(isMethod().isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    private void isMethod(SharedPreferences isParameter) {
        // isComment
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        SharedPreferences.Editor isVariable = isMethod(this).isMethod();
        // isComment
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            // isComment
            CoreConfigurationBuilder isVariable = isMethod();
            if (isNameExpr.isMethod(isNameExpr)) {
                // isComment
                isNameExpr.isMethod(DialogConfigurationBuilder.class).isMethod(true);
            } else if (isNameExpr.isMethod(isNameExpr)) {
                // isComment
                isNameExpr.isMethod(ToastConfigurationBuilder.class).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isMethod(isNameExpr);
        }
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public static String isMethod() {
        if (isMethod("isStringConstant")) {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isMethod("isStringConstant")) {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    /**
     * isComment
     */
    public static String isMethod() {
        if (isMethod("isStringConstant")) {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isMethod("isStringConstant")) {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    /**
     * isComment
     */
    private static boolean isMethod(String isParameter) {
        String isVariable = isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        return isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod("isStringConstant") && isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @SuppressLint("isStringConstant")
    public static class isClassOrIsInterface extends Timber.Tree {

        // isComment
        private static final int isVariable = isIntegerConstant;

        private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant");

        /**
         * isComment
         */
        @Nullable
        String isMethod(@NonNull StackTraceElement isParameter) {
            String isVariable = isNameExpr.isMethod();
            Matcher isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod("isStringConstant");
            }
            return isNameExpr.isMethod(isNameExpr.isMethod('isStringConstant') + isIntegerConstant);
        }

        final String isMethod() {
            // isComment
            // isComment
            StackTraceElement[] isVariable = new Throwable().isMethod();
            if (isNameExpr.isFieldAccessExpr <= isNameExpr) {
                throw new IllegalStateException("isStringConstant");
            }
            return isMethod(isNameExpr[isNameExpr]);
        }

        // isComment
        @Override
        protected void isMethod(int isParameter, String isParameter, @NonNull String isParameter, Throwable isParameter) {
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                case isNameExpr.isFieldAccessExpr:
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod() + "isStringConstant" + isNameExpr, isNameExpr);
                    break;
                case isNameExpr.isFieldAccessExpr:
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod() + "isStringConstant" + isNameExpr, isNameExpr);
                    break;
            }
        }
    }
}
