// isComment
package com.codebutler.farebot.transit.seq_go;

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
import java.util.List;
import java.util.Locale;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    public static final String isVariable = "isStringConstant";

    @NonNull
    static SeqGoTransitInfo isMethod(@NonNull String isParameter, @NonNull ImmutableList<Trip> isParameter, @NonNull ImmutableList<Refill> isParameter, boolean isParameter, int isParameter) {
        return new AutoValue_SeqGoTransitInfo(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod((double) isMethod() / isDoubleConstant);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr;
    }

    @Nullable
    @Override
    public List<Subscription> isMethod() {
        return null;
    }

    @Override
    public abstract boolean isMethod();

    abstract int isMethod();
}
