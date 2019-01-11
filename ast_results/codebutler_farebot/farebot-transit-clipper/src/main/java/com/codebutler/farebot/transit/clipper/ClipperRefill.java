// isComment
package com.codebutler.farebot.transit.clipper;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.codebutler.farebot.transit.Refill;
import com.google.auto.value.AutoValue;
import java.text.NumberFormat;
import java.util.Locale;

@AutoValue
abstract class isClassOrIsInterface extends Refill {

    @NonNull
    static ClipperRefill isMethod(long isParameter, long isParameter, long isParameter, long isParameter) {
        return new AutoValue_ClipperRefill(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        NumberFormat isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod((double) isMethod() / isDoubleConstant);
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod((int) isMethod());
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod((int) isMethod());
    }

    abstract long isMethod();

    abstract long isMethod();
}
