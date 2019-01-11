// isComment
package org.geometerplus.fbreader.library;

import java.util.Collections;
import java.util.List;
import org.geometerplus.fbreader.book.*;

public class isClassOrIsInterface extends FirstLevelTree {

    isConstructor(RootTree isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Status isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod() {
        isMethod();
        for (Author isVariable : isNameExpr.isMethod()) {
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
                    final List<Author> isVariable = isNameExpr.isMethod();
                    boolean isVariable = true;
                    if (isNameExpr.isMethod()) {
                        isNameExpr &= isMethod(isNameExpr.isFieldAccessExpr);
                    } else
                        for (Author isVariable : isNameExpr) {
                            isNameExpr &= isMethod(isNameExpr);
                        }
                    return isNameExpr;
                }
            case isNameExpr:
                // isComment
                return true;
            default:
                return true;
        }
    }

    private boolean isMethod(Author isParameter) {
        final AuthorTree isVariable = new AuthorTree(isNameExpr, isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return true;
        } else {
            new AuthorTree(this, isNameExpr, -isNameExpr - isIntegerConstant);
            return true;
        }
    }
}
