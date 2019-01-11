// isComment
package com.codebutler.farebot.transit.myki;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.stub.StubTransitInfo;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends StubTransitInfo {

    public static final String isVariable = "isStringConstant";

    @NonNull
    static MykiTransitInfo isMethod(@NonNull String isParameter) {
        return new AutoValue_MykiTransitInfo(isNameExpr);
    }

    @Nullable
    @Override
    public abstract String isMethod();

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr;
    }
}
