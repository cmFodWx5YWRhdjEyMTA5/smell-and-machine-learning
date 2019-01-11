// isComment
package cgeo.geocaching.maps.google.v1;

import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.maps.PositionAndScaleOverlay;
import cgeo.geocaching.maps.interfaces.GeneralOverlay;
import cgeo.geocaching.maps.interfaces.MapViewImpl;
import cgeo.geocaching.maps.interfaces.OverlayImpl;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import android.graphics.Canvas;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class isClassOrIsInterface extends Overlay implements OverlayImpl {

    private PositionAndScaleOverlay isVariable = null;

    private final Lock isVariable = new ReentrantLock();

    public isConstructor(final MapViewImpl isParameter, final Geopoint isParameter, final String isParameter) {
        isNameExpr = new PositionAndScaleOverlay(this, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final Canvas isParameter, final MapView isParameter, final boolean isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, (MapViewImpl) isNameExpr, isNameExpr);
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
        throw new UnsupportedOperationException();
    }
}
