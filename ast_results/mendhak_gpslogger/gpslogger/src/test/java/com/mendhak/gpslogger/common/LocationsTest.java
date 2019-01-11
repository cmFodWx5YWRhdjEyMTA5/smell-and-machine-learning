// isComment
package com.mendhak.gpslogger.common;

import android.location.Location;
import android.test.suitebuilder.annotation.SmallTest;
import com.mendhak.gpslogger.loggers.MockLocations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod();
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        Location isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(isNameExpr.isMethod()));
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod(isIntegerConstant).isMethod();
        Location isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(isDoubleConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod();
        Location isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod();
        Location isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod();
        Location isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isIntegerConstant);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isIntegerConstant);
    }
}
