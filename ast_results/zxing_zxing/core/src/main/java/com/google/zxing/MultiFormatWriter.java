// isComment
package com.google.zxing;

import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;
import com.google.zxing.oned.CodaBarWriter;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.oned.Code93Writer;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.oned.EAN8Writer;
import com.google.zxing.oned.ITFWriter;
import com.google.zxing.oned.UPCAWriter;
import com.google.zxing.oned.UPCEWriter;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Writer {

    @Override
    public BitMatrix isMethod(String isParameter, BarcodeFormat isParameter, int isParameter, int isParameter) throws WriterException {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
    }

    @Override
    public BitMatrix isMethod(String isParameter, BarcodeFormat isParameter, int isParameter, int isParameter, Map<EncodeHintType, ?> isParameter) throws WriterException {
        Writer isVariable;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = new EAN8Writer();
                break;
            case isNameExpr:
                isNameExpr = new UPCEWriter();
                break;
            case isNameExpr:
                isNameExpr = new EAN13Writer();
                break;
            case isNameExpr:
                isNameExpr = new UPCAWriter();
                break;
            case isNameExpr:
                isNameExpr = new QRCodeWriter();
                break;
            case isNameExpr:
                isNameExpr = new Code39Writer();
                break;
            case isNameExpr:
                isNameExpr = new Code93Writer();
                break;
            case isNameExpr:
                isNameExpr = new Code128Writer();
                break;
            case isNameExpr:
                isNameExpr = new ITFWriter();
                break;
            case isNameExpr:
                isNameExpr = new PDF417Writer();
                break;
            case isNameExpr:
                isNameExpr = new CodaBarWriter();
                break;
            case isNameExpr:
                isNameExpr = new DataMatrixWriter();
                break;
            case isNameExpr:
                isNameExpr = new AztecWriter();
                break;
            default:
                throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
