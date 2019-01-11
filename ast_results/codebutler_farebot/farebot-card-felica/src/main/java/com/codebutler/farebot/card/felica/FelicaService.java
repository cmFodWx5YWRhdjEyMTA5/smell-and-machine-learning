// isComment
package com.codebutler.farebot.card.felica;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static FelicaService isMethod(int isParameter, @NonNull List<FelicaBlock> isParameter) {
        return new AutoValue_FelicaService(isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<FelicaService> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_FelicaService.GsonTypeAdapter(isNameExpr);
    }

    public abstract int isMethod();

    @NonNull
    public abstract List<FelicaBlock> isMethod();
}
