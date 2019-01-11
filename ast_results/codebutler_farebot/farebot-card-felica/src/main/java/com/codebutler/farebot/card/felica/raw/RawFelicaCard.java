// isComment
package com.codebutler.farebot.card.felica.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.Card;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.card.RawCard;
import com.codebutler.farebot.card.felica.FelicaCard;
import com.codebutler.farebot.card.felica.FelicaSystem;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import net.kazzz.felica.lib.FeliCaLib;
import java.util.Date;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface implements RawCard {

    @NonNull
    public static RawFelicaCard isMethod(@NonNull byte[] isParameter, @NonNull Date isParameter, @NonNull FeliCaLib.IDm isParameter, @NonNull FeliCaLib.PMm isParameter, @NonNull List<FelicaSystem> isParameter) {
        return new AutoValue_RawFelicaCard(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    public static TypeAdapter<RawFelicaCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawFelicaCard.GsonTypeAdapter(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    public Card isMethod() {
        return isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @NonNull
    abstract FeliCaLib.IDm isMethod();

    @NonNull
    abstract FeliCaLib.PMm isMethod();

    @NonNull
    public abstract List<FelicaSystem> isMethod();
}
