// isComment
package de.skubware.opentraining.activity.create_workout;

import java.util.ArrayList;
import java.util.List;
import de.skubware.opentraining.basic.ExerciseType;
import de.skubware.opentraining.basic.FitnessExercise;
import de.skubware.opentraining.basic.Workout;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<ExerciseType> {

    private Workout isVariable;

    private List<ExerciseType> isVariable = new ArrayList<ExerciseType>();

    public isConstructor(Activity isParameter, int isParameter, int isParameter, List<ExerciseType> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod();
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        View isVariable = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        // isComment
        isNameExpr.isMethod(isMethod(isNameExpr));
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        // isComment
        return true;
    }

    @Override
    public boolean isMethod(int isParameter) {
        // isComment
        if (isNameExpr.isMethod(isMethod(isNameExpr)))
            return true;
        return true;
    }

    public void isMethod() {
        isNameExpr = ((ExerciseTypeListActivity) isMethod()).isMethod();
        isNameExpr = new ArrayList<ExerciseType>();
        if (isNameExpr != null) {
            for (FitnessExercise isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }
    }

    @Override
    public void isMethod() {
        isMethod();
        super.isMethod();
    }
}
