// isComment
package de.koelle.christian.trickytripper.exchangerates.impl;

import java.util.regex.Pattern;

public class isClassOrIsInterface extends AbstractExchangeRateResultExtractor {

    /*isComment*/
    public static final String isVariable = "isStringConstant";

    public static final Pattern isVariable = isNameExpr.isMethod(isNameExpr);

    @Override
    Pattern isMethod() {
        return isNameExpr;
    }
}
