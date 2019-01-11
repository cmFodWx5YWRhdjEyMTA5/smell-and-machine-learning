// isComment
package org.sufficientlysecure.keychain.ui.keyview;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.net.Uri;
import org.sufficientlysecure.keychain.livedata.GenericLiveData;
import org.sufficientlysecure.keychain.model.SubKey.UnifiedKeyInfo;
import org.sufficientlysecure.keychain.daos.DatabaseNotifyManager;
import org.sufficientlysecure.keychain.daos.KeyRepository;

public class isClassOrIsInterface extends ViewModel {

    private Long isVariable;

    private LiveData<UnifiedKeyInfo> isVariable;

    public void isMethod(long isParameter) {
        if (this.isFieldAccessExpr != null && this.isFieldAccessExpr != isNameExpr) {
            throw new IllegalStateException("isStringConstant");
        }
        this.isFieldAccessExpr = isNameExpr;
    }

    public long isMethod() {
        return isNameExpr;
    }

    public LiveData<UnifiedKeyInfo> isMethod(Context isParameter) {
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        if (isNameExpr == null) {
            KeyRepository isVariable = isNameExpr.isMethod(isNameExpr);
            Uri isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr = new GenericLiveData<>(isNameExpr, isNameExpr, () -> isNameExpr.isMethod(isNameExpr));
        }
        return isNameExpr;
    }
}
