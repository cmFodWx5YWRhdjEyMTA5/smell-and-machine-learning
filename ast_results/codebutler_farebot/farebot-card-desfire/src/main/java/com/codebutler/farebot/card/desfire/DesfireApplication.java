// isComment
package com.codebutler.farebot.card.desfire;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static DesfireApplication isMethod(int isParameter, @NonNull List<DesfireFile> isParameter) {
        return new AutoValue_DesfireApplication(isNameExpr, isNameExpr);
    }

    public abstract int isMethod();

    @NonNull
    public abstract List<DesfireFile> isMethod();

    @Nullable
    public DesfireFile isMethod(int isParameter) {
        for (DesfireFile isVariable : isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        return null;
    }
}
