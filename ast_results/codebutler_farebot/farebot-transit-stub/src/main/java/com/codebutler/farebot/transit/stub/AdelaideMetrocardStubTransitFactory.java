// isComment
package com.codebutler.farebot.transit.stub;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.desfire.DesfireCard;
import com.codebutler.farebot.transit.TransitFactory;
import com.codebutler.farebot.transit.TransitIdentity;

public class isClassOrIsInterface implements TransitFactory<DesfireCard, AdelaideMetrocardStubTransitInfo> {

    @Override
    public boolean isMethod(@NonNull DesfireCard isParameter) {
        return (isNameExpr.isMethod(isIntegerConstant) != null);
    }

    @NonNull
    @Override
    public TransitIdentity isMethod(@NonNull DesfireCard isParameter) {
        return isNameExpr.isMethod("isStringConstant", null);
    }

    @NonNull
    @Override
    public AdelaideMetrocardStubTransitInfo isMethod(@NonNull DesfireCard isParameter) {
        return new AutoValue_AdelaideMetrocardStubTransitInfo();
    }
}
