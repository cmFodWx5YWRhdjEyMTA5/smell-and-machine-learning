// isComment
// isComment
package com.aragaer.jtt;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.powermock.api.mockito.PowerMockito.*;
import java.util.LinkedList;
import android.app.Service;
import android.content.*;
import android.preference.PreferenceManager;
import android.os.Handler;
import android.util.Log;
import org.junit.*;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import com.aragaer.jtt.mechanics.AndroidTicker;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ AndroidTicker.class, Log.class, Service.class, PreferenceManager.class })
public class isClassOrIsInterface {

    private static Context isVariable = isMethod(Context.class);

    private static SharedPreferences isVariable = isMethod(SharedPreferences.class);

    private TestJttService isVariable;

    @Before
    public void isMethod() throws Exception {
        isMethod(Log.class);
        isMethod(PreferenceManager.class);
        isMethod(isNameExpr.isMethod(isMethod(Context.class))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod())).isMethod("isStringConstant");
        isMethod(isMethod(Handler.class, "isStringConstant"));
        isMethod(isMethod(Service.class, "isStringConstant"));
        isNameExpr = new TestJttService();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod(null, isIntegerConstant, isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
    }
}

class isClassOrIsInterface extends JttService {

    LinkedList<BroadcastReceiver> isVariable = new LinkedList<BroadcastReceiver>();

    LinkedList<IntentFilter> isVariable = new LinkedList<IntentFilter>();

    @Override
    public Intent isMethod(BroadcastReceiver isParameter, IntentFilter isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return null;
    }

    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }
}
