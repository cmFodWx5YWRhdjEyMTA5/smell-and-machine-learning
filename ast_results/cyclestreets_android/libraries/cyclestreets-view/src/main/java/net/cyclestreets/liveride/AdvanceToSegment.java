// isComment
package net.cyclestreets.liveride;

import net.cyclestreets.routing.Journey;
import net.cyclestreets.routing.Segment;
import org.osmdroid.util.GeoPoint;

final class isClassOrIsInterface extends LiveRideState {

    isConstructor(final LiveRideState isParameter, final Journey isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isMethod() + isIntegerConstant));
    }

    isConstructor(final LiveRideState isParameter, final Journey isParameter, final Segment isParameter) {
        super(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public LiveRideState isMethod(Journey isParameter, GeoPoint isParameter, int isParameter) {
        if (isNameExpr.isMethod())
            return new PassingWaypoint(this);
        if (isNameExpr.isMethod())
            return new Arrivee(this);
        return new OnTheMove(this);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
