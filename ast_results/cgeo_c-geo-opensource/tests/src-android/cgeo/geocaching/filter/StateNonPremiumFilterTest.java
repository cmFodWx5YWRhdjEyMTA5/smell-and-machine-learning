// isComment
package cgeo.geocaching.filter;

import junit.framework.TestCase;
import cgeo.geocaching.models.Geocache;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends TestCase {

    private StateFilterFactory.StateNonPremiumFilter isVariable;

    private Geocache isVariable;

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new StateFilterFactory.StateNonPremiumFilter();
        isNameExpr = new Geocache();
        isNameExpr.isMethod(true);
    }

    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(new Geocache())).isMethod();
    }
}
