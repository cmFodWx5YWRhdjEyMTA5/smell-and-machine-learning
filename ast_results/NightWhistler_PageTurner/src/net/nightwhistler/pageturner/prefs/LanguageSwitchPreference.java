// isComment
package net.nightwhistler.pageturner.prefs;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.Toast;
import net.nightwhistler.pageturner.R;

public class isClassOrIsInterface extends ListPreference {

    private Context isVariable;

    private String isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        }
        this.isFieldAccessExpr = isNameExpr;
    }
}
