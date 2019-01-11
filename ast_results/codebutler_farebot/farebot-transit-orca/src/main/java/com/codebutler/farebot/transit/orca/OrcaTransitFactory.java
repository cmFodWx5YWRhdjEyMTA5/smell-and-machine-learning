// isComment
package com.codebutler.farebot.transit.orca;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.desfire.DesfireCard;
import com.codebutler.farebot.card.desfire.DesfireFile;
import com.codebutler.farebot.card.desfire.RecordDesfireFile;
import com.codebutler.farebot.card.desfire.StandardDesfireFile;
import com.codebutler.farebot.transit.TransitFactory;
import com.codebutler.farebot.transit.TransitIdentity;
import com.codebutler.farebot.transit.Trip;
import com.codebutler.farebot.base.util.ArrayUtils;
import com.codebutler.farebot.base.util.ByteUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static com.codebutler.farebot.transit.orca.OrcaData.TRANS_TYPE_CANCEL_TRIP;
import static com.codebutler.farebot.transit.orca.OrcaData.TRANS_TYPE_TAP_IN;
import static com.codebutler.farebot.transit.orca.OrcaData.TRANS_TYPE_TAP_OUT;

public class isClassOrIsInterface implements TransitFactory<DesfireCard, OrcaTransitInfo> {

    @Override
    public boolean isMethod(@NonNull DesfireCard isParameter) {
        return (isNameExpr.isMethod(isIntegerConstant) != null);
    }

    @NonNull
    @Override
    public TransitIdentity isMethod(@NonNull DesfireCard isParameter) {
        try {
            byte[] isVariable = ((StandardDesfireFile) isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant)).isMethod().isMethod();
            return isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant)));
        } catch (Exception isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    @NonNull
    @Override
    public OrcaTransitInfo isMethod(@NonNull DesfireCard isParameter) {
        byte[] isVariable;
        int isVariable;
        int isVariable;
        List<Trip> isVariable;
        try {
            isNameExpr = ((StandardDesfireFile) isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant)).isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        } catch (Exception isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
        try {
            isNameExpr = ((StandardDesfireFile) isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant)).isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        } catch (Exception isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
        try {
            isNameExpr = isMethod(isNameExpr);
        } catch (Exception isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
        return new AutoValue_OrcaTransitInfo(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    private static List<Trip> isMethod(@NonNull DesfireCard isParameter) {
        List<Trip> isVariable = new ArrayList<>();
        DesfireFile isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant);
        if (isNameExpr instanceof RecordDesfireFile) {
            RecordDesfireFile isVariable = (RecordDesfireFile) isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant);
            OrcaTrip[] isVariable = new OrcaTrip[isNameExpr.isMethod().isMethod()];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr));
            }
            isNameExpr.isMethod(isNameExpr, new Trip.Comparator());
            isNameExpr.isMethod(isNameExpr);
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                OrcaTrip isVariable = isNameExpr[isNameExpr];
                OrcaTrip isVariable = (isNameExpr + isIntegerConstant < isNameExpr.isFieldAccessExpr) ? isNameExpr[isNameExpr + isIntegerConstant] : null;
                if (isMethod(isNameExpr, isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
                    isNameExpr++;
                    continue;
                }
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr, new Trip.Comparator());
        return isNameExpr;
    }

    private static boolean isMethod(@NonNull OrcaTrip isParameter, @NonNull OrcaTrip isParameter) {
        return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod() == isNameExpr && (isNameExpr.isMethod() == isNameExpr || isNameExpr.isMethod() == isNameExpr) && isNameExpr.isMethod() == isNameExpr.isMethod();
    }
}
