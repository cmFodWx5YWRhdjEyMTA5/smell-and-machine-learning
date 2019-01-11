// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface extends DesfireFileSettings {

    @NonNull
    public static StandardDesfireFileSettings isMethod(byte isParameter, byte isParameter, @NonNull byte[] isParameter, int isParameter) {
        return new AutoValue_StandardDesfireFileSettings(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    public abstract int isMethod();
}
