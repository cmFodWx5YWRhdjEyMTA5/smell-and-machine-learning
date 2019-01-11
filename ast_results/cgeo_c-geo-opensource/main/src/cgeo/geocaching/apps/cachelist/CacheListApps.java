// isComment
package cgeo.geocaching.apps.cachelist;

import cgeo.geocaching.R;
import cgeo.geocaching.maps.mapsforge.v6.NewMap;
import java.util.ArrayList;
import java.util.List;

public enum CacheListApps {

    INTERNAL(new InternalCacheListMap()), INTERNAL_NEW(new InternalCacheListMap(NewMap.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), LOCUS_SHOW(new LocusShowCacheListApp()), LOCUS_EXPORT(new LocusExportCacheListApp()), MAPS_ME(new MapsMeCacheListApp());

    private final CacheListApp isVariable;

    isConstructor(final CacheListApp isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static List<CacheListApp> isMethod() {
        final List<CacheListApp> isVariable = new ArrayList<>();
        for (final CacheListApps isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
        return isNameExpr;
    }
}
