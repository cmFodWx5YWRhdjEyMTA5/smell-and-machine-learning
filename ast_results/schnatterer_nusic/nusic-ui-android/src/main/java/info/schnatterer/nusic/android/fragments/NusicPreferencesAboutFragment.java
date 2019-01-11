// isComment
package info.schnatterer.nusic.android.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import info.schnatterer.nusic.android.application.NusicApplication;
import info.schnatterer.nusic.ui.R;
import roboguice.fragment.provided.RoboPreferenceFragment;

@SuppressLint("isStringConstant")
public class isClassOrIsInterface extends RoboPreferenceFragment {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
    }
}
