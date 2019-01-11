// isComment
package com.google.zxing.client.j2se;

import java.util.List;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.validators.PositiveInteger;
import com.google.zxing.BarcodeFormat;

final class isClassOrIsInterface {

    static final String isVariable = "isStringConstant";

    @Parameter(names = "isStringConstant", description = "isStringConstant")
    BarcodeFormat isVariable = isNameExpr.isFieldAccessExpr;

    @Parameter(names = "isStringConstant", description = "isStringConstant")
    String isVariable = "isStringConstant";

    @Parameter(names = "isStringConstant", description = "isStringConstant")
    String isVariable = isNameExpr;

    @Parameter(names = "isStringConstant", description = "isStringConstant", validateWith = PositiveInteger.class)
    int isVariable = isIntegerConstant;

    @Parameter(names = "isStringConstant", description = "isStringConstant", validateWith = PositiveInteger.class)
    int isVariable = isIntegerConstant;

    @Parameter(names = "isStringConstant", description = "isStringConstant")
    String isVariable = null;

    @Parameter(names = "isStringConstant", description = "isStringConstant", help = true)
    boolean isVariable;

    @Parameter(description = "isStringConstant", required = true)
    List<String> isVariable;
}
