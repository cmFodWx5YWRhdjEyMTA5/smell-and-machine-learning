// isComment
package fr.neamar.kiss;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

public class isClassOrIsInterface extends Application {

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    private DataHandler isVariable;

    private RootHandler isVariable;

    private IconsHandler isVariable;

    public static KissApplication isMethod(Context isParameter) {
        return (KissApplication) isNameExpr.isMethod();
    }

    public DataHandler isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new DataHandler(this);
        }
        return isNameExpr;
    }

    public void isMethod(DataHandler isParameter) {
        isNameExpr = isNameExpr;
    }

    public RootHandler isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RootHandler(this);
        }
        return isNameExpr;
    }

    public void isMethod(Context isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new DataHandler(this);
        } else if (isNameExpr.isFieldAccessExpr) {
            // isComment
            Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
        }
    }

    public IconsHandler isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new IconsHandler(this);
        }
        return isNameExpr;
    }

    public void isMethod() {
        isNameExpr = new IconsHandler(this);
    }
}
