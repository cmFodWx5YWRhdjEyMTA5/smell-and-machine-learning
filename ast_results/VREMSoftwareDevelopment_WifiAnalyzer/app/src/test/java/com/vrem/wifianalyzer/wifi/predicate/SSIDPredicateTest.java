// isComment
package com.vrem.wifianalyzer.wifi.predicate;

import com.vrem.wifianalyzer.wifi.model.WiFiAdditional;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import com.vrem.wifianalyzer.wifi.model.WiFiSignal;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    private static final String isVariable = "isStringConstant";

    @Test
    public void isMethod() {
        // isComment
        WiFiDetail isVariable = new WiFiDetail(isNameExpr, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(new SSIDPredicate(isNameExpr).isMethod(isNameExpr));
        isMethod(new SSIDPredicate("isStringConstant").isMethod(isNameExpr));
        isMethod(new SSIDPredicate("isStringConstant").isMethod(isNameExpr));
        isMethod(new SSIDPredicate("isStringConstant").isMethod(isNameExpr));
        isMethod(new SSIDPredicate(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr));
        isMethod(new SSIDPredicate("isStringConstant").isMethod(isNameExpr));
        isMethod(new SSIDPredicate("isStringConstant").isMethod(isNameExpr));
    }
}
