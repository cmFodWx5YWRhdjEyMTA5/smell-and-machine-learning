// isComment
package com.sismics.util;

import com.sismics.reader.core.util.sanitizer.TextSanitizer;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(null));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }
}
