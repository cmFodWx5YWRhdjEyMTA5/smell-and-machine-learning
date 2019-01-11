// isComment
// isComment
package com.aragaer.jtt.android;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.*;
import android.content.*;
import android.os.Handler;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import com.aragaer.jtt.JttService;
import com.aragaer.jtt.mechanics.AndroidTicker;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AndroidTicker.class)
public class isClassOrIsInterface {

    private Context isVariable;

    private Intent isVariable;

    private TimeChangeReceiver isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new TimeChangeReceiver();
        isNameExpr = isMethod(Intent.class);
        isNameExpr = isMethod(Context.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Intent.class));
    }

    @Test
    public void isMethod() {
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        isMethod(isMethod(Handler.class, "isStringConstant"));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    // isComment
    }

    @Test
    public void isMethod() {
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        isMethod(isMethod(Handler.class, "isStringConstant"));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    // isComment
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Intent.class));
    }
}
