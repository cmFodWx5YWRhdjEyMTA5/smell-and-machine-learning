// isComment
package net.bible.service.css;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(MyRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private CssControl isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new CssControl();
    }

    @After
    public void isMethod() throws Exception {
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant), isMethod("isStringConstant"));
    }
}
