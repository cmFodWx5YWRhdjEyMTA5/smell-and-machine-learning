// isComment
package cgeo.geocaching.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * isComment
 */
public class isClassOrIsInterface extends TextView {

    private boolean isVariable;

    public isConstructor(final Context isParameter, final AttributeSet isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = true;
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = true;
    }

    public isConstructor(final Context isParameter) {
        super(isNameExpr);
        isNameExpr = true;
    }

    @Override
    protected void isMethod(final int isParameter, final int isParameter) {
        try {
            super.isMethod(isNameExpr, isNameExpr);
        } catch (final IndexOutOfBoundsException isParameter) {
            isMethod(isMethod().isMethod());
            super.isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    public void isMethod(final int isParameter) {
        try {
            super.isMethod(isNameExpr);
        } catch (final IndexOutOfBoundsException isParameter) {
            isMethod(isMethod().isMethod());
            super.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(final CharSequence isParameter, final BufferType isParameter) {
        try {
            super.isMethod(isNameExpr, isNameExpr);
        } catch (final IndexOutOfBoundsException isParameter) {
            isMethod(isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    public void isMethod(final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(final boolean isParameter) {
        if (!isNameExpr) {
            super.isMethod(isNameExpr);
        }
    }
}
