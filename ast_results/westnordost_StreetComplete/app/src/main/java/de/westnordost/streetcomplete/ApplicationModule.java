// isComment
package de.westnordost.streetcomplete;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import java.util.List;
import javax.inject.Provider;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import de.westnordost.streetcomplete.data.QuestController;
import de.westnordost.streetcomplete.data.QuestType;
import de.westnordost.streetcomplete.data.changesets.OpenChangesetsDao;
import de.westnordost.streetcomplete.data.download.MobileDataAutoDownloadStrategy;
import de.westnordost.streetcomplete.data.download.WifiAutoDownloadStrategy;
import de.westnordost.streetcomplete.data.osm.persist.ElementGeometryDao;
import de.westnordost.streetcomplete.data.osm.persist.MergedElementDao;
import de.westnordost.streetcomplete.data.osm.persist.OsmQuestDao;
import de.westnordost.streetcomplete.data.osm.persist.UndoOsmQuestDao;
import de.westnordost.streetcomplete.data.osmnotes.CreateNoteDao;
import de.westnordost.streetcomplete.data.osmnotes.OsmNoteQuestDao;
import de.westnordost.streetcomplete.data.tiles.DownloadedTilesDao;
import de.westnordost.streetcomplete.location.LocationRequestFragment;
import de.westnordost.streetcomplete.oauth.OsmOAuthDialogFragment;
import de.westnordost.streetcomplete.sound.SoundFx;
import de.westnordost.streetcomplete.tools.CrashReportExceptionHandler;

@Module
public class isClassOrIsInterface {

    private final Application isVariable;

    public isConstructor(Application isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Provides
    public Context isMethod() {
        return isNameExpr;
    }

    @Provides
    public Application isMethod() {
        return isNameExpr;
    }

    @Provides
    public SharedPreferences isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Provides
    public AssetManager isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    public Resources isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    public QuestController isMethod(OsmQuestDao isParameter, UndoOsmQuestDao isParameter, MergedElementDao isParameter, ElementGeometryDao isParameter, OsmNoteQuestDao isParameter, CreateNoteDao isParameter, OpenChangesetsDao isParameter, Provider<List<QuestType>> isParameter) {
        return new QuestController(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod());
    }

    @Provides
    public static MobileDataAutoDownloadStrategy isMethod(OsmQuestDao isParameter, DownloadedTilesDao isParameter, Provider<List<QuestType>> isParameter) {
        return new MobileDataAutoDownloadStrategy(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    public static WifiAutoDownloadStrategy isMethod(OsmQuestDao isParameter, DownloadedTilesDao isParameter, Provider<List<QuestType>> isParameter) {
        return new WifiAutoDownloadStrategy(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    public static LocationRequestFragment isMethod() {
        return new LocationRequestFragment();
    }

    @Provides
    @Singleton
    public static CrashReportExceptionHandler isMethod(Context isParameter) {
        return new CrashReportExceptionHandler(isNameExpr);
    }

    @Provides
    public static OsmOAuthDialogFragment isMethod() {
        return new OsmOAuthDialogFragment();
    }

    @Provides
    public SoundFx isMethod() {
        return new SoundFx(isMethod());
    }
}
