// isComment
package org.geometerplus.fbreader.network.opds;

import java.util.List;
import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.zlibrary.core.util.MiscUtil;
import org.geometerplus.fbreader.network.BasketItem;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.urlInfo.*;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;

class isClassOrIsInterface extends BasketItem {

    isConstructor(NetworkLibrary isParameter, OPDSNetworkLink isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
        final List<String> isVariable = isMethod();
        if (isNameExpr.isMethod()) {
            return;
        }
        if (isMethod()) {
            for (String isVariable : isNameExpr) {
                isNameExpr.isMethod(isMethod(isNameExpr));
            }
            isNameExpr.isFieldAccessExpr.isMethod();
            return;
        }
        final OPDSNetworkLink isVariable = (OPDSNetworkLink) isNameExpr;
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            return;
        }
        isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        final OPDSCatalogItem.State isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr));
    }
}
