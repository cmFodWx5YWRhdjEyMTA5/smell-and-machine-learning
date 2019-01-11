// isComment
package org.quantumbadger.redreader.cache.downloadstrategy;

import org.quantumbadger.redreader.cache.CacheEntry;
import org.quantumbadger.redreader.common.TimestampBound;

public class isClassOrIsInterface implements DownloadStrategy {

    private final TimestampBound isVariable;

    public isConstructor(final TimestampBound isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod(final CacheEntry isParameter) {
        return !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
