// isComment
package com.wildplot.android.parsing.AtomTypes;

import com.wildplot.android.parsing.Atom;
import com.wildplot.android.parsing.ExpressionFormatException;
import com.wildplot.android.parsing.TreeElement;

public class isClassOrIsInterface implements TreeElement {

    private Atom.AtomType isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;

    private Double isVariable;

    public isConstructor(String isParameter) {
        try {
            this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
        } catch (NumberFormatException isParameter) {
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    public Atom.AtomType isMethod() {
        return isNameExpr;
    }

    @Override
    public double isMethod() throws ExpressionFormatException {
        if (isNameExpr != isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            return isNameExpr;
        } else {
            throw new ExpressionFormatException("isStringConstant");
        }
    }

    @Override
    public boolean isMethod() throws ExpressionFormatException {
        if (isNameExpr != isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            return true;
        } else {
            throw new ExpressionFormatException("isStringConstant");
        }
    }
}
