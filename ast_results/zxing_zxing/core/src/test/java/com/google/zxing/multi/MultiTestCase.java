// isComment
package com.google.zxing.multi;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.BufferedImageLuminanceSource;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.common.AbstractBlackBoxTestCase;
import com.google.zxing.common.HybridBinarizer;
import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() throws Exception {
        // isComment
        Path isVariable = isNameExpr.isMethod("isStringConstant");
        Path isVariable = isNameExpr.isMethod("isStringConstant");
        BufferedImage isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        LuminanceSource isVariable = new BufferedImageLuminanceSource(isNameExpr);
        BinaryBitmap isVariable = new BinaryBitmap(new HybridBinarizer(isNameExpr));
        MultipleBarcodeReader isVariable = new GenericMultipleBarcodeReader(new MultiFormatReader());
        Result[] isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr[isIntegerConstant].isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr[isIntegerConstant].isMethod());
        isMethod("isStringConstant", isNameExpr[isIntegerConstant].isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr[isIntegerConstant].isMethod());
    }
}
