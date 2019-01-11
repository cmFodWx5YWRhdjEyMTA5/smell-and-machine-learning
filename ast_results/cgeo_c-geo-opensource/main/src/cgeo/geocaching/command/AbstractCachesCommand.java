// isComment
package cgeo.geocaching.command;

import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.app.Activity;
import java.util.Collection;

public abstract class isClassOrIsInterface extends AbstractCommand {

    @NonNull
    private final Collection<Geocache> isVariable;

    public isConstructor(@NonNull final Activity isParameter, @NonNull final Collection<Geocache> isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected boolean isMethod() {
        return !isNameExpr.isMethod();
    }

    @NonNull
    protected Collection<Geocache> isMethod() {
        return isNameExpr;
    }
}
