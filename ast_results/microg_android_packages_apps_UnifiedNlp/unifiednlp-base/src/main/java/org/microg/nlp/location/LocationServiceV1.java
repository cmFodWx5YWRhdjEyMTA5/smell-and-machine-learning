// isComment
package org.microg.nlp.location;

public class isClassOrIsInterface extends AbstractLocationService {

    private static LocationProviderV1 isVariable;

    public isConstructor() {
        super("isStringConstant");
    }

    @Override
    protected synchronized LocationProvider isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new LocationProviderV1(this);
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = null;
    }
}
