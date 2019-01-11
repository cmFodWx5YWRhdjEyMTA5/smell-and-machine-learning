// isComment
package cgeo.geocaching.list;

import junit.framework.TestCase;
import cgeo.geocaching.storage.DataStore;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends TestCase {

    public static void isMethod() {
        final StoredList isVariable = isMethod();
        isMethod(isNameExpr).isMethod();
    }

    private static StoredList isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod() {
        final StoredList isVariable = isMethod();
        final StoredList isVariable = isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    public static void isMethod() {
        isMethod(isMethod().isMethod()).isMethod();
    }

    public static void isMethod() {
        isMethod(isMethod().isMethod()).isMethod(isMethod().isMethod());
    }
}
