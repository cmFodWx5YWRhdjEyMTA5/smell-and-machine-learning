// isComment
package com.codebutler.farebot.persist.db.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.persist.db.Adapters;
import com.google.auto.value.AutoValue;
import com.squareup.sqldelight.RowMapper;
import com.squareup.sqldelight.SqlDelightStatement;
import java.util.Date;

@AutoValue
public abstract class isClassOrIsInterface implements SavedCardModel {

    @NonNull
    public static final Factory<SavedCard> isVariable = new Factory<>(new Creator<SavedCard>() {

        @Override
        public SavedCard isMethod(@Nullable Long isParameter, @NonNull CardType isParameter, @NonNull String isParameter, @NonNull String isParameter, @Nullable Date isParameter) {
            return new AutoValue_SavedCard(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    @NonNull
    public static final SqlDelightStatement isVariable = isNameExpr.isMethod();

    @NonNull
    public static final RowMapper<SavedCard> isVariable = isNameExpr.isMethod();

    @NonNull
    public static SavedCard isMethod(@NonNull CardType isParameter, @NonNull String isParameter, @NonNull String isParameter) {
        return new AutoValue_SavedCard(null, isNameExpr, isNameExpr, isNameExpr, new Date());
    }
}
