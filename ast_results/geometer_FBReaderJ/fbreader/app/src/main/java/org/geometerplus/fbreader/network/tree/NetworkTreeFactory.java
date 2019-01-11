// isComment
package org.geometerplus.fbreader.network.tree;

import org.fbreader.util.Boolean3;
import org.geometerplus.fbreader.network.*;

class isClassOrIsInterface {

    public static NetworkTree isMethod(NetworkCatalogTree isParameter, NetworkItem isParameter) {
        return isMethod(isNameExpr, isNameExpr, -isIntegerConstant);
    }

    public static NetworkTree isMethod(NetworkCatalogTree isParameter, NetworkItem isParameter, int isParameter) {
        final int isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr == -isIntegerConstant) {
            isNameExpr = isNameExpr;
        } else if (isNameExpr < isIntegerConstant || isNameExpr > isNameExpr) {
            throw new IndexOutOfBoundsException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        }
        if (isNameExpr instanceof NetworkCatalogItem) {
            final NetworkCatalogItem isVariable = (NetworkCatalogItem) isNameExpr;
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return null;
            }
            return new NetworkCatalogTree(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof NetworkBookItem) {
            if (isNameExpr != isNameExpr) {
                throw new RuntimeException("isStringConstant");
            }
            final NetworkBookItem isVariable = (NetworkBookItem) isNameExpr;
            final int isVariable = isNameExpr.isFieldAccessExpr.isMethod();
            final boolean isVariable = (isNameExpr & isNameExpr.isFieldAccessExpr) != isIntegerConstant;
            switch(isNameExpr & isNameExpr.isFieldAccessExpr) {
                default:
                    return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                case isNameExpr.isFieldAccessExpr:
                    if (isNameExpr.isFieldAccessExpr == null) {
                        return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    } else {
                        final NetworkTree isVariable = isNameExpr > isIntegerConstant ? (NetworkTree) isNameExpr.isMethod().isMethod(isNameExpr - isIntegerConstant) : null;
                        NetworkSeriesTree isVariable = null;
                        if (isNameExpr instanceof NetworkSeriesTree) {
                            isNameExpr = (NetworkSeriesTree) isNameExpr;
                            if (!isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                isNameExpr = null;
                            }
                        }
                        if (isNameExpr == null) {
                            isNameExpr = new NetworkSeriesTree(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                        }
                        return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr);
                    }
                case isNameExpr.isFieldAccessExpr:
                    if (isNameExpr > isIntegerConstant && isNameExpr.isFieldAccessExpr != null) {
                        final NetworkTree isVariable = (NetworkTree) isNameExpr.isMethod().isMethod(isNameExpr - isIntegerConstant);
                        if (isNameExpr instanceof NetworkSeriesTree) {
                            final NetworkSeriesTree isVariable = (NetworkSeriesTree) isNameExpr;
                            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr);
                            }
                        } else /*isComment*/
                        {
                            final NetworkBookItem isVariable = ((NetworkBookTree) isNameExpr).isFieldAccessExpr;
                            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                isNameExpr.isMethod();
                                final NetworkSeriesTree isVariable = new NetworkSeriesTree(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr - isIntegerConstant, isNameExpr);
                                new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr);
                                return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr);
                            }
                        }
                    }
                    return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                case isNameExpr.isFieldAccessExpr:
                    if (isNameExpr.isFieldAccessExpr.isMethod()) {
                        return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    } else {
                        final NetworkBookItem.AuthorData isVariable = isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant);
                        final NetworkTree isVariable = isNameExpr > isIntegerConstant ? (NetworkTree) isNameExpr.isMethod().isMethod(isNameExpr - isIntegerConstant) : null;
                        NetworkAuthorTree isVariable = null;
                        if (isNameExpr instanceof NetworkAuthorTree) {
                            isNameExpr = (NetworkAuthorTree) isNameExpr;
                            if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                                isNameExpr = null;
                            }
                        }
                        if (isNameExpr == null) {
                            isNameExpr = new NetworkAuthorTree(isNameExpr, isNameExpr);
                        }
                        return new NetworkBookTree(isNameExpr, isNameExpr, isNameExpr);
                    }
            }
        } else if (isNameExpr instanceof TopUpItem) {
            return new TopUpTree(isNameExpr, (TopUpItem) isNameExpr);
        }
        return null;
    }
}
