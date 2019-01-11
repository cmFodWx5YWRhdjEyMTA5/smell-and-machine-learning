// isComment
package net.nightwhistler.nucular.parser;

import net.nightwhistler.nucular.atom.AtomElement;
import net.nightwhistler.nucular.atom.Author;

public class isClassOrIsInterface extends ElementParser {

    private Author isVariable;

    public isConstructor(AtomElement isParameter) {
        super("isStringConstant");
        this.isFieldAccessExpr = new Author();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected ElementParser isMethod(String isParameter) {
        if (isNameExpr.isMethod("isStringConstant")) {
            return new NameParser();
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new UriParser();
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return new EmailParser();
        }
        return super.isMethod(isNameExpr);
    }

    private class isClassOrIsInterface extends ElementParser {

        public isConstructor() {
            super("isStringConstant");
        }

        @Override
        public void isMethod(String isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface extends ElementParser {

        public isConstructor() {
            super("isStringConstant");
        }

        @Override
        public void isMethod(String isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface extends ElementParser {

        public isConstructor() {
            super("isStringConstant");
        }

        @Override
        public void isMethod(String isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
