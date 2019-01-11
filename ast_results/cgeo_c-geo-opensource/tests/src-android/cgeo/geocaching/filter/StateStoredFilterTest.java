// isComment
package cgeo.geocaching.filter;

import junit.framework.TestCase;
import cgeo.geocaching.models.Geocache;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends TestCase {

    private StateFilterFactory.StateStoredFilter isVariable;

    private StateFilterFactory.StateNotStoredFilter isVariable;

    private Geocache isVariable;

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new StateFilterFactory.StateStoredFilter();
        isNameExpr = new StateFilterFactory.StateNotStoredFilter();
        isNameExpr = new Geocache();
    }

    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
    }
}
