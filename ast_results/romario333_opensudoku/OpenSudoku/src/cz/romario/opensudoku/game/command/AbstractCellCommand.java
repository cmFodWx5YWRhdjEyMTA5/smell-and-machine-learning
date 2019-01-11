// isComment
package cz.romario.opensudoku.game.command;

import cz.romario.opensudoku.game.CellCollection;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AbstractCommand {

    private CellCollection isVariable;

    protected CellCollection isMethod() {
        return isNameExpr;
    }

    protected void isMethod(CellCollection isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
