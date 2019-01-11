// isComment
package com.github.mobile.tests.commit;

import static android.view.KeyEvent.KEYCODE_DEL;
import android.view.View;
import android.widget.EditText;
import com.github.mobile.R;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.commit.CreateCommentActivity;
import org.eclipse.egit.github.core.Repository;
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
        Repository isVariable = new Repository();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
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
