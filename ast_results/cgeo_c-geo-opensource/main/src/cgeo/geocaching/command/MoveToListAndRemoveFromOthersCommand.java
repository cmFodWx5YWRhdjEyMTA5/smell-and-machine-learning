// isComment
package cgeo.geocaching.command;

import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.storage.DataStore;
import android.app.Activity;
import android.support.annotation.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class isClassOrIsInterface extends MoveToListCommand {

    private final Map<String, Set<Integer>> isVariable = new HashMap<>();

    protected isConstructor(@NonNull final Activity isParameter, @NonNull final Geocache isParameter) {
        this(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    protected isConstructor(@NonNull final Activity isParameter, @NonNull final Collection<Geocache> isParameter) {
        super(isNameExpr, isNameExpr, -isIntegerConstant);
    }

    @Override
    protected void isMethod() {
        for (final Geocache isVariable : isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(), new HashSet<>(isNameExpr.isMethod()));
        }
        isNameExpr.isMethod(isMethod(), isNameExpr.isMethod(isMethod()));
    }

    @Override
    protected void isMethod() {
        for (final Geocache isVariable : isMethod()) {
            final Set<Integer> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr != null) {
                isNameExpr.isMethod(isMethod(), isNameExpr);
            }
        }
    }
}
