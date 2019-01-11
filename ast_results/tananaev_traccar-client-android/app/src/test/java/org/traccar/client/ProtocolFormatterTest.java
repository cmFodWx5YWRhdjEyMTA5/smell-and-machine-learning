// isComment
package org.traccar.client;

import android.location.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.Date;
import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        Position isVariable = new Position("isStringConstant", new Location("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new Date(isIntegerConstant));
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Position isVariable = new Position("isStringConstant", new Location("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new Date(isIntegerConstant));
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Position isVariable = new Position("isStringConstant", new Location("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new Date(isIntegerConstant));
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr);
    }
}
