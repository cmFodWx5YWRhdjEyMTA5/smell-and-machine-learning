// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import de.azapps.mirakel.model.list.meta.SpecialListsBooleanProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsDoneProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsDueExistsProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsFileProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsReminderProperty;
import de.azapps.mirakel.settings.R;

public class isClassOrIsInterface extends BasePropertyFragement<SpecialListsBooleanProperty> {

    public static NegatedPropertyFragment isMethod(final SpecialListsBooleanProperty isParameter) {
        return isMethod(new NegatedPropertyFragment(), isNameExpr);
    }

    @Override
    public View isMethod(final LayoutInflater isParameter, final ViewGroup isParameter, final Bundle isParameter) {
        // isComment
        final View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        CheckBox isVariable = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr instanceof SpecialListsDoneProperty) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof SpecialListsReminderProperty) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof SpecialListsFileProperty) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr instanceof SpecialListsDueExistsProperty) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod("isStringConstant");
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void isMethod(CompoundButton isParameter, boolean isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
        return isNameExpr;
    }
}
