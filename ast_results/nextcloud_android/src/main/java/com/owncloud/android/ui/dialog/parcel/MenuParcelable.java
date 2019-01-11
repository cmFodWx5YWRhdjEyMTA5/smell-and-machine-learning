// isComment
package com.owncloud.android.ui.dialog.parcel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface implements Parcelable {

    private List<MenuItemParcelable> isVariable = new ArrayList<MenuItemParcelable>();

    public List<MenuItemParcelable> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<MenuItemParcelable> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor() {
        isNameExpr = new ArrayList<MenuItemParcelable>();
    }

    public isConstructor(Parcel isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    public static final Parcelable.Creator<MenuParcelable> isVariable = new Parcelable.Creator<MenuParcelable>() {

        @Override
        public MenuParcelable isMethod(Parcel isParameter) {
            return new MenuParcelable(isNameExpr);
        }

        @Override
        public MenuParcelable[] isMethod(int isParameter) {
            return new MenuParcelable[isNameExpr];
        }
    };

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
