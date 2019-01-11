// isComment
package de.westnordost.streetcomplete;

import javax.inject.Singleton;
import dagger.Component;
import de.westnordost.streetcomplete.data.DbModule;
import de.westnordost.streetcomplete.data.OsmModule;
import de.westnordost.streetcomplete.data.upload.QuestChangesUploadService;
import de.westnordost.streetcomplete.data.download.QuestDownloadService;
import de.westnordost.streetcomplete.data.meta.MetadataModule;
import de.westnordost.streetcomplete.oauth.OAuthModule;
import de.westnordost.streetcomplete.oauth.OsmOAuthDialogFragment;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.GroupedImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.ImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.QuestModule;
import de.westnordost.streetcomplete.quests.building_levels.AddBuildingLevelsForm;
import de.westnordost.streetcomplete.quests.localized_name.AddLocalizedNameForm;
import de.westnordost.streetcomplete.quests.oneway.AddOnewayForm;
import de.westnordost.streetcomplete.quests.opening_hours.AddOpeningHoursForm;
import de.westnordost.streetcomplete.quests.localized_name.AddRoadNameForm;
import de.westnordost.streetcomplete.quests.parking_fee.AddParkingFeeForm;
import de.westnordost.streetcomplete.quests.note_discussion.NoteDiscussionForm;
import de.westnordost.streetcomplete.quests.postbox_collection_times.AddCollectionTimesForm;
import de.westnordost.streetcomplete.settings.SettingsActivity;
import de.westnordost.streetcomplete.settings.SettingsFragment;
import de.westnordost.streetcomplete.settings.QuestSelectionFragment;
import de.westnordost.streetcomplete.statistics.AnswersCounter;
import de.westnordost.streetcomplete.tangram.MapControlsFragment;
import de.westnordost.streetcomplete.tangram.QuestsMapFragment;
import de.westnordost.streetcomplete.util.SerializedSavedState;

@Singleton
@Component(modules = { ApplicationModule.class, OAuthModule.class, OsmModule.class, QuestModule.class, DbModule.class, MetadataModule.class })
public interface isClassOrIsInterface {

    void isMethod(StreetCompleteApplication isParameter);

    void isMethod(MainActivity isParameter);

    void isMethod(NoteDiscussionForm isParameter);

    void isMethod(SerializedSavedState isParameter);

    void isMethod(QuestChangesUploadService isParameter);

    void isMethod(QuestDownloadService isParameter);

    void isMethod(SettingsFragment isParameter);

    void isMethod(SettingsActivity isParameter);

    void isMethod(AnswersCounter isParameter);

    void isMethod(AddOpeningHoursForm isParameter);

    void isMethod(AddLocalizedNameForm isParameter);

    void isMethod(AddRoadNameForm isParameter);

    void isMethod(AddParkingFeeForm isParameter);

    void isMethod(AddOnewayForm isParameter);

    void isMethod(AddCollectionTimesForm isParameter);

    void isMethod(OsmOAuthDialogFragment isParameter);

    void isMethod(AbstractQuestAnswerFragment isParameter);

    void isMethod(QuestsMapFragment isParameter);

    void isMethod(MapControlsFragment isParameter);

    void isMethod(QuestSelectionFragment isParameter);

    void isMethod(GroupedImageListQuestAnswerFragment isParameter);

    void isMethod(ImageListQuestAnswerFragment isParameter);

    void isMethod(AddBuildingLevelsForm isParameter);
}
