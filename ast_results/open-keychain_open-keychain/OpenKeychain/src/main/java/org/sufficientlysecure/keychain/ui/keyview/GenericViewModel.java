// isComment
package org.sufficientlysecure.keychain.ui.keyview;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import org.sufficientlysecure.keychain.livedata.GenericLiveData;
import org.sufficientlysecure.keychain.livedata.GenericLiveData.GenericDataLoader;
import org.sufficientlysecure.keychain.daos.DatabaseNotifyManager;

/**
 * isComment
 */
public class isClassOrIsInterface extends ViewModel {

    private LiveData isVariable;

    public <T> LiveData<T> isMethod(Context isParameter, GenericDataLoader<T> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new GenericLiveData<>(isNameExpr, isNameExpr.isMethod(), isNameExpr);
        }
        // isComment
        return isNameExpr;
    }
}
