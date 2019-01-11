// isComment
package cgeo.geocaching.maps.google.v1;

import cgeo.geocaching.maps.CachesOverlay;
import cgeo.geocaching.maps.interfaces.ItemizedOverlayImpl;
import cgeo.geocaching.maps.interfaces.MapProjectionImpl;
import cgeo.geocaching.maps.interfaces.MapViewImpl;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import android.support.annotation.Nullable;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * isComment
 */
public class isClassOrIsInterface extends ItemizedOverlay<GoogleCacheOverlayItem> implements ItemizedOverlayImpl {

    /**
     * isComment
     */
    @Nullable
    private final CachesOverlay isVariable;

    private final Lock isVariable = new ReentrantLock();

    public isConstructor(final Context isParameter, final Drawable isParameter) {
        super(isMethod(isNameExpr));
        isNameExpr = new CachesOverlay(this, isNameExpr);
    }

    @Override
    public CachesOverlay isMethod() {
        return isNameExpr;
    }

    @Override
    protected GoogleCacheOverlayItem isMethod(final int isParameter) {
        if (isNameExpr != null) {
            return (GoogleCacheOverlayItem) isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @Override
    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return isIntegerConstant;
    }

    @Override
    protected boolean isMethod(final int isParameter) {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return true;
    }

    @Override
    public void isMethod(final Canvas isParameter, final MapView isParameter, final boolean isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr), isNameExpr);
        }
    }

    private static MapViewImpl isMethod(final MapView isParameter) {
        return (MapViewImpl) isNameExpr;
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    @Override
    public Drawable isMethod(final Drawable isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final int isParameter) {
        super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(final int isParameter) {
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final Canvas isParameter, final MapViewImpl isParameter, final boolean isParameter) {
        super.isMethod(isNameExpr, (MapView) isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final Canvas isParameter, final Point isParameter, final MapProjectionImpl isParameter, final byte isParameter) {
    // isComment
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
