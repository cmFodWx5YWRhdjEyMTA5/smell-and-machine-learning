// isComment
package es.usc.citius.servando.calendula.allergies;

import android.os.Parcel;
import android.os.Parcelable;

public class isClassOrIsInterface implements Parcelable {

    public static final Parcelable.Creator<AllergenGroupWrapper> isVariable = new Parcelable.Creator<AllergenGroupWrapper>() {

        @Override
        public AllergenGroupWrapper isMethod(Parcel isParameter) {
            return new AllergenGroupWrapper(isNameExpr);
        }

        @Override
        public AllergenGroupWrapper[] isMethod(int isParameter) {
            return new AllergenGroupWrapper[isNameExpr];
        }
    };

    private AllergenVO isVariable;

    private String isVariable;

    public isConstructor(AllergenVO isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(AllergenVO isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(Parcel isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod(AllergenVO.class.isMethod());
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    public AllergenVO isMethod() {
        return isNameExpr;
    }

    public void isMethod(AllergenVO isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(this.isFieldAccessExpr);
    }
}
