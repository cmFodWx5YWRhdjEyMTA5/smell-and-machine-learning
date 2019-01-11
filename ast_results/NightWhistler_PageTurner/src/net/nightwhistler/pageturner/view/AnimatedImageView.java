// isComment
package net.nightwhistler.pageturner.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import net.nightwhistler.pageturner.animation.Animator;

public class isClassOrIsInterface extends ImageView {

    private Animator isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public void isMethod(Animator isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Animator isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Canvas isParameter) {
        super.isMethod(isNameExpr);
        if (this.isFieldAccessExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
