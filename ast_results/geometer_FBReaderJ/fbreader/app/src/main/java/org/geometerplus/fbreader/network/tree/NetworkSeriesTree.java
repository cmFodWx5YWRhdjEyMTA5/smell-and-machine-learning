// isComment
package org.geometerplus.fbreader.network.tree;

import java.util.*;
import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.fbreader.tree.FBTree;
import org.geometerplus.fbreader.network.*;

public class isClassOrIsInterface extends NetworkTree {

    public final String isVariable;

    private final boolean isVariable;

    isConstructor(NetworkTree isParameter, String isParameter, int isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        if (!isNameExpr) {
            return super.isMethod();
        }
        StringBuilder isVariable = new StringBuilder();
        int isVariable = isIntegerConstant;
        Set<NetworkBookItem.AuthorData> isVariable = new TreeSet<NetworkBookItem.AuthorData>();
        for (FBTree isVariable : isMethod()) {
            if (!(isNameExpr instanceof NetworkBookTree)) {
                continue;
            }
            final NetworkBookItem isVariable = ((NetworkBookTree) isNameExpr).isFieldAccessExpr;
            for (NetworkBookItem.AuthorData isVariable : isNameExpr.isFieldAccessExpr) {
                if (!isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr++ > isIntegerConstant) {
                        isNameExpr.isMethod("isStringConstant");
                    }
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    if (isNameExpr == isIntegerConstant) {
                        return isNameExpr.isMethod();
                    }
                }
            }
        }
        return isNameExpr.isMethod();
    }

    @Override
    protected ZLImage isMethod() {
        for (FBTree isVariable : isMethod()) {
            if (isNameExpr instanceof NetworkBookTree) {
                return ((NetworkBookTree) isNameExpr).isMethod();
            }
        }
        return null;
    }

    @Override
    public void isMethod(Set<NetworkTree> isParameter) {
        super.isMethod(isNameExpr);
        if (isMethod().isMethod()) {
            isMethod();
        }
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isNameExpr;
    }
}
