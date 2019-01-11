// isComment
package net.cyclestreets;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@Ignore
@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<CycleStreets> isVariable = new ActivityTestRule<>(CycleStreets.class);

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isStringConstant);
    }
}
