// isComment
package au.id.micolous.metrodroid.transit.adelaide;

import android.os.Parcel;
import android.os.Parcelable;
import au.id.micolous.metrodroid.transit.Trip;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedString;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;

public class isClassOrIsInterface extends En1545Transaction implements Parcelable {

    // isComment
    private static final En1545Field isVariable = new En1545Container(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545Bitmap(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedString("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant))));

    public isConstructor(byte[] isParameter) {
        super(isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<AdelaideTransaction> isVariable = new Creator<AdelaideTransaction>() {

        @Override
        public AdelaideTransaction isMethod(Parcel isParameter) {
            return new AdelaideTransaction(isNameExpr);
        }

        @Override
        public AdelaideTransaction[] isMethod(int isParameter) {
            return new AdelaideTransaction[isNameExpr];
        }
    };

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    protected boolean isMethod() {
        // isComment
        return isNameExpr.isMethod(isNameExpr) == isIntegerConstant;
    }
}
