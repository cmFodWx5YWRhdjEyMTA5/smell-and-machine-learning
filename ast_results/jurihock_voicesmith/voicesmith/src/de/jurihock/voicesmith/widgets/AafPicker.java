// isComment
package de.jurihock.voicesmith.widgets;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import de.jurihock.voicesmith.AAF;
import de.jurihock.voicesmith.R;

public final class isClassOrIsInterface extends RadioGroup implements OnClickListener {

    private AAF isVariable;

    private final RadioButton[] isVariable = new RadioButton[isNameExpr.isMethod()];

    private PropertyChangeListener isVariable;

    public AAF isMethod() {
        return isNameExpr;
    }

    public void isMethod(AAF isParameter) {
        if (this.isFieldAccessExpr == isNameExpr)
            return;
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            boolean isVariable = isNameExpr[isNameExpr].isMethod().isMethod().isMethod(isNameExpr.isMethod());
            isNameExpr[isNameExpr].isMethod(isNameExpr);
        }
    }

    public void isMethod(PropertyChangeListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(Context isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this);
        // isComment
        AAF[] isVariable = isNameExpr.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            RadioButton isVariable = (isNameExpr[isNameExpr] = (RadioButton) this.isMethod(isNameExpr[isNameExpr].isMethod()));
            isNameExpr.isMethod(this);
        }
        // isComment
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr[isIntegerConstant].isMethod(true);
    }

    public void isMethod(View isParameter) {
        Object isVariable = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        for (RadioButton isVariable : isNameExpr) {
            if (!isNameExpr.isMethod().isMethod(isNameExpr)) {
                isNameExpr.isMethod(true);
            }
        }
        // isComment
        if (isNameExpr != null) {
            isNameExpr.isMethod(new PropertyChangeEvent(this, "isStringConstant", null, isNameExpr));
        }
    }
}
