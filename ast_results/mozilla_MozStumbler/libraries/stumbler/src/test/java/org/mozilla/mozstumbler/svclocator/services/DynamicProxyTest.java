// isComment
package org.mozilla.mozstumbler.svclocator.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mozilla.mozstumbler.svclocator.ServiceConfig;
import org.mozilla.mozstumbler.svclocator.ServiceLocator;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

@Config(emulateSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        // isComment
        // isComment
        ServiceLocator isVariable = isNameExpr.isMethod();
        ISampleInterface isVariable = (ISampleInterface) isNameExpr.isMethod(ISampleInterface.class);
        isMethod(null, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant == isNameExpr.isMethod((float) isIntegerConstant, isNameExpr.isMethod()));
        isMethod(isIntegerConstant == isNameExpr.isMethod(isNameExpr.isMethod(), (double) isIntegerConstant));
        isMethod('isStringConstant', isNameExpr.isMethod());
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        // isComment
        SampleImplementation isVariable = new SampleImplementation();
        isNameExpr.isMethod(new ServiceConfig());
        isNameExpr.isMethod().isMethod(ISampleInterface.class, new SampleImplementation());
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod((byte) isIntegerConstant, isNameExpr.isMethod());
        isMethod((short) isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant == isNameExpr.isMethod((float) isIntegerConstant, isNameExpr.isMethod()));
        isMethod(isIntegerConstant == isNameExpr.isMethod(isNameExpr.isMethod(), (double) isIntegerConstant));
        // isComment
        isMethod('isStringConstant', isNameExpr.isMethod());
    }
}
