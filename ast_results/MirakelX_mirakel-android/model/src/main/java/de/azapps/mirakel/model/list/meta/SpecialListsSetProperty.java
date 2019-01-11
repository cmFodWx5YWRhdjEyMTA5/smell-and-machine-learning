// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;

public abstract class isClassOrIsInterface extends SpecialListsBooleanProperty {

    @NonNull
    protected List<Integer> isVariable = new ArrayList<>(isIntegerConstant);

    public isConstructor(final boolean isParameter, @NonNull final List<Integer> isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = new ArrayList<>(isIntegerConstant);
        isNameExpr.isMethod(this.isFieldAccessExpr, Integer.class.isMethod());
    }

    protected isConstructor(final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
    // isComment
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        if (isNameExpr.isMethod()) {
            return new MirakelQueryBuilder(isNameExpr);
        }
        return new MirakelQueryBuilder(isNameExpr).isMethod(isMethod(), isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant" + isMethod() + "isStringConstant";
        isNameExpr += "isStringConstant" + (this.isFieldAccessExpr ? "isStringConstant" : "isStringConstant");
        isNameExpr += "isStringConstant";
        isNameExpr += isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr + "isStringConstant";
    }

    @NonNull
    public List<Integer> isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(@NonNull final List<Integer> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        isNameExpr.isMethod(isNameExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
        isNameExpr.isMethod(this.isFieldAccessExpr);
    }
}
