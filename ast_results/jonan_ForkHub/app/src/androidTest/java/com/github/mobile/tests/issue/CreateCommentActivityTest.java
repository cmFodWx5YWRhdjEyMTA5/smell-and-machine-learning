// isComment
package com.github.mobile.tests.issue;

import static android.view.KeyEvent.KEYCODE_DEL;
import android.view.View;
import android.widget.EditText;
import com.github.mobile.R;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.issue.CreateCommentActivity;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<CreateCommentActivity> {

    /**
     * isComment
     */
    public isConstructor() {
        super(CreateCommentActivity.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isMethod(isNameExpr.isMethod(new RepositoryId("isStringConstant", "isStringConstant"), isIntegerConstant, new User().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() throws Throwable {
        View isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        final EditText isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }
}
