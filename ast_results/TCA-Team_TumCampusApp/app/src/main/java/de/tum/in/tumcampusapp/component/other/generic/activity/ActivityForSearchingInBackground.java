// isComment
package de.tum.in.tumcampusapp.component.other.generic.activity;

import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.utils.NetUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends ActivityForSearching<T> {

    private Disposable isVariable;

    /**
     * isComment
     */
    public isConstructor(int isParameter, String isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Nullable
    protected abstract T isMethod();

    /**
     * isComment
     */
    @Nullable
    protected abstract T isMethod(String isParameter);

    /**
     * isComment
     */
    protected abstract void isMethod(@Nullable T isParameter);

    @Override
    public final void isMethod() {
        isMethod(null);
    }

    @Override
    public final void isMethod(@Nullable String isParameter) {
        if (!isNameExpr.isMethod(isNameExpr.this)) {
            isMethod();
            return;
        }
        isMethod();
        Observable<T> isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(this::onSearchInBackground);
        } else {
            isNameExpr = isNameExpr.isMethod(() -> isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(this::onSearchFinished, isParameter -> isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }
}
