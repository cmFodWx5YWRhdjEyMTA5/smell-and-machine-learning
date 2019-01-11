// isComment
package com.danielme.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

/**
 * isComment
 */
@SuppressWarnings({ "isStringConstant", "isStringConstant" })
public final class isClassOrIsInterface extends DiskLruCacheFactory {

    public isConstructor(Context isParameter) {
        this(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public isConstructor(Context isParameter, int isParameter) {
        this(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    public isConstructor(final Context isParameter, final String isParameter, int isParameter) {
        super(new CacheDirectoryGetter() {

            @Override
            public File isMethod() {
                File isVariable = isNameExpr.isMethod();
                if (isNameExpr == null) {
                    isNameExpr = isNameExpr.isMethod();
                    if (isNameExpr == null) {
                        return null;
                    }
                }
                if (isNameExpr != null) {
                    return new File(isNameExpr, isNameExpr);
                }
                return isNameExpr;
            }
        }, isNameExpr);
    }
}
