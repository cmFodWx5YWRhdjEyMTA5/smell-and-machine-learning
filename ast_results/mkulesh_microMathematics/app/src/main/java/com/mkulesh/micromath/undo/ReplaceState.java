// isComment
package com.mkulesh.micromath.undo;

import android.os.Parcel;
import android.os.Parcelable;
import com.mkulesh.micromath.formula.FormulaBase;
import java.util.ArrayList;

/*isComment*/
public final class isClassOrIsInterface implements Parcelable {

    /*isComment*/
    public static class isClassOrIsInterface implements Parcelable {

        public FormulaBase.BaseType isVariable;

        public int isVariable;

        public Parcelable isVariable;

        public isConstructor(int isParameter, FormulaBase.BaseType isParameter, Parcelable isParameter) {
            super();
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        public isConstructor(Parcel isParameter) {
            super();
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isFieldAccessExpr.isMethod()[isNameExpr.isMethod()];
            isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @Override
        public void isMethod(Parcel isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        public static final Parcelable.Creator<EntryState> isVariable = new Parcelable.Creator<EntryState>() {

            @Override
            public EntryState isMethod(Parcel isParameter) {
                return new EntryState(isNameExpr);
            }

            @Override
            public EntryState[] isMethod(int isParameter) {
                return new EntryState[isNameExpr];
            }
        };
    }

    private final ArrayList<EntryState> isVariable = new ArrayList<>();

    public isConstructor() {
        super();
    }

    public isConstructor(Parcel isParameter) {
        super();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public ArrayList<EntryState> isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter, FormulaBase isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(new EntryState(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod()));
        } else {
            isNameExpr.isMethod(new EntryState(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null));
        }
    }

    public static final Parcelable.Creator<ReplaceState> isVariable = new Parcelable.Creator<ReplaceState>() {

        @Override
        public ReplaceState isMethod(Parcel isParameter) {
            return new ReplaceState(isNameExpr);
        }

        @Override
        public ReplaceState[] isMethod(int isParameter) {
            return new ReplaceState[isNameExpr];
        }
    };
}
