// isComment
package fr.free.nrw.commons.category;

import android.os.Parcel;
import android.os.Parcelable;

public class isClassOrIsInterface implements Parcelable {

    private final String isVariable;

    private boolean isVariable;

    public static Creator<CategoryItem> isVariable = new Creator<CategoryItem>() {

        @Override
        public CategoryItem isMethod(Parcel isParameter) {
            return new CategoryItem(isNameExpr);
        }

        @Override
        public CategoryItem[] isMethod(int isParameter) {
            return new CategoryItem[isIntegerConstant];
        }
    };

    isConstructor(String isParameter, boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    private isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod() == isIntegerConstant;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr) {
            return true;
        }
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod()) {
            return true;
        }
        CategoryItem isVariable = (CategoryItem) isNameExpr;
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + 'isStringConstant';
    }
}
