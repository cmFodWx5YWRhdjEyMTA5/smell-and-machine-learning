// isComment
package cgeo.geocaching.settings;

import android.support.annotation.Nullable;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Preference {

    public isConstructor(final Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isIntegerConstant);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod(final Context isParameter, @Nullable final AttributeSet isParameter, final int isParameter) {
        if (isNameExpr == null) {
            return;
        }
        final TypedArray isVariable = isNameExpr.isMethod(isNameExpr, isMethod(), isNameExpr, isIntegerConstant);
        isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    protected abstract void isMethod(TypedArray isParameter);

    /**
     * isComment
     */
    protected abstract int[] isMethod();
}
