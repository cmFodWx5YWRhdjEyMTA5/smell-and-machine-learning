// isComment
package com.codebutler.farebot.card.felica;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static FelicaBlock isMethod(byte isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_FelicaBlock(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public static TypeAdapter<FelicaBlock> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_FelicaBlock.GsonTypeAdapter(isNameExpr);
    }

    public abstract byte isMethod();

    @NonNull
    public abstract ByteArray isMethod();
}
