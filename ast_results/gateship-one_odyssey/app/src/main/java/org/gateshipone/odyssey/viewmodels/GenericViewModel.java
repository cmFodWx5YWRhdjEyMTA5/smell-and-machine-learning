// isComment
package org.gateshipone.odyssey.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import org.gateshipone.odyssey.models.GenericModel;
import java.util.List;

public abstract class isClassOrIsInterface<T extends GenericModel> extends AndroidViewModel {

    private MutableLiveData<List<T>> isVariable;

    abstract void isMethod();

    isConstructor(@NonNull final Application isParameter) {
        super(isNameExpr);
        isNameExpr = new MutableLiveData<>();
    }

    public LiveData<List<T>> isMethod() {
        return isNameExpr;
    }

    public void isMethod() {
        isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod(null);
    }

    protected void isMethod(final List<T> isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
