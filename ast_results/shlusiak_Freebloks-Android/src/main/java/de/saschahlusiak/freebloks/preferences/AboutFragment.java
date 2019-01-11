// isComment
package de.saschahlusiak.freebloks.preferences;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.Preference.OnPreferenceClickListener;
import de.saschahlusiak.freebloks.AboutActivity;
import de.saschahlusiak.freebloks.BuildConfig;
import de.saschahlusiak.freebloks.Global;
import de.saschahlusiak.freebloks.R;
import de.saschahlusiak.freebloks.donate.DonateActivity;

public class isClassOrIsInterface extends PreferenceFragment implements OnPreferenceClickListener {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod("isStringConstant").isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr ? "isStringConstant" : "isStringConstant"));
    }

    @Override
    public void isMethod(Bundle isParameter) {
        isMethod("isStringConstant").isMethod(this);
        isMethod("isStringConstant").isMethod(this);
        isMethod("isStringConstant").isMethod(this);
        super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Preference isParameter) {
        final Intent isVariable;
        switch(isNameExpr.isMethod()) {
            case "isStringConstant":
                String isVariable;
                if (isNameExpr.isFieldAccessExpr)
                    isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
                else
                    isNameExpr = "isStringConstant" + isMethod().isMethod().isMethod();
                isNameExpr = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                isMethod(isNameExpr);
                break;
            case "isStringConstant":
                isNameExpr = new Intent(isMethod(), AboutActivity.class);
                isMethod(isNameExpr);
                break;
            case "isStringConstant":
                isNameExpr = new Intent(isMethod(), DonateActivity.class);
                isMethod(isNameExpr);
                break;
        }
        return true;
    }
}
