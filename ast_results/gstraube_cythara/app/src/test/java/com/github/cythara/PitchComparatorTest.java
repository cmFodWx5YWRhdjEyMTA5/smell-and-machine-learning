// isComment
package com.github.cythara;

import com.github.cythara.tuning.GuitarTuning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.util.HashMap;
import java.util.Map;
import static com.github.cythara.tuning.GuitarTuning.Pitch.D3;
import static com.github.cythara.tuning.GuitarTuning.Pitch.E2;
import static com.github.cythara.tuning.GuitarTuning.Pitch.E4;
import static com.github.cythara.tuning.GuitarTuning.Pitch.G3;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MainActivity.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isNameExpr.isMethod(MainActivity.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(new GuitarTuning());
        Map<Float, PitchDifference> isVariable = new HashMap<>();
        isNameExpr.isMethod(isDoubleConstant, new PitchDifference(isNameExpr, -isDoubleConstant));
        isNameExpr.isMethod(isDoubleConstant, new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(isDoubleConstant, new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(isDoubleConstant, new PitchDifference(isNameExpr, -isDoubleConstant));
        for (Float isVariable : isNameExpr.isMethod()) {
            PitchDifference isVariable = isNameExpr.isMethod(isNameExpr);
            PitchDifference isVariable = isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr);
            isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr));
            isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr, isDoubleConstant));
        }
    }
}
