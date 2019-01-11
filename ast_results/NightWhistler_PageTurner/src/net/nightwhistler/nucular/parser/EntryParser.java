// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.Entry;
import net.nightwhistler.nucular.atom.Feed;

public class isClassOrIsInterface extends ElementParser {

    private Entry isVariable;

    public isConstructor(Feed isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = new Entry();
        isNameExpr.isMethod(isNameExpr);
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
            return new AuthorParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new IDParser(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new SummaryParser(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }
}
