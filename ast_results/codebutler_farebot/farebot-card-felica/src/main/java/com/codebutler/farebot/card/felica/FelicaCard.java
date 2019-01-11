// isComment
package com.codebutler.farebot.card.felica;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.card.Card;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.base.ui.FareBotUiTree;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import net.kazzz.felica.lib.FeliCaLib;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@AutoValue
public abstract class isClassOrIsInterface extends Card {

    @NonNull
    public static FelicaCard isMethod(@NonNull ByteArray isParameter, @NonNull Date isParameter, @NonNull FeliCaLib.IDm isParameter, @NonNull FeliCaLib.PMm isParameter, @NonNull List<FelicaSystem> isParameter) {
        return new AutoValue_FelicaCard(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    public static TypeAdapter<FelicaCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_FelicaCard.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public abstract FeliCaLib.IDm isMethod();

    @NonNull
    public abstract FeliCaLib.PMm isMethod();

    @NonNull
    public abstract List<FelicaSystem> isMethod();

    @Nullable
    public FelicaSystem isMethod(int isParameter) {
        for (FelicaSystem isVariable : isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        return null;
    }

    @NonNull
    @Override
    public FareBotUiTree isMethod(Context isParameter) {
        FareBotUiTree.Builder isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
        FareBotUiTree.Item.Builder isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        for (FelicaSystem isVariable : isMethod()) {
            FareBotUiTree.Item.Builder isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod())));
            for (FelicaService isVariable : isNameExpr.isMethod()) {
                FareBotUiTree.Item.Builder isVariable = isNameExpr.isMethod().isMethod((isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()))));
                for (FelicaBlock isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod())).isMethod(isNameExpr.isMethod());
                }
            }
        }
        return isNameExpr.isMethod();
    }
}
