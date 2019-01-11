// isComment
package org.geometerplus.fbreader.library;

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
        for (Tag isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr == null) {
                isMethod(isNameExpr);
            }
        }
    }

    @Override
    public boolean isMethod(BookEvent isParameter, Book isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
            case isNameExpr:
                {
                    // isComment
                    final List<Tag> isVariable = isNameExpr.isMethod();
                    boolean isVariable = true;
                    if (isNameExpr.isMethod()) {
                        isNameExpr &= isMethod(isNameExpr.isFieldAccessExpr);
                    } else
                        for (Tag isVariable : isNameExpr) {
                            if (isNameExpr.isFieldAccessExpr == null) {
                                isNameExpr &= isMethod(isNameExpr);
                            }
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
}
