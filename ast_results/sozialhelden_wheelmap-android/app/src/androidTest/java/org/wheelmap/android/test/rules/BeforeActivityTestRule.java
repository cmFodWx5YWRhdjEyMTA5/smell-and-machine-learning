// isComment
package org.wheelmap.android.test.rules;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * isComment
 */
public class isClassOrIsInterface<T extends Activity> extends ActivityTestRule<T> {

    public interface isClassOrIsInterface {

        void isMethod();
    }

    private OnBeforeActivityLaunchedListener isVariable;

    public isConstructor(Class<T> isParameter, OnBeforeActivityLaunchedListener isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Class<T> isParameter, boolean isParameter, OnBeforeActivityLaunchedListener isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Class<T> isParameter, boolean isParameter, boolean isParameter, OnBeforeActivityLaunchedListener isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public Statement isMethod(final Statement isParameter, Description isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }
}
