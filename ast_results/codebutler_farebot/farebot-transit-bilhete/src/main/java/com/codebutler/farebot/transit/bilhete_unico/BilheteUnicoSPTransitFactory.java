// isComment
package com.codebutler.farebot.transit.bilhete_unico;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.classic.ClassicCard;
import com.codebutler.farebot.card.classic.DataClassicSector;
import com.codebutler.farebot.transit.TransitFactory;
import com.codebutler.farebot.transit.TransitIdentity;
import java.util.Arrays;

public class isClassOrIsInterface implements TransitFactory<ClassicCard, BilheteUnicoSPTransitInfo> {

    private static final byte[] isVariable = { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant };

    @Override
    public boolean isMethod(@NonNull ClassicCard isParameter) {
        if (isNameExpr.isMethod(isIntegerConstant) instanceof DataClassicSector) {
            byte[] isVariable = ((DataClassicSector) isNameExpr.isMethod(isIntegerConstant)).isMethod(isIntegerConstant).isMethod().isMethod();
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant), isNameExpr);
        }
        return true;
    }

    @NonNull
    @Override
    public TransitIdentity isMethod(@NonNull ClassicCard isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
    }

    @NonNull
    @Override
    public BilheteUnicoSPTransitInfo isMethod(@NonNull ClassicCard isParameter) {
        byte[] isVariable = ((DataClassicSector) isNameExpr.isMethod(isIntegerConstant)).isMethod(isIntegerConstant).isMethod().isMethod();
        BilheteUnicoSPCredit isVariable = isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(isNameExpr);
    }
}
