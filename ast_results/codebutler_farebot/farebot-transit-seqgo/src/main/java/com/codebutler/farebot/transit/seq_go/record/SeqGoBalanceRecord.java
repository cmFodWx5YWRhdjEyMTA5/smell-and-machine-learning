// isComment
package com.codebutler.farebot.transit.seq_go.record;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteUtils;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface extends SeqGoRecord implements Comparable<SeqGoBalanceRecord> {

    @NonNull
    public static SeqGoBalanceRecord isMethod(byte[] isParameter) {
        if (isNameExpr[isIntegerConstant] != isIntegerConstant) {
            throw new AssertionError();
        }
        // isComment
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant), isIntegerConstant, isIntegerConstant);
        int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        return new AutoValue_SeqGoBalanceRecord(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public abstract int isMethod();

    public abstract int isMethod();

    @Override
    public int isMethod(SeqGoBalanceRecord isParameter) {
        // isComment
        return isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(this.isMethod());
    }
}
