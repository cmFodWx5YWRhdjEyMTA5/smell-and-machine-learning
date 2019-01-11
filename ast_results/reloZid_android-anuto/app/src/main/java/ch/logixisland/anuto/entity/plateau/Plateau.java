// isComment
package ch.logixisland.anuto.entity.plateau;

import ch.logixisland.anuto.engine.logic.GameEngine;
import ch.logixisland.anuto.engine.logic.entity.Entity;
import ch.logixisland.anuto.entity.Types;
import ch.logixisland.anuto.util.iterator.Predicate;

public abstract class isClassOrIsInterface extends Entity {

    isConstructor(GameEngine isParameter) {
        super(isNameExpr);
    }

    public static Predicate<Plateau> isMethod() {
        return new Predicate<Plateau>() {

            @Override
            public boolean isMethod(Plateau isParameter) {
                return !isNameExpr.isMethod();
            }
        };
    }

    private boolean isVariable;

    @Override
    public final int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }
}
