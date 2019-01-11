// isComment
package com.vrem.wifianalyzer.wifi.channelavailable;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.MainContextHelper;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.RobolectricUtil;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.band.WiFiChannelCountry;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import java.util.Collections;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private Settings isVariable;

    private MainActivity isVariable;

    private WiFiChannelCountry isVariable;

    private Locale isVariable;

    private ChannelAvailableAdapter isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr = new ChannelAvailableAdapter(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @After
    public void isMethod() {
        isMethod(isNameExpr, isMethod()).isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        Resources isVariable = isNameExpr.isMethod();
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        String isVariable = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), "isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), "isStringConstant");
        ViewGroup isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        View isVariable = isNameExpr.isMethod(isIntegerConstant, null, isNameExpr);
        // isComment
        isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isNameExpr + "isStringConstant", isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isNameExpr, isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isNameExpr + "isStringConstant", isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isNameExpr, isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
    }
}
