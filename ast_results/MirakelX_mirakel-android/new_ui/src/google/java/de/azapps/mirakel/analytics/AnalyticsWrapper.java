// isComment
package de.azapps.mirakel.analytics;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import de.azapps.mirakel.helper.AnalyticsWrapperBase;
import de.azapps.mirakel.helper.MirakelCommonPreferences;
import de.azapps.mirakelandroid.BuildConfig;

public class isClassOrIsInterface extends AnalyticsWrapperBase {

    @Nullable
    private GoogleAnalytics isVariable;

    @Nullable
    private Tracker isVariable;

    public isConstructor(Application isParameter) {
        if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
        }
    }

    @Override
    public void isMethod(@NonNull final CATEGORY isParameter, @NonNull final String isParameter, @Nullable final String isParameter, @Nullable final Long isParameter) {
        if (isNameExpr != null) {
            HitBuilders.EventBuilder isVariable = new HitBuilders.EventBuilder();
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    @Override
    public void isMethod(Object isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod(new HitBuilders.ScreenViewBuilder().isMethod());
        }
    }

    @Override
    public void isMethod() {
        isNameExpr = null;
    }
}
