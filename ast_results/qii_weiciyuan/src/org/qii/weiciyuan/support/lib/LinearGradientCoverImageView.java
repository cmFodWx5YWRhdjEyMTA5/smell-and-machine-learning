// isComment
package org.qii.weiciyuan.support.lib;

import org.qii.weiciyuan.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ImageView {

    private LinearGradient isVariable;

    private Paint isVariable = new Paint();

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        this(isNameExpr, isNameExpr, -isIntegerConstant);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Canvas isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr == null) {
            int[] isVariable = { isNameExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) };
            isNameExpr = new LinearGradient(isIntegerConstant, isIntegerConstant, isIntegerConstant, isMethod(), isNameExpr, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }
}
