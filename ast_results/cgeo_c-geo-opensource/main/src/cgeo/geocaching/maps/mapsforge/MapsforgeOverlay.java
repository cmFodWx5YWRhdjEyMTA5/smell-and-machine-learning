// isComment
package cgeo.geocaching.maps.mapsforge;

import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.maps.PositionAndScaleOverlay;
import cgeo.geocaching.maps.interfaces.GeneralOverlay;
import cgeo.geocaching.maps.interfaces.MapViewImpl;
import cgeo.geocaching.maps.interfaces.OverlayImpl;
import org.mapsforge.v3.android.maps.Projection;
import org.mapsforge.v3.android.maps.overlay.Overlay;
import android.graphics.Canvas;
import android.graphics.Point;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class isClassOrIsInterface extends Overlay implements OverlayImpl {

    private PositionAndScaleOverlay isVariable = null;

    private final Lock isVariable = new ReentrantLock();

    public isConstructor(final MapViewImpl isParameter, final Geopoint isParameter, final String isParameter) {
        isNameExpr = new PositionAndScaleOverlay(this, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(final Canvas isParameter, final Point isParameter, final Projection isParameter, final byte isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, new MapsforgeMapProjection(isNameExpr), isNameExpr);
        }
    }

    public GeneralOverlay isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public MapViewImpl isMethod() {
        return (MapViewImpl) isNameExpr;
    }
}
