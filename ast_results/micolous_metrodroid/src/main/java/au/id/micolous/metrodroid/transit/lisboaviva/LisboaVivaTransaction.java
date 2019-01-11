// isComment
package au.id.micolous.metrodroid.transit.lisboaviva;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedHex;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;

class isClassOrIsInterface extends En1545Transaction {

    public static final Creator<LisboaVivaTransaction> isVariable = new Creator<LisboaVivaTransaction>() {

        public LisboaVivaTransaction isMethod(Parcel isParameter) {
            return new LisboaVivaTransaction(isNameExpr);
        }

        public LisboaVivaTransaction[] isMethod(int isParameter) {
            return new LisboaVivaTransaction[isNameExpr];
        }
    };

    private static final String isVariable = "isStringConstant";

    private static final En1545Field isVariable = new En1545Container(isNameExpr.isMethod(isNameExpr), new En1545FixedHex(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedHex(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), // isComment
    new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedHex(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedHex(isNameExpr, isIntegerConstant));

    @Nullable
    public Station isMethod(Integer isParameter) {
        if (isNameExpr == null)
            return null;
        return isMethod().isMethod(isNameExpr, isMethod(), isNameExpr.isMethod(isNameExpr));
    }

    protected boolean isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        return isNameExpr == isIntegerConstant;
    }

    protected boolean isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        return isNameExpr == isIntegerConstant;
    }

    public isConstructor(byte[] isParameter) {
        super(isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @NonNull
    @Override
    public List<String> isMethod() {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr == isNameExpr.isFieldAccessExpr) {
            if (isMethod() <= isIntegerConstant)
                return isNameExpr.isMethod("isStringConstant");
            else
                return isNameExpr.isMethod("isStringConstant");
        }
        return super.isMethod();
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }
}
