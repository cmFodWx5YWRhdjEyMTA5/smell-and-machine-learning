// isComment
package org.lumicall.android.preferences;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;
import org.lumicall.android.R;
import org.lumicall.android.db.LumicallDataSource;
import org.lumicall.android.db.ENUMSuffix;
import org.sipdroid.sipua.ui.Receiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class isClassOrIsInterface extends DBObjectSettings<ENUMSuffix> {

    @Override
    protected void isMethod(LumicallDataSource isParameter, ENUMSuffix isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected ENUMSuffix isMethod() {
        return new ENUMSuffix();
    }

    @Override
    protected ENUMSuffix isMethod(LumicallDataSource isParameter, long isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod() {
    // isComment
    // isComment
    // isComment
    }
}
