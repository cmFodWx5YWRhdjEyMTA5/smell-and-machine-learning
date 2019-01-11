// isComment
package es.usc.citius.servando.calendula.activities;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import es.usc.citius.servando.calendula.persistence.Presentation;

class isClassOrIsInterface extends BaseMatcher {

    Presentation isVariable;

    public isConstructor(Presentation isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Description isParameter) {
    }
}
