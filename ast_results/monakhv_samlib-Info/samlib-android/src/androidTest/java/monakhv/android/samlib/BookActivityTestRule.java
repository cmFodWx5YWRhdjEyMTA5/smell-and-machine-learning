// isComment
package monakhv.android.samlib;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import monakhv.samlib.db.entity.SamLibConfig;

/**
 * isComment
 */
class isClassOrIsInterface extends ActivityTestRule<BooksActivity> {

    isConstructor(Class<BooksActivity> isParameter) {
        super(isNameExpr);
    }

    @Override
    protected Intent isMethod() {
        Intent isVariable = super.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }
}
