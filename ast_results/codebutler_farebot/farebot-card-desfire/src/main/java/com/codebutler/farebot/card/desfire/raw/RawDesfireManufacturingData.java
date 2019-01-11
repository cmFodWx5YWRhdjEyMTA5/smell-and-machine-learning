// isComment
package com.codebutler.farebot.card.desfire.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.desfire.DesfireManufacturingData;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawDesfireManufacturingData isMethod(@NonNull byte[] isParameter) {
        return new AutoValue_RawDesfireManufacturingData(isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public static TypeAdapter<RawDesfireManufacturingData> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawDesfireManufacturingData.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public abstract ByteArray isMethod();

    @NonNull
    public final DesfireManufacturingData isMethod() {
        return isNameExpr.isMethod(isMethod().isMethod());
    }
}
