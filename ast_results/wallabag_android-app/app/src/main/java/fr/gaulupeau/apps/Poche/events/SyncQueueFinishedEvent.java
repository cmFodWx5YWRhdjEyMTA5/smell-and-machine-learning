// isComment
package fr.gaulupeau.apps.Poche.events;

import fr.gaulupeau.apps.Poche.service.ActionRequest;
import fr.gaulupeau.apps.Poche.service.ActionResult;

public class isClassOrIsInterface extends BackgroundOperationFinishedEvent {

    protected Long isVariable;

    public isConstructor(ActionRequest isParameter, ActionResult isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(ActionRequest isParameter, ActionResult isParameter, Long isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public Long isMethod() {
        return isNameExpr;
    }

    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
