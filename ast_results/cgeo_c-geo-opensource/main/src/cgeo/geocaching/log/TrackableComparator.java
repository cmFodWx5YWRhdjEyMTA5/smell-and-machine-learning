// isComment
package cgeo.geocaching.log;

import cgeo.geocaching.utils.TextUtils;
import java.util.Comparator;

public enum TrackableComparator {

    TRACKABLE_COMPARATOR_NAME(new Comparator<TrackableLog>() {

        @Override
        public int isMethod(final TrackableLog isParameter, final TrackableLog isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
    }), TRACKABLE_COMPARATOR_TRACKCODE(new Comparator<TrackableLog>() {

        @Override
        public int isMethod(final TrackableLog isParameter, final TrackableLog isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
    });

    private final Comparator<TrackableLog> isVariable;

    isConstructor(final Comparator<TrackableLog> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Comparator<TrackableLog> isMethod() {
        return isNameExpr;
    }

    public static TrackableComparator isMethod(final String isParameter) {
        for (final TrackableComparator isVariable : isMethod()) {
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr.isFieldAccessExpr;
    }
}
