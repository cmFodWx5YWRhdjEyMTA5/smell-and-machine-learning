// isComment
package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant");

    @Test
    public void isMethod() {
        CharSequence isVariable = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
    }

    private static void isMethod(CharSequence isParameter) {
        BitArray isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        CharSequence isVariable = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
        isNameExpr = "isStringConstant";
        isMethod(isNameExpr);
    }

    private static void isMethod(CharSequence isParameter) {
        CharSequence isVariable = isNameExpr.isMethod(isNameExpr).isMethod("isStringConstant");
        BitArray isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
