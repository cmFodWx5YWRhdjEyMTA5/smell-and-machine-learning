// isComment
package com.mkulesh.micromath.widgets;

public interface isClassOrIsInterface {

    enum FormulaType {

        EQUATION,
        RESULT,
        PLOT_FUNCTION,
        PLOT_CONTOUR,
        TEXT_FRAGMENT,
        IMAGE_FRAGMENT
    }

    enum Position {

        BEFORE, AFTER, LEFT, RIGHT
    }

    /**
     * isComment
     */
    void isMethod(Position isParameter, FormulaType isParameter);

    /**
     * isComment
     */
    void isMethod(int isParameter);

    /**
     * isComment
     */
    void isMethod(float isParameter);

    /**
     * isComment
     */
    void isMethod(String isParameter);

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    boolean isMethod(String isParameter);

    /**
     * isComment
     */
    void isMethod();

    /**
     * isComment
     */
    void isMethod();
}
