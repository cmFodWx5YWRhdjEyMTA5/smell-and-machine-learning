// isComment
package github.daneren2005.dsub.util;

import github.daneren2005.dsub.fragments.SubsonicFragment;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends BackgroundTask<T> {

    private final SubsonicFragment isVariable;

    public isConstructor(SubsonicFragment isParameter) {
        super(isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr = new Task() {

            @Override
            public void isMethod(T isParameter) {
                isNameExpr.isMethod(true);
                isMethod(isNameExpr);
            }

            @Override
            public void isMethod(Throwable isParameter) {
                isNameExpr.isMethod(true);
                isMethod(isNameExpr);
            }
        });
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod() || isNameExpr.isMethod();
    }

    @Override
    public void isMethod(final String isParameter) {
        isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}
