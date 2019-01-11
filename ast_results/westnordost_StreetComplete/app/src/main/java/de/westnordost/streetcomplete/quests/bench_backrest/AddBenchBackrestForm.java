// isComment
package de.westnordost.streetcomplete.quests.bench_backrest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.YesNoQuestAnswerFragment;

public class isClassOrIsInterface extends YesNoQuestAnswerFragment {

    public static final String isVariable = "isStringConstant";

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
        return isNameExpr;
    }

    private void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, () -> {
            Bundle isVariable = new Bundle();
            isNameExpr.isMethod(isNameExpr, true);
            isMethod(isNameExpr);
        });
    }
}
