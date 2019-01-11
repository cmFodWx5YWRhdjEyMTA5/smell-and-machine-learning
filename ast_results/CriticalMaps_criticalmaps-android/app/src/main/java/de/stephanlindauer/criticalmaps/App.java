// isComment
package de.stephanlindauer.criticalmaps;

import android.app.Application;
import android.support.annotation.NonNull;
import timber.log.Timber;

public class isClassOrIsInterface extends Application {

    private static AppComponent isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new Timber.DebugTree());
        } else {
            isNameExpr.isMethod(new NoOpTree());
        }
        isNameExpr = isNameExpr.isMethod().isMethod(this).isMethod();
    }

    public static AppComponent isMethod() {
        return isNameExpr;
    }

    private static class isClassOrIsInterface extends Timber.Tree {

        @Override
        protected void isMethod(int isParameter, String isParameter, @NonNull String isParameter, Throwable isParameter) {
        }
    }
}
