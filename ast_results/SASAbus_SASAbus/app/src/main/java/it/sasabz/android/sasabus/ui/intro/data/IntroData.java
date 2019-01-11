// isComment
package it.sasabz.android.sasabus.ui.intro.data;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import java.util.ArrayList;
import it.sasabz.android.sasabus.R;
import it.sasabz.android.sasabus.ui.MapActivity;
import it.sasabz.android.sasabus.ui.departure.DepartureActivity;
import it.sasabz.android.sasabus.ui.intro.AppIntro;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppIntro {

    @Override
    public void isMethod() {
        isMethod(new IntroFragmentDataStandalone());
        ArrayList<Integer> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    /**
     * isComment
     */
    private void isMethod() {
        Intent isVariable = new Intent(this, DepartureActivity.class);
        isMethod(isNameExpr);
        isMethod();
    }
}
