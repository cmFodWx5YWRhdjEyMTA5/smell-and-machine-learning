// isComment
package fr.neamar.kiss.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.widget.Toast;
import java.util.HashSet;
import fr.neamar.kiss.KissApplication;
import fr.neamar.kiss.R;

public class isClassOrIsInterface extends DialogPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(DialogInterface isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isMethod()).isMethod().isMethod("isStringConstant", new HashSet<String>()).isMethod();
            isNameExpr.isMethod(isMethod()).isMethod().isMethod().isMethod();
            isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        }
    }
}
