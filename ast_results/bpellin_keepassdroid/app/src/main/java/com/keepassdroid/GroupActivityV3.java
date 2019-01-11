// isComment
package com.keepassdroid;

import android.content.Intent;
import com.keepassdroid.database.PwGroupIdV3;

public class isClassOrIsInterface extends GroupActivity {

    @Override
    protected PwGroupIdV3 isMethod(Intent isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr, -isIntegerConstant);
        if (isNameExpr == -isIntegerConstant) {
            return null;
        }
        return new PwGroupIdV3(isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = !isNameExpr && !isNameExpr;
    }
}
