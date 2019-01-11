// isComment
package org.hwyl.sexytopo.model.sketch;

import org.hwyl.sexytopo.model.graph.Coord2D;
import org.junit.Assert;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        PathDetail isVariable = new PathDetail(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(new Coord2D(isIntegerConstant, isIntegerConstant), new Coord2D(isIntegerConstant, isIntegerConstant)));
    }

    @Test
    public void isMethod() {
        PathDetail isVariable = new PathDetail(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(new Coord2D(isIntegerConstant, isIntegerConstant), new Coord2D(isIntegerConstant, isIntegerConstant)));
    }

    @Test
    public void isMethod() {
        PathDetail isVariable = new PathDetail(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new Coord2D(isDoubleConstant, isDoubleConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(new Coord2D(isIntegerConstant, isIntegerConstant), new Coord2D(isIntegerConstant, isIntegerConstant)));
    }
}
