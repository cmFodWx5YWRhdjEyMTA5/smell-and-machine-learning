// isComment
package au.id.micolous.metrodroid.transit.ravkav;

import android.os.Parcel;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;
import au.id.micolous.metrodroid.util.Utils;

class isClassOrIsInterface extends En1545Transaction {

    public static final Creator<RavKavTransaction> isVariable = new Creator<RavKavTransaction>() {

        public RavKavTransaction isMethod(Parcel isParameter) {
            return new RavKavTransaction(isNameExpr);
        }

        public RavKavTransaction[] isMethod(int isParameter) {
            return new RavKavTransaction[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)), new En1545Bitmap(new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)));

    public isConstructor(byte[] isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(boolean isParameter) {
        if (isMethod() == isNameExpr && isNameExpr.isMethod(isIntegerConstant).isMethod(isMethod()))
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return super.isMethod(isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public boolean isMethod() {
        return isMethod() == isNameExpr;
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }
}
