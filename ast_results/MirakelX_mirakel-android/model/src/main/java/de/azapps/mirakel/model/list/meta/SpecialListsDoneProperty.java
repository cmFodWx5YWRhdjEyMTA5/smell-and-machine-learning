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

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        return this.isFieldAccessExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsDoneProperty> isVariable = new Creator<SpecialListsDoneProperty>() {

        public SpecialListsDoneProperty isMethod(Parcel isParameter) {
            return new SpecialListsDoneProperty(isNameExpr);
        }

        public SpecialListsDoneProperty[] isMethod(int isParameter) {
            return new SpecialListsDoneProperty[isNameExpr];
        }
    };
}
