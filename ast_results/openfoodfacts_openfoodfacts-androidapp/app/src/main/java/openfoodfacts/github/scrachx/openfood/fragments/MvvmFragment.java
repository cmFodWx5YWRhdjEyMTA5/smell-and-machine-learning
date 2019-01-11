// isComment
package openfoodfacts.github.scrachx.openfood.fragments;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import io.reactivex.disposables.CompositeDisposable;
import openfoodfacts.github.scrachx.openfood.views.viewmodel.ViewModel;

public abstract class isClassOrIsInterface<T extends ViewModel, U> extends Fragment {

    private U isVariable;

    private CompositeDisposable isVariable = new CompositeDisposable();

    @CallSuper
    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
    }

    @CallSuper
    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
        isMethod(isNameExpr);
    }

    protected void isMethod() {
        isMethod().isMethod();
    }

    @CallSuper
    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        isMethod().isMethod();
    }

    @NonNull
    public U isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isMethod();
        }
        return isNameExpr;
    }

    protected abstract T isMethod();

    @NonNull
    protected abstract U isMethod();

    protected abstract void isMethod();

    protected abstract void isMethod(CompositeDisposable isParameter);
}
