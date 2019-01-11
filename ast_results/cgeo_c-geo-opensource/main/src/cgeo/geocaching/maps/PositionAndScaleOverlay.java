// isComment
package cgeo.geocaching.maps;

import cgeo.geocaching.storage.DataStore;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.location.Viewport;
import cgeo.geocaching.maps.interfaces.GeneralOverlay;
import cgeo.geocaching.maps.interfaces.MapProjectionImpl;
import cgeo.geocaching.maps.interfaces.MapViewImpl;
import cgeo.geocaching.maps.interfaces.OverlayImpl;
import android.graphics.Canvas;
import android.graphics.Point;
import android.location.Location;
import java.util.ArrayList;

public class isClassOrIsInterface implements GeneralOverlay {

    private OverlayImpl isVariable = null;

    PositionDrawer isVariable = null;

    ScaleDrawer isVariable = null;

    DirectionDrawer isVariable = null;

    DistanceDrawer isVariable = null;

    public isConstructor(final OverlayImpl isParameter, final MapViewImpl isParameter, final Geopoint isParameter, final String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new PositionDrawer();
        isNameExpr = new ScaleDrawer();
        if (isNameExpr != null) {
            isNameExpr = new DirectionDrawer(isNameExpr);
            isNameExpr = new DistanceDrawer(isNameExpr, isNameExpr);
        } else if (isNameExpr != null) {
            final Viewport isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr = new DirectionDrawer(isNameExpr.isFieldAccessExpr);
                isNameExpr = new DistanceDrawer(isNameExpr, isNameExpr.isFieldAccessExpr);
            }
        }
    }

    public void isMethod(final Location isParameter) {
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public Location isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod(final float isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public float isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(final Canvas isParameter, final Point isParameter, final MapProjectionImpl isParameter, final byte isParameter) {
        isMethod(isNameExpr, isNameExpr, isMethod().isMethod());
    }

    @Override
    public void isMethod(final Canvas isParameter, final MapViewImpl isParameter, final boolean isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
    }

    private void isMethod(final Canvas isParameter, final MapProjectionImpl isParameter, final MapViewImpl isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public OverlayImpl isMethod() {
        return this.isFieldAccessExpr;
    }

    public ArrayList<Location> isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod(final ArrayList<Location> isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
