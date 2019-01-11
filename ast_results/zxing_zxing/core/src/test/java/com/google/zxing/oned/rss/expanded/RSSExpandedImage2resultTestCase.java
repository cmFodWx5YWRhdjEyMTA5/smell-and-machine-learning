// isComment
package com.google.zxing.oned.rss.expanded;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import javax.imageio.ImageIO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.BufferedImageLuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.common.AbstractBlackBoxTestCase;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.GlobalHistogramBinarizer;
import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() throws Exception {
        // isComment
        ExpandedProductParsedResult isVariable = new ExpandedProductParsedResult("isStringConstant", "isStringConstant", null, null, null, null, null, null, "isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", null, null, null, new HashMap<String, String>());
        isMethod("isStringConstant", isNameExpr);
    }

    private static void isMethod(String isParameter, ExpandedProductParsedResult isParameter) throws IOException, NotFoundException {
        Path isVariable = isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr);
        BufferedImage isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        BinaryBitmap isVariable = new BinaryBitmap(new GlobalHistogramBinarizer(new BufferedImageLuminanceSource(isNameExpr)));
        int isVariable = isNameExpr.isMethod() / isIntegerConstant;
        BitArray isVariable = isNameExpr.isMethod(isNameExpr, null);
        Result isVariable;
        try {
            RSSExpandedReader isVariable = new RSSExpandedReader();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        } catch (ReaderException isParameter) {
            isMethod(isNameExpr.isMethod());
            return;
        }
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        ParsedResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }
}
