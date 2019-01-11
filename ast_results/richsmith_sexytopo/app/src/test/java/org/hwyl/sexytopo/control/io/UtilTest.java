// isComment
package org.hwyl.sexytopo.control.io;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Util.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(Util.class);
        isNameExpr.isMethod(true).isMethod(Util.class, "isStringConstant", null, isNameExpr + "isStringConstant");
        String isVariable = isNameExpr.isMethod(null, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(Util.class);
        isNameExpr.isMethod(true).isMethod(Util.class, "isStringConstant", null, isNameExpr + "isStringConstant");
        isNameExpr.isMethod(true).isMethod(Util.class, "isStringConstant", null, isNameExpr + "isStringConstant");
        String isVariable = isNameExpr.isMethod(null, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(Util.class);
        isNameExpr.isMethod(true).isMethod(Util.class, "isStringConstant", null, "isStringConstant");
        String isVariable = isNameExpr.isMethod(null, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }
}
