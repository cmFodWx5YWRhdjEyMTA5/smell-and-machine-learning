// isComment
package org.geometerplus.fbreader.network.opds;

import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.core.network.QuietNetworkContext;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.fbreader.options.SyncOptions;
import org.geometerplus.fbreader.network.ISyncNetworkLink;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.sync.SyncUtil;
import org.geometerplus.fbreader.network.urlInfo.*;

public class isClassOrIsInterface extends OPDSNetworkLink implements ISyncNetworkLink {

    private static UrlInfoCollection<UrlInfoWithDate> isMethod() {
        final UrlInfoCollection<UrlInfoWithDate> isVariable = new UrlInfoCollection<UrlInfoWithDate>();
        isNameExpr.isMethod(new UrlInfoWithDate(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new UrlInfoWithDate(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr + "isStringConstant", isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new UrlInfoWithDate(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr + "isStringConstant", isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new UrlInfoWithDate(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr + "isStringConstant", isNameExpr.isFieldAccessExpr));
        return isNameExpr;
    }

    private static ZLResource isMethod() {
        return isNameExpr.isMethod().isMethod("isStringConstant");
    }

    public isConstructor(NetworkLibrary isParameter) {
        this(isNameExpr, -isIntegerConstant, isMethod().isMethod(), isMethod());
    }

    private isConstructor(NetworkLibrary isParameter, int isParameter, String isParameter, UrlInfoCollection<UrlInfoWithDate> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, null, null, isNameExpr);
    }

    public String isMethod() {
        final String isVariable = isNameExpr.isMethod(new QuietNetworkContext());
        return isNameExpr != null ? isNameExpr : isMethod().isMethod("isStringConstant").isMethod();
    }

    public Type isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod(ZLNetworkContext isParameter) {
        return isNameExpr.isMethod(isNameExpr) != null;
    }

    public void isMethod(ZLNetworkContext isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
