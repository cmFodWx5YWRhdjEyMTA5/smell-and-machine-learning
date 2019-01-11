// isComment
package org.hwyl.sexytopo.model.sketch;

import org.hwyl.sexytopo.model.graph.Coord2D;

public class isClassOrIsInterface extends SinglePositionDetail {

    private final String isVariable;

    public isConstructor(Coord2D isParameter, String isParameter, Colour isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public TextDetail isMethod(Coord2D isParameter) {
        return new TextDetail(isMethod().isMethod(isNameExpr), isMethod(), isMethod());
    }
}
