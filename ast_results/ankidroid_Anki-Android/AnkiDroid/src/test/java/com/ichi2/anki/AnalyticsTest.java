// isComment
package com.ichi2.anki;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.brsanthu.googleanalytics.GoogleAnalytics;
import com.brsanthu.googleanalytics.GoogleAnalyticsBuilder;
import com.brsanthu.googleanalytics.request.ExceptionHit;
import com.ichi2.anki.analytics.UsageAnalytics;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@PowerMockIgnore("isStringConstant")
@PrepareForTest({ PreferenceManager.class, GoogleAnalytics.class })
@RunWith(PowerMockRunner.class)
public class isClassOrIsInterface {

    @Mock
    private Context isVariable;

    @Mock
    private Resources isVariable;

    @Mock
    private SharedPreferences isVariable;

    @Mock
    private SharedPreferences.Editor isVariable;

    // isComment
    private GoogleAnalytics isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(PreferenceManager.class);
        isNameExpr.isMethod(GoogleAnalytics.class);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true)).isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(new SpyGoogleAnalyticsBuilder());
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    private class isClassOrIsInterface extends GoogleAnalyticsBuilder {

        public GoogleAnalytics isMethod() {
            GoogleAnalytics isVariable = super.isMethod();
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        Exception isVariable = isNameExpr.isMethod(Exception.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(null);
        Throwable isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        Exception isVariable = isNameExpr.isMethod(Exception.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(null);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Exception isVariable = isNameExpr.isMethod(Exception.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        Exception isVariable = isNameExpr.isMethod(Exception.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        // isComment
        ExceptionHit isVariable = isNameExpr.isMethod(new ExceptionHit());
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
        try {
            isNameExpr.isMethod(isNameExpr, true);
        } catch (Exception isParameter) {
        // isComment
        }
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
    }
}
