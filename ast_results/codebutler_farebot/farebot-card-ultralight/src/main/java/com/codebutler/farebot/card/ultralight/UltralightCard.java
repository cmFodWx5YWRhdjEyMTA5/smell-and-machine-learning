// isComment
package com.codebutler.farebot.card.ultralight;

import android.content.Context;
import android.support.annotation.NonNull;
import com.codebutler.farebot.card.Card;
import com.codebutler.farebot.card.CardType;
import com.codebutler.farebot.base.ui.FareBotUiTree;
import com.codebutler.farebot.base.util.ByteArray;
import com.google.auto.value.AutoValue;
import java.util.Date;
import java.util.List;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends Card {

    static final int isVariable = isIntegerConstant;

    static final int isVariable = isIntegerConstant;

    @NonNull
    public static UltralightCard isMethod(@NonNull ByteArray isParameter, @NonNull Date isParameter, @NonNull List<UltralightPage> isParameter, int isParameter) {
        return new AutoValue_UltralightCard(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    public abstract List<UltralightPage> isMethod();

    @NonNull
    public UltralightPage isMethod(int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @NonNull
    @Override
    public FareBotUiTree isMethod(Context isParameter) {
        FareBotUiTree.Builder isVariable = isNameExpr.isMethod(isNameExpr);
        FareBotUiTree.Item.Builder isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        for (UltralightPage isVariable : isMethod()) {
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()))).isMethod(isNameExpr.isMethod());
        }
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public abstract int isMethod();
}
