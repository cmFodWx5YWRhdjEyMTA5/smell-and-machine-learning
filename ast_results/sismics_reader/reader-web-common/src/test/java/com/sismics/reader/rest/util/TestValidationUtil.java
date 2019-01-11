// isComment
package com.sismics.reader.rest.util;

import junit.framework.Assert;
import org.junit.Test;
import com.sismics.rest.exception.ClientException;
import com.sismics.rest.util.ValidationUtil;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        try {
            isNameExpr.isMethod("isStringConstant", "isStringConstant");
            isNameExpr.isMethod();
        } catch (ClientException isParameter) {
        // isComment
        }
        try {
            isNameExpr.isMethod("isStringConstant", "isStringConstant");
            isNameExpr.isMethod();
        } catch (ClientException isParameter) {
        // isComment
        }
    }
}
