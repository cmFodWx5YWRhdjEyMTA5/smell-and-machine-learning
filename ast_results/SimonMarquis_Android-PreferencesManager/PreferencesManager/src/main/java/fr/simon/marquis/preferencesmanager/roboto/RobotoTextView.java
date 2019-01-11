// isComment
package fr.simon.marquis.preferencesmanager.roboto;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import fr.simon.marquis.preferencesmanager.R;

public class isClassOrIsInterface extends TextView {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr, null, isIntegerConstant);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isIntegerConstant);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod(Context isParameter, AttributeSet isParameter, int isParameter) {
        if (isMethod()) {
            return;
        }
        int isVariable = isIntegerConstant;
        if (isNameExpr != null) {
            TypedArray isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isIntegerConstant);
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
                isNameExpr.isMethod();
                Typeface isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                isMethod(isNameExpr);
            }
        }
    }
}
