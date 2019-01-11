// isComment
// isComment
package com.aragaer.jtt.resources;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.format.DateFormat;
import android.util.Log;
import com.aragaer.jtt.R;
import com.aragaer.jtt.Settings;
import org.junit.*;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ Log.class, Configuration.class, PreferenceManager.class, SharedPreferences.class, Resources.class, Context.class, DateFormat.class })
public class isClassOrIsInterface {

    static Context isVariable = isMethod(Context.class);

    SharedPreferences isVariable = isMethod(SharedPreferences.class);

    Resources isVariable = isMethod(Resources.class);

    Configuration isVariable = isMethod(Configuration.class);

    @Before
    public void isMethod() throws Exception {
        isMethod(Log.class);
        isMethod(PreferenceManager.class);
        isMethod(Resources.class);
        isMethod(DateFormat.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new String[] { "isStringConstant" });
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new String[] { "isStringConstant" });
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new String[] { "isStringConstant" });
    }

    @Test
    public void isMethod() {
        RuntimeResources isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        RuntimeResources isVariable = isNameExpr.isMethod(isNameExpr);
        RuntimeResources isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        RuntimeResources isVariable = isNameExpr.isMethod(isNameExpr);
        StringResources isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
    }
}
