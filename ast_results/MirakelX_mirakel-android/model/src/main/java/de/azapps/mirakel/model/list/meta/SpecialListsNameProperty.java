// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.generic.ModelBase;
import de.azapps.mirakel.model.R;

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

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsNameProperty> isVariable = new Creator<SpecialListsNameProperty>() {

        public SpecialListsNameProperty isMethod(Parcel isParameter) {
            return new SpecialListsNameProperty(isNameExpr);
        }

        public SpecialListsNameProperty[] isMethod(int isParameter) {
            return new SpecialListsNameProperty[isNameExpr];
        }
    };
}
