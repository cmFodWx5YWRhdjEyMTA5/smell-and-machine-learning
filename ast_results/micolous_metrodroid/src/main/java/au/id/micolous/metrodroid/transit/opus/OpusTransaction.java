// isComment
package au.id.micolous.metrodroid.transit.opus;

import android.os.Parcel;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;

class isClassOrIsInterface extends En1545Transaction {

    public static final Creator<OpusTransaction> isVariable = new Creator<OpusTransaction>() {

        public OpusTransaction isMethod(Parcel isParameter) {
            return new OpusTransaction(isNameExpr);
        }

        public OpusTransaction[] isMethod(int isParameter) {
            return new OpusTransaction[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Container(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), // isComment
    new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), // isComment
    new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant))));

    public isConstructor(byte[] isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }
}
