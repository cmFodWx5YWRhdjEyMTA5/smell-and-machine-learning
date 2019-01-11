// isComment
package net.bible.android.control;

import net.bible.android.control.backup.BackupControl;
import net.bible.android.control.bookmark.BookmarkControl;
import net.bible.android.control.comparetranslations.CompareTranslationsControl;
import net.bible.android.control.document.DocumentControl;
import net.bible.android.control.download.DownloadControl;
import net.bible.android.control.footnoteandref.FootnoteAndRefControl;
import net.bible.android.control.footnoteandref.NoteDetailCreator;
import net.bible.android.control.link.LinkControl;
import net.bible.android.control.mynote.MyNoteControl;
import net.bible.android.control.navigation.DocumentBibleBooksFactory;
import net.bible.android.control.navigation.NavigationControl;
import net.bible.android.control.page.PageControl;
import net.bible.android.control.page.PageTiltScrollControlFactory;
import net.bible.android.control.page.window.ActiveWindowPageManagerProvider;
import net.bible.android.control.page.window.WindowControl;
import net.bible.android.control.readingplan.ReadingPlanControl;
import net.bible.android.control.report.ErrorReportControl;
import net.bible.android.control.search.SearchControl;
import net.bible.android.control.speak.SpeakControl;
import net.bible.android.control.versification.BibleTraverser;
import net.bible.android.view.activity.navigation.biblebookactionbar.BibleBookActionBarManager;
import net.bible.android.view.activity.navigation.biblebookactionbar.SortActionBarButton;
import net.bible.android.view.activity.page.BibleKeyHandler;
import net.bible.android.view.activity.page.actionbar.BibleActionBarButton;
import net.bible.android.view.activity.page.actionbar.CommentaryActionBarButton;
import net.bible.android.view.activity.page.actionbar.DictionaryActionBarButton;
import net.bible.android.view.activity.page.actionbar.StrongsActionBarButton;
import net.bible.android.view.activity.page.screen.WindowMenuCommandHandler;
import net.bible.android.view.activity.readingplan.actionbar.ReadingPlanActionBarManager;
import net.bible.android.view.activity.search.searchresultsactionbar.ScriptureToggleActionBarButton;
import net.bible.android.view.activity.search.searchresultsactionbar.SearchResultsActionBarManager;
import net.bible.android.view.activity.speak.actionbarbuttons.SpeakActionBarButton;
import net.bible.android.view.activity.speak.actionbarbuttons.SpeakStopActionBarButton;
import net.bible.service.history.HistoryManager;
import net.bible.service.history.HistoryTraversalFactory;
import net.bible.service.sword.SwordContentFacade;
import net.bible.service.sword.SwordDocumentFacade;
import dagger.Component;

/**
 * isComment
 */
@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface isClassOrIsInterface {

    // isComment
    WarmUp isMethod();

    ErrorReportControl isMethod();

    SwordDocumentFacade isMethod();

    SwordContentFacade isMethod();

    BibleTraverser isMethod();

    NavigationControl isMethod();

    DocumentBibleBooksFactory isMethod();

    WindowControl isMethod();

    ActiveWindowPageManagerProvider isMethod();

    LinkControl isMethod();

    PageTiltScrollControlFactory isMethod();

    HistoryManager isMethod();

    HistoryTraversalFactory isMethod();

    BibleKeyHandler isMethod();

    DocumentControl isMethod();

    BackupControl isMethod();

    BookmarkControl isMethod();

    MyNoteControl isMethod();

    NoteDetailCreator isMethod();

    DownloadControl isMethod();

    PageControl isMethod();

    ReadingPlanControl isMethod();

    SearchControl isMethod();

    CompareTranslationsControl isMethod();

    FootnoteAndRefControl isMethod();

    SpeakControl isMethod();

    BibleActionBarButton isMethod();

    CommentaryActionBarButton isMethod();

    DictionaryActionBarButton isMethod();

    StrongsActionBarButton isMethod();

    SortActionBarButton isMethod();

    SpeakActionBarButton isMethod();

    SpeakStopActionBarButton isMethod();

    ScriptureToggleActionBarButton isMethod();

    ReadingPlanActionBarManager isMethod();

    SearchResultsActionBarManager isMethod();

    BibleBookActionBarManager isMethod();

    WindowMenuCommandHandler isMethod();
}
