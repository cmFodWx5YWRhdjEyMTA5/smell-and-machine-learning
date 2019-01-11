// isComment
package ca.farrelltonsolar.classic;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.LineChartRenderer;

/**
 * isComment
 */
public class isClassOrIsInterface extends BarLineChartBase<LineData> implements LineDataProvider {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = new CustomLineChartRenderer(this, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant && isNameExpr.isMethod() > isIntegerConstant)
            isNameExpr.isFieldAccessExpr = isIntegerConstant;
    }

    @Override
    public LineData isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        // isComment
        if (isNameExpr != null && isNameExpr instanceof CustomLineChartRenderer) {
            ((LineChartRenderer) isNameExpr).isMethod();
        }
        super.isMethod();
    }
}
