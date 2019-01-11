// isComment
package org.totschnig.myexpenses.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnitParamsRunner.class)
public class isClassOrIsInterface {

    @Test
    @Parameters({ "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
