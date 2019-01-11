// isComment
package com.codebutler.farebot.card.cepas.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.card.RawCard;
import com.codebutler.farebot.card.cepas.CEPASCard;
import com.codebutler.farebot.card.cepas.CEPASHistory;
import com.codebutler.farebot.card.cepas.CEPASPurse;
import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Date;
import java.util.List;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

@AutoValue
public abstract class isClassOrIsInterface implements RawCard<CEPASCard> {

    @NonNull
    public static RawCEPASCard isMethod(@NonNull byte[] isParameter, @NonNull Date isParameter, @NonNull List<RawCEPASPurse> isParameter, @NonNull List<RawCEPASHistory> isParameter) {
        return new AutoValue_RawCEPASCard(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawCEPASCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawCEPASCard.GsonTypeAdapter(isNameExpr);
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
    public CEPASCard isMethod() {
        List<CEPASPurse> isVariable = isMethod(isMethod(isMethod(), new Function<RawCEPASPurse, CEPASPurse>() {

            @Override
            public CEPASPurse isMethod(RawCEPASPurse isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        List<CEPASHistory> isVariable = isMethod(isMethod(isMethod(), new Function<RawCEPASHistory, CEPASHistory>() {

            @Override
            public CEPASHistory isMethod(RawCEPASHistory isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        return isNameExpr.isMethod(isMethod(), isMethod(), isNameExpr, isNameExpr);
    }

    @NonNull
    abstract List<RawCEPASPurse> isMethod();

    @NonNull
    abstract List<RawCEPASHistory> isMethod();
}
