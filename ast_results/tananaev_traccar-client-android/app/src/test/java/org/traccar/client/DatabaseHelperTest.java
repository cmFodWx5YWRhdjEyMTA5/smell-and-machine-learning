// isComment
package org.traccar.client;

import android.location.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import java.util.Date;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        DatabaseHelper isVariable = new DatabaseHelper(isNameExpr.isFieldAccessExpr);
        Position isVariable = new Position("isStringConstant", new Location("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new Date(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
    }
}
