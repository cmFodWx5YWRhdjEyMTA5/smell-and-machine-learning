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
public abstract class isClassOrIsInterface implements SavedKeyModel {

    @NonNull
    public static final Factory<SavedKey> isVariable = new Factory<>(new Creator<SavedKey>() {

        @Override
        public SavedKey isMethod(@Nullable Long isParameter, @NonNull String isParameter, @NonNull CardType isParameter, @NonNull String isParameter, Date isParameter) {
            return new AutoValue_SavedKey(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    @NonNull
    public static final RowMapper<SavedKey> isVariable = isNameExpr.isMethod();

    @NonNull
    public static final SqlDelightStatement isVariable = isNameExpr.isMethod();

    @NonNull
    public static SavedKey isMethod(@NonNull String isParameter, @NonNull CardType isParameter, @NonNull String isParameter) {
        return new AutoValue_SavedKey(null, isNameExpr, isNameExpr, isNameExpr, new Date());
    }
}
