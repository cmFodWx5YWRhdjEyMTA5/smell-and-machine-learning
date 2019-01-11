// isComment
package com.codebutler.farebot.card.classic;

import android.content.Context;
import android.support.annotation.NonNull;
import com.codebutler.farebot.base.ui.FareBotUiTree;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.Card;
import com.codebutler.farebot.card.CardType;
import com.google.auto.value.AutoValue;
import java.util.Date;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface extends Card {

    @NonNull
    public static ClassicCard isMethod(@NonNull ByteArray isParameter, @NonNull Date isParameter, @NonNull List<ClassicSector> isParameter) {
        return new AutoValue_ClassicCard(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public CardType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    public abstract List<ClassicSector> isMethod();

    public ClassicSector isMethod(int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @NonNull
    @Override
    public FareBotUiTree isMethod(Context isParameter) {
        FareBotUiTree.Builder isVariable = isNameExpr.isMethod(isNameExpr);
        for (ClassicSector isVariable : isMethod()) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            FareBotUiTree.Item.Builder isVariable = isNameExpr.isMethod();
            if (isNameExpr instanceof UnauthorizedClassicSector) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
            } else if (isNameExpr instanceof InvalidClassicSector) {
                InvalidClassicSector isVariable = (InvalidClassicSector) isNameExpr;
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod()));
            } else {
                DataClassicSector isVariable = (DataClassicSector) isNameExpr;
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                for (ClassicBlock isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()))).isMethod(isNameExpr.isMethod());
                }
            }
        }
        return isNameExpr.isMethod();
    }
}
