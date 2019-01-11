// isComment
package com.codebutler.farebot.card.cepas.raw;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.cepas.CEPASPurse;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawCEPASPurse isMethod(int isParameter, byte[] isParameter) {
        return new AutoValue_RawCEPASPurse(isNameExpr, isNameExpr.isMethod(isNameExpr), null);
    }

    @NonNull
    public static RawCEPASPurse isMethod(int isParameter, String isParameter) {
        return new AutoValue_RawCEPASPurse(isNameExpr, null, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawCEPASPurse> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawCEPASPurse.GsonTypeAdapter(isNameExpr);
    }

    public boolean isMethod() {
        return isMethod() != null;
    }

    @NonNull
    public CEPASPurse isMethod() {
        if (isMethod()) {
            return isNameExpr.isMethod(isMethod(), isMethod().isMethod());
        }
        return isNameExpr.isMethod(isMethod(), isMethod());
    }

    public byte isMethod() {
        return isMethod().isMethod()[isIntegerConstant];
    }

    abstract int isMethod();

    @Nullable
    abstract ByteArray isMethod();

    @Nullable
    abstract String isMethod();
}
