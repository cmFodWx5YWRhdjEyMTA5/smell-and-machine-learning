// isComment
package de.westnordost.streetcomplete.quests.surface;

import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.GroupedImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.view.Item;
import static de.westnordost.streetcomplete.quests.surface.Surface.*;

public class isClassOrIsInterface extends GroupedImageListQuestAnswerFragment {

    @Override
    protected Item[] isMethod() {
        // isComment
        boolean isVariable = "isStringConstant".isMethod(isMethod().isMethod().isMethod("isStringConstant"));
        if (isNameExpr)
            return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
        else
            return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
    }

    @Override
    protected Item[] isMethod() {
        return new Item[] { new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr }) };
    }
}
