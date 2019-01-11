// isComment
package org.geometerplus.android.fbreader.network.action;

import java.util.*;
import android.app.Activity;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.*;
import org.geometerplus.fbreader.tree.FBTree;
import org.geometerplus.android.fbreader.network.BuyBooksActivity;

public class isClassOrIsInterface extends CatalogAction {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof BasketCatalogTree && ((BasketCatalogTree) isNameExpr).isMethod();
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (isNameExpr.isMethod(isNameExpr) != null) {
            return true;
        }
        final Set<String> isVariable = new HashSet<String>();
        for (FBTree isVariable : isNameExpr.isMethod()) {
            if (isNameExpr instanceof NetworkBookTree) {
                isNameExpr.isMethod(((NetworkBookTree) isNameExpr).isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        final BasketItem isVariable = (BasketItem) ((BasketCatalogTree) isNameExpr).isFieldAccessExpr;
        return isNameExpr.isMethod(new HashSet(isNameExpr.isMethod()));
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final ArrayList<NetworkBookTree> isVariable = new ArrayList<NetworkBookTree>();
        for (FBTree isVariable : isNameExpr.isMethod()) {
            if (isNameExpr instanceof NetworkBookTree) {
                isNameExpr.isMethod((NetworkBookTree) isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
