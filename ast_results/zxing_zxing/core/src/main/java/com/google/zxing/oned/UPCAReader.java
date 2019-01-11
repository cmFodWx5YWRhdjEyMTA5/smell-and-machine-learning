// isComment
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface extends UPCEANReader {

    private final UPCEANReader isVariable = new EAN13Reader();

    @Override
    public Result isMethod(int isParameter, BitArray isParameter, int[] isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException, FormatException, ChecksumException {
        return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr));
    }

    @Override
    public Result isMethod(int isParameter, BitArray isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException, FormatException, ChecksumException {
        return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
    }

    @Override
    public Result isMethod(BinaryBitmap isParameter) throws NotFoundException, FormatException {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Result isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException, FormatException {
        return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    @Override
    BarcodeFormat isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected int isMethod(BitArray isParameter, int[] isParameter, StringBuilder isParameter) throws NotFoundException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private static Result isMethod(Result isParameter) throws FormatException {
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod(isIntegerConstant) == 'isStringConstant') {
            Result isVariable = new Result(isNameExpr.isMethod(isIntegerConstant), null, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod() != null) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return isNameExpr;
        } else {
            throw isNameExpr.isMethod();
        }
    }
}
