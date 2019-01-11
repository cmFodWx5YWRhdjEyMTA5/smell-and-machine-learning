// isComment
package org.sagemath.droid.models.gson;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    private int isVariable;

    private String[] isVariable;

    public isConstructor() {
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String[] isMethod() {
        return isNameExpr;
    }

    public void isMethod(String[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    public static final Creator<Values> isVariable = new Creator<Values>() {

        @Override
        public Values isMethod(Parcel isParameter) {
            return new Values(isNameExpr);
        }

        @Override
        public Values[] isMethod(int isParameter) {
            return new Values[isNameExpr];
        }
    };

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
