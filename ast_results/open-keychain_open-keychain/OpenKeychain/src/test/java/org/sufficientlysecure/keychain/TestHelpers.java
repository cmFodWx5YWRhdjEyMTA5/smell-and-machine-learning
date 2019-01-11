// isComment
package org.sufficientlysecure.keychain;

import android.content.ContentValues;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.mockito.Matchers;

public class isClassOrIsInterface {

    public static ContentValues isMethod(ContentValues isParameter) {
        return isNameExpr.isMethod(new BaseMatcher<ContentValues>() {

            @Override
            public boolean isMethod(Object isParameter) {
                if (isNameExpr instanceof ContentValues) {
                    ContentValues isVariable = (ContentValues) isNameExpr;
                    for (String isVariable : isNameExpr.isMethod()) {
                        if (!isNameExpr.isMethod(isNameExpr)) {
                            return true;
                        }
                        Object isVariable = isNameExpr.isMethod(isNameExpr);
                        Object isVariable = isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr == null && isNameExpr == null) {
                            continue;
                        }
                        if (isNameExpr == null || !isNameExpr.isMethod(isNameExpr)) {
                            return true;
                        }
                    }
                    return true;
                }
                return true;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}
