// isComment
package au.id.micolous.metrodroid.transit.adelaide;

import android.os.Parcel;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedHex;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.transit.intercode.IntercodeSubscription;
import au.id.micolous.metrodroid.ui.ListItem;

public class isClassOrIsInterface extends En1545Subscription {

    // isComment
    private static final En1545Field isVariable = isNameExpr.isMethod(new En1545Container(// isComment
    new En1545FixedHex("isStringConstant", isIntegerConstant), new En1545Bitmap(// isComment
    new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), // isComment
    new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), // isComment
    new En1545FixedInteger(isNameExpr, isIntegerConstant), // isComment
    new En1545Container(isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant))), new En1545FixedInteger(isNameExpr, isIntegerConstant)));

    isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    @Nullable
    @Override
    public List<ListItem> isMethod() {
        List<ListItem> isVariable = super.isMethod();
        if (isNameExpr == null)
            isNameExpr = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod(new HashSet<>(isNameExpr.isMethod(isNameExpr, isNameExpr + "isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr))));
        return isNameExpr;
    }

    public static final Creator<AdelaideSubscription> isVariable = new Creator<AdelaideSubscription>() {

        @Override
        public AdelaideSubscription isMethod(Parcel isParameter) {
            return new AdelaideSubscription(isNameExpr);
        }

        @Override
        public AdelaideSubscription[] isMethod(int isParameter) {
            return new AdelaideSubscription[isNameExpr];
        }
    };

    public boolean isMethod() {
        return (isNameExpr.isMethod(isNameExpr) == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isNameExpr) == isNameExpr.isFieldAccessExpr);
    }

    isConstructor(byte[] isParameter) {
        super(isNameExpr, isNameExpr, null);
    }

    @Override
    public Integer isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
