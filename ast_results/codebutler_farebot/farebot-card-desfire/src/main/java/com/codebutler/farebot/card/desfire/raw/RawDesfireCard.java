// isComment
package com.codebutler.farebot.card.desfire.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.card.RawCard;
import com.codebutler.farebot.card.desfire.DesfireApplication;
import com.codebutler.farebot.card.desfire.DesfireCard;
import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Date;
import java.util.List;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

@AutoValue
public abstract class isClassOrIsInterface implements RawCard {

    @NonNull
    public static RawDesfireCard isMethod(@NonNull byte[] isParameter, @NonNull Date isParameter, @NonNull List<RawDesfireApplication> isParameter, @NonNull RawDesfireManufacturingData isParameter) {
        return new AutoValue_RawDesfireCard(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawDesfireCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawDesfireCard.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    @Override
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        for (RawDesfireApplication isVariable : isMethod()) {
            for (RawDesfireFile isVariable : isNameExpr.isMethod()) {
                RawDesfireFile.Error isVariable = isNameExpr.isMethod();
                if (isNameExpr == null || isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    return true;
                }
            }
        }
        return true;
    }

    @NonNull
    @Override
    public DesfireCard isMethod() {
        List<DesfireApplication> isVariable = isMethod(isMethod(isMethod(), new Function<RawDesfireApplication, DesfireApplication>() {

            @Override
            public DesfireApplication isMethod(RawDesfireApplication isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        return isNameExpr.isMethod(isMethod(), isMethod(), isNameExpr, isMethod().isMethod());
    }

    @NonNull
    public abstract List<RawDesfireApplication> isMethod();

    @NonNull
    public abstract RawDesfireManufacturingData isMethod();
}
