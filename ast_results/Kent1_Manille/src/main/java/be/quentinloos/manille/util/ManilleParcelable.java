// isComment
package be.quentinloos.manille.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import be.quentinloos.manille.core.Manille;
import be.quentinloos.manille.core.ManilleFree;
import be.quentinloos.manille.core.ManilleScore;
import be.quentinloos.manille.core.ManilleTurns;
import be.quentinloos.manille.core.Turn;

/**
 * isComment
 */
public class isClassOrIsInterface implements Parcelable {

    Manille isVariable;

    public isConstructor(Manille isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        int isVariable = isNameExpr.isMethod();
        if (isNameExpr == isIntegerConstant)
            isNameExpr = new ManilleFree();
        else if (isNameExpr == isIntegerConstant)
            this.isFieldAccessExpr = new ManilleScore(isNameExpr.isMethod());
        else if (isNameExpr == isIntegerConstant) {
            this.isFieldAccessExpr = new ManilleTurns(isNameExpr.isMethod(), isNameExpr.isMethod());
            ((ManilleTurns) isNameExpr).isMethod(isNameExpr.isMethod());
            ((ManilleTurns) isNameExpr).isMethod(isNameExpr.isMethod());
        }
        this.isMethod(isNameExpr);
    }

    public Manille isMethod() {
        return isNameExpr;
    }

    private void isMethod(Parcel isParameter) {
        int[] isVariable = new int[isIntegerConstant];
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        ArrayList<Turn> isVariable = new ArrayList<Turn>();
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        // isComment
        if (isNameExpr instanceof ManilleFree)
            isNameExpr.isMethod(isIntegerConstant);
        else if (isNameExpr instanceof ManilleScore) {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(((ManilleScore) isNameExpr).isMethod());
        } else if (isNameExpr instanceof ManilleTurns) {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(((ManilleTurns) isNameExpr).isMethod());
            isNameExpr.isMethod(((ManilleTurns) isNameExpr).isMethod());
            isNameExpr.isMethod(((ManilleTurns) isNameExpr).isMethod());
            isNameExpr.isMethod(((ManilleTurns) isNameExpr).isMethod());
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        ArrayList<TurnParcelable> isVariable = new ArrayList<TurnParcelable>();
        for (Turn isVariable : isNameExpr.isMethod()) isNameExpr.isMethod(new TurnParcelable(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Parcelable.Creator<ManilleParcelable> isVariable = new Parcelable.Creator<ManilleParcelable>() {

        @Override
        public ManilleParcelable isMethod(Parcel isParameter) {
            return new ManilleParcelable(isNameExpr);
        }

        @Override
        public ManilleParcelable[] isMethod(int isParameter) {
            return new ManilleParcelable[isNameExpr];
        }
    };
}
