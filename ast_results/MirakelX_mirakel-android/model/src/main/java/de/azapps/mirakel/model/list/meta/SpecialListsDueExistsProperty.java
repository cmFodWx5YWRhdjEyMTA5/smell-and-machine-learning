// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder.Operation;
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
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr + "isStringConstant";
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr, (String) null);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsDueExistsProperty> isVariable = new Creator<SpecialListsDueExistsProperty>() {

        public SpecialListsDueExistsProperty isMethod(Parcel isParameter) {
            return new SpecialListsDueExistsProperty(isNameExpr);
        }

        public SpecialListsDueExistsProperty[] isMethod(int isParameter) {
            return new SpecialListsDueExistsProperty[isNameExpr];
        }
    };
}
