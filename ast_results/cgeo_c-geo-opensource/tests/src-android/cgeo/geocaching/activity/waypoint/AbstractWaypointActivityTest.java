// isComment
package cgeo.geocaching.activity.waypoint;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.EditWaypointActivity_;
import cgeo.geocaching.activity.AbstractEspressoTest;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.enumerations.LoadFlags;
import cgeo.geocaching.enumerations.LoadFlags.SaveFlag;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.storage.DataStore;
import java.util.Collections;

public abstract class isClassOrIsInterface extends AbstractEspressoTest<EditWaypointActivity_> {

    private Geocache isVariable;

    public isConstructor() {
        super(EditWaypointActivity_.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Override
    protected void isMethod() throws Exception {
        isMethod();
        super.isMethod();
    }

    protected final Geocache isMethod() {
        return isNameExpr;
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr)).isMethod();
    }

    protected Geocache isMethod() {
        final Geocache isVariable = new Geocache();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }
}
