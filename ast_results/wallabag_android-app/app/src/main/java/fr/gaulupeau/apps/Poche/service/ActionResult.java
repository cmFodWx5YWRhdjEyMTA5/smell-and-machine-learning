// isComment
package fr.gaulupeau.apps.Poche.service;

public class isClassOrIsInterface {

    public enum ErrorType {

        TEMPORARY,
        NO_NETWORK,
        INCORRECT_CONFIGURATION,
        INCORRECT_CREDENTIALS,
        NOT_FOUND,
        NOT_FOUND_LOCALLY,
        NEGATIVE_RESPONSE,
        SERVER_ERROR,
        UNKNOWN
    }

    private boolean isVariable = true;

    private ErrorType isVariable;

    private String isVariable;

    public isConstructor() {
    }

    public isConstructor(ErrorType isParameter) {
        isMethod(isNameExpr);
    }

    public isConstructor(ErrorType isParameter, String isParameter) {
        this(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public ErrorType isMethod() {
        return isNameExpr;
    }

    public void isMethod(ErrorType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null)
            isNameExpr = true;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    void isMethod(ActionResult isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod())
            return;
        isNameExpr = true;
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
    }
}
