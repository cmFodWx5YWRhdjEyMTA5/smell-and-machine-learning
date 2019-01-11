// isComment
package net.nightwhistler.nucular.parser.opensearch;

import net.nightwhistler.nucular.parser.ElementParser;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private SearchDescription isVariable;

    public isConstructor() {
        super("isStringConstant");
        this.isFieldAccessExpr = new SearchDescription();
    }

    public SearchDescription isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(String isParameter, Map<String, String> isParameter) {
        if (!isNameExpr.isMethod("isStringConstant")) {
            // isComment
            super.isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    protected ElementParser isMethod(String isParameter) {
        if (isNameExpr.isMethod("isStringConstant")) {
            return new UrlParser(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }
}
