// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.AtomElement;
import net.nightwhistler.nucular.atom.Link;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private AtomElement isVariable;

    public isConstructor(AtomElement isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(Map<String, String> isParameter) {
        Link isVariable = new Link(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"));
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
