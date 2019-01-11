// isComment
package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.pdf417.decoder.PDF417ScanningDecoder;
import com.google.zxing.pdf417.detector.Detector;
import com.google.zxing.pdf417.detector.PDF417DetectorResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Reader, MultipleBarcodeReader {

    private static final Result[] isVariable = new Result[isIntegerConstant];

    /**
     * isComment
     */
    @Override
    public Result isMethod(BinaryBitmap isParameter) throws NotFoundException, FormatException, ChecksumException {
        return isMethod(isNameExpr, null);
    }

    @Override
    public Result isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException, FormatException, ChecksumException {
        Result[] isVariable = isMethod(isNameExpr, isNameExpr, true);
        if (isNameExpr == null || isNameExpr.isFieldAccessExpr == isIntegerConstant || isNameExpr[isIntegerConstant] == null) {
            throw isNameExpr.isMethod();
        }
        return isNameExpr[isIntegerConstant];
    }

    @Override
    public Result[] isMethod(BinaryBitmap isParameter) throws NotFoundException {
        return isMethod(isNameExpr, null);
    }

    @Override
    public Result[] isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException {
        try {
            return isMethod(isNameExpr, isNameExpr, true);
        } catch (FormatException | ChecksumException isParameter) {
            throw isNameExpr.isMethod();
        }
    }

    private static Result[] isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter, boolean isParameter) throws NotFoundException, FormatException, ChecksumException {
        List<Result> isVariable = new ArrayList<>();
        PDF417DetectorResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        for (ResultPoint[] isVariable : isNameExpr.isMethod()) {
            DecoderResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant], isMethod(isNameExpr), isMethod(isNameExpr));
            Result isVariable = new Result(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            PDF417ResultMetadata isVariable = (PDF417ResultMetadata) isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    private static int isMethod(ResultPoint isParameter, ResultPoint isParameter) {
        if (isNameExpr == null || isNameExpr == null) {
            return isIntegerConstant;
        }
        return (int) isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isMethod());
    }

    private static int isMethod(ResultPoint isParameter, ResultPoint isParameter) {
        if (isNameExpr == null || isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr;
        }
        return (int) isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isMethod());
    }

    private static int isMethod(ResultPoint[] isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]), isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]) * isNameExpr.isFieldAccessExpr / isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]), isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]) * isNameExpr.isFieldAccessExpr / isNameExpr.isFieldAccessExpr));
    }

    private static int isMethod(ResultPoint[] isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]), isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]) * isNameExpr.isFieldAccessExpr / isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]), isMethod(isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant]) * isNameExpr.isFieldAccessExpr / isNameExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod() {
    // isComment
    }
}
