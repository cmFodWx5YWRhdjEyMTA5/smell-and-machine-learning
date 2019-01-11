// isComment
package org.quantumbadger.redreader.cache.downloadstrategy;

import org.quantumbadger.redreader.cache.CacheEntry;

public class isClassOrIsInterface implements DownloadStrategy {

    public static final DownloadStrategyIfNotCached isVariable = new DownloadStrategyIfNotCached();

    private isConstructor() {
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod(final CacheEntry isParameter) {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
