// isComment
package au.id.micolous.metrodroid.transit.ravkav;

import android.os.Parcel;
import android.support.annotation.Nullable;
import au.id.micolous.metrodroid.transit.TransitBalance;
import au.id.micolous.metrodroid.transit.TransitCurrency;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;

public class isClassOrIsInterface extends En1545Subscription {

    private static final En1545Field isVariable = new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)));

    public isConstructor(byte[] isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @Nullable
    @Override
    public TransitBalance isMethod() {
        if (isMethod() != isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Integer isMethod() {
        if (isMethod() == isIntegerConstant)
            return isNameExpr;
        return null;
    }

    private int isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        return (isNameExpr >> isIntegerConstant) & isIntegerConstant;
    }

    public static final Creator<RavKavSubscription> isVariable = new Creator<RavKavSubscription>() {

        @Override
        public RavKavSubscription isMethod(Parcel isParameter) {
            return new RavKavSubscription(isNameExpr);
        }

        @Override
        public RavKavSubscription[] isMethod(int isParameter) {
            return new RavKavSubscription[isNameExpr];
        }
    };

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }
}
