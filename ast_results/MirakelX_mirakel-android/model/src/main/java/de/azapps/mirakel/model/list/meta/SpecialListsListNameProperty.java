// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsStringProperty {

    public isConstructor(final boolean isParameter, @NonNull final String isParameter, @NonNull final Type isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
    }

    @NonNull
    @Override
    protected String isMethod() {
        // isComment
        return isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull Context isParameter) {
        MirakelQueryBuilder isVariable = super.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsListNameProperty> isVariable = new Creator<SpecialListsListNameProperty>() {

        public SpecialListsListNameProperty isMethod(Parcel isParameter) {
            return new SpecialListsListNameProperty(isNameExpr);
        }

        public SpecialListsListNameProperty[] isMethod(int isParameter) {
            return new SpecialListsListNameProperty[isNameExpr];
        }
    };
}
