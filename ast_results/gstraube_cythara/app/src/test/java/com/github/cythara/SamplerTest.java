// isComment
package com.github.cythara;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static com.github.cythara.Sampler.*;
import static com.github.cythara.tuning.GuitarTuning.Pitch.B3;
import static com.github.cythara.tuning.GuitarTuning.Pitch.E2;
import static com.github.cythara.tuning.GuitarTuning.Pitch.G3;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        List<PitchDifference> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, -isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, -isDoubleConstant));
        PitchDifference isVariable = isMethod(isNameExpr);
        double isVariable = (isDoubleConstant - isDoubleConstant + isDoubleConstant + isDoubleConstant - isDoubleConstant) / isDoubleConstant;
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isMethod(isNameExpr.isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr, isDoubleConstant));
    }

    @Test
    public void isMethod() {
        List<PitchDifference> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        List<PitchDifference> isVariable = isMethod(isNameExpr, isNameExpr);
        for (PitchDifference isVariable : isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isMethod(isNameExpr.isMethod()));
        }
    }

    @Test
    public void isMethod() {
        List<PitchDifference> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        Note isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() {
        List<PitchDifference> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        isNameExpr.isMethod(new PitchDifference(isNameExpr, isDoubleConstant));
        Note isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isNameExpr.isMethod())).isMethod(isMethod(isNameExpr.isMethod())));
    }
}
