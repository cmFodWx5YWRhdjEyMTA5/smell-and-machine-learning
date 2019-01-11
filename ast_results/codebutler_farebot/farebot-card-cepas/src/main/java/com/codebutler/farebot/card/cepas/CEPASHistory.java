// isComment
package com.codebutler.farebot.card.cepas;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static CEPASHistory isMethod(int isParameter, @NonNull List<CEPASTransaction> isParameter) {
        return new AutoValue_CEPASHistory(isNameExpr, isNameExpr, true, null);
    }

    @NonNull
    public static CEPASHistory isMethod(int isParameter, @NonNull String isParameter) {
        return new AutoValue_CEPASHistory(isNameExpr, null, true, isNameExpr);
    }

    @NonNull
    public static CEPASHistory isMethod(int isParameter, @Nullable byte[] isParameter) {
        if (isNameExpr == null) {
            return new AutoValue_CEPASHistory(isNameExpr, isNameExpr.<CEPASTransaction>isMethod(), true, null);
        }
        int isVariable = isIntegerConstant;
        int isVariable = isNameExpr.isFieldAccessExpr / isNameExpr;
        List<CEPASTransaction> isVariable = new ArrayList<>(isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr += isNameExpr) {
            byte[] isVariable = new byte[isNameExpr];
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
        return new AutoValue_CEPASHistory(isNameExpr, isNameExpr, true, null);
    }

    public abstract int isMethod();

    @Nullable
    public abstract List<CEPASTransaction> isMethod();

    public abstract boolean isMethod();

    @Nullable
    public abstract String isMethod();
}
