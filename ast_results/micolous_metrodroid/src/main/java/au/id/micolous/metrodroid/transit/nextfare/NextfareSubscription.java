// isComment
package au.id.micolous.metrodroid.transit.nextfare;

import android.os.Parcel;
import android.os.Parcelable;
import au.id.micolous.metrodroid.transit.Subscription;
import au.id.micolous.metrodroid.transit.nextfare.record.NextfareBalanceRecord;
import au.id.micolous.metrodroid.transit.nextfare.record.NextfareTravelPassRecord;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class isClassOrIsInterface extends Subscription implements Parcelable {

    public static final Creator<NextfareSubscription> isVariable = new Creator<NextfareSubscription>() {

        @Override
        public NextfareSubscription isMethod(Parcel isParameter) {
            return new NextfareSubscription(isNameExpr);
        }

        @Override
        public NextfareSubscription[] isMethod(int isParameter) {
            return new NextfareSubscription[isNameExpr];
        }
    };

    private Calendar isVariable;

    public isConstructor(NextfareTravelPassRecord isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    public isConstructor(NextfareBalanceRecord isParameter) {
    // isComment
    // isComment
    }

    protected isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public Calendar isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
