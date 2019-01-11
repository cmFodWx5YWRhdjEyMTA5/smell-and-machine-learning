// isComment
package cgeo.geocaching.loaders;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.capability.ISearchByCenter;
import cgeo.geocaching.location.Geopoint;
import android.app.Activity;
import android.support.annotation.NonNull;
import io.reactivex.functions.Function;

public class isClassOrIsInterface extends AbstractSearchLoader {

    @NonNull
    private final Geopoint isVariable;

    public isConstructor(final Activity isParameter, @NonNull final Geopoint isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public SearchResult isMethod() {
        return isMethod(isNameExpr.isMethod(), new Function<ISearchByCenter, SearchResult>() {

            @Override
            public SearchResult isMethod(final ISearchByCenter isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}
