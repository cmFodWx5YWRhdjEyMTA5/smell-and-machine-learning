// isComment
package org.geometerplus.fbreader.library;

import java.util.*;
import org.geometerplus.fbreader.book.*;

public class isClassOrIsInterface extends FirstLevelTree {

    private boolean isVariable;

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
        isNameExpr = true;
        List<String> isVariable = null;
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod() > isNameExpr.isMethod() * isIntegerConstant / isIntegerConstant;
        }
        if (isNameExpr) {
            for (String isVariable : isNameExpr) {
                isMethod(isNameExpr);
            }
        } else {
            for (BookQuery isVariable = new BookQuery(new Filter.Empty(), isIntegerConstant); ; isNameExpr = isNameExpr.isMethod()) {
                final List<Book> isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod()) {
                    break;
                }
                for (Book isVariable : isNameExpr) {
                    isMethod(isNameExpr);
                }
            }
        }
    }

    @Override
    public boolean isMethod(BookEvent isParameter, Book isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        switch(isNameExpr) {
            case isNameExpr:
                if (isNameExpr) {
                    return isMethod(isNameExpr.isMethod());
                } else {
                    return isMethod(isNameExpr);
                }
            case isNameExpr:
                if (isNameExpr) {
                    // isComment
                    return true;
                } else {
                    return super.isMethod(isNameExpr, isNameExpr);
                }
            case isNameExpr:
                if (isNameExpr) {
                    // isComment
                    return isMethod(isNameExpr.isMethod());
                } else {
                    boolean isVariable = isMethod(isNameExpr);
                    isNameExpr |= isMethod(isNameExpr);
                    return isNameExpr;
                }
            default:
                return super.isMethod(isNameExpr, isNameExpr);
        }
    }

    private boolean isMethod(String isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        final TitleTree isVariable = new TitleTree(isNameExpr, isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return true;
        } else {
            new TitleTree(this, isNameExpr, -isNameExpr - isIntegerConstant);
            return true;
        }
    }
}
