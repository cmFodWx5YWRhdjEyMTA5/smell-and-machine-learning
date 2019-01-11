// isComment
package de.westnordost.streetcomplete.quests.crossing_type;

import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.ImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.view.Item;

public class isClassOrIsInterface extends ImageListQuestAnswerFragment {

    private final Item[] isVariable = new Item[] { new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) };

    @Override
    protected Item[] isMethod() {
        return isNameExpr;
    }

    @Override
    protected int isMethod() {
        return isIntegerConstant;
    }
}
