// isComment
package com.codebutler.farebot.card.classic.key;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static ClassicSectorKey isMethod(@NonNull byte[] isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_ClassicSectorKey(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public static TypeAdapter<ClassicSectorKey> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_ClassicSectorKey.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public abstract ByteArray isMethod();

    @NonNull
    public abstract ByteArray isMethod();
}
