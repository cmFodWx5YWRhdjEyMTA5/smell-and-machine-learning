// isComment
package com.github.pockethub.android.tests.issue;

import android.view.View;
import android.widget.EditText;
import com.meisolsson.githubsdk.model.Repository;
import com.github.pockethub.android.R.id;
import com.github.pockethub.android.tests.ActivityTest;
import com.github.pockethub.android.ui.issue.EditIssueActivity;
import com.github.pockethub.android.util.InfoUtils;
import static android.view.KeyEvent.KEYCODE_DEL;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<EditIssueActivity> {

    /**
     * isComment
     */
    public isConstructor() {
        super(EditIssueActivity.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        Repository isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr));
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
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }
}
