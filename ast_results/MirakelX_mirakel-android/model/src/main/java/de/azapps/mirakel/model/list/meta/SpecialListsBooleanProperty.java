// isComment
package de.azapps.mirakel.model.list.meta;

import android.os.Parcel;
import android.support.annotation.NonNull;

public abstract class isClassOrIsInterface extends SpecialListsBaseProperty {

    protected boolean isVariable;

    @NonNull
    protected abstract String isMethod();

    public isConstructor(final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(@NonNull final Parcel isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod() != isIntegerConstant;
    }

    protected isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        isNameExpr = isNameExpr instanceof SpecialListsBooleanProperty && ((SpecialListsBooleanProperty) isNameExpr).isFieldAccessExpr;
    }

    public boolean isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant" + isMethod() + "isStringConstant";
        isNameExpr += "isStringConstant" + (this.isFieldAccessExpr ? "isStringConstant" : "isStringConstant");
        return isNameExpr + "isStringConstant";
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        isNameExpr.isMethod(isNameExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
    }
}
