// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.list.SpecialList;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsStringProperty {

    public isConstructor(final boolean isParameter, @NonNull final String isParameter, @NonNull final Type isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    public isConstructor() {
        super();
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

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<SpecialListsContentProperty> isVariable = new Creator<SpecialListsContentProperty>() {

        public SpecialListsContentProperty isMethod(Parcel isParameter) {
            return new SpecialListsContentProperty(isNameExpr);
        }

        public SpecialListsContentProperty[] isMethod(int isParameter) {
            return new SpecialListsContentProperty[isNameExpr];
        }
    };
}
