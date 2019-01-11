// isComment
package de.koelle.christian.trickytripper.export.impl;

import java.util.Date;
import java.util.Locale;
import junit.framework.Assert;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(new Date(isStringConstant), isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(new Date(isStringConstant), isNameExpr.isFieldAccessExpr));
    }
}
