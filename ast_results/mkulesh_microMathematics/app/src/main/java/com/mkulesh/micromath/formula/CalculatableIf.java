// isComment
package com.mkulesh.micromath.formula;

import com.mkulesh.micromath.formula.CalculaterTask.CancelException;
import com.mkulesh.micromath.math.CalculatedValue;

public interface isClassOrIsInterface {

    enum DifferentiableType {

        NONE, NUMERICAL, ANALYTICAL, INDEPENDENT
    }

    /**
     * isComment
     */
    CalculatedValue.ValueType isMethod(CalculaterTask isParameter, CalculatedValue isParameter) throws CancelException;

    /**
     * isComment
     */
    DifferentiableType isMethod(String isParameter);

    /**
     * isComment
     */
    CalculatedValue.ValueType isMethod(String isParameter, CalculaterTask isParameter, CalculatedValue isParameter) throws CancelException;
}
