// isComment
package au.id.micolous.metrodroid.transit.opus;

import android.os.Parcel;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedHex;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.util.Utils;

class isClassOrIsInterface extends En1545Subscription {

    public static final Creator<OpusSubscription> isVariable = new Creator<OpusSubscription>() {

        public OpusSubscription isMethod(Parcel isParameter) {
            return new OpusSubscription(isNameExpr);
        }

        public OpusSubscription[] isMethod(int isParameter) {
            return new OpusSubscription[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr)), new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedHex(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedHex(isNameExpr, isIntegerConstant))));

    public isConstructor(byte[] isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Integer isMethod() {
        return isNameExpr.isMethod(isNameExpr + "isStringConstant") == isIntegerConstant ? isNameExpr : null;
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }
}
