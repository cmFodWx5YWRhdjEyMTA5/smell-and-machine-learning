// isComment
package de.westnordost.streetcomplete.quests.construction;

import android.support.annotation.Nullable;
import de.westnordost.osmapi.map.data.Element;
import de.westnordost.streetcomplete.data.meta.OsmTaggings;
import de.westnordost.streetcomplete.data.osm.AOsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.DateUtil;
import de.westnordost.streetcomplete.quests.YesNoQuestAnswerFragment;

public abstract class isClassOrIsInterface extends AOsmElementQuestType {

    protected final OverpassMapDataDao isVariable;

    isConstructor(OverpassMapDataDao isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Nullable
    @Override
    public Boolean isMethod(Element isParameter) {
        /*isComment*/
        return null;
    }

    public AbstractQuestAnswerFragment isMethod() {
        return new YesNoQuestAnswerFragment();
    }

    protected String isMethod() {
        return isNameExpr.isMethod() + "isStringConstant";
    }

    protected String isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr) + "isStringConstant";
    }

    String isMethod(String isParameter, String isParameter, int isParameter) {
        // isComment
        return "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + isMethod() + "isStringConstant" + "isStringConstant" + isMethod(isNameExpr, isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    private String isMethod(String isParameter, int isParameter) {
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isMethod(-isNameExpr) + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isMethod(-isNameExpr) + "isStringConstant" + "isStringConstant";
    }

    void isMethod(StringMapChangesBuilder isParameter) {
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
