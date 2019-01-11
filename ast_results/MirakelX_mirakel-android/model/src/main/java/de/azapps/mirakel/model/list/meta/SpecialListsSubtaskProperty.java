// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.provider.MirakelInternalContentProvider;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsBooleanProperty {

    boolean isVariable;

    public isConstructor(boolean isParameter, boolean isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod() != isIntegerConstant;
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
        if (isNameExpr instanceof SpecialListsSubtaskProperty) {
            isNameExpr = ((SpecialListsSubtaskProperty) isNameExpr).isMethod();
        } else {
            isNameExpr = true;
        }
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        if (isNameExpr && isNameExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr && !isNameExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (!isNameExpr && isNameExpr) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new MirakelQueryBuilder(isNameExpr).isMethod().isMethod((isNameExpr ? "isStringConstant" : "isStringConstant")), isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
        isNameExpr += "isStringConstant" + isNameExpr;
        return isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
        isNameExpr.isMethod(isNameExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
    }

    public static final Creator<SpecialListsSubtaskProperty> isVariable = new Creator<SpecialListsSubtaskProperty>() {

        public SpecialListsSubtaskProperty isMethod(Parcel isParameter) {
            return new SpecialListsSubtaskProperty(isNameExpr);
        }

        public SpecialListsSubtaskProperty[] isMethod(int isParameter) {
            return new SpecialListsSubtaskProperty[isNameExpr];
        }
    };
}
