// isComment
package com.mendhak.gpslogger.loggers;

import android.test.suitebuilder.annotation.SmallTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.File;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(null), isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(new File("isStringConstant")), isMethod());
    }
}
