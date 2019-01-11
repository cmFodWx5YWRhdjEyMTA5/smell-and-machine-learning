// isComment
package me.ccrama.redditslide.Activities;

import android.os.Bundle;
import me.ccrama.redditslide.R;
import me.ccrama.redditslide.Reddit;
import me.ccrama.redditslide.SwipeLayout.app.SwipeBackActivityBase;
import me.ccrama.redditslide.util.LogUtil;

public class isClassOrIsInterface extends BaseActivity implements SwipeBackActivityBase {

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        } else {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        }
    }
}
