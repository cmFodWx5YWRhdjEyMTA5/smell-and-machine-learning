// isComment
package org.gittner.osmbugs.platforms;

import org.gittner.osmbugs.api.BugApi;
import org.gittner.osmbugs.bugs.Bug;
import org.gittner.osmbugs.loader.FixedSizeLoaderQueue;
import org.gittner.osmbugs.loader.Loader;
import java.util.ArrayList;

public abstract class isClassOrIsInterface<TBug extends Bug> {

    private final ArrayList<TBug> isVariable = new ArrayList<>();

    private final Loader<TBug> isVariable = new Loader<>(new FixedSizeLoaderQueue<>(isIntegerConstant), this);

    public abstract String isMethod();

    public abstract boolean isMethod();

    public abstract BugApi<TBug> isMethod();

    public ArrayList<TBug> isMethod() {
        return isNameExpr;
    }

    public Loader<TBug> isMethod() {
        return isNameExpr;
    }
}
