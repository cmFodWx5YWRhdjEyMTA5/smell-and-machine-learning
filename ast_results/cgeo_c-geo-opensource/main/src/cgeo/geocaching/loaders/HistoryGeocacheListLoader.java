// isComment
package cgeo.geocaching.loaders;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.settings.Settings;
import cgeo.geocaching.storage.DataStore;
import android.app.Activity;

public class isClassOrIsInterface extends AbstractSearchLoader {

    private final Geopoint isVariable;

    public isConstructor(final Activity isParameter, final Geopoint isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public SearchResult isMethod() {
        return isNameExpr.isMethod(isNameExpr != null ? isNameExpr.isMethod() : isNameExpr.isFieldAccessExpr);
    }
}
