// isComment
package com.codebutler.farebot.transit.stub;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends StubTransitInfo {

    @NonNull
    public static AtHopStubTransitInfo isMethod() {
        return new AutoValue_AtHopStubTransitInfo();
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return "isStringConstant";
    }
}
