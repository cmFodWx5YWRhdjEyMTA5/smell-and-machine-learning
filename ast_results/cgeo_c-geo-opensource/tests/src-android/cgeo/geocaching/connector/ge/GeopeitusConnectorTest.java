// isComment
package cgeo.geocaching.connector.ge;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.ConnectorFactoryTest;
import cgeo.geocaching.connector.IConnector;
import java.util.Set;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    private static IConnector isMethod() {
        final IConnector isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        return isNameExpr;
    }

    public static void isMethod() {
        final IConnector isVariable = isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
    }

    public static void isMethod() {
        final Set<String> isVariable = isNameExpr.isMethod();
        isMethod(isMethod().isMethod(isNameExpr)).isMethod("isStringConstant", "isStringConstant");
    }
}
