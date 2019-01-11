// isComment
package com.danielme.muspyforandroid.ui.adapters;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    private String isVariable;

    public isConstructor() {
        super();
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(this.isFieldAccessExpr);
    }

    protected isConstructor(Parcel isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    public static final Parcelable.Creator<ResultsItem> isVariable = new Parcelable.Creator<ResultsItem>() {

        @Override
        public ResultsItem isMethod(Parcel isParameter) {
            return new ResultsItem(isNameExpr);
        }

        @Override
        public ResultsItem[] isMethod(int isParameter) {
            return new ResultsItem[isNameExpr];
        }
    };
}
