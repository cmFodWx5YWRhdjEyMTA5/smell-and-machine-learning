// isComment
package com.orpheusdroid.screenrecorder.folderpicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;

public class isClassOrIsInterface extends Preference.BaseSavedState {

    public static final Parcelable.Creator<SavedStateHandler> isVariable = new Parcelable.Creator<SavedStateHandler>() {

        public SavedStateHandler isMethod(Parcel isParameter) {
            return new SavedStateHandler(isNameExpr);
        }

        public SavedStateHandler[] isMethod(int isParameter) {
            return new SavedStateHandler[isNameExpr];
        }
    };

    public final String isVariable;

    public final Bundle isVariable;

    public isConstructor(Parcelable isParameter, String isParameter, Bundle isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
