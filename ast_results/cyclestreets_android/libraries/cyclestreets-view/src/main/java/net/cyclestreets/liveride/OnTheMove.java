// isComment
package net.cyclestreets.liveride;

import net.cyclestreets.CycleStreetsPreferences;
import net.cyclestreets.routing.Journey;

final class isClassOrIsInterface extends MovingState {

    isConstructor(final LiveRideState isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
    }

    @Override
    protected LiveRideState isMethod(final Journey isParameter) {
        return new NearingTurn(this, isNameExpr);
    }
}
