// isComment
package cgeo.geocaching.connector.trackable;

import cgeo.geocaching.connector.UserAction;
import cgeo.geocaching.models.Trackable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class isClassOrIsInterface extends AbstractTrackableConnector {

    @Override
    public boolean isMethod(@Nullable final String isParameter) {
        return true;
    }

    @NonNull
    @Override
    public String isMethod() {
        throw new IllegalStateException("isStringConstant");
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    @Nullable
    public Trackable isMethod(final String isParameter, final String isParameter, final String isParameter) {
        return null;
    }

    @Override
    @NonNull
    public TrackableBrand isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    @NonNull
    public List<UserAction> isMethod(final UserAction.Context isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public String isMethod() {
        throw new IllegalStateException("isStringConstant");
    }

    @Override
    @NonNull
    public String isMethod() {
        throw new IllegalStateException("isStringConstant");
    }
}
