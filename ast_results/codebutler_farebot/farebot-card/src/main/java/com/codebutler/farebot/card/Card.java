// isComment
package com.codebutler.farebot.card;

import android.content.Context;
import android.support.annotation.NonNull;
import com.codebutler.farebot.base.ui.FareBotUiTree;
import com.codebutler.farebot.base.util.ByteArray;
import java.util.Date;

public abstract class isClassOrIsInterface {

    @NonNull
    public abstract CardType isMethod();

    @NonNull
    public abstract ByteArray isMethod();

    @NonNull
    public abstract Date isMethod();

    @NonNull
    public abstract FareBotUiTree isMethod(Context isParameter);

    @NonNull
    @SuppressWarnings("isStringConstant")
    public Class<? extends Card> isMethod() {
        Class<? extends Card> isVariable = isMethod();
        while (isNameExpr.isMethod() != Card.class) {
            isNameExpr = (Class<? extends Card>) isNameExpr.isMethod();
        }
        return isNameExpr;
    }
}
