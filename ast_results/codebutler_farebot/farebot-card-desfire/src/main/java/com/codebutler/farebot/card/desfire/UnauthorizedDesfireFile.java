// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface implements DesfireFile {

    @NonNull
    public static UnauthorizedDesfireFile isMethod(int isParameter, @NonNull DesfireFileSettings isParameter, @NonNull String isParameter) {
        return new AutoValue_UnauthorizedDesfireFile(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public abstract String isMethod();
}
