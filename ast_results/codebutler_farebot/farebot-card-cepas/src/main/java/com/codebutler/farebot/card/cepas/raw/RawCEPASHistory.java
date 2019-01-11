// isComment
package com.codebutler.farebot.card.cepas.raw;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.cepas.CEPASHistory;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawCEPASHistory isMethod(int isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_RawCEPASHistory(isNameExpr, isNameExpr.isMethod(isNameExpr), null);
    }

    @NonNull
    public static RawCEPASHistory isMethod(int isParameter, @NonNull String isParameter) {
        return new AutoValue_RawCEPASHistory(isNameExpr, null, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawCEPASHistory> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawCEPASHistory.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public CEPASHistory isMethod() {
        ByteArray isVariable = isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isMethod(), isNameExpr.isMethod());
        }
        return isNameExpr.isMethod(isMethod(), isMethod());
    }

    abstract int isMethod();

    @Nullable
    abstract ByteArray isMethod();

    @Nullable
    abstract String isMethod();
}
