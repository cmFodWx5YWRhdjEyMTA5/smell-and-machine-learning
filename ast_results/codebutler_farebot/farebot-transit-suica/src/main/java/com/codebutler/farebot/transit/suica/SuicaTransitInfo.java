// isComment
package com.codebutler.farebot.transit.suica;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface extends TransitInfo {

    @NonNull
    static SuicaTransitInfo isMethod(@Nullable String isParameter, @NonNull List<Trip> isParameter, @NonNull List<Refill> isParameter, @NonNull List<Subscription> isParameter) {
        return new AutoValue_SuicaTransitInfo(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        if (isMethod().isMethod() > isIntegerConstant) {
            return isMethod().isMethod(isIntegerConstant).isMethod();
        }
        return null;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        // isComment
        return "isStringConstant";
    }
}
