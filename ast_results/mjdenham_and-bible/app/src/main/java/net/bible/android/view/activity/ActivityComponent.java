// isComment
package net.bible.android.view.activity;

import net.bible.android.activity.SpeakWidgetManager;
import net.bible.android.control.ApplicationComponent;
import net.bible.android.view.activity.base.ActivityBase;
import net.bible.android.view.activity.bookmark.BookmarkLabels;
import net.bible.android.view.activity.bookmark.Bookmarks;
import net.bible.android.view.activity.bookmark.ManageLabels;
import net.bible.android.view.activity.comparetranslations.CompareTranslations;
import net.bible.android.view.activity.download.Download;
import net.bible.android.view.activity.download.ProgressStatus;
import net.bible.android.view.activity.footnoteandref.FootnoteAndRefActivity;
import net.bible.android.view.activity.help.Help;
import net.bible.android.view.activity.mynote.MyNotes;
import net.bible.android.view.activity.navigation.ChooseDictionaryWord;
import net.bible.android.view.activity.navigation.ChooseDocument;
import net.bible.android.view.activity.navigation.GridChoosePassageBook;
import net.bible.android.view.activity.navigation.GridChoosePassageChapter;
import net.bible.android.view.activity.navigation.GridChoosePassageVerse;
import net.bible.android.view.activity.navigation.History;
import net.bible.android.view.activity.navigation.genbookmap.ChooseKeyBase;
import net.bible.android.view.activity.readingplan.DailyReading;
import net.bible.android.view.activity.readingplan.DailyReadingList;
import net.bible.android.view.activity.readingplan.ReadingPlanSelectorList;
import net.bible.android.view.activity.search.Search;
import net.bible.android.view.activity.search.SearchIndex;
import net.bible.android.view.activity.search.SearchIndexProgressStatus;
import net.bible.android.view.activity.search.SearchResults;
import net.bible.android.view.activity.speak.GeneralSpeakActivity;
import net.bible.android.view.activity.speak.BibleSpeakActivity;
import dagger.Component;
import net.bible.android.view.activity.speak.SpeakSettingsActivity;
import net.bible.service.device.speak.TextToSpeechNotificationManager;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = { ApplicationComponent.class })
public interface isClassOrIsInterface {

    // isComment
    // isComment
    void isMethod(ActivityBase isParameter);

    void isMethod(StartupActivity isParameter);

    void isMethod(Bookmarks isParameter);

    void isMethod(BookmarkLabels isParameter);

    void isMethod(ManageLabels isParameter);

    void isMethod(GridChoosePassageBook isParameter);

    void isMethod(GridChoosePassageChapter isParameter);

    void isMethod(GridChoosePassageVerse isParameter);

    void isMethod(ChooseDictionaryWord isParameter);

    void isMethod(ChooseKeyBase isParameter);

    void isMethod(ChooseDocument isParameter);

    void isMethod(Download isParameter);

    void isMethod(GeneralSpeakActivity isParameter);

    void isMethod(BibleSpeakActivity isParameter);

    void isMethod(SpeakSettingsActivity isParameter);

    void isMethod(DailyReading isParameter);

    void isMethod(DailyReadingList isParameter);

    void isMethod(ReadingPlanSelectorList isParameter);

    void isMethod(SearchIndex isParameter);

    void isMethod(Search isParameter);

    void isMethod(SearchResults isParameter);

    void isMethod(CompareTranslations isParameter);

    void isMethod(FootnoteAndRefActivity isParameter);

    void isMethod(MyNotes isParameter);

    void isMethod(History isParameter);

    void isMethod(Help isParameter);

    // isComment
    void isMethod(TextToSpeechNotificationManager isParameter);

    void isMethod(SpeakWidgetManager isParameter);

    // isComment
    void isMethod(SearchIndexProgressStatus isParameter);

    void isMethod(ProgressStatus isParameter);
}
