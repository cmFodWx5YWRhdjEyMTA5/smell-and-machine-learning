// isComment
package cgeo.geocaching.connector.gc;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.CGeoTestCase;
import cgeo.geocaching.SearchResult;
import cgeo.geocaching.enumerations.LoadFlags;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.storage.DataStore;

public class isClassOrIsInterface extends CGeoTestCase {

    private static Geocache isMethod(final String isParameter) {
        final SearchResult isVariable = isNameExpr.isMethod(isNameExpr, null, true, null);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod() {
        // isComment
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }
}
