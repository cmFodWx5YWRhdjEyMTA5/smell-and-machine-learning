// isComment
package de.koelle.christian.trickytripper.activitysupport;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import de.koelle.christian.trickytripper.R;
import de.koelle.christian.trickytripper.activities.ParticipantTabActivity;
import de.koelle.christian.trickytripper.activities.PaymentTabActivity;
import de.koelle.christian.trickytripper.activities.ReportTabActivity;
import de.koelle.christian.trickytripper.constants.Rc;

public class isClassOrIsInterface extends FragmentStatePagerAdapter {

    private final Context isVariable;

    public isConstructor(FragmentManager isParameter, Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new ParticipantTabActivity();
            case isNameExpr.isFieldAccessExpr:
                return new PaymentTabActivity();
            case isNameExpr.isFieldAccessExpr:
                return new ReportTabActivity();
            default:
                throw new UnsupportedOperationException("isStringConstant" + isNameExpr + "isStringConstant");
        }
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public CharSequence isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                throw new UnsupportedOperationException("isStringConstant" + isNameExpr + "isStringConstant");
        }
    }
}
