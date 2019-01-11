// isComment
package org.hwyl.sexytopo.model.sketch;

import org.hwyl.sexytopo.control.util.SpaceFlipper;
import org.hwyl.sexytopo.control.util.SpaceMover;
import org.hwyl.sexytopo.model.graph.Coord2D;
import org.hwyl.sexytopo.model.graph.Space;

public class isClassOrIsInterface extends SinglePositionDetail {

    private final CrossSection isVariable;

    public isConstructor(CrossSection isParameter, Coord2D isParameter) {
        super(isNameExpr.isFieldAccessExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public CrossSection isMethod() {
        return isNameExpr;
    }

    public Space<Coord2D> isMethod() {
        // isComment
        Space<Coord2D> isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        // isComment
        Space<Coord2D> isVariable = isNameExpr.isMethod(isNameExpr, isMethod());
        return isNameExpr;
    }

    @Override
    public CrossSectionDetail isMethod(Coord2D isParameter) {
        return new CrossSectionDetail(isMethod(), isMethod().isMethod(isNameExpr));
    }
}
