// isComment
package com.mde.potdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.mde.potdroid.fragments.BoardFragment;
import com.mde.potdroid.helpers.SettingsWrapper;
import com.mde.potdroid.helpers.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends Activity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        Intent isVariable;
        SettingsWrapper isVariable = new SettingsWrapper(this);
        isNameExpr.isMethod(isMethod());
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = new Intent(isNameExpr.this, BoardActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
            isNameExpr = new Intent(isNameExpr.this, BookmarkActivity.class);
        } else {
            isNameExpr = new Intent(isNameExpr.this, ForumActivity.class);
        }
        isMethod(isNameExpr);
        isMethod();
    }
}
