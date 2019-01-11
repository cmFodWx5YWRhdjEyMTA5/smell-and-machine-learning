// isComment
package cgeo.geocaching.connector.trackable;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.connector.UserAction;
import cgeo.geocaching.connector.gc.GCConnector;
import cgeo.geocaching.connector.gc.GCParser;
import cgeo.geocaching.enumerations.Loaders;
import cgeo.geocaching.log.AbstractLoggingActivity;
import cgeo.geocaching.models.Trackable;
import cgeo.geocaching.network.Network;
import cgeo.geocaching.network.Parameters;
import cgeo.geocaching.settings.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class isClassOrIsInterface extends AbstractTrackableConnector {

    /**
     * isComment
     */
    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(@Nullable final String isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod();
    }

    @NonNull
    @Override
    public String isMethod() {
        return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    @NonNull
    public String isMethod(@NonNull final Trackable isParameter) {
        return isMethod() + "isStringConstant" + isNameExpr.isMethod();
    }

    static String isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", new Parameters("isStringConstant", isNameExpr)));
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    @Nullable
    public Trackable isMethod(final String isParameter, final String isParameter, final String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    private static class isClassOrIsInterface {

        private static final TravelBugConnector isVariable = new TravelBugConnector();
    }

    private isConstructor() {
    // isComment
    }

    public static TravelBugConnector isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final String isParameter) {
        // isComment
        final String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isMethod(isNameExpr)) {
            return isNameExpr;
        }
        final String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isMethod(isNameExpr)) {
            return isNameExpr;
        }
        return null;
    }

    @Override
    @NonNull
    public List<UserAction> isMethod(final UserAction.Context isParameter) {
        // isComment
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    @NonNull
    public TrackableBrand isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Override
    public AbstractTrackableLoggingManager isMethod(final AbstractLoggingActivity isParameter) {
        return new TravelBugLoggingManager(isNameExpr);
    }

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }
}
