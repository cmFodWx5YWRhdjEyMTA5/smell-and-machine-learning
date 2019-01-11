// isComment
package com.showmehills;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    public enum Target {

        APP
    }

    private static AnalyticsTrackers isVariable;

    public static synchronized void isMethod(Context isParameter) {
        if (isNameExpr != null) {
            // isComment
            return;
        }
        isNameExpr = new AnalyticsTrackers(isNameExpr);
    }

    public static synchronized AnalyticsTrackers isMethod() {
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        return isNameExpr;
    }

    private final Map<Target, Tracker> isVariable = new HashMap<Target, Tracker>();

    private final Context isVariable;

    /**
     * isComment
     */
    private isConstructor(Context isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    public synchronized Tracker isMethod(Target isParameter) {
        if (!isNameExpr.isMethod(isNameExpr)) {
            Tracker isVariable;
            switch(isNameExpr) {
                case isNameExpr:
                    isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    break;
                default:
                    throw new IllegalArgumentException("isStringConstant" + isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}
