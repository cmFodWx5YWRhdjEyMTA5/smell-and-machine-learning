// isComment
package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public enum CharacterSetECI {

    // isComment
    Cp437(new int[] { isIntegerConstant, isIntegerConstant }),
    ISO8859_1(new int[] { isIntegerConstant, isIntegerConstant }, "isStringConstant"),
    ISO8859_2(isIntegerConstant, "isStringConstant"),
    ISO8859_3(isIntegerConstant, "isStringConstant"),
    ISO8859_4(isIntegerConstant, "isStringConstant"),
    ISO8859_5(isIntegerConstant, "isStringConstant"),
    ISO8859_6(isIntegerConstant, "isStringConstant"),
    ISO8859_7(isIntegerConstant, "isStringConstant"),
    ISO8859_8(isIntegerConstant, "isStringConstant"),
    ISO8859_9(isIntegerConstant, "isStringConstant"),
    ISO8859_10(isIntegerConstant, "isStringConstant"),
    ISO8859_11(isIntegerConstant, "isStringConstant"),
    ISO8859_13(isIntegerConstant, "isStringConstant"),
    ISO8859_14(isIntegerConstant, "isStringConstant"),
    ISO8859_15(isIntegerConstant, "isStringConstant"),
    ISO8859_16(isIntegerConstant, "isStringConstant"),
    SJIS(isIntegerConstant, "isStringConstant"),
    Cp1250(isIntegerConstant, "isStringConstant"),
    Cp1251(isIntegerConstant, "isStringConstant"),
    Cp1252(isIntegerConstant, "isStringConstant"),
    Cp1256(isIntegerConstant, "isStringConstant"),
    UnicodeBigUnmarked(isIntegerConstant, "isStringConstant", "isStringConstant"),
    UTF8(isIntegerConstant, "isStringConstant"),
    ASCII(new int[] { isIntegerConstant, isIntegerConstant }, "isStringConstant"),
    Big5(isIntegerConstant),
    GB18030(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant"),
    EUC_KR(isIntegerConstant, "isStringConstant");

    private static final Map<Integer, CharacterSetECI> isVariable = new HashMap<>();

    private static final Map<String, CharacterSetECI> isVariable = new HashMap<>();

    static {
        for (CharacterSetECI isVariable : isMethod()) {
            for (int isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            for (String isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    private final int[] isVariable;

    private final String[] isVariable;

    isConstructor(int isParameter) {
        this(new int[] { isNameExpr });
    }

    isConstructor(int isParameter, String... isParameter) {
        this.isFieldAccessExpr = new int[] { isNameExpr };
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(int[] isParameter, String... isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr[isIntegerConstant];
    }

    /**
     * isComment
     */
    public static CharacterSetECI isMethod(int isParameter) throws FormatException {
        if (isNameExpr < isIntegerConstant || isNameExpr >= isIntegerConstant) {
            throw isNameExpr.isMethod();
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public static CharacterSetECI isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
