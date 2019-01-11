// isComment
package org.sudowars.Model.CommandManagement.GameCommands;

import org.sudowars.Model.Game.Game;
import org.sudowars.Model.Game.GameCell;
import org.sudowars.Model.Game.Player;

/**
 * isComment
 */
public class isClassOrIsInterface extends CellCommand {

    /**
     * isComment
     */
    private static final long isVariable = isStringConstant;

    private int isVariable;

    /**
     * isComment
     */
    public isConstructor(GameCell isParameter, int isParameter) throws IllegalArgumentException {
        super(isNameExpr);
        assert (isNameExpr > isIntegerConstant && isNameExpr < isIntegerConstant);
        if (isNameExpr > isIntegerConstant && isNameExpr < isIntegerConstant) {
            this.isFieldAccessExpr = isNameExpr;
        } else {
            throw new IllegalArgumentException("isStringConstant");
        }
    }

    /**
     * isComment
     */
    public boolean isMethod(Game isParameter, Player isParameter) throws IllegalArgumentException {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        GameCell isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        if (isNameExpr instanceof GameCell) {
            return isNameExpr.isMethod(isNameExpr, (GameCell) isNameExpr, isNameExpr, isIntegerConstant);
        } else {
            // isComment
            return true;
        }
    }

    @Override
    public GameCommand isMethod(Game isParameter) {
        return new RemoveCellValueCommand(this.isMethod(isNameExpr));
    }
}
