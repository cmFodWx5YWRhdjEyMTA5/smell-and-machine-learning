// isComment
package cgeo.geocaching.maps.google.v1;

import cgeo.geocaching.models.IWaypoint;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.maps.interfaces.CachesOverlayItemImpl;
import cgeo.geocaching.maps.interfaces.GeoPointImpl;
import cgeo.geocaching.maps.interfaces.MapItemFactory;

public class isClassOrIsInterface implements MapItemFactory {

    @Override
    public GeoPointImpl isMethod(final Geopoint isParameter) {
        return new GoogleGeoPoint(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Override
    public CachesOverlayItemImpl isMethod(final IWaypoint isParameter, final boolean isParameter) {
        return new GoogleCacheOverlayItem(isNameExpr, isNameExpr);
    }
}
