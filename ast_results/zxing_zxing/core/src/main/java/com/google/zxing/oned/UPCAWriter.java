// isComment
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Writer {

    private final EAN13Writer isVariable = new EAN13Writer();

    @Override
    public BitMatrix isMethod(String isParameter, BarcodeFormat isParameter, int isParameter, int isParameter) throws WriterException {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
    }

    @Override
    public BitMatrix isMethod(String isParameter, BarcodeFormat isParameter, int isParameter, int isParameter, Map<EncodeHintType, ?> isParameter) throws WriterException {
        if (isNameExpr != isNameExpr.isFieldAccessExpr) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        }
        // isComment
        return isNameExpr.isMethod('isStringConstant' + isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
