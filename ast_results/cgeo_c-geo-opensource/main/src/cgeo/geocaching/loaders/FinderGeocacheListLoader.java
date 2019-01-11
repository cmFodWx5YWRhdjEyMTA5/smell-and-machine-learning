// isComment
package cgeo.geocaching.loaders;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.capability.ISearchByFinder;
import android.app.Activity;
import android.support.annotation.NonNull;
import io.reactivex.functions.Function;

public class isClassOrIsInterface extends AbstractSearchLoader {

    @NonNull
    private final String isVariable;

    public isConstructor(final Activity isParameter, @NonNull final String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public SearchResult isMethod() {
        return isMethod(isNameExpr.isMethod(), new Function<ISearchByFinder, SearchResult>() {

            @Override
            public SearchResult isMethod(final ISearchByFinder isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}
