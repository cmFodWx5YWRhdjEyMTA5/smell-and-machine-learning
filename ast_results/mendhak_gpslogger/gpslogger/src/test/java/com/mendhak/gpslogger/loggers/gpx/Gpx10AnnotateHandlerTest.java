// isComment
package com.mendhak.gpslogger.loggers.gpx;

import android.location.Location;
import android.test.suitebuilder.annotation.SmallTest;
import com.mendhak.gpslogger.BuildConfig;
import com.mendhak.gpslogger.common.Strings;
import com.mendhak.gpslogger.loggers.MockLocations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Gpx10AnnotateHandler isVariable = new Gpx10AnnotateHandler(null, null, null, null, isIntegerConstant);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        String isVariable = "isStringConstant";
        isMethod("isStringConstant", isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Gpx10AnnotateHandler isVariable = new Gpx10AnnotateHandler(null, null, null, null, isIntegerConstant);
        Location isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant).isMethod(isDoubleConstant).isMethod();
        String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        String isVariable = "isStringConstant";
        isMethod("isStringConstant", isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Gpx10WriteHandler isVariable = new Gpx10WriteHandler(null, null, null, true);
        Gpx10AnnotateHandler isVariable = new Gpx10AnnotateHandler(null, null, null, null, isNameExpr.isMethod(isNameExpr.isMethod(new Date(isStringConstant))).isMethod());
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(new Date(isStringConstant)));
        String isVariable = "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
        isMethod("isStringConstant", isNameExpr, isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
    }
}
