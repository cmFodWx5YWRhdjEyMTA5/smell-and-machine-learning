// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.AtomElement;

public class isClassOrIsInterface extends ElementParser {

    private AtomElement isVariable;

    public isConstructor(AtomElement isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
