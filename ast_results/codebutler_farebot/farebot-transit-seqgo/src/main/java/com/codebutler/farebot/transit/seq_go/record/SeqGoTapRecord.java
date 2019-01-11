// isComment
package com.codebutler.farebot.transit.seq_go.record;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteUtils;
import com.codebutler.farebot.transit.Trip;
import com.codebutler.farebot.transit.seq_go.SeqGoData;
import com.codebutler.farebot.transit.seq_go.SeqGoUtil;
import com.google.auto.value.AutoValue;
import java.util.GregorianCalendar;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends SeqGoRecord implements Comparable<SeqGoTapRecord> {

    @NonNull
    public static SeqGoTapRecord isMethod(byte[] isParameter) {
        if (isNameExpr[isIntegerConstant] != isIntegerConstant) {
            throw new AssertionError("isStringConstant");
        }
        int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        GregorianCalendar isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant));
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant)) >> isIntegerConstant;
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant));
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant));
        return new AutoValue_SeqGoTapRecord(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    public Trip.Mode isMethod() {
        if (isNameExpr.isFieldAccessExpr.isMethod(isMethod())) {
            return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
        } else {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    @Override
    public int isMethod(@NonNull SeqGoTapRecord isParameter) {
        // isComment
        if (isNameExpr.isMethod() == this.isMethod()) {
            return this.isMethod().isMethod(isNameExpr.isMethod());
        } else {
            return isMethod(this.isMethod(), isNameExpr.isMethod());
        }
    }

    private static int isMethod(int isParameter, int isParameter) {
        return isNameExpr < isNameExpr ? -isIntegerConstant : (isNameExpr == isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    abstract int isMethod();

    public abstract GregorianCalendar isMethod();

    public abstract int isMethod();

    public abstract int isMethod();

    public abstract int isMethod();
}
