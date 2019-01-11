// isComment
package net.gsantner.markor.format.todotxt;

import android.util.Patterns;
import net.gsantner.opoc.format.todotxt.SttCommander;
import java.util.regex.Pattern;

// isComment
public enum TodoTxtHighlighterPattern {

    CONTEXT(isNameExpr.isFieldAccessExpr),
    // isComment
    PROJECT(isNameExpr.isFieldAccessExpr),
    DONE(isNameExpr.isFieldAccessExpr),
    DATE(isNameExpr.isFieldAccessExpr),
    COMPLETION_DATE(isNameExpr.isFieldAccessExpr),
    CREATION_DATE(isNameExpr.isFieldAccessExpr),
    PATTERN_KEY_VALUE(isNameExpr.isFieldAccessExpr),
    PRIORITY_ANY(isNameExpr.isFieldAccessExpr),
    PRIORITY_A(isNameExpr.isFieldAccessExpr),
    PRIORITY_B(isNameExpr.isFieldAccessExpr),
    PRIORITY_C(isNameExpr.isFieldAccessExpr),
    PRIORITY_D(isNameExpr.isFieldAccessExpr),
    PRIORITY_E(isNameExpr.isFieldAccessExpr),
    PRIORITY_F(isNameExpr.isFieldAccessExpr),
    LINK(isNameExpr.isFieldAccessExpr),
    NEWLINE_CHARACTER(isNameExpr.isMethod("isStringConstant")),
    LINESTART(isNameExpr.isMethod("isStringConstant")),
    LINE_OF_TEXT(isNameExpr.isMethod("isStringConstant"));

    private Pattern isVariable;

    isConstructor(Pattern isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Pattern isMethod() {
        return isNameExpr;
    }
}
