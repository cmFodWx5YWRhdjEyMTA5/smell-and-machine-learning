// isComment
package com.codebutler.farebot.transit.opal;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.codebutler.farebot.transit.Subscription;
import com.google.auto.value.AutoValue;
import java.util.Date;

/**
 * isComment
 */
@AutoValue
abstract class isClassOrIsInterface extends Subscription {

    @NonNull
    public static OpalSubscription isMethod() {
        return new AutoValue_OpalSubscription();
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public Date isMethod() {
        // isComment
        return new Date(isIntegerConstant - isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant);
    }

    @Override
    public Date isMethod() {
        // isComment
        return new Date(isIntegerConstant - isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant);
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return "isStringConstant";
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return null;
    }
}
