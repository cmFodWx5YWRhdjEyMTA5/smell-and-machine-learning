// isComment
package au.id.micolous.metrodroid.transit.opal;

import android.os.Parcel;
import android.support.annotation.NonNull;
import au.id.micolous.metrodroid.transit.Subscription;
import au.id.micolous.metrodroid.util.Utils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import au.id.micolous.farebot.R;

/**
 * isComment
 */
class isClassOrIsInterface extends Subscription {

    public static final Creator<OpalSubscription> isVariable = new Creator<OpalSubscription>() {

        public OpalSubscription isMethod(Parcel isParameter) {
            return isNameExpr.isMethod();
        }

        public OpalSubscription[] isMethod(int isParameter) {
            return new OpalSubscription[isNameExpr];
        }
    };

    private static final OpalSubscription isVariable = new OpalSubscription();

    public static OpalSubscription isMethod() {
        return isNameExpr;
    }

    private isConstructor() {
    }

    @Override
    public Calendar isMethod() {
        // isComment
        return new GregorianCalendar(isIntegerConstant, isIntegerConstant, isIntegerConstant);
    }

    @Override
    public Calendar isMethod() {
        // isComment
        return new GregorianCalendar(isIntegerConstant, isIntegerConstant, isIntegerConstant);
    }

    @Override
    public String isMethod(boolean isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public PaymentMethod isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
    }
}
