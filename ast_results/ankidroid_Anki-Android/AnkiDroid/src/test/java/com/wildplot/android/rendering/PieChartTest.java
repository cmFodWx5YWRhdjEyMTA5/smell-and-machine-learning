// isComment
package com.wildplot.android.rendering;

import android.graphics.Color;
import com.wildplot.android.rendering.graphics.wrapper.ColorWrap;
import com.wildplot.android.rendering.graphics.wrapper.FontMetricsWrap;
import com.wildplot.android.rendering.graphics.wrapper.GraphicsWrap;
import com.wildplot.android.rendering.graphics.wrapper.RectangleWrap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.floatThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ RectangleWrap.class, GraphicsWrap.class, ColorWrap.class, PlotSheet.class, Color.class })
public class isClassOrIsInterface {

    private static final double isVariable = isDoubleConstant;

    @Mock
    private GraphicsWrap isVariable;

    @Mock
    private PlotSheet isVariable;

    private PieChart isVariable;

    @Before
    public void isMethod() {
        isMethod(android.graphics.Color.class);
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod())).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(new float[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant });
        FontMetricsWrap isVariable = isMethod(FontMetricsWrap.class);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isMethod(String.class))).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new PieChart(isNameExpr, new double[] { isIntegerConstant, isIntegerConstant }, new ColorWrap[] { isNameExpr.isFieldAccessExpr });
    }

    @Test
    public void isMethod() {
        isNameExpr = new PieChart(isNameExpr, new double[] { isIntegerConstant, isIntegerConstant }, new ColorWrap[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr });
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr = new PieChart(isNameExpr, new double[] { isDoubleConstant }, new ColorWrap[] { isNameExpr.isFieldAccessExpr });
        RectangleWrap isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(isMethod(-isDoubleConstant)), isMethod(isMethod(isDoubleConstant)));
    }

    @Test
    public void isMethod() {
        isNameExpr = new PieChart(isNameExpr, new double[] { isIntegerConstant, isIntegerConstant }, new ColorWrap[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr });
        RectangleWrap isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(isMethod(-isDoubleConstant)), isMethod(isMethod(isDoubleConstant)));
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(isMethod(isDoubleConstant)), isMethod(isMethod(isDoubleConstant)));
    }

    public static RectangleWrap isMethod(int isParameter, int isParameter) {
        RectangleWrap isVariable = isMethod(RectangleWrap.class);
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    private static FloatMatcher isMethod(double isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
