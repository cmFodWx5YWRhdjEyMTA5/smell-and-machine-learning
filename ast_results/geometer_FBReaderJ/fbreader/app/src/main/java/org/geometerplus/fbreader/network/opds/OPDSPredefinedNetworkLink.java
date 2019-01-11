// isComment
package org.geometerplus.fbreader.network.opds;

import org.geometerplus.fbreader.network.IPredefinedNetworkLink;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.urlInfo.*;

public class isClassOrIsInterface extends OPDSNetworkLink implements IPredefinedNetworkLink {

    private static final String isVariable = "isStringConstant";

    private final String isVariable;

    public isConstructor(NetworkLibrary isParameter, int isParameter, String isParameter, String isParameter, String isParameter, String isParameter, UrlInfoCollection<UrlInfoWithDate> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public Type isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isMethod();
    }

    public boolean isMethod(String isParameter) {
        return isNameExpr != null && isNameExpr.isMethod(isMethod()) != -isIntegerConstant;
    }
}
