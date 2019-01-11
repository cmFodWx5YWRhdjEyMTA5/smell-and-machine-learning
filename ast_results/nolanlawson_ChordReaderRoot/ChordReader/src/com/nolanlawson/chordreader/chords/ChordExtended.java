// isComment
package com.nolanlawson.chordreader.chords;

import static com.nolanlawson.chordreader.chords.ChordQuality.Diminished;
import static com.nolanlawson.chordreader.chords.ChordQuality.Major;
import static com.nolanlawson.chordreader.chords.ChordQuality.Minor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * isComment
 */
public enum ChordExtended {

    // isComment
    Major7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant")),
    Minor7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant")),
    Dominant7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")),
    Diminished7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant")),
    // isComment
    Major9(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")),
    Major11(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")),
    Major13(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")),
    AugmentedDominant7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant")),
    AugmentedMajor7(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant")),
    // isComment
    Minor9(isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));

    /**
     * isComment
     */
    private List<String> isVariable;

    private ChordQuality isVariable;

    isConstructor(ChordQuality isParameter, List<String> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<String> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public ChordQuality isMethod() {
        return isNameExpr;
    }

    public static List<String> isMethod() {
        List<String> isVariable = new ArrayList<String>();
        for (ChordExtended isVariable : isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    private static Map<String, ChordExtended> isVariable = new HashMap<String, ChordExtended>();

    static {
        for (ChordExtended isVariable : isMethod()) {
            for (String isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            }
        }
    }

    public static ChordExtended isMethod(String isParameter) {
        // isComment
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        }
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
