// isComment
package com.codebutler.farebot.card.ultralight;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static UltralightPage isMethod(int isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_UltralightPage(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public static TypeAdapter<UltralightPage> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_UltralightPage.GsonTypeAdapter(isNameExpr);
    }

    public abstract int isMethod();

    @NonNull
    public abstract ByteArray isMethod();
}
