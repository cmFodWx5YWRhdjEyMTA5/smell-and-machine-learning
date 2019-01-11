// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import de.azapps.mirakel.model.list.meta.SpecialListsSubtaskProperty;
import de.azapps.mirakel.settings.R;

public class isClassOrIsInterface extends BasePropertyFragement<SpecialListsSubtaskProperty> {

    public static SubtaskPropertyFragment isMethod(SpecialListsSubtaskProperty isParameter) {
        return isMethod(new SubtaskPropertyFragment(), isNameExpr);
    }

    @Override
    public View isMethod(LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        final CheckBox isVariable = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void isMethod(CompoundButton isParameter, boolean isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
        isMethod(isNameExpr);
        final CheckBox isVariable = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void isMethod(CompoundButton isParameter, boolean isParameter) {
                isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr);
            }
        });
        return isNameExpr;
    }

    private void isMethod(CheckBox isParameter) {
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }
}
