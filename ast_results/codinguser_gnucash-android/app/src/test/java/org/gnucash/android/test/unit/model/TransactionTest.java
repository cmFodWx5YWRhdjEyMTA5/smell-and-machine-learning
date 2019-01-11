// isComment
package org.gnucash.android.test.unit.model;

import org.gnucash.android.model.Commodity;
import org.gnucash.android.model.Money;
import org.gnucash.android.model.Split;
import org.gnucash.android.model.Transaction;
import org.gnucash.android.model.TransactionType;
import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        Transaction isVariable = new Transaction(isNameExpr, true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
        Transaction isVariable = new Transaction(isNameExpr, true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    // isComment
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        Split isVariable = new Split(isNameExpr.isMethod(), "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction("isStringConstant");
        Split isVariable = new Split(isNameExpr.isMethod(), "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        Split isVariable = new Split(isNameExpr.isMethod(), "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        List<Split> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant").isMethod(isNameExpr.isMethod()).isMethod("isStringConstant").isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        Split isVariable = new Split(new Money("isStringConstant", "isStringConstant"), "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        Split isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        Transaction isVariable = new Transaction("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        Split isVariable = new Split(new Money("isStringConstant", "isStringConstant"), "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        Split isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }
}
