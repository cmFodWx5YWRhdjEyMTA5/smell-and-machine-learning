// isComment
package org.andstatus.app.data;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod('isStringConstant') + isNameExpr.isMethod('isStringConstant'), isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod('isStringConstant') + isNameExpr.isMethod('isStringConstant'), isNameExpr.isMethod(null));
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }
}
