// isComment
package com.codebutler.farebot.transit.clipper;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import com.google.auto.value.AutoValue;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    @NonNull
    static ClipperTransitInfo isMethod(@NonNull String isParameter, @NonNull List<Trip> isParameter, @NonNull List<Refill> isParameter, short isParameter) {
        return new AutoValue_ClipperTransitInfo(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod() / isDoubleConstant);
    }

    @Nullable
    @Override
    public List<Subscription> isMethod() {
        return null;
    }

    abstract short isMethod();
}
