// isComment
package cgeo.geocaching.connector.trackable;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.connector.UserAction;
import cgeo.geocaching.models.Trackable;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class isClassOrIsInterface {

    private static UnknownTrackableConnector isMethod() {
        return new UnknownTrackableConnector();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod("isStringConstant")).isMethod();
    }

    @Test(expected = IllegalStateException.class)
    public void isMethod() throws Exception {
        isMethod().isMethod(new Trackable());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod("isStringConstant", null, null)).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod("isStringConstant")).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod(new UserAction.Context(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr))).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod().isMethod()).isMethod();
    }
}
