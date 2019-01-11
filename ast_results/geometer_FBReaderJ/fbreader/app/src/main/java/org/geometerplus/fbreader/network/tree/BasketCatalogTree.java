// isComment
package org.geometerplus.fbreader.network.tree;

import java.util.*;
import org.geometerplus.zlibrary.core.network.QuietNetworkContext;
import org.geometerplus.fbreader.tree.FBTree;
import org.geometerplus.fbreader.network.*;

public class isClassOrIsInterface extends NetworkCatalogTree {

    private long isVariable = -isIntegerConstant;

    public isConstructor(NetworkCatalogTree isParameter, BasketItem isParameter, int isParameter) {
        super(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
        if (!isNameExpr.isMethod().isMethod()) {
            isMethod(new QuietNetworkContext(), true, true);
        }
    }

    public isConstructor(RootTree isParameter, BasketItem isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isIntegerConstant);
        if (!isNameExpr.isMethod().isMethod()) {
            isMethod(new QuietNetworkContext(), true, true);
        }
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    public synchronized List<FBTree> isMethod() {
        final BasketItem isVariable = (BasketItem) isNameExpr;
        final long isVariable = isNameExpr.isMethod();
        if (isNameExpr != isNameExpr) {
            isNameExpr = isNameExpr;
            final List<FBTree> isVariable = new ArrayList<FBTree>();
            final Set<String> isVariable = new TreeSet(isNameExpr.isMethod());
            for (FBTree isVariable : super.isMethod()) {
                if (!(isNameExpr instanceof NetworkBookTree)) {
                    continue;
                }
                final NetworkBookTree isVariable = (NetworkBookTree) isNameExpr;
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
            for (FBTree isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
            for (String isVariable : isNameExpr) {
                final NetworkBookItem isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(this, isNameExpr);
                }
            }
        }
        return super.isMethod();
    }

    @Override
    public synchronized void isMethod(NetworkItem isParameter) {
        if (!(isNameExpr instanceof NetworkBookItem)) {
            return;
        }
        final NetworkBookItem isVariable = (NetworkBookItem) isNameExpr;
        final String isVariable = isNameExpr.isMethod();
        for (FBTree isVariable : isMethod()) {
            if (isNameExpr instanceof NetworkBookTree && isNameExpr.isMethod(((NetworkBookTree) isNameExpr).isFieldAccessExpr.isMethod())) {
                return;
            }
        }
        final BasketItem isVariable = (BasketItem) isNameExpr;
        if (isNameExpr.isMethod(isNameExpr)) {
            super.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
