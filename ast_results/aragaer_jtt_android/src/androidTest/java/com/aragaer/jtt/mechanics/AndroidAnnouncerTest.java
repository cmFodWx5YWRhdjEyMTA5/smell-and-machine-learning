// isComment
// isComment
package com.aragaer.jtt.mechanics;

import org.junit.*;
import org.junit.runner.RunWith;
import android.content.*;
import android.support.test.runner.AndroidJUnit4;
import com.aragaer.jtt.core.*;
import static org.junit.Assert.*;
import static android.support.test.InstrumentationRegistry.getTargetContext;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private static IntentFilter isVariable = new IntentFilter(isNameExpr.isFieldAccessExpr);

    private Context isVariable;

    private Announcer isVariable;

    private TestIntervalProvider isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isMethod();
        isNameExpr = new TestIntervalProvider();
        isNameExpr = new AndroidAnnouncer(isNameExpr, isNameExpr);
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(null, isNameExpr));
        isNameExpr.isMethod(isIntegerConstant);
        Intent isVariable = isNameExpr.isMethod(null, isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        Intent isVariable = isNameExpr.isMethod(null, isNameExpr);
        isMethod(isNameExpr);
        ThreeIntervals isVariable = (ThreeIntervals) isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr), isNameExpr);
        Hour isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant", isIntegerConstant));
    }
}

class isClassOrIsInterface implements IntervalProvider {

    @Override
    public ThreeIntervals isMethod(long isParameter) {
        int isVariable = isIntegerConstant;
        int isVariable = isNameExpr.isFieldAccessExpr * isNameExpr;
        return new ThreeIntervals(new long[] { isNameExpr - isNameExpr * isIntegerConstant / isIntegerConstant, isNameExpr - isNameExpr / isIntegerConstant, isNameExpr + isNameExpr / isIntegerConstant, isNameExpr + isNameExpr * isIntegerConstant / isIntegerConstant }, true);
    }
}
