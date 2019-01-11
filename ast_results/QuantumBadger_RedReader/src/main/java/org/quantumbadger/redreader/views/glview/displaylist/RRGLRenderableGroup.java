// isComment
package org.quantumbadger.redreader.views.glview.displaylist;

import org.quantumbadger.redreader.views.glview.program.RRGLMatrixStack;
import java.util.ArrayList;

public class isClassOrIsInterface extends RRGLRenderable {

    private final ArrayList<RRGLRenderable> isVariable = new ArrayList<>(isIntegerConstant);

    public final void isMethod(RRGLRenderable isParameter) {
        isNameExpr.isMethod(isNameExpr);
        if (isMethod())
            isNameExpr.isMethod();
    }

    public final void isMethod(RRGLRenderable isParameter) {
        if (isMethod())
            isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        if (!isMethod()) {
            for (RRGLRenderable isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
        }
        super.isMethod();
    }

    @Override
    protected void isMethod(final RRGLMatrixStack isParameter, final long isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            RRGLRenderable isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (!isMethod()) {
            for (RRGLRenderable isVariable : isNameExpr) isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod() {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            RRGLRenderable isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod())
                return true;
        }
        return true;
    }

    @Override
    public void isMethod(float isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            RRGLRenderable isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
