// isComment
package com.codebutler.farebot.card.classic;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class isClassOrIsInterface implements ClassicSector {

    @NonNull
    public static ClassicSector isMethod(int isParameter, List<ClassicBlock> isParameter) {
        return new AutoValue_DataClassicSector(isNameExpr, isNameExpr);
    }

    @NonNull
    public abstract List<ClassicBlock> isMethod();

    @NonNull
    public ClassicBlock isMethod(int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @NonNull
    public byte[] isMethod(int isParameter, int isParameter) {
        int isVariable = isIntegerConstant;
        byte[] isVariable = new byte[isNameExpr * isIntegerConstant];
        for (int isVariable = isNameExpr; isNameExpr < (isNameExpr + isNameExpr); isNameExpr++) {
            byte[] isVariable = isMethod(isNameExpr).isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr * isIntegerConstant, isNameExpr.isFieldAccessExpr);
            isNameExpr++;
        }
        return isNameExpr;
    }
}
