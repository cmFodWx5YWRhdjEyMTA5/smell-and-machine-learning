// isComment
package org.wheelmap.android.tango.mode.operations;

import org.wheelmap.android.tango.renderer.WheelmapModeRenderer;
import java.util.Stack;

public abstract class isClassOrIsInterface extends WheelmapModeRenderer {

    private Stack<Operation> isVariable = new Stack<>();

    private boolean isVariable = true;

    public void isMethod(final Operation isParameter) {
        isNameExpr = true;
        isMethod(new Consumer<Manipulator>() {

            @Override
            public void isMethod(Manipulator isParameter) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = true;
                isMethod();
            }
        });
    }

    @Override
    public void isMethod() {
        isNameExpr = true;
        isMethod(new Consumer<Manipulator>() {

            @Override
            public void isMethod(Manipulator isParameter) {
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod().isMethod(isNameExpr);
                }
                isNameExpr = true;
                isMethod();
            }
        });
    }

    /**
     * isComment
     */
    protected boolean isMethod() {
        return isNameExpr;
    }
}
