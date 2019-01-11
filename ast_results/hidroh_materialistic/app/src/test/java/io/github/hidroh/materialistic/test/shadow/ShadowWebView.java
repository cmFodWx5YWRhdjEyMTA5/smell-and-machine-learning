// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;

@Implements(value = WebView.class, inheritImplementationMethods = true)
public class isClassOrIsInterface extends org.robolectric.shadows.ShadowWebView {

    public static final String isVariable = "isStringConstant";

    @RealObject
    WebView isVariable;

    private DownloadListener isVariable;

    private WebView.FindListener isVariable;

    public static String isVariable;

    private int isVariable;

    private int isVariable;

    private int isVariable;

    private int isVariable;

    private int isVariable;

    private int isVariable = -isIntegerConstant;

    @Implementation
    public void isMethod(DownloadListener isParameter) {
        isNameExpr = isNameExpr;
    }

    @Implementation
    public void isMethod(WebView.FindListener isParameter) {
        isNameExpr = isNameExpr;
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Implementation
    public void isMethod(String isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isIntegerConstant, isNameExpr, true);
        }
    }

    @Implementation
    public void isMethod(boolean isParameter) {
        if (isNameExpr) {
            isNameExpr++;
        } else {
            isNameExpr--;
        }
    }

    @Implementation
    public int isMethod() {
        return isNameExpr;
    }

    @Implementation
    public void isMethod() {
        isNameExpr--;
    }

    @Implementation
    public void isMethod() {
        isNameExpr++;
    }

    @Implementation
    public void isMethod() {
        isNameExpr++;
    }

    @Implementation
    public void isMethod() {
        isNameExpr--;
    }

    @Implementation
    public boolean isMethod(boolean isParameter) {
        if (isNameExpr) {
            isNameExpr = isIntegerConstant;
        } else {
            isNameExpr--;
        }
        return true;
    }

    @Implementation
    public boolean isMethod(boolean isParameter) {
        isNameExpr++;
        return true;
    }

    @Implementation
    public void isMethod() {
        isNameExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public DownloadListener isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr;
    }

    public static String isMethod() {
        String isVariable = isNameExpr;
        isNameExpr = null;
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr;
    }
}
