// isComment
package org.sudowars.Model.Game;

import org.sudowars.Model.Sudoku.Field.Cell;
import org.sudowars.Model.Sudoku.Field.CellBuilder;
import org.sudowars.Model.Sudoku.Field.Field;

/**
 * isComment
 */
public class isClassOrIsInterface implements CellBuilder<GameCell> {

    private final Field<Cell> isVariable;

    /**
     * isComment
     */
    isConstructor(Field<Cell> isParameter) throws IllegalArgumentException {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public GameCell isMethod(int isParameter) throws IllegalArgumentException {
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        GameCell isVariable = null;
        Cell isVariable = this.isFieldAccessExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr = new GameCell(isNameExpr);
        }
        return isNameExpr;
    }
}
