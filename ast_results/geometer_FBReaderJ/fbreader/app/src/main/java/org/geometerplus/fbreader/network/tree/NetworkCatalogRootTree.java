// isComment
package org.geometerplus.fbreader.network.tree;

import org.fbreader.util.Pair;
import org.geometerplus.fbreader.tree.FBTree;
import org.geometerplus.fbreader.network.*;

public class isClassOrIsInterface extends NetworkCatalogTree {

    public isConstructor(RootTree isParameter, INetworkLink isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, (NetworkCatalogItem) isNameExpr.isMethod(), isNameExpr);
    }

    public isConstructor(RootTree isParameter, INetworkLink isParameter) {
        this(isNameExpr, isNameExpr, -isIntegerConstant);
    }

    @Override
    public Pair<String, String> isMethod() {
        return new Pair(isMethod(), null);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        final BasketItem isVariable = isMethod().isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            new BasketCatalogTree(this, isNameExpr, -isIntegerConstant);
        }
    }

    @Override
    public int isMethod(FBTree isParameter) {
        if (!(isNameExpr instanceof NetworkCatalogRootTree)) {
            return isIntegerConstant;
        }
        return isMethod().isMethod(((NetworkCatalogRootTree) isNameExpr).isMethod());
    }
}
