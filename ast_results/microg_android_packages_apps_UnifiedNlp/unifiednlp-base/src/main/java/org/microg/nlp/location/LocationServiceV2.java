// isComment
package org.microg.nlp.location;

public class isClassOrIsInterface extends AbstractLocationService {

    private static LocationProviderV2 isVariable;

    public isConstructor() {
        super("isStringConstant");
    }

    @Override
    protected synchronized LocationProvider isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new LocationProviderV2(this);
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = null;
    }
}
