// isComment
package com.codebutler.farebot.card.ultralight.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.card.RawCard;
import com.codebutler.farebot.card.ultralight.UltralightCard;
import com.codebutler.farebot.card.ultralight.UltralightPage;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Date;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface implements RawCard<UltralightCard> {

    @NonNull
    public static RawUltralightCard isMethod(@NonNull byte[] isParameter, @NonNull Date isParameter, @NonNull List<UltralightPage> isParameter, int isParameter) {
        return new AutoValue_RawUltralightCard(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawUltralightCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawUltralightCard.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    @Override
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    public UltralightCard isMethod() {
        return isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod());
    }

    @NonNull
    public abstract List<UltralightPage> isMethod();

    abstract int isMethod();
}
