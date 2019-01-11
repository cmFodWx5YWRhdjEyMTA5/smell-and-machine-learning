// isComment
package com.github.mobile.tests.issue;

import static android.view.KeyEvent.KEYCODE_DEL;
import android.view.View;
import android.widget.EditText;
import com.github.mobile.R;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.issue.EditIssueActivity;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;

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
        Repository isVariable = new Repository();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
