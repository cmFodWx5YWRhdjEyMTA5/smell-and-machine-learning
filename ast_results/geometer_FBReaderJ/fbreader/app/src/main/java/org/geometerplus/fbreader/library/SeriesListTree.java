// isComment
package org.geometerplus.fbreader.library;

import java.util.Collections;
import org.geometerplus.fbreader.book.*;

public class isClassOrIsInterface extends FirstLevelTree {

    isConstructor(RootTree isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Status isMethod() {
        if (!isNameExpr.isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        }
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isMethod() == isNameExpr.isFieldAccessExpr ? "isStringConstant" : super.isMethod();
    }

    @Override
    public void isMethod() {
        isMethod();
        for (String isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(BookEvent isParameter, Book isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
            case isNameExpr:
                {
                    // isComment
                    final SeriesInfo isVariable = isNameExpr.isMethod();
                    // isComment
                    return isNameExpr != null && isMethod(isNameExpr.isFieldAccessExpr.isMethod());
                }
            case isNameExpr:
                // isComment
                return true;
            default:
                return true;
        }
    }

    private boolean isMethod(String isParameter) {
        // isComment
        final Series isVariable = new Series(isNameExpr);
        final SeriesTree isVariable = new SeriesTree(isNameExpr, isNameExpr, isNameExpr, null);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return true;
        } else {
            new SeriesTree(this, isNameExpr, null, -isNameExpr - isIntegerConstant);
            return true;
        }
    }
}
