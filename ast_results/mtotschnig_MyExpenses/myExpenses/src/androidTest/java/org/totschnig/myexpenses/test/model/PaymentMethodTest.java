// isComment
package org.totschnig.myexpenses.test.model;

import org.totschnig.myexpenses.model.PaymentMethod;

public class isClassOrIsInterface extends ModelTest {

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod();
    }

    public void isMethod() {
        PaymentMethod isVariable = isNameExpr.isMethod(isIntegerConstant);
        assert isNameExpr != null;
        isMethod(isMethod(isNameExpr));
        isNameExpr.isFieldAccessExpr = !isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        assert isNameExpr != null;
        isMethod(isMethod(isNameExpr));
        // isComment
        isNameExpr.isFieldAccessExpr = !isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
    }

    public void isMethod() {
        PaymentMethod isVariable = isNameExpr.isMethod(isIntegerConstant);
        assert isNameExpr != null;
        isMethod(isMethod(isNameExpr));
        PaymentMethod.PreDefined isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        assert isNameExpr != null;
        isMethod(isMethod(isNameExpr));
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }

    private boolean isMethod(PaymentMethod isParameter) {
        return isNameExpr.isMethod() != null;
    }
}
