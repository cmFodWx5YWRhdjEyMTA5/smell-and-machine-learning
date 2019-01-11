// isComment
package net.bible.android.control.bookmark;

import android.graphics.Color;

/**
 * isComment
 */
public enum BookmarkStyle {

    YELLOW_STAR(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant)),
    RED_HIGHLIGHT(isNameExpr.isMethod((int) (isIntegerConstant * isDoubleConstant), isIntegerConstant, isIntegerConstant, isIntegerConstant)),
    YELLOW_HIGHLIGHT(isNameExpr.isMethod((int) (isIntegerConstant * isDoubleConstant), isIntegerConstant, isIntegerConstant, isIntegerConstant)),
    GREEN_HIGHLIGHT(isNameExpr.isMethod((int) (isIntegerConstant * isDoubleConstant), isIntegerConstant, isIntegerConstant, isIntegerConstant)),
    BLUE_HIGHLIGHT(isNameExpr.isMethod((int) (isIntegerConstant * isDoubleConstant), isIntegerConstant, isIntegerConstant, isIntegerConstant)),
    // isComment
    SPEAK(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}
