// isComment
package de.westnordost.streetcomplete.data.osmnotes;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import de.westnordost.osmapi.common.errors.OsmConflictException;
import de.westnordost.osmapi.map.data.OsmLatLon;
import de.westnordost.osmapi.notes.Note;
import de.westnordost.osmapi.notes.NotesDao;
import de.westnordost.streetcomplete.data.QuestStatus;
import de.westnordost.streetcomplete.data.statistics.QuestStatisticsDao;
import de.westnordost.streetcomplete.util.ImageUploader;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class isClassOrIsInterface {

    private ImageUploader isVariable;

    private NoteDao isVariable;

    private OsmNoteQuestDao isVariable;

    private QuestStatisticsDao isVariable;

    private NotesDao isVariable;

    private OsmNoteQuestChangesUpload isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(NotesDao.class);
        isNameExpr = isMethod(NoteDao.class);
        isNameExpr = isMethod(ImageUploader.class);
        isNameExpr = isMethod(OsmNoteQuestDao.class);
        isNameExpr = isMethod(QuestStatisticsDao.class);
        isNameExpr = new OsmNoteQuestChangesUpload(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr)).isMethod(isParameter -> {
            // isComment
            isNameExpr.isMethod(isIntegerConstant);
            ArrayList<OsmNoteQuest> isVariable = new ArrayList<>();
            isNameExpr.isMethod(null);
            return isNameExpr;
        });
        final AtomicBoolean isVariable = new AtomicBoolean(true);
        Thread isVariable = new Thread(() -> isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        OsmNoteQuest isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(OsmConflictException.class);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod().isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        OsmNoteQuest isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(isMethod(Note.class));
        Note isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        OsmNoteQuest isVariable = isMethod();
        ArrayList<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        Note isVariable = new Note();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isIntegerConstant, "isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    private static OsmNoteQuest isMethod() {
        Note isVariable = new Note();
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isFieldAccessExpr = new OsmLatLon(isDoubleConstant, isDoubleConstant);
        OsmNoteQuest isVariable = new OsmNoteQuest(isNameExpr, new OsmNoteQuestType());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }
}
