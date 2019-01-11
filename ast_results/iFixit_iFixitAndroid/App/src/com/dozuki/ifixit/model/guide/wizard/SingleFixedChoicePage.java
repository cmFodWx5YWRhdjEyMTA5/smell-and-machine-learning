// isComment
package com.dozuki.ifixit.model.guide.wizard;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.dozuki.ifixit.ui.guide.create.wizard.SingleChoiceFragment;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * isComment
 */
public class isClassOrIsInterface extends Page {

    protected ArrayList<String> isVariable = new ArrayList<String>();

    public isConstructor(ModelCallbacks isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Fragment isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    public String isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ArrayList<ReviewItem> isParameter) {
        isNameExpr.isMethod(new ReviewItem(isMethod(), isNameExpr.isMethod(isNameExpr), isMethod()));
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public SingleFixedChoicePage isMethod(String... isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        return this;
    }

    public SingleFixedChoicePage isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return this;
    }
}
