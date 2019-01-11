// isComment
package com.commonsware.cwac.wakeful;

import java.io.IOException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import com.commonsware.cwac.wakeful.WakefulIntentService.AlarmListener;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class isClassOrIsInterface extends BroadcastReceiver {

    private static final String isVariable = "isStringConstant";

    @Override
    public void isMethod(Context isParameter, Intent isParameter) {
        AlarmListener isVariable = isMethod(isNameExpr);
        if (isNameExpr != null) {
            if (isNameExpr.isMethod() == null) {
                SharedPreferences isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod();
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr, true);
            }
        }
    }

    @SuppressWarnings("isStringConstant")
    private WakefulIntentService.AlarmListener isMethod(Context isParameter) {
        PackageManager isVariable = isNameExpr.isMethod();
        ComponentName isVariable = new ComponentName(isNameExpr, isMethod());
        try {
            ActivityInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            XmlResourceParser isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            while (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                    if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                        String isVariable = isNameExpr.isMethod(null, "isStringConstant");
                        Class<AlarmListener> isVariable = (Class<AlarmListener>) isNameExpr.isMethod(isNameExpr);
                        return (isNameExpr.isMethod());
                    }
                }
                isNameExpr.isMethod();
            }
        } catch (NameNotFoundException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } catch (XmlPullParserException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } catch (IOException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } catch (ClassNotFoundException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } catch (IllegalAccessException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } catch (InstantiationException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
        return (null);
    }
}
