// isComment
package org.sagemath.droid.states;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/**
 * isComment
 */
public class isClassOrIsInterface extends View.BaseSavedState {

    private String isVariable;

    public isConstructor(Parcelable isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Creator<OutputBlockState> isVariable = new Creator<OutputBlockState>() {

        @Override
        public OutputBlockState isMethod(Parcel isParameter) {
            return new OutputBlockState(isNameExpr);
        }

        @Override
        public OutputBlockState[] isMethod(int isParameter) {
            return new OutputBlockState[isNameExpr];
        }
    };
}
