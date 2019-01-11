// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.AtomElement;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private AtomElement isVariable;

    private boolean isVariable = true;

    StringBuffer isVariable = new StringBuffer();

    public isConstructor(AtomElement isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(String isParameter, Map<String, String> isParameter) {
    // isComment
    }

    @Override
    public void isMethod(String isParameter) {
        if (isNameExpr.isMethod("isStringConstant")) {
            this.isFieldAccessExpr = true;
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
    }

    @Override
    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
