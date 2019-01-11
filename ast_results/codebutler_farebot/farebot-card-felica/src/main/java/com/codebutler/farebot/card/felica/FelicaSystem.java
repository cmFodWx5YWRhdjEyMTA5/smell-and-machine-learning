// isComment
package com.codebutler.farebot.card.felica;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static FelicaSystem isMethod(int isParameter, @NonNull List<FelicaService> isParameter) {
        return new AutoValue_FelicaSystem(isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<FelicaSystem> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_FelicaSystem.GsonTypeAdapter(isNameExpr);
    }

    public abstract int isMethod();

    @NonNull
    public abstract List<FelicaService> isMethod();

    @Nullable
    public FelicaService isMethod(int isParameter) {
        for (FelicaService isVariable : isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        return null;
    }
}
