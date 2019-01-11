// isComment
package com.codebutler.farebot.persist.db;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.CardType;
import com.squareup.sqldelight.ColumnAdapter;
import java.util.Date;

public final class isClassOrIsInterface {

    @NonNull
    public static final ColumnAdapter<CardType, String> isVariable = new ColumnAdapter<CardType, String>() {

        @NonNull
        @Override
        public CardType isMethod(String isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public String isMethod(@NonNull CardType isParameter) {
            return isNameExpr.isMethod();
        }
    };

    @NonNull
    public static final ColumnAdapter<Date, Long> isVariable = new ColumnAdapter<Date, Long>() {

        @NonNull
        @Override
        public Date isMethod(Long isParameter) {
            return new Date(isNameExpr);
        }

        @Override
        public Long isMethod(@NonNull Date isParameter) {
            return isNameExpr.isMethod();
        }
    };

    private isConstructor() {
    }
}
