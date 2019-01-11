// isComment
package cgeo.geocaching.loaders;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.capability.ISearchByNextPage;
import android.app.Activity;
import io.reactivex.functions.Function;

public class isClassOrIsInterface extends AbstractSearchLoader {

    private final SearchResult isVariable;

    public isConstructor(final Activity isParameter, final SearchResult isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public SearchResult isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(), new Function<ISearchByNextPage, SearchResult>() {

            @Override
            public SearchResult isMethod(final ISearchByNextPage isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}
