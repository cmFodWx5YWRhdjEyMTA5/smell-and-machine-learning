// isComment
package ru0xdc.rtkgps.settings.widget;

import ru0xdc.rtklib.constants.TroposphereOption;
import android.content.Context;
import android.util.AttributeSet;

public class isClassOrIsInterface extends EnumListPreference<TroposphereOption> {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr);
    }
}
