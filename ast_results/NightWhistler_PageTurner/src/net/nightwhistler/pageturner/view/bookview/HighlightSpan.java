// isComment
package net.nightwhistler.pageturner.view.bookview;

import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import net.nightwhistler.pageturner.dto.HighLight;
import net.nightwhistler.pageturner.view.HighlightManager;

/**
 * isComment
 */
public class isClassOrIsInterface extends BackgroundColorSpan {

    private HighLight isVariable;

    public isConstructor(HighLight isParameter) {
        super(isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    public HighLight isMethod() {
        return this.isFieldAccessExpr;
    }

    @Override
    public void isMethod(TextPaint isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this.isFieldAccessExpr.isMethod() != null && this.isFieldAccessExpr.isMethod().isMethod().isMethod() > isIntegerConstant);
    }
}
