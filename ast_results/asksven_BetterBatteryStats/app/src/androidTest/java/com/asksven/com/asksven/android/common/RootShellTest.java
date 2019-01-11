// isComment
package com.asksven.android.common;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.util.Log;
import android.util.SparseArray;
import com.asksven.android.common.CommonLogSettings;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    private RootShell isVariable = null;

    static final String isVariable = "isStringConstant";

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        List<String> isVariable = new ArrayList<String>();
        String isVariable = "isStringConstant";
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        // isComment
        if (isNameExpr.isMethod()) {
            isMethod(!isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr));
            isMethod(isNameExpr.isMethod() > isIntegerConstant);
        } else {
            isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr));
        }
    }

    @Test
    public void isMethod() throws Exception {
        List<String> isVariable = new ArrayList<String>();
        String isVariable = "isStringConstant";
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr != null);
    }
}
