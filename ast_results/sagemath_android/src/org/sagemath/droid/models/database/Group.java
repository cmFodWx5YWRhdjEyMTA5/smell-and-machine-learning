// isComment
package org.sagemath.droid.models.database;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    private static final String isVariable = "isStringConstant";

    Long isVariable;

    String isVariable;

    public isConstructor() {
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Long isMethod() {
        return isNameExpr;
    }

    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return "isStringConstant" + isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof Group) {
            Group isVariable = (Group) isNameExpr;
            return isNameExpr.isMethod().isMethod(isNameExpr);
        } else {
            return true;
        }
    }

    private isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    public static final Creator<Group> isVariable = new Creator<Group>() {

        @Override
        public Group isMethod(Parcel isParameter) {
            return new Group(isNameExpr);
        }

        @Override
        public Group[] isMethod(int isParameter) {
            return new Group[isNameExpr];
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
