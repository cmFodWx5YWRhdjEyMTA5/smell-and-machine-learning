// isComment
package com.codebutler.farebot.transit.suica;

import android.content.Context;
import android.support.annotation.NonNull;
import com.codebutler.farebot.card.felica.FelicaBlock;
import com.codebutler.farebot.card.felica.FelicaCard;
import com.codebutler.farebot.card.felica.FelicaDBUtil;
import com.codebutler.farebot.card.felica.FelicaService;
import com.codebutler.farebot.transit.TransitFactory;
import com.codebutler.farebot.transit.TransitIdentity;
import com.codebutler.farebot.transit.Trip;
import com.google.common.collect.ImmutableList;
import net.kazzz.felica.lib.FeliCaLib;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isClassOrIsInterface implements TransitFactory<FelicaCard, SuicaTransitInfo> {

    @NonNull
    private final FelicaDBUtil isVariable;

    public isConstructor(@NonNull Context isParameter) {
        isNameExpr = new FelicaDBUtil(isNameExpr);
    }

    @Override
    public boolean isMethod(FelicaCard isParameter) {
        return (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) != null);
    }

    @Override
    public TransitIdentity isMethod(@NonNull FelicaCard isParameter) {
        // isComment
        return isNameExpr.isMethod("isStringConstant", null);
    }

    @Override
    public SuicaTransitInfo isMethod(@NonNull FelicaCard isParameter) {
        FelicaService isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        long isVariable = -isIntegerConstant;
        List<SuicaTrip> isVariable = new ArrayList<>();
        // isComment
        List<FelicaBlock> isVariable = isNameExpr.isMethod();
        for (int isVariable = (isNameExpr.isMethod() - isIntegerConstant); isNameExpr >= isIntegerConstant; isNameExpr--) {
            FelicaBlock isVariable = isNameExpr.isMethod(isNameExpr);
            SuicaTrip isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr.isMethod() == isIntegerConstant) {
                continue;
            }
            isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(// isComment
        null, isNameExpr.<Trip>isMethod(isNameExpr), null, null);
    }
}
