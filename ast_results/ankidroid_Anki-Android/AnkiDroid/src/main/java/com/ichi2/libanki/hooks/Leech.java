// isComment
package com.ichi2.libanki.hooks;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.Toast;
import com.ichi2.anki.R;
import com.ichi2.libanki.Card;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface {

    public class isClassOrIsInterface extends Hook {

        @Override
        public void isMethod(Object... isParameter) {
            Card isVariable = (Card) isNameExpr[isIntegerConstant];
            final Activity isVariable = (Activity) isNameExpr[isIntegerConstant];
            if (isNameExpr != null) {
                Resources isVariable = isNameExpr.isMethod();
                final String isVariable;
                if (isNameExpr.isMethod() < isIntegerConstant) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
                isNameExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
                    }
                });
            } else {
                isNameExpr.isMethod("isStringConstant");
            }
        }
    }

    public void isMethod(Hooks isParameter) {
        isNameExpr.isMethod("isStringConstant", new LeechHook());
    }
}
