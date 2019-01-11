// isComment
package ch.hgdev.toposuite.help;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import ch.hgdev.toposuite.App;
import ch.hgdev.toposuite.R;
import ch.hgdev.toposuite.TopoSuiteActivity;
import ch.hgdev.toposuite.utils.Logger;

public class isClassOrIsInterface extends TopoSuiteActivity {

    private ViewGroup isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = (ViewGroup) this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        this.isFieldAccessExpr.isMethod();
        this.isFieldAccessExpr.isMethod(this.isMethod());
    }

    @Override
    protected String isMethod() {
        return this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private WebView isMethod() {
        WebView isVariable = new WebView(this);
        isNameExpr.isMethod("isStringConstant" + this.isMethod());
        return isNameExpr;
    }

    /**
     * isComment
     */
    private String isMethod() {
        InputStream isVariable = null;
        try {
            String isVariable = "isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant";
            isNameExpr = this.isMethod().isMethod("isStringConstant" + isNameExpr);
            return isNameExpr;
        } catch (IOException isParameter) {
            return "isStringConstant";
        } finally {
            if (isNameExpr != null) {
                try {
                    isNameExpr.isMethod();
                } catch (IOException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
                }
            }
        }
    }
}
