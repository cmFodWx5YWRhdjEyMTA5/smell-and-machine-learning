// isComment
package org.geometerplus.fbreader.library;

import java.math.BigDecimal;
import org.geometerplus.fbreader.book.Book;
import org.geometerplus.fbreader.book.IBookCollection;
import org.geometerplus.fbreader.formats.PluginCollection;
import org.geometerplus.fbreader.tree.FBTree;

public final class isClassOrIsInterface extends BookTree {

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Book isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    isConstructor(LibraryTree isParameter, Book isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod(FBTree isParameter) {
        if (isNameExpr instanceof BookInSeriesTree) {
            final BigDecimal isVariable = isNameExpr.isMethod().isFieldAccessExpr;
            final BigDecimal isVariable = ((BookTree) isNameExpr).isFieldAccessExpr.isMethod().isFieldAccessExpr;
            final int isVariable;
            if (isNameExpr == null) {
                isNameExpr = isNameExpr == null ? isIntegerConstant : isIntegerConstant;
            } else {
                isNameExpr = isNameExpr == null ? -isIntegerConstant : isNameExpr.isMethod(isNameExpr);
            }
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        return super.isMethod(isNameExpr);
    }
}
