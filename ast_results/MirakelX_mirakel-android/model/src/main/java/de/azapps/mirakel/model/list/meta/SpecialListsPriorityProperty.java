// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsSetProperty {

    public isConstructor(final boolean isParameter, @NonNull final List<Integer> isParameter) {
        super(isNameExpr, isNameExpr);
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
        if (isNameExpr instanceof SpecialListsPriorityProperty) {
            isNameExpr = ((SpecialListsPriorityProperty) isNameExpr).isMethod();
        } else {
            isNameExpr = new ArrayList<>(isIntegerConstant);
        }
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        return (this.isFieldAccessExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : "isStringConstant") + 'isStringConstant' + isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsPriorityProperty> isVariable = new Creator<SpecialListsPriorityProperty>() {

        @Override
        public SpecialListsPriorityProperty isMethod(final Parcel isParameter) {
            return new SpecialListsPriorityProperty(isNameExpr);
        }

        @Override
        public SpecialListsPriorityProperty[] isMethod(final int isParameter) {
            return new SpecialListsPriorityProperty[isNameExpr];
        }
    };
}
