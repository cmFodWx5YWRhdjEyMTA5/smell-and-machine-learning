// isComment
package ch.logixisland.anuto.entity.effect;

import ch.logixisland.anuto.engine.logic.entity.Entity;
import ch.logixisland.anuto.engine.logic.loop.TickTimer;
import ch.logixisland.anuto.entity.Types;

public abstract class isClassOrIsInterface extends Entity {

    enum State {

        NotStarted, Active, Ended
    }

    private Entity isVariable;

    private TickTimer isVariable;

    private State isVariable;

    isConstructor(Entity isParameter) {
        super(isNameExpr.isMethod());
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    isConstructor(Entity isParameter, float isParameter) {
        this(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    public Entity isMethod() {
        return isNameExpr;
    }

    @Override
    public final int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isMethod();
        }
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isMethod();
            isMethod();
        }
    }

    protected void isMethod() {
    }

    protected void isMethod() {
    }
}
