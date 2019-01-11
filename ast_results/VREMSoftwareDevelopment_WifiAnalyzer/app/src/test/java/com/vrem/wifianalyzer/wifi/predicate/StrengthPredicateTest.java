// isComment
package com.vrem.wifianalyzer.wifi.predicate;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.wifi.band.WiFiWidth;
import com.vrem.wifianalyzer.wifi.model.Strength;
import com.vrem.wifianalyzer.wifi.model.WiFiAdditional;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import com.vrem.wifianalyzer.wifi.model.WiFiSignal;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        // isComment
        WiFiDetail isVariable = isMethod(-isIntegerConstant);
        // isComment
        isMethod(new StrengthPredicate(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr));
        isMethod(new StrengthPredicate(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr));
    }

    @NonNull
    private WiFiDetail isMethod(int isParameter) {
        WiFiSignal isVariable = new WiFiSignal(isIntegerConstant, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr);
        return new WiFiDetail("isStringConstant", "isStringConstant", "isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
