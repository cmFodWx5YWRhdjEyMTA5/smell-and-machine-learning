// isComment
package de.westnordost.streetcomplete.data.osm.persist;

import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import de.westnordost.osmapi.map.data.BoundingBox;
import de.westnordost.streetcomplete.data.ApplicationDbTestCase;
import de.westnordost.streetcomplete.data.QuestStatus;
import de.westnordost.streetcomplete.data.QuestType;
import de.westnordost.streetcomplete.data.QuestTypeRegistry;
import de.westnordost.streetcomplete.data.osm.ElementGeometry;
import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.OsmQuest;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChanges;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryChange;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryDelete;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryModify;
import de.westnordost.streetcomplete.data.osm.persist.test.TestQuestType;
import de.westnordost.streetcomplete.data.osm.persist.test.TestQuestType2;
import de.westnordost.osmapi.map.data.Element;
import de.westnordost.osmapi.map.data.OsmLatLon;
import de.westnordost.streetcomplete.data.osm.persist.test.TestQuestType3;
import de.westnordost.streetcomplete.data.osm.persist.test.TestQuestType4;
import de.westnordost.streetcomplete.data.osm.persist.test.TestQuestType5;

public class isClassOrIsInterface extends ApplicationDbTestCase {

    private ElementGeometryDao isVariable;

    private OsmQuestDao isVariable;

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new ElementGeometryDao(isNameExpr, isNameExpr);
        List<QuestType> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new TestQuestType());
        isNameExpr.isMethod(new TestQuestType2());
        isNameExpr.isMethod(new TestQuestType3());
        isNameExpr.isMethod(new TestQuestType4());
        isNameExpr.isMethod(new TestQuestType5());
        isNameExpr = new OsmQuestDao(isNameExpr, isNameExpr, new QuestTypeRegistry(isNameExpr));
    }

    public void isMethod() {
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, (long) isNameExpr.isMethod());
        OsmQuest isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod() {
        List<StringMapEntryChange> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(new StringMapEntryDelete("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(new StringMapEntryModify("isStringConstant", "isStringConstant", "isStringConstant"));
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new StringMapChanges(isNameExpr), "isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, (long) isNameExpr.isMethod());
        OsmQuest isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod() {
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant)));
        isMethod(isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(new BoundingBox(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), null, null, null, null).isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod(null, null, null, null, null).isMethod());
    }

    public void isMethod() {
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(null, null, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod(null, null, null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isStringConstant).isMethod());
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        OsmQuest isVariable = isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        List<OsmQuest> isVariable = isNameExpr.isMethod(null, null, isNameExpr.isMethod(TestQuestType.class.isMethod()));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        List<OsmQuest> isVariable = isNameExpr.isMethod(null, null, isNameExpr.isMethod(TestQuestType.class.isMethod(), TestQuestType2.class.isMethod()));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    private static OsmQuest isMethod(long isParameter, Element.Type isParameter) {
        return isMethod(isNameExpr, isNameExpr, new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant)));
    }

    private static OsmQuest isMethod(long isParameter, Element.Type isParameter, ElementGeometry isParameter) {
        return isMethod(new TestQuestType(), isNameExpr, isNameExpr, isNameExpr);
    }

    private static OsmQuest isMethod(OsmElementQuestType isParameter, long isParameter, Element.Type isParameter, ElementGeometry isParameter) {
        return new OsmQuest(null, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, null, new Date(), isNameExpr);
    }

    private void isMethod(OsmQuest... isParameter) {
        for (OsmQuest isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            boolean isVariable = isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr);
        }
    }

    public void isMethod() {
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isMethod() + isStringConstant));
    }

    public void isMethod() {
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isMethod() + isStringConstant));
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        OsmQuest isVariable = isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isMethod(new TestQuestType3(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isMethod(new TestQuestType4(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isMethod(new TestQuestType5(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        OsmQuest isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), "isStringConstant");
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant")));
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isIntegerConstant, null));
    }

    public void isMethod() {
        ElementGeometry isVariable = new ElementGeometry(new OsmLatLon(isIntegerConstant, isIntegerConstant));
        OsmQuest isVariable = isMethod(new TestQuestType(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        OsmQuest isVariable = isMethod(new TestQuestType2(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        OsmQuest isVariable = isMethod(new TestQuestType3(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        OsmQuest isVariable = isMethod(new TestQuestType4(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        List<Long> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    private void isMethod(OsmQuest isParameter, OsmQuest isParameter) {
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    // isComment
    // isComment
    }
}
