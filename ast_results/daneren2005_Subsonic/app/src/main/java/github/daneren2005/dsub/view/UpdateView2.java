// isComment
package github.daneren2005.dsub.view;

import android.content.Context;
import android.widget.ImageView;

public abstract class isClassOrIsInterface<T1, T2> extends UpdateView<T1> {

    protected T2 isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public final void isMethod(T1 isParameter) {
        isMethod(isNameExpr, null);
    }

    @Override
    public void isMethod(T1 isParameter, Object isParameter) {
        if (isNameExpr == isNameExpr && isNameExpr == isNameExpr) {
            return;
        }
        isNameExpr = isNameExpr;
        isNameExpr = (T2) isNameExpr;
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr = null;
        }
        if (isNameExpr != null && isNameExpr instanceof ImageView) {
            ((ImageView) isNameExpr).isMethod(null);
        }
        isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isMethod();
                isNameExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isMethod();
                    }
                });
            }
        });
    }

    protected final void isMethod(T1 isParameter) {
        isMethod(isNameExpr, null);
    }

    protected abstract void isMethod(T1 isParameter, T2 isParameter);
}
