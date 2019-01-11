// isComment
package org.geometerplus.fbreader.library;

import java.util.List;
import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

public final class isClassOrIsInterface extends FilteredTree {

    public final Tag isVariable;

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Tag isParameter) {
        super(isNameExpr, isNameExpr, new Filter.ByTag(isNameExpr));
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, Tag isParameter, int isParameter) {
        super(isNameExpr, new Filter.ByTag(isNameExpr), isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) ? isMethod().isMethod("isStringConstant").isMethod() : isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isMethod();
    }

    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) ? null : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(Book isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod().isMethod();
        }
        for (Tag isVariable : isNameExpr.isMethod()) {
            for (; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
                if (isNameExpr == isNameExpr) {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public void isMethod() {
        isMethod();
        if (!isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            for (Tag isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isMethod(isNameExpr);
                }
            }
        }
        isMethod();
    }

    @Override
    public boolean isMethod(BookEvent isParameter, Book isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                {
                    boolean isVariable = true;
                    final List<Tag> isVariable = isNameExpr.isMethod();
                    if (isNameExpr.isMethod()) {
                        isNameExpr &= isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && isMethod(isNameExpr);
                    } else {
                        for (Tag isVariable : isNameExpr) {
                            if (isNameExpr.isMethod(isNameExpr)) {
                                isNameExpr &= isMethod(isNameExpr);
                            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                isNameExpr &= isMethod(isNameExpr);
                            }
                        }
                    }
                    return isNameExpr;
                }
            case isNameExpr:
                // isComment
                return super.isMethod(isNameExpr, isNameExpr);
            case isNameExpr:
                {
                    // isComment
                    boolean isVariable = isMethod(isNameExpr);
                    final List<Tag> isVariable = isNameExpr.isMethod();
                    if (isNameExpr.isMethod()) {
                        isNameExpr &= isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && isMethod(isNameExpr);
                    } else {
                        for (Tag isVariable : isNameExpr) {
                            if (isNameExpr.isMethod(isNameExpr)) {
                                isNameExpr &= isMethod(isNameExpr);
                            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                isNameExpr &= isMethod(isNameExpr);
                            }
                        }
                    }
                    return isNameExpr;
                }
            default:
                return super.isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        return isMethod(isNameExpr);
    }
}
