// isComment
package cgeo.geocaching.command;

import cgeo.geocaching.R;
import cgeo.geocaching.SearchResult;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.enumerations.LoadFlags;
import cgeo.geocaching.list.StoredList;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.storage.DataStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Activity;
import java.util.Set;

public abstract class isClassOrIsInterface extends AbstractCommand {

    private final int isVariable;

    private Set<String> isVariable;

    private String isVariable;

    protected isConstructor(@NonNull final Activity isParameter, final int isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        final SearchResult isVariable = isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        // isComment
        final StoredList isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    @SuppressWarnings("isStringConstant")
    protected void isMethod() {
        // isComment
        final int isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        new StoredList(isNameExpr, isNameExpr, isIntegerConstant);
        final Set<Geocache> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    @Nullable
    protected String isMethod() {
        return isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
