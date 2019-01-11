// isComment
package com.github.pockethub.android.tests.gist;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.github.pockethub.android.R.id;
import com.github.pockethub.android.tests.ActivityTest;
import com.github.pockethub.android.ui.gist.CreateGistActivity;
import static android.content.Intent.EXTRA_TEXT;

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
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        EditText isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    /**
     * isComment
     */
    public void isMethod() throws Throwable {
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        EditText isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod());
    }
}
