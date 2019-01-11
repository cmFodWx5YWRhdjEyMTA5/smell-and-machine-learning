// isComment
package com.codebutler.farebot.transit.ezlink;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    @NonNull
    static EZLinkTransitInfo isMethod(@NonNull String isParameter, @NonNull ImmutableList<Trip> isParameter, int isParameter) {
        return new AutoValue_EZLinkTransitInfo(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isMethod());
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        NumberFormat isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        return isNameExpr.isMethod(isMethod() / isIntegerConstant);
    }

    @Nullable
    @Override
    public List<Refill> isMethod() {
        return null;
    }

    @Nullable
    @Override
    public List<Subscription> isMethod() {
        return null;
    }

    abstract double isMethod();
}
