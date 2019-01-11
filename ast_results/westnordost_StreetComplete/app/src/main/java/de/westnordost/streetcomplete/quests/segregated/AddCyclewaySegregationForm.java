// isComment
package de.westnordost.streetcomplete.quests.segregated;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.ImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.view.Item;

public class isClassOrIsInterface extends ImageListQuestAnswerFragment {

    @Override
    protected Item[] isMethod() {
        return new Item[] { new Item("isStringConstant", isMethod().isMethod() ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) };
    }

    @Override
    public void isMethod(View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected int isMethod() {
        return isIntegerConstant;
    }
}
