// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements DesfireFile {

    @NonNull
    public static InvalidDesfireFile isMethod(int isParameter, @NonNull DesfireFileSettings isParameter, @NonNull String isParameter) {
        return new AutoValue_InvalidDesfireFile(isNameExpr, isNameExpr, isNameExpr);
    }

    @Nullable
    public abstract String isMethod();
}
