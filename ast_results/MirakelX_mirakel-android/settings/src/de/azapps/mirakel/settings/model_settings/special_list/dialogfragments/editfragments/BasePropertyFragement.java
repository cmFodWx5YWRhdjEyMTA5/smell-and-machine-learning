// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import de.azapps.mirakel.model.list.meta.SpecialListsBaseProperty;

public abstract class isClassOrIsInterface<T extends SpecialListsBaseProperty> extends Fragment {

    public static final String isVariable = "isStringConstant";

    @NonNull
    protected T isVariable;

    protected isConstructor() {
    }

    @Override
    public void isMethod(@NonNull final Bundle isParameter) {
        super.isMethod(isNameExpr);
        if ((isMethod() != null) && isMethod().isMethod(isNameExpr)) {
            isNameExpr = isMethod().isMethod(isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant");
        }
    }

    public T isMethod() {
        return isNameExpr;
    }

    public void isMethod(@NonNull final T isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected static <S extends BasePropertyFragement> S isMethod(final S isParameter, final SpecialListsBaseProperty isParameter) {
        final Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }
}
