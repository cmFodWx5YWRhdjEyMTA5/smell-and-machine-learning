// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.Feed;
import java.util.Map;

public class isClassOrIsInterface extends ElementParser {

    private Feed isVariable;

    public isConstructor() {
        super("isStringConstant");
        this.isFieldAccessExpr = new Feed();
    }

    public Feed isMethod() {
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
            return new LinkParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new ContentParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new TitleParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new EntryParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new AuthorParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new IDParser(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }
}
