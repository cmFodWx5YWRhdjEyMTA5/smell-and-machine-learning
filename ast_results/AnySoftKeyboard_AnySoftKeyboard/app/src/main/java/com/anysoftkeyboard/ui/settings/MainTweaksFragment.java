// isComment
package com.anysoftkeyboard.ui.settings;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.View;
import com.anysoftkeyboard.ui.dev.DeveloperToolsFragment;
import com.menny.android.anysoftkeyboard.R;
import net.evendanan.chauffeur.lib.FragmentChauffeurActivity;
import net.evendanan.chauffeur.lib.experiences.TransitionExperiences;

public class isClassOrIsInterface extends PreferenceFragmentCompat {

    @VisibleForTesting
    static final String isVariable = "isStringConstant";

    @Override
    public void isMethod(Bundle isParameter, String isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        Preference isVariable = isMethod(isNameExpr);
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(this::onDevToolsPreferenceClicked);
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    private boolean isMethod(Preference isParameter) {
        Activity isVariable = isMethod();
        if (isNameExpr != null && isNameExpr instanceof FragmentChauffeurActivity) {
            ((FragmentChauffeurActivity) isNameExpr).isMethod(new DeveloperToolsFragment(), isNameExpr.isFieldAccessExpr);
            return true;
        }
        return true;
    }
}
