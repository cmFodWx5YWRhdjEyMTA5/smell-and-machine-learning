// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends DesfireFileSettings {

    @NonNull
    public static ValueDesfireFileSettings isMethod(byte isParameter, byte isParameter, @NonNull byte[] isParameter, int isParameter, int isParameter, int isParameter, boolean isParameter) {
        return new AutoValue_ValueDesfireFileSettings(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public abstract int isMethod();

    public abstract int isMethod();

    public abstract int isMethod();

    public abstract boolean isMethod();
}
