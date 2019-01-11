// isComment
package com.mkulesh.micromath.math;

import android.support.annotation.NonNull;
import com.mkulesh.micromath.formula.CalculaterTask;
import com.mkulesh.micromath.formula.CalculaterTask.CancelException;
import com.mkulesh.micromath.formula.TermField;
import com.mkulesh.micromath.formula.TermParser;
import com.mkulesh.micromath.properties.DocumentProperties;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.util.FastMath;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.measure.DecimalMeasure;
import javax.measure.Measure;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

public class isClassOrIsInterface {

    public enum ErrorType {

        TERM_NOT_READY,
        INVALID_ARGUMENT,
        NOT_A_NUMBER,
        NOT_A_REAL,
        PASSED_COMPLEX,
        INCOMPATIBLE_UNIT
    }

    public enum ValueType {

        INVALID, REAL, COMPLEX
    }

    public enum PartType {

        RE, IM
    }

    public static final CalculatedValue isVariable = new CalculatedValue(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isDoubleConstant);

    public static final CalculatedValue isVariable = new CalculatedValue(isNameExpr.isFieldAccessExpr, isDoubleConstant, isDoubleConstant);

    public static final CalculatedValue isVariable = new CalculatedValue(isNameExpr.isFieldAccessExpr, -isDoubleConstant, isDoubleConstant);

    private ValueType isVariable = isNameExpr.isFieldAccessExpr;

    private double isVariable = isNameExpr.isFieldAccessExpr;

    private double isVariable = isDoubleConstant;

    private Unit isVariable = null;

    public isConstructor() {
    // isComment
    }

    public isConstructor(ValueType isParameter, double isParameter, double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(double isParameter, Unit isParameter) {
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isDoubleConstant;
        isNameExpr = isNameExpr;
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }

    public ValueType isMethod(CalculatedValue isParameter, Unit isParameter) {
        this.isMethod(isNameExpr);
        isNameExpr = isNameExpr;
        return isNameExpr;
    }

    public Unit isMethod() {
        return isNameExpr;
    }

    public void isMethod(Unit isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(@NonNull Unit isParameter, @NonNull Unit isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            try {
                final Measure isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                if (isMethod()) {
                    final Measure isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                }
                isNameExpr = (isNameExpr.isMethod() == null || isNameExpr.isMethod().isMethod()) ? null : isNameExpr;
            } catch (Exception isParameter) {
                isMethod(isNameExpr.isFieldAccessExpr);
            }
        } else {
            isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    public void isMethod(final Unit isParameter, boolean isParameter) {
        final Unit isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        Unit isVariable = isNameExpr;
        if (isNameExpr == null && isNameExpr) {
            ArrayList<Unit> isVariable = new ArrayList<>();
            for (Unit isVariable : isNameExpr.isMethod().isMethod()) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
            int isVariable = isNameExpr.isFieldAccessExpr;
            for (Unit isVariable : isNameExpr) {
                if (isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod())) {
                    isNameExpr = isNameExpr;
                    break;
                }
                if (isNameExpr == null || isNameExpr.isMethod().isMethod() < isNameExpr) {
                    isNameExpr = isNameExpr;
                    isNameExpr = isNameExpr.isMethod().isMethod();
                }
            }
            // isComment
            if (isNameExpr != null) {
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                }
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) && isNameExpr >= isIntegerConstant) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                }
            }
        }
        isMethod(isNameExpr, isNameExpr == null ? isNameExpr.isMethod() : isNameExpr);
    }

    public ValueType isMethod(ErrorType isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isDoubleConstant;
        isNameExpr = null;
        return isNameExpr;
    }

    public ValueType isMethod(double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isDoubleConstant;
        isNameExpr = isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }

    public ValueType isMethod(double isParameter, Unit isParameter) {
        this.isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        return isNameExpr;
    }

    public ValueType isMethod(double isParameter, double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = (isNameExpr != isDoubleConstant) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }

    public ValueType isMethod(Complex isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = (isNameExpr != isDoubleConstant) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }

    /**
     * isComment
     */
    public ValueType isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod(isNameExpr);
            case isNameExpr:
                return isMethod(isNameExpr) || isMethod(isNameExpr);
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr == isDoubleConstant;
            case isNameExpr:
                return isNameExpr == isDoubleConstant && isNameExpr == isDoubleConstant;
            default:
                return true;
        }
    }

    public static boolean isMethod(double isParameter) {
        return isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod(isNameExpr);
    }

    public double isMethod() {
        return isNameExpr;
    }

    public double isMethod() {
        return isNameExpr;
    }

    public Complex isMethod() {
        return new Complex(isNameExpr, isNameExpr);
    }

    public int isMethod() {
        return (int) isNameExpr;
    }

    public double isMethod(PartType isParameter) {
        return isNameExpr == isNameExpr.isFieldAccessExpr ? isNameExpr : isNameExpr;
    }

    private boolean isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        return isNameExpr.isFieldAccessExpr != null || isNameExpr.isFieldAccessExpr != null;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr.isMethod() + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + (isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod());
    }

    public String isMethod(DocumentProperties isParameter) {
        String isVariable;
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr:
                if (isNameExpr.isMethod(isNameExpr)) {
                    return isNameExpr.isFieldAccessExpr;
                }
                isNameExpr = isMethod(isNameExpr, isNameExpr, true);
                if (isNameExpr != null) {
                    isNameExpr += "isStringConstant" + isNameExpr.isMethod();
                }
                return isNameExpr;
            case isNameExpr:
                if (isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod(isNameExpr)) {
                    return isNameExpr.isFieldAccessExpr;
                }
                isNameExpr = isMethod(isNameExpr, isNameExpr, true) + isMethod(isNameExpr, isNameExpr, true) + "isStringConstant";
                if (isNameExpr != null) {
                    isNameExpr += "isStringConstant" + isNameExpr.isMethod();
                }
                return isNameExpr;
        }
        return "isStringConstant";
    }

    private String isMethod(double isParameter, DocumentProperties isParameter, boolean isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            if (isNameExpr < isIntegerConstant) {
                return "isStringConstant" + isNameExpr.isFieldAccessExpr;
            } else {
                return isNameExpr ? "isStringConstant" + isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
            }
        } else {
            final double isVariable = isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr >= isIntegerConstant && isNameExpr) {
                return "isStringConstant" + isNameExpr.isMethod(isNameExpr);
            } else {
                return isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    /**
     * isComment
     */
    public void isMethod(CalculaterTask isParameter, TermField isParameter) throws CancelException {
        isNameExpr.isMethod(isNameExpr, this);
        if (!isMethod()) {
            isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    public ValueType isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isMethod(isNameExpr, isNameExpr)) {
            if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr == null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                return isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else {
            isNameExpr = null;
        }
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr);
        }
    }

    public ValueType isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isMethod(isNameExpr, isNameExpr)) {
            if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr == null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                return isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else {
            isNameExpr = null;
        }
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr);
        }
    }

    public ValueType isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isMethod(isNameExpr, isNameExpr)) {
            if (isNameExpr.isFieldAccessExpr == null) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr == null) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else {
                isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
                if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr = null;
                }
            }
        } else {
            isNameExpr = null;
        }
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isFieldAccessExpr * isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr * isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr * isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr * isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr * isNameExpr.isFieldAccessExpr);
        }
    }

    public ValueType isMethod(double isParameter) {
        isNameExpr *= isNameExpr;
        isNameExpr *= isNameExpr;
        return isNameExpr;
    }

    public ValueType isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isMethod(isNameExpr, isNameExpr)) {
            if (isNameExpr.isFieldAccessExpr == null) {
                isNameExpr = isNameExpr.isFieldAccessExpr.isMethod();
            } else if (isNameExpr.isFieldAccessExpr == null) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
            } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = null;
            } else {
                isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        } else {
            isNameExpr = null;
        }
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            final double isVariable = isNameExpr.isFieldAccessExpr;
            final double isVariable = isNameExpr.isFieldAccessExpr;
            if (isNameExpr.isMethod(isNameExpr) < isNameExpr.isMethod(isNameExpr)) {
                final double isVariable = isNameExpr / isNameExpr;
                final double isVariable = isNameExpr * isNameExpr + isNameExpr;
                return isMethod((isNameExpr.isFieldAccessExpr * isNameExpr + isNameExpr.isFieldAccessExpr) / isNameExpr, (isNameExpr.isFieldAccessExpr * isNameExpr - isNameExpr.isFieldAccessExpr) / isNameExpr);
            } else {
                final double isVariable = isNameExpr / isNameExpr;
                final double isVariable = isNameExpr * isNameExpr + isNameExpr;
                return isMethod((isNameExpr.isFieldAccessExpr * isNameExpr + isNameExpr.isFieldAccessExpr) / isNameExpr, (isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr * isNameExpr) / isNameExpr);
            }
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr / isNameExpr.isFieldAccessExpr);
        }
    }

    public Unit isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr != null || isNameExpr.isMethod()) {
            return null;
        }
        final int isVariable = (int) isNameExpr.isFieldAccessExpr;
        if ((double) isNameExpr != isNameExpr.isFieldAccessExpr) {
            return null;
        }
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public ValueType isMethod(CalculatedValue isParameter, CalculatedValue isParameter) {
        if (isMethod(isNameExpr, isNameExpr)) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
            if (isNameExpr == null) {
                return isMethod(isNameExpr.isFieldAccessExpr);
            }
        } else {
            isNameExpr = null;
        }
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr;
        return isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod() || (isNameExpr.isMethod() && isNameExpr.isFieldAccessExpr < isIntegerConstant)) {
            if (isNameExpr.isFieldAccessExpr != null) {
                isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr = null;
            }
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant);
            } else {
                isNameExpr = null;
            }
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod());
        } else {
            return isMethod(isDoubleConstant / isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod() || isNameExpr.isFieldAccessExpr <= isDoubleConstant) {
            return isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod() || isNameExpr.isFieldAccessExpr <= isDoubleConstant) {
            return isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod(isDoubleConstant)));
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        } else {
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isMethod() * isNameExpr.isFieldAccessExpr, isNameExpr.isMethod() * isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isMethod() * isNameExpr.isFieldAccessExpr);
        }
    }

    public ValueType isMethod(CalculatedValue isParameter, int isParameter) {
        try {
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            } else {
                isNameExpr = null;
            }
            final List<Complex> isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            for (Complex isVariable : isNameExpr) {
                if (isNameExpr.isMethod(isNameExpr.isMethod()) < isDoubleConstant) {
                    return isMethod(isNameExpr.isMethod());
                }
            }
            if (!isNameExpr.isMethod()) {
                return isMethod(isNameExpr.isMethod(isIntegerConstant));
            }
        } catch (Exception isParameter) {
        // isComment
        }
        return isMethod(isNameExpr.isFieldAccessExpr);
    }

    public ValueType isMethod(CalculatedValue isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr.isFieldAccessExpr, -isDoubleConstant * isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    /**
     * isComment
     */
    public static double isMethod(double isParameter, int isParameter) {
        if (isNameExpr == isIntegerConstant) {
            return isIntegerConstant;
        }
        try {
            return new BigDecimal(isNameExpr).isMethod(new MathContext(isNameExpr, isNameExpr.isFieldAccessExpr)).isMethod();
        } catch (ArithmeticException isParameter) {
        // isComment
        }
        final double isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        final double isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr < isIntegerConstant ? -isNameExpr : isNameExpr));
        final int isVariable = isNameExpr - (int) isNameExpr;
        double isVariable = isDoubleConstant;
        double isVariable = isDoubleConstant;
        if (isNameExpr > isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isDoubleConstant, isNameExpr);
            isNameExpr = isNameExpr.isMethod(isDoubleConstant, (double) isNameExpr - isNameExpr);
        } else {
            isNameExpr = isNameExpr.isMethod(isDoubleConstant, (double) isNameExpr);
        }
        double isVariable = isNameExpr * isNameExpr;
        isNameExpr *= isNameExpr;
        final long isVariable = isNameExpr.isMethod(isNameExpr);
        double isVariable = ((double) isNameExpr) / isNameExpr;
        isNameExpr /= isNameExpr;
        return isNameExpr;
    }
}
