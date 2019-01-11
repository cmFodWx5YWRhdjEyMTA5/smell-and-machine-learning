// isComment
package com.fsck.k9.backend.pop3;

import com.fsck.k9.mail.ConnectionSecurity;
import com.fsck.k9.mail.ServerSettings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        ServerSettings isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        ServerSettings isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        ServerSettings isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }
}
