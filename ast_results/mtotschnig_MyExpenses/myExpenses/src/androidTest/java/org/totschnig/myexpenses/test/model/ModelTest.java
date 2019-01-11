// isComment
package org.totschnig.myexpenses.test.model;

import android.test.ProviderTestCase2;
import org.totschnig.myexpenses.model.Model;
import org.totschnig.myexpenses.model.PaymentMethod;
import org.totschnig.myexpenses.provider.TransactionProvider;

public abstract class isClassOrIsInterface extends ProviderTestCase2<TransactionProvider> {

    public isConstructor() {
        super(TransactionProvider.class, isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod(isMethod());
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod();
    }
}
