// isComment
package net.nightwhistler.nucular.parser.opensearch;

import net.nightwhistler.nucular.atom.Link;
import net.nightwhistler.nucular.parser.ElementParser;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private SearchDescription isVariable;

    public isConstructor(SearchDescription isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(Map<String, String> isParameter) {
        Link isVariable = new Link(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"));
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
