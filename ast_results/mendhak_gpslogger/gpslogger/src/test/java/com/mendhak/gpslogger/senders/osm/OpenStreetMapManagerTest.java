// isComment
package com.mendhak.gpslogger.senders.osm;

import android.test.suitebuilder.annotation.SmallTest;
import com.mendhak.gpslogger.common.PreferenceHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.File;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        OpenStreetMapManager isVariable = new OpenStreetMapManager(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        OpenStreetMapManager isVariable = new OpenStreetMapManager(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod("isStringConstant", isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        PreferenceHelper isVariable = isMethod(PreferenceHelper.class);
        OpenStreetMapManager isVariable = new OpenStreetMapManager(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(new File("isStringConstant"), "isStringConstant"), isMethod(true));
        isMethod("isStringConstant", isNameExpr.isMethod(new File("isStringConstant"), "isStringConstant"), isMethod(true));
    }
}
