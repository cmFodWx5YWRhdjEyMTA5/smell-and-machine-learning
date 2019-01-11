// isComment
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.RSS14Reader;
import com.google.zxing.oned.rss.expanded.RSSExpandedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface extends OneDReader {

    private static final OneDReader[] isVariable = new OneDReader[isIntegerConstant];

    private final OneDReader[] isVariable;

    public isConstructor(Map<DecodeHintType, ?> isParameter) {
        @SuppressWarnings("isStringConstant")
        Collection<BarcodeFormat> isVariable = isNameExpr == null ? null : (Collection<BarcodeFormat>) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        boolean isVariable = isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) != null;
        Collection<OneDReader> isVariable = new ArrayList<>();
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new MultiFormatUPCEANReader(isNameExpr));
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new Code39Reader(isNameExpr));
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new Code93Reader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new Code128Reader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new ITFReader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new CodaBarReader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new RSS14Reader());
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(new RSSExpandedReader());
            }
        }
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(new MultiFormatUPCEANReader(isNameExpr));
            isNameExpr.isMethod(new Code39Reader());
            isNameExpr.isMethod(new CodaBarReader());
            isNameExpr.isMethod(new Code93Reader());
            isNameExpr.isMethod(new Code128Reader());
            isNameExpr.isMethod(new ITFReader());
            isNameExpr.isMethod(new RSS14Reader());
            isNameExpr.isMethod(new RSSExpandedReader());
        }
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Result isMethod(int isParameter, BitArray isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException {
        for (OneDReader isVariable : isNameExpr) {
            try {
                return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            } catch (ReaderException isParameter) {
            // isComment
            }
        }
        throw isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        for (Reader isVariable : isNameExpr) {
            isNameExpr.isMethod();
        }
    }
}
