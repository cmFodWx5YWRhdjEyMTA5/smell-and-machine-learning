// isComment
package org.totschnig.myexpenses.model;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(packageName = "isStringConstant")
public class isClassOrIsInterface {

    Payee isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new Payee(isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        final Long isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        final Long isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        final Long isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        final Long isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    }
}
