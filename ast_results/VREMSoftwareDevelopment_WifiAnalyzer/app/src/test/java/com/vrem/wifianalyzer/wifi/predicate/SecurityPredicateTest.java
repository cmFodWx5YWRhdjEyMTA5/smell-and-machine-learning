// isComment
package com.vrem.wifianalyzer.wifi.predicate;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.wifi.band.WiFiWidth;
import com.vrem.wifianalyzer.wifi.model.Security;
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
        WiFiDetail isVariable = isMethod("isStringConstant");
        SecurityPredicate isVariable = new SecurityPredicate(isNameExpr.isFieldAccessExpr);
        // isComment
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
        isMethod(new SecurityPredicate(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        WiFiDetail isVariable = isMethod("isStringConstant");
        SecurityPredicate isVariable = new SecurityPredicate(isNameExpr.isFieldAccessExpr);
        // isComment
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
    }

    @NonNull
    private WiFiDetail isMethod(String isParameter) {
        WiFiSignal isVariable = new WiFiSignal(isIntegerConstant, isIntegerConstant, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        return new WiFiDetail("isStringConstant", "isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
