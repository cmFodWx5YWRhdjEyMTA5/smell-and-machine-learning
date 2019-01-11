// isComment
package fr.ybo.transportsrennes.keolis.modele.bus;

import java.io.Serializable;
import java.util.Calendar;

/**
 * isComment
 */
@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface implements Serializable {

    private boolean isVariable;

    private String isVariable;

    private Calendar isVariable;

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Calendar isMethod() {
        return isNameExpr;
    }

    public void isMethod(Calendar isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private int isVariable = -isIntegerConstant;

    public int isMethod() {
        if (isNameExpr == -isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) * isIntegerConstant + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
    }
}
