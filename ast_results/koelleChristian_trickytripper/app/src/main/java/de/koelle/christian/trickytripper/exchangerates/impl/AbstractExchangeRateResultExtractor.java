// isComment
package de.koelle.christian.trickytripper.exchangerates.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import de.koelle.christian.common.utils.NumberUtils;

public abstract class isClassOrIsInterface implements ExchangeRateResultExtractor {

    private static final String isVariable = new String(new char[] { isIntegerConstant });

    abstract Pattern isMethod();

    public Double isMethod(String isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        isNameExpr = isMethod(isNameExpr);
        Matcher isVariable = isMethod().isMethod(isNameExpr);
        Double isVariable = null;
        if (isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod(isIntegerConstant);
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            } catch (RuntimeException isParameter) {
            // isComment
            }
        }
        return isNameExpr;
    }

    private String isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }
}
