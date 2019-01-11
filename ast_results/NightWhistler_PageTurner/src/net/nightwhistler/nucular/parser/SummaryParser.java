// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.Entry;

public class isClassOrIsInterface extends ElementParser {

    private Entry isVariable;

    public isConstructor(Entry isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
