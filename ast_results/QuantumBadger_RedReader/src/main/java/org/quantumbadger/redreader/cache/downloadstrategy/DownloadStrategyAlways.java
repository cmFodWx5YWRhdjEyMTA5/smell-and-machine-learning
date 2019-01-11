// isComment
package org.quantumbadger.redreader.cache.downloadstrategy;

import org.quantumbadger.redreader.cache.CacheEntry;

public class isClassOrIsInterface implements DownloadStrategy {

    public static final DownloadStrategyAlways isVariable = new DownloadStrategyAlways();

    private isConstructor() {
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod(final CacheEntry isParameter) {
        // isComment
        return true;
    }

    @Override
    public boolean isMethod() {
        // isComment
        return true;
    }
}
