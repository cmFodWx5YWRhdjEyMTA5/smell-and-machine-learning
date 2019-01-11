// isComment
package au.id.micolous.metrodroid.transit.intercode;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.ui.ListItem;
import au.id.micolous.metrodroid.util.Utils;

public class isClassOrIsInterface extends En1545Subscription {

    public static final Parcelable.Creator<IntercodeSubscription> isVariable = new Parcelable.Creator<IntercodeSubscription>() {

        @NonNull
        public IntercodeSubscription isMethod(Parcel isParameter) {
            return new IntercodeSubscription(isNameExpr);
        }

        @NonNull
        public IntercodeSubscription[] isMethod(int isParameter) {
            return new IntercodeSubscription[isNameExpr];
        }
    };

    private static final En1545Field isVariable = new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod("isStringConstant"), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), new En1545Bitmap(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant));

    public static En1545Field isMethod(En1545Field isParameter) {
        return new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545Bitmap(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr)), new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr);
    }

    private static final En1545Field isVariable = isMethod(new En1545FixedInteger("isStringConstant", isIntegerConstant));

    private static final En1545Container isVariable = new En1545Container(isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant));

    private static final En1545Container isVariable = new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant));

    private static final En1545Container isVariable = new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant));

    private static final En1545Container isVariable = new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant));

    public static final En1545FixedInteger isVariable = new En1545FixedInteger(isNameExpr, isIntegerConstant);

    public static final En1545FixedInteger isVariable = new En1545FixedInteger(isNameExpr, isIntegerConstant);

    public static final En1545Container isVariable = new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant));

    public static final En1545Container isVariable = new En1545Container(new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant));

    private static final En1545Field isVariable = isMethod(new En1545Bitmap(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)));

    private static final En1545Field isVariable = isMethod(new En1545Bitmap(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), new En1545FixedInteger("isStringConstant", isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger("isStringConstant", isIntegerConstant)));

    private final int isVariable;

    public isConstructor(byte[] isParameter, int isParameter, int isParameter, Integer isParameter) {
        super(isNameExpr, isMethod(isNameExpr), isNameExpr);
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null)
            isNameExpr = isNameExpr;
        else
            isNameExpr = isNameExpr;
    }

    private static En1545Field isMethod(int isParameter) {
        if (isNameExpr == isIntegerConstant)
            return isNameExpr;
        if (isNameExpr == isIntegerConstant)
            return isNameExpr;
        if (isNameExpr == isIntegerConstant)
            return isNameExpr;
        return isNameExpr;
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

    @Nullable
    @Override
    public Integer isMethod() {
        if (isNameExpr.isMethod(isNameExpr) != isIntegerConstant && isNameExpr.isMethod(isNameExpr) != isIntegerConstant) {
            return isNameExpr / isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr.isMethod(isNameExpr) != isIntegerConstant) {
            return isNameExpr;
        }
        return null;
    }

    @Nullable
    @Override
    public Integer isMethod() {
        if (isNameExpr.isMethod(isNameExpr) != isIntegerConstant && isNameExpr.isMethod(isNameExpr) != isIntegerConstant) {
            return isNameExpr.isMethod(isNameExpr) / isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr.isMethod(isNameExpr) != isIntegerConstant) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @Nullable
    @Override
    public List<ListItem> isMethod() {
        List<ListItem> isVariable = super.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(new HashSet<>(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr + "isStringConstant", isNameExpr + "isStringConstant", isNameExpr + "isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr))));
        return isNameExpr;
    }
}
