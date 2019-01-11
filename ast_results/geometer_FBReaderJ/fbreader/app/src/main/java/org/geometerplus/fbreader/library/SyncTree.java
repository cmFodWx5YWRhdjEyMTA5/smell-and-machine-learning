// isComment
package org.geometerplus.fbreader.library;

import java.util.Arrays;
import java.util.List;
import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.book.Book;
import org.geometerplus.fbreader.book.Filter;

public class isClassOrIsInterface extends FirstLevelTree {

    private final List<String> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    isConstructor(RootTree isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Pair<String, String> isMethod() {
        return new Pair(isMethod(), null);
    }

    @Override
    public Status isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod() {
        isMethod();
        final ZLResource isVariable = isMethod().isMethod(isNameExpr);
        Filter isVariable = new Filter.HasPhysicalFile();
        for (String isVariable : isNameExpr) {
            final Filter isVariable = new Filter.ByLabel(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                new SyncLabelTree(this, isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
            }
            isNameExpr = new Filter.And(isNameExpr, new Filter.Not(isNameExpr));
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            new SyncLabelTree(this, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }
}
