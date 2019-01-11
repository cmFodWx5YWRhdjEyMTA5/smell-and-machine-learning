// isComment
package com.github.mobile.tests.gist;

import static android.content.Intent.EXTRA_TEXT;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.github.mobile.R;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.gist.CreateGistActivity;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<CreateGistActivity> {

    /**
     * isComment
     */
    public isConstructor() {
        super(CreateGistActivity.class);
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(new Intent().isMethod(isNameExpr, "isStringConstant"));
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        EditText isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    /**
     * isComment
     */
    public void isMethod() throws Throwable {
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        EditText isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod());
    }
}
