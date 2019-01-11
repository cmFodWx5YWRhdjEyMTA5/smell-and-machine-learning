// isComment
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/**
 * isComment
 */
final class isClassOrIsInterface extends AI01decoder {

    // isComment
    private static final int isVariable = isIntegerConstant + isIntegerConstant + isIntegerConstant;

    // isComment
    isConstructor(BitArray isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() throws NotFoundException, FormatException {
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod("isStringConstant");
        int isVariable = isNameExpr.isMethod();
        int isVariable = this.isMethod().isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        this.isMethod(isNameExpr, isNameExpr + isIntegerConstant, isNameExpr);
        return this.isMethod().isMethod(isNameExpr, isNameExpr + isIntegerConstant);
    }
}
