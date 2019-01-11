// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.AtomElement;
import net.nightwhistler.nucular.atom.Content;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private Content isVariable;

    StringBuffer isVariable;

    private boolean isVariable;

    public isConstructor(AtomElement isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = new Content();
        isNameExpr.isMethod(isNameExpr);
        this.isFieldAccessExpr = new StringBuffer();
        this.isFieldAccessExpr = true;
    }

    @Override
    public void isMethod(String isParameter, Map<String, String> isParameter) {
        this.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
    }

    @Override
    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Map<String, String> isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Override
    public void isMethod(String isParameter) {
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = true;
            this.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        } else {
            this.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        }
    }

    @Override
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
