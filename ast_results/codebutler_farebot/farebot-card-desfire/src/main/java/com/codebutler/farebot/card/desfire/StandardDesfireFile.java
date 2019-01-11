// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements DesfireFile {

    @NonNull
    public static DesfireFile isMethod(int isParameter, @NonNull DesfireFileSettings isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_StandardDesfireFile(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public abstract ByteArray isMethod();
}
