// isComment
package org.sagemath.droid.states;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/**
 * isComment
 */
public class isClassOrIsInterface extends View.BaseSavedState {

    private OutputBlockState isVariable = null;

    private InteractViewState isVariable = null;

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(OutputBlockState.class.isMethod());
        isNameExpr = isNameExpr.isMethod(InteractViewState.class.isMethod());
    }

    public isConstructor(Parcelable isParameter, OutputBlockState isParameter, InteractViewState isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public OutputBlockState isMethod() {
        return isNameExpr;
    }

    public InteractViewState isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return super.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
