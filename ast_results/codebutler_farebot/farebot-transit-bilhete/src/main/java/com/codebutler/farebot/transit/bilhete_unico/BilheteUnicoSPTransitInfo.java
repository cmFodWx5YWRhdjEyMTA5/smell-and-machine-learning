// isComment
package com.codebutler.farebot.transit.bilhete_unico;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import com.google.auto.value.AutoValue;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    static final String isVariable = "isStringConstant";

    @NonNull
    static BilheteUnicoSPTransitInfo isMethod(@NonNull BilheteUnicoSPCredit isParameter) {
        return new AutoValue_BilheteUnicoSPTransitInfo(isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isMethod().isMethod());
    }

    @Nullable
    @Override
    public String isMethod() {
        return null;
    }

    @Nullable
    @Override
    public List<Trip> isMethod() {
        return null;
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

    @NonNull
    abstract BilheteUnicoSPCredit isMethod();

    private static String isMethod(int isParameter) {
        NumberFormat isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        return isNameExpr.isMethod((double) isNameExpr / isDoubleConstant);
    }
}
