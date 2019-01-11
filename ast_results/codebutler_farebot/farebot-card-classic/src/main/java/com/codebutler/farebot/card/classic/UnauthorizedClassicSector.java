// isComment
package com.codebutler.farebot.card.classic;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements ClassicSector {

    @NonNull
    public static UnauthorizedClassicSector isMethod(int isParameter) {
        return new AutoValue_UnauthorizedClassicSector(isNameExpr);
    }
}
