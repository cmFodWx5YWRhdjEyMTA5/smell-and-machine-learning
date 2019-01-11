// isComment
package org.geometerplus.fbreader.library;

import java.util.List;
import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.Paths;

public class isClassOrIsInterface extends FirstLevelTree {

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
        for (String isVariable : isNameExpr.isFieldAccessExpr.isMethod()) {
            isMethod(isNameExpr, isMethod().isMethod("isStringConstant").isMethod(), isNameExpr);
        }
        isMethod("isStringConstant", "isStringConstant");
        final List<String> isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod(isNameExpr.isMethod(isIntegerConstant), "isStringConstant");
        } else {
            final ZLResource isVariable = isMethod().isMethod("isStringConstant");
            final String isVariable = isNameExpr.isMethod("isStringConstant").isMethod();
            final String isVariable = isNameExpr.isMethod("isStringConstant").isMethod();
            int isVariable = isIntegerConstant;
            for (String isVariable : isNameExpr) {
                isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(++isNameExpr)), isNameExpr);
            }
        }
    }

    private void isMethod(String isParameter, String isParameter, String isParameter) {
        final ZLFile isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            new FileTree(this, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(String isParameter, String isParameter) {
        final ZLResource isVariable = isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod("isStringConstant").isMethod());
    }
}
