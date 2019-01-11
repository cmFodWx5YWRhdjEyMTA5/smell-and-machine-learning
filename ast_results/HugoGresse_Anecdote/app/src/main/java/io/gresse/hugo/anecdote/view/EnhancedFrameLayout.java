// isComment
package io.gresse.hugo.anecdote.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class isClassOrIsInterface extends FrameLayout {

    @Nullable
    private View isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(@LayoutRes int isParameter) {
        if (isNameExpr != null) {
            this.isMethod(isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr, this, true);
    }

    /**
     * isComment
     */
    public void isMethod() {
        if (isNameExpr != null) {
            this.isMethod(isNameExpr);
            isNameExpr = null;
        }
    }
}
