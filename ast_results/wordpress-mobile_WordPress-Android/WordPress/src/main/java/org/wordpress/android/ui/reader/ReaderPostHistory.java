// isComment
package org.wordpress.android.ui.reader;

import android.os.Bundle;
import org.wordpress.android.ui.reader.models.ReaderBlogIdPostId;
import org.wordpress.android.util.StringUtils;
import java.util.ArrayList;
import java.util.Stack;

/*isComment*/
class isClassOrIsInterface extends Stack<ReaderBlogIdPostId> {

    private static final String isVariable = "isStringConstant";

    void isMethod(Bundle isParameter) {
        isMethod();
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                this.isMethod(isNameExpr);
            }
        }
    }

    void isMethod(Bundle isParameter) {
        if (isNameExpr != null && !isMethod()) {
            isNameExpr.isMethod(isNameExpr, this.isMethod());
        }
    }

    private ArrayList<String> isMethod() {
        ArrayList<String> isVariable = new ArrayList<>();
        for (ReaderBlogIdPostId isVariable : this) {
            isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    private void isMethod(ArrayList<String> isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod()) {
            return;
        }
        for (String isVariable : isNameExpr) {
            String[] isVariable = isNameExpr.isMethod("isStringConstant");
            long isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
            long isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
            this.isMethod(new ReaderBlogIdPostId(isNameExpr, isNameExpr));
        }
    }
}
