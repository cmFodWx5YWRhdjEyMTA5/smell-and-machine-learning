// isComment
package com.codebutler.farebot.transit.manly_fast_ferry;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.format.DateFormat;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import com.codebutler.farebot.base.ui.FareBotUiTree;
import com.google.auto.value.AutoValue;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    public static final String isVariable = "isStringConstant";

    @NonNull
    static ManlyFastFerryTransitInfo isMethod(@NonNull String isParameter, @NonNull ArrayList<Trip> isParameter, @NonNull ArrayList<Refill> isParameter, @NonNull GregorianCalendar isParameter, int isParameter) {
        return new AutoValue_ManlyFastFerryTransitInfo(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod((double) isMethod() / isDoubleConstant);
    }

    @Nullable
    @Override
    public List<Subscription> isMethod() {
        // isComment
        return null;
    }

    @Nullable
    @Override
    public FareBotUiTree isMethod(@NonNull Context isParameter) {
        FareBotUiTree.Builder isVariable = isNameExpr.isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod(isMethod().isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr;
    }

    abstract GregorianCalendar isMethod();

    abstract int isMethod();
}
