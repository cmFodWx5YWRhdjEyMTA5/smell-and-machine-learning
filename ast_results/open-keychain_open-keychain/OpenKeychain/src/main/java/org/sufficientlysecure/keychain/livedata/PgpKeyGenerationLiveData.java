// isComment
package org.sufficientlysecure.keychain.livedata;

import android.content.Context;
import org.sufficientlysecure.keychain.operations.results.PgpEditKeyResult;
import org.sufficientlysecure.keychain.pgp.PgpKeyOperation;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel;
import org.sufficientlysecure.keychain.ui.keyview.loader.AsyncTaskLiveData;
import org.sufficientlysecure.keychain.util.ProgressScaler;

public class isClassOrIsInterface extends AsyncTaskLiveData<PgpEditKeyResult> {

    private SaveKeyringParcel isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr, null);
    }

    public void isMethod(SaveKeyringParcel isParameter) {
        if (this.isFieldAccessExpr == isNameExpr) {
            return;
        }
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    @Override
    protected PgpEditKeyResult isMethod() {
        if (isNameExpr == null) {
            return null;
        }
        PgpKeyOperation isVariable = new PgpKeyOperation(new ProgressScaler());
        return isNameExpr.isMethod(isNameExpr);
    }
}
