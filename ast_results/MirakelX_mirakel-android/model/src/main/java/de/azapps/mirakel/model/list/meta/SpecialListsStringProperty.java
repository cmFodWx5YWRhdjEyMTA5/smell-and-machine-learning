// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder.Operation;

public abstract class isClassOrIsInterface extends SpecialListsBooleanProperty {

    public enum Type {

        BEGIN, END, CONTAINS
    }

    @NonNull
    protected String isVariable = "isStringConstant";

    @NonNull
    protected Type isVariable = isNameExpr.isFieldAccessExpr;

    public isConstructor(final boolean isParameter, @NonNull final String isParameter, @NonNull final Type isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor() {
        super(true);
        this.isFieldAccessExpr = "isStringConstant";
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    protected isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr.isMethod()[isNameExpr.isMethod()];
    }

    protected isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
        if (isNameExpr instanceof SpecialListsStringProperty) {
            isNameExpr = ((SpecialListsStringProperty) isNameExpr).isMethod();
            isNameExpr = ((SpecialListsStringProperty) isNameExpr).isMethod();
        } else {
            isNameExpr = "isStringConstant";
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
    }

    public void isMethod(@NonNull final String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    public String isMethod() {
        return this.isFieldAccessExpr;
    }

    @NonNull
    public Type isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(@NonNull final Type isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        switch(this.isFieldAccessExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + this.isFieldAccessExpr + "isStringConstant");
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + this.isFieldAccessExpr + "isStringConstant");
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + this.isFieldAccessExpr + "isStringConstant");
            default:
                return "isStringConstant";
        }
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr);
        MirakelQueryBuilder.Operation isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        if (this.isFieldAccessExpr == null) {
            return isNameExpr.isMethod(isMethod(), isNameExpr, "isStringConstant");
        }
        switch(this.isFieldAccessExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr + "isStringConstant");
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, "isStringConstant" + isNameExpr);
            default:
                return isNameExpr;
        }
    }

    @NonNull
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant" + isMethod() + "isStringConstant";
        isNameExpr += "isStringConstant" + (this.isFieldAccessExpr ? "isStringConstant" : "isStringConstant");
        isNameExpr += "isStringConstant" + this.isFieldAccessExpr.isMethod();
        isNameExpr += "isStringConstant" + this.isFieldAccessExpr + "isStringConstant";
        return isNameExpr + "isStringConstant";
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
        isNameExpr.isMethod(this.isFieldAccessExpr);
        isNameExpr.isMethod(this.isFieldAccessExpr == null ? -isIntegerConstant : this.isFieldAccessExpr.isMethod());
    }
}
