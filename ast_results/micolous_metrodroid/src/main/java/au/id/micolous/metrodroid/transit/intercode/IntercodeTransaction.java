// isComment
package au.id.micolous.metrodroid.transit.intercode;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedString;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;

class isClassOrIsInterface extends En1545Transaction {

    private final int isVariable;

    public static final Parcelable.Creator<IntercodeTransaction> isVariable = new Parcelable.Creator<IntercodeTransaction>() {

        @NonNull
        public IntercodeTransaction isMethod(Parcel isParameter) {
            return new IntercodeTransaction(isNameExpr);
        }

        @NonNull
        public IntercodeTransaction[] isMethod(int isParameter) {
            return new IntercodeTransaction[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Container(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545Bitmap(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedString("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant))));

    public isConstructor(byte[] isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null)
            isNameExpr = isNameExpr;
        else
            isNameExpr = isNameExpr;
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }
}
