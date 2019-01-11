// isComment
package org.sufficientlysecure.materialchips.simple;

import java.util.List;
import android.content.Context;
import android.util.AttributeSet;
import org.sufficientlysecure.materialchips.ChipsInput;

public class isClassOrIsInterface extends ChipsInput<SimpleChip> {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    private void isMethod() {
        SimpleChipsAdapter isVariable = new SimpleChipsAdapter(isMethod(), this);
        isMethod(isNameExpr);
    }

    public void isMethod(List<SimpleChip> isParameter) {
        SimpleChipDropdownAdapter isVariable = new SimpleChipDropdownAdapter(isMethod(), isNameExpr);
        isMethod(isNameExpr);
    }
}
