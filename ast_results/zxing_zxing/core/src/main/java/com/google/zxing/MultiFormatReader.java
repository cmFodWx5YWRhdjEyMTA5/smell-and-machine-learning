// isComment
package com.google.zxing;

import com.google.zxing.aztec.AztecReader;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.maxicode.MaxiCodeReader;
import com.google.zxing.oned.MultiFormatOneDReader;
import com.google.zxing.pdf417.PDF417Reader;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Reader {

    private static final Reader[] isVariable = new Reader[isIntegerConstant];

    private Map<DecodeHintType, ?> isVariable;

    private Reader[] isVariable;

    /**
     * isComment
     */
    @Override
    public Result isMethod(BinaryBitmap isParameter) throws NotFoundException {
        isMethod(null);
        return isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public Result isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException {
        isMethod(isNameExpr);
        return isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public Result isMethod(BinaryBitmap isParameter) throws NotFoundException {
        // isComment
        if (isNameExpr == null) {
            isMethod(null);
        }
        return isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(Map<DecodeHintType, ?> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        boolean isVariable = isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        @SuppressWarnings("isStringConstant")
        Collection<BarcodeFormat> isVariable = isNameExpr == null ? null : (Collection<BarcodeFormat>) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        Collection<Reader> isVariable = new ArrayList<>();
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr && !isNameExpr) {
                isNameExpr.isMethod(new MultiFormatOneDReader(isNameExpr));
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new QRCodeReader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new DataMatrixReader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new AztecReader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new PDF417Reader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new MaxiCodeReader());
            }
            // isComment
            if (isNameExpr && isNameExpr) {
                isNameExpr.isMethod(new MultiFormatOneDReader(isNameExpr));
            }
        }
        if (isNameExpr.isMethod()) {
            if (!isNameExpr) {
                isNameExpr.isMethod(new MultiFormatOneDReader(isNameExpr));
            }
            isNameExpr.isMethod(new QRCodeReader());
            isNameExpr.isMethod(new DataMatrixReader());
            isNameExpr.isMethod(new AztecReader());
            isNameExpr.isMethod(new PDF417Reader());
            isNameExpr.isMethod(new MaxiCodeReader());
            if (isNameExpr) {
                isNameExpr.isMethod(new MultiFormatOneDReader(isNameExpr));
            }
        }
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            for (Reader isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
        }
    }

    private Result isMethod(BinaryBitmap isParameter) throws NotFoundException {
        if (isNameExpr != null) {
            for (Reader isVariable : isNameExpr) {
                try {
                    return isNameExpr.isMethod(isNameExpr, isNameExpr);
                } catch (ReaderException isParameter) {
                // isComment
                }
            }
        }
        throw isNameExpr.isMethod();
    }
}
