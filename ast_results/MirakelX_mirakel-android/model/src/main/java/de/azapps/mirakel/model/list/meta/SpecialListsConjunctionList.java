// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;

public class isClassOrIsInterface extends SpecialListsBaseProperty {

    public enum CONJUNCTION {

        AND, OR
    }

    @NonNull
    private CONJUNCTION isVariable = isNameExpr.isFieldAccessExpr;

    @NonNull
    private List<SpecialListsBaseProperty> isVariable = new ArrayList<>(isIntegerConstant);

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter, @NonNull final CONJUNCTION isParameter) {
        if (isNameExpr instanceof SpecialListsConjunctionList) {
            isNameExpr = ((SpecialListsConjunctionList) isNameExpr).isFieldAccessExpr;
            isNameExpr = ((SpecialListsConjunctionList) isNameExpr).isFieldAccessExpr;
        } else {
            isNameExpr = isNameExpr;
            isNameExpr = new ArrayList<>(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public isConstructor(@NonNull final CONJUNCTION isParameter, @NonNull final List<SpecialListsBaseProperty> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    public CONJUNCTION isMethod() {
        return isNameExpr;
    }

    @NonNull
    public List<SpecialListsBaseProperty> isMethod() {
        return isNameExpr;
    }

    public void isMethod(@NonNull final List<SpecialListsBaseProperty> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(@NonNull final SpecialListsBaseProperty isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public CONJUNCTION isMethod() {
        return isNameExpr;
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr);
        for (final SpecialListsBaseProperty isVariable : isNameExpr) {
            final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    @NonNull
    @Override
    public String isMethod() {
        if ((isNameExpr.isMethod() > isIntegerConstant) || (!isNameExpr.isMethod() && (isNameExpr.isMethod(isIntegerConstant) instanceof SpecialListsConjunctionList))) {
            final String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<SpecialListsBaseProperty, String>() {

                @Override
                public String isMethod(SpecialListsBaseProperty isParameter) {
                    return isNameExpr.isMethod();
                }
            }));
            return 'isStringConstant' + isNameExpr + 'isStringConstant';
        } else if (isNameExpr.isMethod() == isIntegerConstant) {
            return isNameExpr.isMethod(isIntegerConstant).isMethod();
        } else {
            return "isStringConstant";
        }
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        return isNameExpr.isMethod('isStringConstant' + isMethod(isNameExpr) + 'isStringConstant', isNameExpr.isMethod(isNameExpr, new Function<SpecialListsBaseProperty, String>() {

            @Override
            public String isMethod(SpecialListsBaseProperty isParameter) {
                if (isNameExpr instanceof SpecialListsConjunctionList) {
                    return 'isStringConstant' + isNameExpr.isMethod(isNameExpr) + 'isStringConstant';
                }
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) throws NoSuchElementException {
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        // isComment
        throw new NoSuchElementException("isStringConstant" + isNameExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        isNameExpr.isMethod(this.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(new Parcelable[isNameExpr.isMethod()]), isIntegerConstant);
    }

    private isConstructor(final Parcel isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod()[isNameExpr.isMethod()];
        final SpecialListsBaseProperty[] isVariable = (SpecialListsBaseProperty[]) isNameExpr.isMethod(isNameExpr.isMethod());
        this.isFieldAccessExpr = new ArrayList<>(isIntegerConstant);
        for (SpecialListsBaseProperty isVariable : isNameExpr) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    public static final Creator<SpecialListsConjunctionList> isVariable = new Creator<SpecialListsConjunctionList>() {

        @Override
        public SpecialListsConjunctionList isMethod(final Parcel isParameter) {
            return new SpecialListsConjunctionList(isNameExpr);
        }

        @Override
        public SpecialListsConjunctionList[] isMethod(final int isParameter) {
            return new SpecialListsConjunctionList[isNameExpr];
        }
    };
}
