// isComment
package com.github.cythara.tuning;

import com.github.cythara.NoteName;
import com.github.cythara.Tuning;
import static com.github.cythara.NoteName.A;
import static com.github.cythara.NoteName.C;
import static com.github.cythara.NoteName.D;
import static com.github.cythara.NoteName.G;

public class isClassOrIsInterface implements Tuning {

    @Override
    public com.github.cythara.Note[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public com.github.cythara.Note isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    private enum Pitch implements com.github.cythara.Note {

        C2(isNameExpr, isIntegerConstant, isDoubleConstant), G2(isNameExpr, isIntegerConstant, isDoubleConstant), D3(isNameExpr, isIntegerConstant, isDoubleConstant), A3(isNameExpr, isIntegerConstant, isDoubleConstant);

        private final String isVariable;

        private final int isVariable;

        private final float isVariable;

        private NoteName isVariable;

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
}
