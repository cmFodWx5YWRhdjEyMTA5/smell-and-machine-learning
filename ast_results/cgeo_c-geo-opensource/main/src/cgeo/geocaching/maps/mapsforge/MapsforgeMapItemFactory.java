// isComment
package cgeo.geocaching.maps.mapsforge;

import cgeo.geocaching.models.IWaypoint;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.maps.interfaces.CachesOverlayItemImpl;
import cgeo.geocaching.maps.interfaces.GeoPointImpl;
import cgeo.geocaching.maps.interfaces.MapItemFactory;

public class isClassOrIsInterface implements MapItemFactory {

    @Override
    public GeoPointImpl isMethod(final Geopoint isParameter) {
        return new MapsforgeGeoPoint(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Override
    public CachesOverlayItemImpl isMethod(final IWaypoint isParameter, final boolean isParameter) {
        return new MapsforgeCacheOverlayItem(isNameExpr, isNameExpr);
    }
}
