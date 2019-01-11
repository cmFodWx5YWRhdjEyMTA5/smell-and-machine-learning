// isComment
package cgeo.geocaching.connector.trackable;

import cgeo.geocaching.connector.AbstractConnector;
import cgeo.geocaching.connector.UserAction;
import cgeo.geocaching.log.AbstractLoggingActivity;
import cgeo.geocaching.log.TrackableLog;
import cgeo.geocaching.models.Trackable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import io.reactivex.Observable;

public abstract class isClassOrIsInterface implements TrackableConnector {

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod(@Nullable final String isParameter, @Nullable final TrackableBrand isParameter) {
        if (isNameExpr == null || isNameExpr == isNameExpr.isFieldAccessExpr) {
            return isMethod(isNameExpr);
        }
        return isNameExpr == isMethod() && isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final String isParameter) {
        return null;
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final String isParameter) {
        return null;
    }

    @Override
    @NonNull
    public List<UserAction> isMethod(final UserAction.Context isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public String isMethod(@NonNull final Trackable isParameter) {
        throw new IllegalStateException("isStringConstant");
    }

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant" + isMethod();
    }

    @Override
    @NonNull
    public String isMethod() {
        return isMethod();
    }

    @Override
    @Nullable
    public String isMethod() {
        return null;
    }

    @Override
    @NonNull
    public List<Trackable> isMethod(final String isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public List<Trackable> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    @NonNull
    public Observable<TrackableLog> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public AbstractTrackableLoggingManager isMethod(final AbstractLoggingActivity isParameter) {
        return null;
    }
}
