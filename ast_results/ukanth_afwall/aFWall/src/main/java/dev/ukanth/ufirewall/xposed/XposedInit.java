// isComment
package dev.ukanth.ufirewall.xposed;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.widget.Toast;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import dev.ukanth.ufirewall.Api;
import dev.ukanth.ufirewall.BuildConfig;
import dev.ukanth.ufirewall.log.Log;
import dev.ukanth.ufirewall.preferences.SharePreference;
import static de.robv.android.xposed.XposedHelpers.callStaticMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

/**
 * isComment
 */
public class isClassOrIsInterface implements IXposedHookZygoteInit, IXposedHookLoadPackage {

    public static final String isVariable = isNameExpr.isFieldAccessExpr;

    public static final String isVariable = "isStringConstant";

    public static String isVariable = null;

    private static Context isVariable;

    private XSharedPreferences isVariable;

    private SharedPreferences isVariable;

    private String isVariable = isNameExpr.isFieldAccessExpr;

    private Activity isVariable;

    public Activity isMethod() {
        return isNameExpr;
    }

    public void isMethod(Activity isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(final XC_LoadPackage.LoadPackageParam isParameter) throws Throwable {
        try {
            // isComment
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                isMethod();
                isMethod(isNameExpr);
            }
            isMethod(isNameExpr);
        } catch (XposedHelpers.ClassNotFoundError isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
    }

    // isComment
    private void isMethod(XC_LoadPackage.LoadPackageParam isParameter) {
        Class<?> isVariable = isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        XC_MethodHook isVariable = new XC_MethodHook() {

            @Override
            protected void isMethod(MethodHookParam isParameter) throws Throwable {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                isNameExpr.isMethod(true);
            }

            @Override
            protected void isMethod(MethodHookParam isParameter) throws Throwable {
            }
        };
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
    }

    private void isMethod() {
        try {
            if (isNameExpr == null) {
                Object isVariable = isMethod(isMethod("isStringConstant", null), "isStringConstant");
                isNameExpr = (Context) isNameExpr.isMethod();
            }
            if (isNameExpr == null) {
                isNameExpr = new XSharedPreferences(isNameExpr);
                isNameExpr.isMethod();
                isNameExpr.isMethod();
                if (isNameExpr.isMethod("isStringConstant", true)) {
                    isNameExpr = isNameExpr.isMethod("isStringConstant", "isStringConstant");
                }
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            } else {
                isNameExpr.isMethod();
                isNameExpr.isMethod();
            }
            // isComment
            isNameExpr = new SharePreference(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
        }
    }

    private void isMethod(XC_LoadPackage.LoadPackageParam isParameter) throws NoSuchMethodException {
        final ApplicationInfo isVariable = isNameExpr.isFieldAccessExpr;
        Class<?> isVariable = isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        Class<?> isVariable = isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        XC_MethodHook isVariable = new XC_MethodHook() {

            @Override
            protected void isMethod(MethodHookParam isParameter) throws Throwable {
                isMethod();
                final boolean isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr);
                if (!isNameExpr) {
                    isNameExpr.isMethod(isIntegerConstant);
                    DownloadManager isVariable = (DownloadManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isIntegerConstant);
                    if (isMethod() != null) {
                        isMethod().isMethod(() -> isNameExpr.isMethod(isMethod().isMethod(), "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant", isNameExpr.isFieldAccessExpr).isMethod());
                    }
                }
            }
        };
        XC_MethodHook isVariable = new XC_MethodHook() {

            @Override
            protected void isMethod(MethodHookParam isParameter) throws Throwable {
                isMethod();
                final boolean isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr);
                if (!isNameExpr) {
                    final Uri isVariable = (Uri) isNameExpr.isFieldAccessExpr[isIntegerConstant];
                    isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod("isStringConstant"));
                    if (isMethod() != null) {
                        isMethod().isMethod(() -> isNameExpr.isMethod(isMethod().isMethod(), "isStringConstant" + isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr).isMethod());
                    }
                }
            }
        };
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        Class<?> isVariable = isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new XC_MethodHook() {

            @Override
            protected void isMethod(MethodHookParam isParameter) throws Throwable {
                Activity isVariable = (Activity) isNameExpr.isMethod();
                if (isNameExpr != null) {
                    isMethod(isNameExpr);
                }
            }
        });
    }

    @Override
    public void isMethod(StartupParam isParameter) throws Throwable {
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
    }
}
