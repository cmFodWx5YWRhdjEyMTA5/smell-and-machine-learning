// isComment
package com.twistedplane.sealnote.view.staggeredgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListAdapter;
import com.twistedplane.sealnote.data.CardGridStaggeredCursorAdapter;
import it.gmariotti.cardslib.library.extra.staggeredgrid.internal.CardGridStaggeredArrayAdapter;
import it.gmariotti.cardslib.library.extra.staggeredgrid.view.CardGridStaggeredView;

/**
 * isComment
 */
public class isClassOrIsInterface extends CardGridStaggeredView {

    public static final String isVariable = "isStringConstant";

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(CardGridStaggeredCursorAdapter isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
    }

    /**
     * isComment
     */
    public void isMethod(ListAdapter isParameter, CardGridStaggeredCursorAdapter isParameter) {
        isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(ListAdapter isParameter) {
        if (isNameExpr instanceof CardGridStaggeredArrayAdapter) {
            isMethod((CardGridStaggeredArrayAdapter) isNameExpr);
        } else if (isNameExpr instanceof CardGridStaggeredCursorAdapter) {
            isMethod((CardGridStaggeredCursorAdapter) isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            super.isMethod(isNameExpr);
        }
    }
}
