// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    static DesfireRecord isMethod(@NonNull byte[] isParameter) {
        return new AutoValue_DesfireRecord(isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    public abstract ByteArray isMethod();
}
