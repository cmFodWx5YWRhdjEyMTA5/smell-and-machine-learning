// isComment
package com.codebutler.farebot.transit.seq_go;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.seq_go.record.SeqGoTopupRecord;
import com.google.auto.value.AutoValue;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * isComment
 */
@AutoValue
abstract class isClassOrIsInterface extends Refill {

    @NonNull
    static SeqGoRefill isMethod(SeqGoTopupRecord isParameter) {
        return new AutoValue_SeqGoRefill(isNameExpr);
    }

    @Override
    public long isMethod() {
        return isMethod().isMethod().isMethod() / isIntegerConstant;
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return null;
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isMethod().isMethod() ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public long isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod(@NonNull Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod((double) isMethod() / isIntegerConstant);
    }

    abstract SeqGoTopupRecord isMethod();
}
