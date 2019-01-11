// isComment
package com.google.zxing.negative;

import com.google.zxing.common.AbstractNegativeBlackBoxTestCase;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AbstractNegativeBlackBoxTestCase {

    public isConstructor() {
        super("isStringConstant");
        isMethod(isIntegerConstant, isDoubleConstant);
        isMethod(isIntegerConstant, isDoubleConstant);
        isMethod(isIntegerConstant, isDoubleConstant);
        isMethod(isIntegerConstant, isDoubleConstant);
    }
}
