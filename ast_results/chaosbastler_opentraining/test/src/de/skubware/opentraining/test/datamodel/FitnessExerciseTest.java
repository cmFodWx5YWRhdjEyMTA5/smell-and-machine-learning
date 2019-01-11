// isComment
package de.skubware.opentraining.test.datamodel;

import java.util.GregorianCalendar;
import android.test.AndroidTestCase;
import de.skubware.opentraining.basic.ExerciseType;
import de.skubware.opentraining.basic.FSet;
import de.skubware.opentraining.basic.ExerciseType.ExerciseSource;
import de.skubware.opentraining.basic.FSet.SetParameter;
import de.skubware.opentraining.basic.FitnessExercise;
import de.skubware.opentraining.basic.TrainingEntry;
import de.skubware.opentraining.basic.Workout;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public static final String isVariable = "isStringConstant";

    public void isMethod() {
        ExerciseType isVariable = (new ExerciseType.Builder("isStringConstant", isNameExpr.isFieldAccessExpr)).isMethod();
        FitnessExercise isVariable = new FitnessExercise(isNameExpr);
        Workout isVariable = new Workout("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        TrainingEntry isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        FSet isVariable = new FSet(new SetParameter.Duration(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr);
        assert (isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr, true);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr, true);
        assert (isNameExpr.isMethod(isNameExpr));
    }
}
