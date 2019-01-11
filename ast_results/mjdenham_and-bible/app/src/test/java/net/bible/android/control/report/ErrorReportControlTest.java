// isComment
package net.bible.android.control.report;

import net.bible.android.common.resource.ResourceProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(MyRobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Mock
    private EmailerStub isVariable = new EmailerStub();

    private ErrorReportControl isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new ErrorReportControl(isNameExpr, isMethod(ResourceProvider.class));
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(new Exception("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
