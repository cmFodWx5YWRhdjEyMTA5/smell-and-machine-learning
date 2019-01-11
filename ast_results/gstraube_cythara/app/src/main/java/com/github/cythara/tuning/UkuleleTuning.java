// isComment
package com.github.cythara.tuning;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.Tuning;
import static com.github.cythara.NoteName.*;

public class isClassOrIsInterface implements Tuning {

    private enum Pitch implements Note {

        G4(isNameExpr, isIntegerConstant, isDoubleConstant), C4(isNameExpr, isIntegerConstant, isDoubleConstant), E4(isNameExpr, isIntegerConstant, isDoubleConstant), A4(isNameExpr, isIntegerConstant, isDoubleConstant);

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
    public Note[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Note isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
