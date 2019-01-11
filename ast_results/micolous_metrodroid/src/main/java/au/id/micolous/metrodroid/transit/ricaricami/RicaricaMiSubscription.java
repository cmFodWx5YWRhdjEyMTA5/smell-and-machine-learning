// isComment
package au.id.micolous.metrodroid.transit.ricaricami;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedHex;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.util.Utils;

public class isClassOrIsInterface extends En1545Subscription {

    private static final String isVariable = "isStringConstant";

    private static final En1545Field isVariable = new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedHex(isNameExpr, isIntegerConstant));

    public isConstructor(byte[] isParameter, byte[] isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant));
    }

    @Override
    public Calendar isMethod() {
        if (isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isNameExpr + "isStringConstant") != isIntegerConstant) {
            Calendar isVariable = (Calendar) isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            return isNameExpr;
        }
        return super.isMethod();
    }

    @Override
    public Integer isMethod() {
        if (isMethod() == isNameExpr.isFieldAccessExpr) {
            int isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == isIntegerConstant && isNameExpr == isIntegerConstant) {
                return isIntegerConstant;
            }
            return isNameExpr - isIntegerConstant;
        }
        return null;
    }

    @Override
    public Integer isMethod() {
        if (isMethod() == isNameExpr.isFieldAccessExpr) {
            int isVariable = isNameExpr.isMethod(isNameExpr);
            return isIntegerConstant - isNameExpr;
        }
        return null;
    }

    private int isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Integer isMethod() {
        if (isMethod() == isNameExpr.isFieldAccessExpr)
            return isNameExpr;
        return null;
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<RicaricaMiSubscription> isVariable = new Creator<RicaricaMiSubscription>() {

        @Override
        public RicaricaMiSubscription isMethod(Parcel isParameter) {
            return new RicaricaMiSubscription(isNameExpr);
        }

        @Override
        public RicaricaMiSubscription[] isMethod(int isParameter) {
            return new RicaricaMiSubscription[isNameExpr];
        }
    };

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }
}
