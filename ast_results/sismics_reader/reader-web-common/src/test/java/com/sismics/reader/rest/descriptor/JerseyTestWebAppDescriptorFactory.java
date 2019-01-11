// isComment
package com.sismics.reader.rest.descriptor;

import com.sismics.util.filter.HeaderBasedSecurityFilter;
import com.sismics.util.filter.RequestContextFilter;
import com.sismics.util.filter.TokenBasedSecurityFilter;
import com.sun.jersey.test.framework.WebAppDescriptor;
import java.io.File;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static String isVariable = new File("isStringConstant").isMethod();

    /**
     * isComment
     */
    public static WebAppDescriptor isMethod() {
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        return new WebAppDescriptor.Builder("isStringConstant").isMethod("isStringConstant").isMethod(RequestContextFilter.class, "isStringConstant").isMethod(TokenBasedSecurityFilter.class, "isStringConstant").isMethod(HeaderBasedSecurityFilter.class, "isStringConstant").isMethod();
    }
}
