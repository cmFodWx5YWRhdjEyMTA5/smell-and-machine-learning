// isComment
package com.codebutler.farebot.card.classic.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.classic.ClassicBlock;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawClassicBlock isMethod(int isParameter, byte[] isParameter) {
        return new AutoValue_RawClassicBlock(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public static TypeAdapter<RawClassicBlock> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawClassicBlock.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public ClassicBlock isMethod() {
        return isNameExpr.isMethod(isMethod(), isMethod(), isMethod());
    }

    public abstract int isMethod();

    @NonNull
    public abstract ByteArray isMethod();

    public String isMethod() {
        // isComment
        return isNameExpr.isFieldAccessExpr;
    }
}
