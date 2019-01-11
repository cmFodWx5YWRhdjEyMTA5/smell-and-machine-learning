// isComment
package org.sudowars.Model.CommandManagement.GameCommands;

import org.sudowars.Model.Game.Game;
import org.sudowars.Model.Game.GameCell;
import org.sudowars.Model.Game.Player;
import org.sudowars.Model.Game.SingleplayerGame;

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
    public isConstructor(GameCell isParameter) throws IllegalArgumentException {
        super(isNameExpr);
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
        GameCell isVariable = isMethod(isNameExpr);
        if (isNameExpr instanceof SingleplayerGame) {
            isNameExpr = isNameExpr.isMethod();
            return ((SingleplayerGame) isNameExpr).isMethod(isNameExpr);
        }
        return true;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public GameCommand isMethod(Game isParameter) {
        return (isNameExpr == isIntegerConstant ? null : new SetCellValueCommand(isMethod(isNameExpr), isNameExpr));
    }
}
