// isComment
package org.gnucash.android.test.unit.model;

import android.graphics.Color;
import org.gnucash.android.model.Account;
import org.gnucash.android.model.Commodity;
import org.gnucash.android.model.Money;
import org.gnucash.android.model.Transaction;
import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Account isVariable = new Account("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        Account isVariable = new Account("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        Account isVariable = new Account("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        Transaction isVariable = new Transaction("isStringConstant");
        Transaction isVariable = new Transaction("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        Account isVariable = new Account("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        Account isVariable = new Account("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        Account isVariable = new Account(isNameExpr);
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        Account isVariable = new Account(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        Account isVariable = new Account("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
