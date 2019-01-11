// isComment
package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.detector.Detector;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Detector {

    private static final DetectorResult[] isVariable = new DetectorResult[isIntegerConstant];

    public isConstructor(BitMatrix isParameter) {
        super(isNameExpr);
    }

    public DetectorResult[] isMethod(Map<DecodeHintType, ?> isParameter) throws NotFoundException {
        BitMatrix isVariable = isMethod();
        ResultPointCallback isVariable = isNameExpr == null ? null : (ResultPointCallback) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        MultiFinderPatternFinder isVariable = new MultiFinderPatternFinder(isNameExpr, isNameExpr);
        FinderPatternInfo[] isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            throw isNameExpr.isMethod();
        }
        List<DetectorResult> isVariable = new ArrayList<>();
        for (FinderPatternInfo isVariable : isNameExpr) {
            try {
                isNameExpr.isMethod(isMethod(isNameExpr));
            } catch (ReaderException isParameter) {
            // isComment
            }
        }
        if (isNameExpr.isMethod()) {
            return isNameExpr;
        } else {
            return isNameExpr.isMethod(isNameExpr);
        }
    }
}
