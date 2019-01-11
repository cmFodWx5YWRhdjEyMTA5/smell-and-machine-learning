// isComment
package protect.gift_card_guard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowWebView;
import org.robolectric.util.ActivityController;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        final Bundle isVariable = new Bundle();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        ActivityController isVariable = isNameExpr.isMethod(ReceiptViewActivity.class).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        Activity isVariable = (Activity) isNameExpr.isMethod();
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView.LoadDataWithBaseURL isVariable = isMethod(isNameExpr).isMethod();
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod("isStringConstant"));
    }
}
