// isComment
package com.wildplot.android.parsing.AtomTypes;

import com.wildplot.android.parsing.Atom;
import com.wildplot.android.parsing.ExpressionFormatException;
import com.wildplot.android.parsing.TopLevelParser;
import com.wildplot.android.parsing.TreeElement;

public class isClassOrIsInterface implements TreeElement {

    private Atom.AtomType isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;

    private TopLevelParser isVariable;

    public isConstructor(TopLevelParser isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public double isMethod() {
        if (isNameExpr != isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod();
        } else {
            throw new ExpressionFormatException("isStringConstant");
        }
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
