// isComment
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AbstractDecoderTest {

    private static final String isVariable = "isStringConstant";

    @Test
    public void isMethod() throws Exception {
        CharSequence isVariable = isNameExpr + isNameExpr + isNameExpr;
        String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        CharSequence isVariable = isNameExpr + isNameExpr + isNameExpr;
        String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr);
    }

    @Test(expected = NotFoundException.class)
    public void isMethod() throws Exception {
        CharSequence isVariable = isNameExpr + isNameExpr + isNameExpr + "isStringConstant";
        isMethod(isNameExpr, "isStringConstant");
    }
}
