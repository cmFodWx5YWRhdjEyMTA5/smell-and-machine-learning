// isComment
package com.dozuki.ifixit.model.guide.wizard;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.dozuki.ifixit.ui.guide.create.wizard.GuideTitleFragment;
import java.util.ArrayList;

public class isClassOrIsInterface extends EditTextPage {

    public static final String isVariable = "isStringConstant";

    public isConstructor(ModelCallbacks isParameter) {
        super(isNameExpr);
    }

    @Override
    public Fragment isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(ArrayList<ReviewItem> isParameter) {
        isNameExpr.isMethod(new ReviewItem(super.isMethod(), isNameExpr.isMethod(isNameExpr), isMethod(), -isIntegerConstant));
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
