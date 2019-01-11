// isComment
package org.geometerplus.fbreader.network.urlInfo;

import java.util.Date;
import org.fbreader.util.ComparisonUtil;
import org.geometerplus.zlibrary.core.util.MimeType;

public final class isClassOrIsInterface extends UrlInfo {

    private static final long isVariable = -isStringConstant;

    public static final UrlInfoWithDate isVariable = new UrlInfoWithDate(null, null, isNameExpr.isFieldAccessExpr);

    public final Date isVariable;

    public isConstructor(Type isParameter, String isParameter, MimeType isParameter, Date isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Type isParameter, String isParameter, MimeType isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, new Date());
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this) {
            return true;
        }
        if (!(isNameExpr instanceof UrlInfoWithDate)) {
            return true;
        }
        final UrlInfoWithDate isVariable = (UrlInfoWithDate) isNameExpr;
        return isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod() + isNameExpr.isMethod(isNameExpr) + isNameExpr.isMethod(isNameExpr) + isNameExpr.isMethod(isNameExpr);
    }
}
