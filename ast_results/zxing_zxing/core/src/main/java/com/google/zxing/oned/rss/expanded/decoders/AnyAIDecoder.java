// isComment
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/**
 * isComment
 */
final class isClassOrIsInterface extends AbstractExpandedDecoder {

    private static final int isVariable = isIntegerConstant + isIntegerConstant + isIntegerConstant;

    isConstructor(BitArray isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() throws NotFoundException, FormatException {
        StringBuilder isVariable = new StringBuilder();
        return this.isMethod().isMethod(isNameExpr, isNameExpr);
    }
}
