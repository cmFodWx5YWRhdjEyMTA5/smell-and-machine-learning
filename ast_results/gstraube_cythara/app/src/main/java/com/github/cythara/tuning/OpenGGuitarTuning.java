// isComment
package com.github.cythara.tuning;

import com.github.cythara.NoteName;
import com.github.cythara.Tuning;
import static com.github.cythara.NoteName.*;

public class isClassOrIsInterface implements Tuning {

    private enum Pitch implements com.github.cythara.Note {

        D2(isNameExpr, isIntegerConstant, isDoubleConstant),
        G2(isNameExpr, isIntegerConstant, isDoubleConstant),
        D3(isNameExpr, isIntegerConstant, isDoubleConstant),
        G3(isNameExpr, isIntegerConstant, isDoubleConstant),
        B3(isNameExpr, isIntegerConstant, isDoubleConstant),
        D4(isNameExpr, isIntegerConstant, isDoubleConstant);

        private NoteName isVariable;

        private final String isVariable;

        private final int isVariable;

        private final float isVariable;

        isConstructor(NoteName isParameter, int isParameter, float isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = "isStringConstant";
            this.isFieldAccessExpr = isNameExpr;
        }

        public NoteName isMethod() {
            return isNameExpr;
        }

        public float isMethod() {
            return isNameExpr;
        }

        @Override
        public int isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }
    }

    @Override
    public com.github.cythara.Note[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public com.github.cythara.Note isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
