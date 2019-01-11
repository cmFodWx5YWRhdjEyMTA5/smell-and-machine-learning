// isComment
package com.github.mobile.ui.gist;

import static com.github.mobile.Intents.EXTRA_GIST;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.github.mobile.Intents.Builder;
import com.github.mobile.R;
import com.github.mobile.core.gist.CreateCommentTask;
import org.eclipse.egit.github.core.Comment;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public class isClassOrIsInterface extends com.github.mobile.ui.comment.CreateCommentActivity {

    /**
     * isComment
     */
    public static Intent isMethod(Gist isParameter) {
        Builder isVariable = new Builder("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    private Gist isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr);
        ActionBar isVariable = isMethod();
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr.isMethod());
        User isVariable = isNameExpr.isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    protected void isMethod(String isParameter) {
        new CreateCommentTask(this, isNameExpr.isMethod(), isNameExpr) {

            @Override
            protected void isMethod(Comment isParameter) throws Exception {
                super.isMethod(isNameExpr);
                isMethod(isNameExpr);
            }
        }.isMethod();
    }
}
