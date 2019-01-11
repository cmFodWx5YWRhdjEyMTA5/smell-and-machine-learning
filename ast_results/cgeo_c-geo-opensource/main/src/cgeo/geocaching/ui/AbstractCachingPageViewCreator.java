// isComment
package cgeo.geocaching.ui;

import cgeo.geocaching.activity.AbstractViewPagerActivity.PageViewCreator;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<ViewClass extends View> implements PageViewCreator {

    public ViewClass isVariable;

    @Override
    public final void isMethod() {
        isNameExpr = null;
    }

    @Override
    public final View isMethod(final ViewGroup isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    @SuppressFBWarnings("isStringConstant")
    public abstract ViewClass isMethod(final ViewGroup isParameter);

    /**
     * isComment
     */
    @Nullable
    @Override
    public Bundle isMethod() {
        return new Bundle();
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(@NonNull final Bundle isParameter) {
    }
}
