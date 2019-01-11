// isComment
package com.fsck.k9.account;

import com.fsck.k9.Account.DeletePolicy;
import com.fsck.k9.RobolectricTest;
import com.fsck.k9.mail.ConnectionSecurity;
import com.fsck.k9.preferences.Protocols;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface extends RobolectricTest {

    @Test
    public void isMethod() {
        DeletePolicy isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        DeletePolicy isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        DeletePolicy isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Test(expected = AssertionError.class)
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr);
    }

    @Test
    public void isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr);
    }

    @Test
    public void isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr);
    }
}
