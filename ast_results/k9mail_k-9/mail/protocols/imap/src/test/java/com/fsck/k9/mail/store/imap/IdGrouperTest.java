// isComment
package com.fsck.k9.mail.store.imap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        Set<Long> isVariable = isMethod(isStringConstant, isStringConstant, isStringConstant);
        IdGrouper.GroupedIds isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Set<Long> isVariable = isMethod(isStringConstant, isStringConstant, isStringConstant, isStringConstant);
        IdGrouper.GroupedIds isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Set<Long> isVariable = isMethod(isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant, isStringConstant);
        IdGrouper.GroupedIds isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isMethod(isStringConstant, isStringConstant, isStringConstant), isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Set<Long> isVariable = isMethod(isStringConstant);
        IdGrouper.GroupedIds isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isMethod(isStringConstant), isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(null);
    }

    private static Set<Long> isMethod(Long... isParameter) {
        HashSet<Long> isVariable = new HashSet<>(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        return isNameExpr;
    }
}
