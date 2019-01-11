// isComment
package com.mkulesh.micromath.formula.terms;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.mkulesh.micromath.formula.CalculatableIf;
import com.mkulesh.micromath.formula.CalculaterTask;
import com.mkulesh.micromath.formula.CalculaterTask.CancelException;
import com.mkulesh.micromath.formula.FormulaTerm;
import com.mkulesh.micromath.formula.Palette;
import com.mkulesh.micromath.formula.PaletteButton;
import com.mkulesh.micromath.formula.TermField;
import com.mkulesh.micromath.math.CalculatedValue;
import com.mkulesh.micromath.plus.R;
import com.mkulesh.micromath.widgets.CustomEditText;
import com.mkulesh.micromath.widgets.CustomTextView;
import com.mkulesh.micromath.widgets.ScaledDimensions;
import org.apache.commons.math3.util.CombinatoricsUtils;
import java.util.Locale;
import javax.measure.unit.Unit;

public class isClassOrIsInterface extends FunctionBase {

    public TermTypeIf.GroupType isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public enum FunctionType implements TermTypeIf {

        POWER(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        SQRT_LAYOUT(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        NTHRT_LAYOUT(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        FACTORIAL(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        ABS_LAYOUT(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        CONJUGATE_LAYOUT(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        RE(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        IM(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        IF(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        SQRT(isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
        ABS(isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

        private final int isVariable;

        private final int isVariable;

        private final int isVariable;

        private final int isVariable;

        private final int isVariable;

        private final String isVariable;

        isConstructor(int isParameter, int isParameter, int isParameter) {
            this(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        isConstructor(int isParameter, int isParameter, int isParameter, int isParameter, int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            this.isFieldAccessExpr = isNameExpr;
        }

        public GroupType isMethod() {
            return isNameExpr.isFieldAccessExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public String isMethod() {
            return isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public int isMethod() {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }

        public boolean isMethod(CustomEditText isParameter) {
            return true;
        }

        public PaletteButton.Category isMethod() {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }

        public FormulaTerm isMethod(TermField isParameter, LinearLayout isParameter, String isParameter, int isParameter) throws Exception {
            return new CommonFunctions(this, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    // isComment
    private final CalculatedValue isVariable = new CalculatedValue(), isVariable = new CalculatedValue();

    private isConstructor(FunctionType isParameter, TermField isParameter, LinearLayout isParameter, String isParameter, int isParameter) throws Exception {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isMethod(isMethod().isMethod(), isNameExpr, isMethod().isMethod(), isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super();
    }

    /**
     * isComment
     */
    public FunctionType isMethod() {
        return (FunctionType) isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    protected String isMethod() {
        switch(isMethod()) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return "isStringConstant";
            default:
                return isNameExpr.isMethod();
        }
    }

    @Override
    public CalculatedValue.ValueType isMethod(CalculaterTask isParameter, CalculatedValue isParameter) throws CancelException {
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
            isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr[isNameExpr]);
            }
            final CalculatedValue isVariable = isNameExpr[isIntegerConstant];
            switch(isMethod()) {
                case isNameExpr:
                    if (isNameExpr.isMethod(isIntegerConstant).isMethod()) {
                        final Unit isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod();
                        isNameExpr.isMethod(isDoubleConstant, isNameExpr);
                        final Unit isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr[isIntegerConstant]);
                        if (isNameExpr != null) {
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr, /*isComment*/
                            true);
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr.isMethod(), /*isComment*/
                            true);
                            return isNameExpr.isMethod();
                        } else {
                            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        }
                    }
                    return isNameExpr.isMethod(isNameExpr, isNameExpr[isIntegerConstant]);
                case isNameExpr:
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr.isMethod());
                case isNameExpr:
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod());
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod() : isDoubleConstant);
                case isNameExpr:
                    if (isNameExpr.isMethod()) {
                        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    return isNameExpr.isMethod((isNameExpr.isMethod() > isIntegerConstant) ? isNameExpr[isIntegerConstant] : isNameExpr[isIntegerConstant]);
                case isNameExpr:
                    if (isNameExpr.isMethod()) {
                        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    try {
                        return isNameExpr.isMethod(isNameExpr.isMethod((int) isNameExpr.isMethod()));
                    } catch (Exception isParameter) {
                        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
            }
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public CalculatableIf.DifferentiableType isMethod(String isParameter) {
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        CalculatableIf.DifferentiableType isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            final int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr).isMethod());
            isNameExpr = isNameExpr.isFieldAccessExpr.isMethod()[isNameExpr];
        }
        CalculatableIf.DifferentiableType isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        switch(isMethod()) {
            // isComment
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                isNameExpr = isNameExpr;
                break;
            // isComment
            case isNameExpr:
                // isComment
                isNameExpr = isNameExpr;
                if (isNameExpr != isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    final CalculatableIf.DifferentiableType isVariable = isNameExpr.isFieldAccessExpr.isMethod()[isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr).isMethod()];
                    isNameExpr = (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) ? isNameExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                }
                break;
            // isComment
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                isNameExpr = (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
        }
        // isComment
        ErrorCode isVariable = isNameExpr.isFieldAccessExpr;
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    public CalculatedValue.ValueType isMethod(String isParameter, CalculaterTask isParameter, CalculatedValue isParameter) throws CancelException {
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
            isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr[isNameExpr]);
            }
            final CalculatedValue isVariable = isNameExpr[isIntegerConstant];
            isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr, isNameExpr, isNameExpr);
            switch(isMethod()) {
                // isComment
                case isNameExpr:
                    {
                        final CalculatedValue isVariable = isNameExpr[isIntegerConstant];
                        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr, isNameExpr, isNameExpr);
                        if (isNameExpr.isMethod() && isNameExpr.isMethod()) {
                            // isComment
                            return isNameExpr.isMethod(isDoubleConstant);
                        } else if (!isNameExpr.isMethod() && isNameExpr.isMethod()) {
                            // isComment
                            CalculatedValue isVariable = new CalculatedValue();
                            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            return isNameExpr.isMethod(isNameExpr, isNameExpr);
                        } else if (isNameExpr.isMethod() && !isNameExpr.isMethod()) {
                            // isComment
                            CalculatedValue isVariable = new CalculatedValue();
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            return isNameExpr.isMethod(isNameExpr, isNameExpr);
                        } else {
                            // isComment
                            CalculatedValue isVariable = new CalculatedValue(), isVariable = new CalculatedValue();
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            isNameExpr.isMethod(isNameExpr, isNameExpr);
                            return isNameExpr.isMethod(isNameExpr, isNameExpr);
                        }
                    }
                case isNameExpr:
                case // isComment
                isNameExpr:
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isDoubleConstant);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                    return isNameExpr.isMethod(isNameExpr, isNameExpr);
                case // isComment
                isNameExpr:
                    {
                        final int isVariable = isNameExpr.isMethod();
                        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr, isNameExpr, isNameExpr);
                        isNameExpr.isMethod(isNameExpr - isIntegerConstant);
                        isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr);
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                        isNameExpr.isMethod((double) isNameExpr);
                        return isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                case isNameExpr:
                case // isComment
                isNameExpr:
                    if (isNameExpr.isMethod()) {
                        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    return isNameExpr.isMethod((isNameExpr.isMethod() >= isIntegerConstant ? isDoubleConstant : -isDoubleConstant) * isNameExpr.isMethod());
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod());
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod() : isDoubleConstant);
                // isComment
                case isNameExpr:
                case isNameExpr:
                case isNameExpr:
                    CalculatableIf.DifferentiableType isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                        final int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr).isMethod());
                        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod()[isNameExpr];
                    }
                    if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                        return isNameExpr.isMethod(isDoubleConstant);
                    } else {
                        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
            }
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected CustomTextView isMethod(CustomTextView isParameter) {
        final Resources isVariable = isMethod().isMethod();
        if (isNameExpr.isMethod() != null) {
            String isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod().isMethod(), this);
                switch(isMethod()) {
                    case isNameExpr:
                        isNameExpr.isMethod("isStringConstant");
                        break;
                    case isNameExpr:
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    case isNameExpr:
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod().isMethod(), this);
                        isNameExpr.isMethod("isStringConstant");
                        break;
                    default:
                        isNameExpr.isMethod(isMethod());
                        break;
                }
                isNameExpr = isNameExpr;
            } else if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                CustomTextView.SymbolType isVariable = (isNameExpr == isNameExpr.isFieldAccessExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr, isMethod().isMethod().isMethod(), this);
                // isComment
                isNameExpr.isMethod("isStringConstant");
            } else if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                CustomTextView.SymbolType isVariable = (isNameExpr == isNameExpr.isFieldAccessExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr, isMethod().isMethod().isMethod(), this);
                // isComment
                isNameExpr.isMethod("isStringConstant");
            }
        }
        return isNameExpr;
    }

    @Override
    protected CustomEditText isMethod(CustomEditText isParameter, LinearLayout isParameter) {
        if (isNameExpr.isMethod() != null) {
            final String isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                final TermField isVariable = isMethod(isMethod(), isNameExpr, -isIntegerConstant, isNameExpr, this, isIntegerConstant);
                isNameExpr.isFieldAccessExpr = (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() == isIntegerConstant) {
                    isNameExpr.isMethod().isMethod(true);
                }
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                final TermField isVariable = isMethod(isMethod(), isNameExpr, -isIntegerConstant, isNameExpr, this, isIntegerConstant);
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                final TermField isVariable = isMethod(isMethod(), isNameExpr, -isIntegerConstant, isNameExpr, this, isIntegerConstant);
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                final TermField isVariable = isMethod(isMethod(), isNameExpr, isNameExpr, this, true);
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))) {
                final TermField isVariable = isMethod(isMethod(), isNameExpr, -isIntegerConstant, isNameExpr, this, isIntegerConstant);
                isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        final int isVariable = isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isIntegerConstant);
            } else if (isMethod().isMethod()) {
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isNameExpr, isIntegerConstant);
            }
        }
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isIntegerConstant);
            }
        }
    }

    @Override
    public TermField isMethod() {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isIntegerConstant);
        }
        return super.isMethod();
    }

    /**
     * isComment
     */
    @Override
    protected boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() <= isIntegerConstant || !isMethod();
    }
}
