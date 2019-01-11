// isComment
package protect.rentalcalc;

import android.content.res.Resources;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Resources isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        for (ParkingType isVariable : isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            ParkingType isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isMethod(isNameExpr == isNameExpr);
        }
        // isComment
        ParkingType isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr == isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr == isNameExpr.isFieldAccessExpr);
    }
}
