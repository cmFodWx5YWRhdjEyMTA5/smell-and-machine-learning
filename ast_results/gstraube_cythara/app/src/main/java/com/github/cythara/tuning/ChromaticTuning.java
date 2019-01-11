// isComment
package com.github.cythara.tuning;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.Tuning;
import static com.github.cythara.NoteName.*;

public class isClassOrIsInterface implements Tuning {

    private enum Pitch implements Note {

        C_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        C_MINUS_1_SHARP(isNameExpr, -isIntegerConstant, "isStringConstant", isDoubleConstant),
        D_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        D_MINUS_1_SHARP(isNameExpr, -isIntegerConstant, "isStringConstant", isDoubleConstant),
        E_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        F_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        F_MINUS_1_SHARP(isNameExpr, -isIntegerConstant, "isStringConstant", isDoubleConstant),
        G_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        G_MINUS_1_SHARP(isNameExpr, -isIntegerConstant, "isStringConstant", isDoubleConstant),
        A_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        A_MINUS_1_SHARP(isNameExpr, -isIntegerConstant, "isStringConstant", isDoubleConstant),
        B_MINUS_1(isNameExpr, -isIntegerConstant, isDoubleConstant),
        C0(isNameExpr, isIntegerConstant, isDoubleConstant),
        C0_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D0(isNameExpr, isIntegerConstant, isDoubleConstant),
        D0_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E0(isNameExpr, isIntegerConstant, isDoubleConstant),
        F0(isNameExpr, isIntegerConstant, isDoubleConstant),
        F0_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G0(isNameExpr, isIntegerConstant, isDoubleConstant),
        G0_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A0(isNameExpr, isIntegerConstant, isDoubleConstant),
        A0_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B0(isNameExpr, isIntegerConstant, isDoubleConstant),
        C1(isNameExpr, isIntegerConstant, isDoubleConstant),
        C1_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D1(isNameExpr, isIntegerConstant, isDoubleConstant),
        D1_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E1(isNameExpr, isIntegerConstant, isDoubleConstant),
        F1(isNameExpr, isIntegerConstant, isDoubleConstant),
        F1_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G1(isNameExpr, isIntegerConstant, isDoubleConstant),
        G1_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A1(isNameExpr, isIntegerConstant, isDoubleConstant),
        A1_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B1(isNameExpr, isIntegerConstant, isDoubleConstant),
        C2(isNameExpr, isIntegerConstant, isDoubleConstant),
        C2_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D2(isNameExpr, isIntegerConstant, isDoubleConstant),
        D2_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E2(isNameExpr, isIntegerConstant, isDoubleConstant),
        F2(isNameExpr, isIntegerConstant, isDoubleConstant),
        F2_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G2(isNameExpr, isIntegerConstant, isDoubleConstant),
        G2_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A2(isNameExpr, isIntegerConstant, isDoubleConstant),
        A2_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B2(isNameExpr, isIntegerConstant, isDoubleConstant),
        C3(isNameExpr, isIntegerConstant, isDoubleConstant),
        C3_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D3(isNameExpr, isIntegerConstant, isDoubleConstant),
        D3_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E3(isNameExpr, isIntegerConstant, isDoubleConstant),
        F3(isNameExpr, isIntegerConstant, isDoubleConstant),
        F3_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G3(isNameExpr, isIntegerConstant, isDoubleConstant),
        G3_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A3(isNameExpr, isIntegerConstant, isDoubleConstant),
        A3_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B3(isNameExpr, isIntegerConstant, isDoubleConstant),
        C4(isNameExpr, isIntegerConstant, isDoubleConstant),
        C4_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D4(isNameExpr, isIntegerConstant, isDoubleConstant),
        D4_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E4(isNameExpr, isIntegerConstant, isDoubleConstant),
        F4(isNameExpr, isIntegerConstant, isDoubleConstant),
        F4_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G4(isNameExpr, isIntegerConstant, isDoubleConstant),
        G4_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A4(isNameExpr, isIntegerConstant, isDoubleConstant),
        A4_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B4(isNameExpr, isIntegerConstant, isDoubleConstant),
        C5(isNameExpr, isIntegerConstant, isDoubleConstant),
        C5_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D5(isNameExpr, isIntegerConstant, isDoubleConstant),
        D5_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E5(isNameExpr, isIntegerConstant, isDoubleConstant),
        F5(isNameExpr, isIntegerConstant, isDoubleConstant),
        F5_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G5(isNameExpr, isIntegerConstant, isDoubleConstant),
        G5_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A5(isNameExpr, isIntegerConstant, isDoubleConstant),
        A5_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B5(isNameExpr, isIntegerConstant, isDoubleConstant),
        C6(isNameExpr, isIntegerConstant, isDoubleConstant),
        C6_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D6(isNameExpr, isIntegerConstant, isDoubleConstant),
        D6_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E6(isNameExpr, isIntegerConstant, isDoubleConstant),
        F6(isNameExpr, isIntegerConstant, isDoubleConstant),
        F6_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G6(isNameExpr, isIntegerConstant, isDoubleConstant),
        G6_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A6(isNameExpr, isIntegerConstant, isDoubleConstant),
        A6_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B6(isNameExpr, isIntegerConstant, isDoubleConstant),
        C7(isNameExpr, isIntegerConstant, isDoubleConstant),
        C7_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D7(isNameExpr, isIntegerConstant, isDoubleConstant),
        D7_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E7(isNameExpr, isIntegerConstant, isDoubleConstant),
        F7(isNameExpr, isIntegerConstant, isDoubleConstant),
        F7_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G7(isNameExpr, isIntegerConstant, isDoubleConstant),
        G7_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A7(isNameExpr, isIntegerConstant, isDoubleConstant),
        A7_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B7(isNameExpr, isIntegerConstant, isDoubleConstant),
        C8(isNameExpr, isIntegerConstant, isDoubleConstant),
        C8_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D8(isNameExpr, isIntegerConstant, isDoubleConstant),
        D8_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E8(isNameExpr, isIntegerConstant, isDoubleConstant),
        F8(isNameExpr, isIntegerConstant, isDoubleConstant),
        F8_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G8(isNameExpr, isIntegerConstant, isDoubleConstant),
        G8_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        A8(isNameExpr, isIntegerConstant, isDoubleConstant),
        A8_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        B8(isNameExpr, isIntegerConstant, isDoubleConstant),
        C9(isNameExpr, isIntegerConstant, isDoubleConstant),
        C9_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        D9(isNameExpr, isIntegerConstant, isDoubleConstant),
        D9_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        E9(isNameExpr, isIntegerConstant, isDoubleConstant),
        F9(isNameExpr, isIntegerConstant, isDoubleConstant),
        F9_SHARP(isNameExpr, isIntegerConstant, "isStringConstant", isDoubleConstant),
        G9(isNameExpr, isIntegerConstant, isDoubleConstant);

        private NoteName isVariable;

        private final String isVariable;

        private final int isVariable;

        private final float isVariable;

        isConstructor(NoteName isParameter, int isParameter, String isParameter, float isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

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
