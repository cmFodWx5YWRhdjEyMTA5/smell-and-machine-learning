// isComment
package com.google.zxing.client.j2se;

import org.junit.Assert;
import org.junit.Test;
import java.nio.charset.StandardCharsets;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        Base64Decoder isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant".isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod("isStringConstant"));
    }
}
