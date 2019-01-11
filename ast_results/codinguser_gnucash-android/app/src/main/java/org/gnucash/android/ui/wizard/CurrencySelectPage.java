// isComment
package org.gnucash.android.ui.wizard;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.tech.freak.wizardpager.model.ModelCallbacks;
import com.tech.freak.wizardpager.model.Page;
import com.tech.freak.wizardpager.model.ReviewItem;
import java.util.ArrayList;

/**
 * isComment
 */
public class isClassOrIsInterface extends Page {

    public static final String isVariable = "isStringConstant";

    protected isConstructor(ModelCallbacks isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Fragment isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(ArrayList<ReviewItem> isParameter) {
        isNameExpr.isMethod(new ReviewItem(isMethod(), isNameExpr.isMethod(isNameExpr), isMethod()));
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
