// isComment
package org.hwyl.sexytopo.model.graph;

import org.hwyl.sexytopo.control.util.NumberTools;

public class isClassOrIsInterface extends Coord {

    public static final Coord2D isVariable = new Coord2D(isIntegerConstant, isIntegerConstant);

    private final double isVariable, isVariable;

    public isConstructor(double isParameter, double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public double isMethod() {
        return isNameExpr;
    }

    public double isMethod() {
        return isNameExpr;
    }

    public Coord2D isMethod(double isParameter, double isParameter) {
        return new Coord2D(isMethod() + isNameExpr, isMethod() + isNameExpr);
    }

    public Coord2D isMethod(Coord2D isParameter) {
        return new Coord2D(this.isFieldAccessExpr + isNameExpr.isFieldAccessExpr, this.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
    }

    public Coord2D isMethod(Coord2D isParameter) {
        return new Coord2D(this.isFieldAccessExpr - isNameExpr.isFieldAccessExpr, this.isFieldAccessExpr - isNameExpr.isFieldAccessExpr);
    }

    public Coord2D isMethod(double isParameter) {
        return new Coord2D(isNameExpr * isNameExpr, isNameExpr * isNameExpr);
    }

    public String isMethod() {
        return isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
    }

    public Coord2D isMethod() {
        return new Coord2D(isNameExpr, -isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod()) {
            return true;
        } else {
            Coord2D isVariable = (Coord2D) isNameExpr;
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr) && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }

    @Override
    public int isMethod() {
        double isVariable = isNameExpr;
        isNameExpr = isIntegerConstant * isNameExpr + isNameExpr;
        return (int) isNameExpr;
    }
}
