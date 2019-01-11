// isComment
package cgeo.geocaching.enumerations;

import cgeo.geocaching.loaders.AbstractSearchLoader.CacheListLoaderType;
import android.support.annotation.NonNull;

public enum CacheListType {

    OFFLINE(true, isNameExpr.isFieldAccessExpr),
    POCKET(true, isNameExpr.isFieldAccessExpr),
    HISTORY(true, isNameExpr.isFieldAccessExpr),
    NEAREST(true, isNameExpr.isFieldAccessExpr),
    COORDINATE(true, isNameExpr.isFieldAccessExpr),
    KEYWORD(true, isNameExpr.isFieldAccessExpr),
    ADDRESS(true, isNameExpr.isFieldAccessExpr),
    FINDER(true, isNameExpr.isFieldAccessExpr),
    OWNER(true, isNameExpr.isFieldAccessExpr),
    MAP(true, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    public final boolean isVariable;

    @NonNull
    public final CacheListLoaderType isVariable;

    isConstructor(final boolean isParameter, @NonNull final CacheListLoaderType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }
}
