// isComment
package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.DecoderResult;
import java.util.List;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Reader {

    /**
     * isComment
     */
    @Override
    public Result isMethod(BinaryBitmap isParameter) throws NotFoundException, FormatException {
        return isMethod(isNameExpr, null);
    }

    @Override
    public Result isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException, FormatException {
        NotFoundException isVariable = null;
        FormatException isVariable = null;
        Detector isVariable = new Detector(isNameExpr.isMethod());
        ResultPoint[] isVariable = null;
        DecoderResult isVariable = null;
        try {
            AztecDetectorResult isVariable = isNameExpr.isMethod(true);
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = new Decoder().isMethod(isNameExpr);
        } catch (NotFoundException isParameter) {
            isNameExpr = isNameExpr;
        } catch (FormatException isParameter) {
            isNameExpr = isNameExpr;
        }
        if (isNameExpr == null) {
            try {
                AztecDetectorResult isVariable = isNameExpr.isMethod(true);
                isNameExpr = isNameExpr.isMethod();
                isNameExpr = new Decoder().isMethod(isNameExpr);
            } catch (NotFoundException | FormatException isParameter) {
                if (isNameExpr != null) {
                    throw isNameExpr;
                }
                if (isNameExpr != null) {
                    throw isNameExpr;
                }
                throw isNameExpr;
            }
        }
        if (isNameExpr != null) {
            ResultPointCallback isVariable = (ResultPointCallback) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                for (ResultPoint isVariable : isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
        Result isVariable = new Result(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        List<byte[]> isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
    // isComment
    }
}
