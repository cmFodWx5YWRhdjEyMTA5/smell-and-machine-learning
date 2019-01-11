// isComment
package org.geometerplus.fbreader.library;

import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

public class isClassOrIsInterface extends BookTree {

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Book isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    isConstructor(LibraryTree isParameter, Book isParameter) {
        super(isNameExpr, isNameExpr);
    }

    isConstructor(LibraryTree isParameter, Book isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        int isVariable = isIntegerConstant;
        for (Author isVariable : isNameExpr.isMethod()) {
            if (isNameExpr++ > isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr == isIntegerConstant) {
                break;
            }
        }
        return isNameExpr.isMethod();
    }
}
