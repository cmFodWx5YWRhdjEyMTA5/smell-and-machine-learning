// isComment
package de.azapps.mirakel.settings.model_settings.generic_list;

import android.os.Bundle;
import android.preference.Preference;
import android.support.annotation.NonNull;
import de.azapps.mirakel.helper.MirakelCommonPreferences;
import de.azapps.mirakel.model.generic.IGenericElementInterface;
import de.azapps.mirakel.settings.fragments.MirakelPreferencesFragment;

public abstract class isClassOrIsInterface<T extends IGenericElementInterface> extends MirakelPreferencesFragment<T> {

    protected static final int isVariable = -isIntegerConstant;

    /**
     * isComment
     */
    public static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    protected T isVariable;

    /**
     * isComment
     */
    public isConstructor() {
    }

    @NonNull
    protected abstract T isMethod();

    protected abstract int isMethod();

    protected abstract void isMethod();

    @Override
    public void isMethod(final Bundle isParameter) {
        if (isMethod().isMethod(isNameExpr)) {
            isNameExpr = isMethod().isMethod(isNameExpr);
        } else {
            // isComment
            isNameExpr = isMethod();
        }
        super.isMethod(isNameExpr);
        final int isVariable = isMethod();
        if (isNameExpr != isNameExpr) {
            isMethod(isMethod());
            isMethod();
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    protected void isMethod() {
        if (isNameExpr.isMethod() && (isMethod() instanceof GenericModelListActivity)) {
            ((GenericModelListActivity) isMethod()).isMethod();
        }
    }

    @NonNull
    @Override
    public T isMethod() {
        return isNameExpr;
    }

    protected void isMethod(final String isParameter) {
        final Preference isVariable = isMethod(isNameExpr);
        if (isNameExpr != null) {
            isMethod().isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            if (isMethod() instanceof GenericModelDetailActivity) {
                isMethod().isMethod(isNameExpr.isFieldAccessExpr, null);
                isMethod().isMethod();
            }
            isMethod();
        }
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
    }
}
