// isComment
package com.codebutler.farebot.card.classic.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.card.RawCard;
import com.codebutler.farebot.card.classic.ClassicCard;
import com.codebutler.farebot.card.classic.ClassicSector;
import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Date;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface implements RawCard<ClassicCard> {

    @NonNull
    public static RawClassicCard isMethod(@NonNull byte[] isParameter, @NonNull Date isParameter, @NonNull List<RawClassicSector> isParameter) {
        return new AutoValue_RawClassicCard(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawClassicCard> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawClassicCard.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    @Override
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        for (RawClassicSector isVariable : isMethod()) {
            if (!isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                return true;
            }
        }
        return true;
    }

    @NonNull
    @Override
    public ClassicCard isMethod() {
        List<ClassicSector> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isMethod(), new Function<RawClassicSector, ClassicSector>() {

            @Override
            public ClassicSector isMethod(RawClassicSector isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        return isNameExpr.isMethod(isMethod(), isMethod(), isNameExpr);
    }

    @NonNull
    public abstract List<RawClassicSector> isMethod();
}
