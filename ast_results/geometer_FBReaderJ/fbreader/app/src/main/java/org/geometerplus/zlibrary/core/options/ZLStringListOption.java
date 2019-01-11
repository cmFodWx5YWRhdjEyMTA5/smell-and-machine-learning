// isComment
package org.geometerplus.zlibrary.core.options;

import java.util.*;
import org.geometerplus.zlibrary.core.util.MiscUtil;

public class isClassOrIsInterface extends ZLOption {

    private final String isVariable;

    private List<String> isVariable;

    private String isVariable;

    public isConstructor(String isParameter, String isParameter, List<String> isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr));
        isNameExpr = isNameExpr;
    }

    public isConstructor(String isParameter, String isParameter, String isParameter, String isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr != null ? isNameExpr.isMethod(isNameExpr) : isNameExpr.<String>isMethod(), isNameExpr);
    }

    public List<String> isMethod() {
        final String isVariable = isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    public void isMethod(List<String> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        isNameExpr = new ArrayList<String>(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }
}
