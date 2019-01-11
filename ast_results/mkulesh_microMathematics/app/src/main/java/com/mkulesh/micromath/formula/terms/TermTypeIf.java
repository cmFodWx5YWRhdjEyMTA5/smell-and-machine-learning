// isComment
package com.mkulesh.micromath.formula.terms;

import android.widget.LinearLayout;
import com.mkulesh.micromath.formula.FormulaTerm;
import com.mkulesh.micromath.formula.PaletteButton;
import com.mkulesh.micromath.formula.TermField;
import com.mkulesh.micromath.widgets.CustomEditText;

public interface isClassOrIsInterface {

    enum GroupType {

        OPERATORS(isIntegerConstant, true),
        COMPARATORS(isIntegerConstant, true),
        ARRAY_FUNCTIONS(isIntegerConstant, true),
        COMMON_FUNCTIONS(isIntegerConstant, true),
        TRIGONOMETRIC_FUNCTIONS(isIntegerConstant, true),
        LOG_FUNCTIONS(isIntegerConstant, true),
        NUMBER_FUNCTIONS(isIntegerConstant, true),
        USER_FUNCTIONS(isIntegerConstant, true),
        INTERVALS(isIntegerConstant, true),
        SERIES_INTEGRALS(isIntegerConstant, true);

        private final int isVariable;

        private final boolean isVariable;

        isConstructor(int isParameter, boolean isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        /**
         * isComment
         */
        public int isMethod() {
            return isNameExpr;
        }

        /**
         * isComment
         */
        public boolean isMethod() {
            return isNameExpr;
        }
    }

    /*isComment*/
    GroupType isMethod();

    /*isComment*/
    String isMethod();

    /*isComment*/
    int isMethod();

    /*isComment*/
    int isMethod();

    /*isComment*/
    int isMethod();

    /*isComment*/
    int isMethod();

    /*isComment*/
    boolean isMethod(CustomEditText isParameter);

    /*isComment*/
    PaletteButton.Category isMethod();

    /*isComment*/
    FormulaTerm isMethod(TermField isParameter, LinearLayout isParameter, String isParameter, int isParameter) throws Exception;
}
