// isComment
package com.codebutler.farebot.transit.kmt;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.kmt.R;
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
    public static KMTTransitInfo isMethod(@NonNull List<Trip> isParameter, @NonNull ByteArray isParameter, int isParameter) {
        return new AutoValue_KMTTransitInfo(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        Locale isVariable = new Locale("isStringConstant", "isStringConstant");
        NumberFormat isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant);
        return isNameExpr.isMethod(isMethod());
    }

    @Nullable
    @Override
    public String isMethod() {
        return new String(isMethod().isMethod());
    }

    @Nullable
    @Override
    public List<Subscription> isMethod() {
        return null;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Nullable
    @Override
    public List<Refill> isMethod() {
        return null;
    }

    @NonNull
    abstract ByteArray isMethod();

    abstract int isMethod();
}
