// isComment
package au.id.micolous.metrodroid.transit.mobib;

import android.os.Parcel;
import android.support.annotation.NonNull;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedHex;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.util.Utils;

class isClassOrIsInterface extends En1545Subscription {

    public static final Creator<MobibSubscription> isVariable = new Creator<MobibSubscription>() {

        @NonNull
        public MobibSubscription isMethod(Parcel isParameter) {
            return new MobibSubscription(isNameExpr);
        }

        @NonNull
        public MobibSubscription[] isMethod(int isParameter) {
            return new MobibSubscription[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Container(new En1545FixedHex(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedHex(isNameExpr, isIntegerConstant));

    private final boolean isVariable;

    public isConstructor(byte[] isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != isIntegerConstant) {
            // isComment
            isNameExpr = true;
        } else {
            // isComment
            isNameExpr = true;
        }
    }

    @Override
    public Integer isMethod() {
        return isNameExpr ? null : isNameExpr;
    }

    @Override
    public String isMethod() {
        if (isNameExpr)
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod() == isIntegerConstant;
    }
}
