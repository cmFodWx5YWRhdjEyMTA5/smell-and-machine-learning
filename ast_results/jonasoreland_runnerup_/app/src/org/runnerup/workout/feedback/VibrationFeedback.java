// isComment
package org.runnerup.workout.feedback;

import android.content.Context;
import org.runnerup.workout.Feedback;
import org.runnerup.workout.Workout;

public class isClassOrIsInterface extends Feedback {

    @Override
    public boolean isMethod(Feedback isParameter) {
        return isNameExpr instanceof VibrationFeedback;
    }

    @Override
    public void isMethod(Workout isParameter, Context isParameter) {
    // isComment
    }
}
