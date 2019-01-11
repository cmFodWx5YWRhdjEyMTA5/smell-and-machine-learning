// isComment
package cgeo.geocaching.loaders;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.gc.GCParser;
import cgeo.geocaching.settings.Settings;
import android.app.Activity;

public class isClassOrIsInterface extends AbstractSearchLoader {

    private final String isVariable;

    public isConstructor(final Activity isParameter, final String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public SearchResult isMethod() {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        return new SearchResult();
    }
}
