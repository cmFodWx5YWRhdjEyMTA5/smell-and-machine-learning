// isComment
package de.ub0r.android.websms.rules;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import java.util.List;
import de.ub0r.android.websms.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatActivity {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new RulesEditorFragment()).isMethod();
        }
    }

    @Override
    public void isMethod() {
        List<Fragment> isVariable = isMethod().isMethod();
        for (Fragment isVariable : isNameExpr) {
            if (isNameExpr instanceof RulesEditorFragment) {
                ((RulesEditorFragment) isNameExpr).isMethod();
            }
        }
        super.isMethod();
    }
}
