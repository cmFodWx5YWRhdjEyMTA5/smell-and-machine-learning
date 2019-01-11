// isComment
package de.azapps.mirakel.settings.model_settings.tag;

import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.support.annotation.NonNull;
import de.azapps.mirakel.helper.MirakelCommonPreferences;
import de.azapps.mirakel.model.tags.Tag;
import de.azapps.mirakel.settings.ColorPickerPref;
import de.azapps.mirakel.settings.R;
import de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailFragment;

public class isClassOrIsInterface extends GenericModelDetailFragment<Tag> {

    @Override
    protected boolean isMethod() {
        return !isNameExpr.isMethod();
    }

    @NonNull
    @Override
    protected Tag isMethod() {
        return isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod() {
        final Tag isVariable = isNameExpr;
        final EditTextPreference isVariable = (EditTextPreference) isMethod("isStringConstant");
        final ColorPickerPref isVariable = (ColorPickerPref) isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new Preference.OnPreferenceChangeListener() {

            @Override
            public boolean isMethod(final Preference isParameter, final Object isParameter) {
                isNameExpr.isMethod((String) isNameExpr);
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isMethod());
                isMethod();
                return true;
            }
        });
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new Preference.OnPreferenceChangeListener() {

            @Override
            public boolean isMethod(final Preference isParameter, final Object isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod();
                return true;
            }
        });
    }
}
