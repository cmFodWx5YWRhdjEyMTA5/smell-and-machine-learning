// isComment
package cgeo.geocaching.connector.gc;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.enumerations.StatusCode;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.utils.TextUtils;
import android.test.suitebuilder.annotation.Suppress;
import junit.framework.TestCase;
import org.apache.commons.lang3.StringUtils;

public class isClassOrIsInterface extends TestCase {

    private final GCLogin isVariable = isNameExpr.isMethod();

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    private static String isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod())).isMethod();
    }

    public static void isMethod() {
        isMethod(new Geopoint(isMethod())).isMethod(Geopoint.class);
    }

    public static void isMethod() {
        final String isVariable = isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr));
    }

    // isComment
    @Suppress
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod();
    }
}
