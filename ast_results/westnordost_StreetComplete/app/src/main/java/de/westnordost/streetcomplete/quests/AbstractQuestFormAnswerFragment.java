// isComment
package de.westnordost.streetcomplete.quests;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.Toast;
import de.westnordost.streetcomplete.R;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AbstractQuestAnswerFragment {

    private Button isVariable;

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isParameter -> {
            if (!isMethod()) {
                isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            } else {
                isMethod();
            }
        });
        return isNameExpr;
    }

    protected void isMethod() {
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod(new DecelerateInterpolator()).isMethod(null);
        } else {
            isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isDoubleConstant).isMethod(isDoubleConstant).isMethod(isIntegerConstant).isMethod(new AccelerateInterpolator()).isMethod(() -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    protected abstract void isMethod();

    public abstract boolean isMethod();

    @Override
    public boolean isMethod() {
        return isMethod();
    }
}
