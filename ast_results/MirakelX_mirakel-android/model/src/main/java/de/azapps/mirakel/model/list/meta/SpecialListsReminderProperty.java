// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsBooleanProperty {

    public isConstructor(final boolean isParameter) {
        super(isNameExpr);
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
    }

    @Override
    protected // isComment
    String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, (String) null);
    }

    @NonNull
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
        isNameExpr += "isStringConstant" + (this.isFieldAccessExpr ? "isStringConstant" : "isStringConstant");
        return isNameExpr + "isStringConstant";
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        return this.isFieldAccessExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsReminderProperty> isVariable = new Creator<SpecialListsReminderProperty>() {

        public SpecialListsReminderProperty isMethod(Parcel isParameter) {
            return new SpecialListsReminderProperty(isNameExpr);
        }

        public SpecialListsReminderProperty[] isMethod(int isParameter) {
            return new SpecialListsReminderProperty[isNameExpr];
        }
    };
}
