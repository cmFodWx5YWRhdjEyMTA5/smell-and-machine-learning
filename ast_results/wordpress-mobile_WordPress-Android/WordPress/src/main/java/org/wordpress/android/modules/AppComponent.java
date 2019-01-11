// isComment
package org.wordpress.android.modules;

import android.app.Application;
import org.wordpress.android.WordPress;
import org.wordpress.android.fluxc.module.ReleaseBaseModule;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule;
import org.wordpress.android.fluxc.module.ReleaseOkHttpClientModule;
import org.wordpress.android.fluxc.module.ReleaseToolsModule;
import org.wordpress.android.login.di.LoginFragmentModule;
import org.wordpress.android.login.di.LoginServiceModule;
import org.wordpress.android.push.GCMMessageService;
import org.wordpress.android.push.GCMRegistrationIntentService;
import org.wordpress.android.push.NotificationsProcessingService;
import org.wordpress.android.ui.AddQuickPressShortcutActivity;
import org.wordpress.android.ui.DeepLinkingIntentReceiverActivity;
import org.wordpress.android.ui.JetpackConnectionResultActivity;
import org.wordpress.android.ui.JetpackRemoteInstallFragment;
import org.wordpress.android.ui.ShareIntentReceiverActivity;
import org.wordpress.android.ui.ShareIntentReceiverFragment;
import org.wordpress.android.ui.WPWebViewActivity;
import org.wordpress.android.ui.accounts.HelpActivity;
import org.wordpress.android.ui.accounts.LoginActivity;
import org.wordpress.android.ui.accounts.LoginEpilogueActivity;
import org.wordpress.android.ui.accounts.LoginMagicLinkInterceptActivity;
import org.wordpress.android.ui.accounts.SiteCreationActivity;
import org.wordpress.android.ui.accounts.login.LoginEpilogueFragment;
import org.wordpress.android.ui.accounts.signup.SignupEpilogueFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationCategoryFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationDomainAdapter;
import org.wordpress.android.ui.accounts.signup.SiteCreationDomainFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationDomainLoaderFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationService;
import org.wordpress.android.ui.accounts.signup.SiteCreationSiteDetailsFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationThemeAdapter;
import org.wordpress.android.ui.accounts.signup.SiteCreationThemeFragment;
import org.wordpress.android.ui.accounts.signup.SiteCreationThemeLoaderFragment;
import org.wordpress.android.ui.accounts.signup.UsernameChangerFullScreenDialogFragment;
import org.wordpress.android.ui.activitylog.detail.ActivityLogDetailFragment;
import org.wordpress.android.ui.activitylog.list.ActivityLogListActivity;
import org.wordpress.android.ui.activitylog.list.ActivityLogListFragment;
import org.wordpress.android.ui.comments.CommentAdapter;
import org.wordpress.android.ui.comments.CommentDetailFragment;
import org.wordpress.android.ui.comments.CommentsActivity;
import org.wordpress.android.ui.comments.CommentsDetailActivity;
import org.wordpress.android.ui.comments.CommentsListFragment;
import org.wordpress.android.ui.comments.EditCommentActivity;
import org.wordpress.android.ui.history.HistoryAdapter;
import org.wordpress.android.ui.history.HistoryDetailContainerFragment;
import org.wordpress.android.ui.main.MeFragment;
import org.wordpress.android.ui.main.MySiteFragment;
import org.wordpress.android.ui.main.SitePickerActivity;
import org.wordpress.android.ui.main.SitePickerAdapter;
import org.wordpress.android.ui.main.WPMainActivity;
import org.wordpress.android.ui.media.MediaBrowserActivity;
import org.wordpress.android.ui.media.MediaGridAdapter;
import org.wordpress.android.ui.media.MediaGridFragment;
import org.wordpress.android.ui.media.MediaPreviewActivity;
import org.wordpress.android.ui.media.MediaPreviewFragment;
import org.wordpress.android.ui.media.MediaSettingsActivity;
import org.wordpress.android.ui.media.services.MediaDeleteService;
import org.wordpress.android.ui.notifications.NotificationsDetailActivity;
import org.wordpress.android.ui.notifications.NotificationsDetailListFragment;
import org.wordpress.android.ui.notifications.NotificationsListFragment;
import org.wordpress.android.ui.notifications.adapters.NotesAdapter;
import org.wordpress.android.ui.notifications.receivers.NotificationsPendingDraftsReceiver;
import org.wordpress.android.ui.pages.PageListFragment;
import org.wordpress.android.ui.pages.PageParentFragment;
import org.wordpress.android.ui.pages.PagesFragment;
import org.wordpress.android.ui.pages.SearchListFragment;
import org.wordpress.android.ui.people.PeopleInviteFragment;
import org.wordpress.android.ui.people.PeopleListFragment;
import org.wordpress.android.ui.people.PeopleManagementActivity;
import org.wordpress.android.ui.people.PersonDetailFragment;
import org.wordpress.android.ui.people.RoleChangeDialogFragment;
import org.wordpress.android.ui.people.RoleSelectDialogFragment;
import org.wordpress.android.ui.photopicker.PhotoPickerActivity;
import org.wordpress.android.ui.plans.PlanFragment;
import org.wordpress.android.ui.plans.PlansActivity;
import org.wordpress.android.ui.plugins.PluginBrowserActivity;
import org.wordpress.android.ui.plugins.PluginDetailActivity;
import org.wordpress.android.ui.plugins.PluginListFragment;
import org.wordpress.android.ui.posts.AddCategoryFragment;
import org.wordpress.android.ui.posts.EditPostActivity;
import org.wordpress.android.ui.posts.EditPostPreviewFragment;
import org.wordpress.android.ui.posts.EditPostSettingsFragment;
import org.wordpress.android.ui.posts.HistoryListFragment;
import org.wordpress.android.ui.posts.PostListFragment;
import org.wordpress.android.ui.posts.PostPreviewActivity;
import org.wordpress.android.ui.posts.PostPreviewFragment;
import org.wordpress.android.ui.posts.PostSettingsTagsActivity;
import org.wordpress.android.ui.posts.PostsListActivity;
import org.wordpress.android.ui.posts.SelectCategoriesActivity;
import org.wordpress.android.ui.prefs.AccountSettingsFragment;
import org.wordpress.android.ui.prefs.AppSettingsFragment;
import org.wordpress.android.ui.prefs.BlogPreferencesActivity;
import org.wordpress.android.ui.prefs.MyProfileActivity;
import org.wordpress.android.ui.prefs.MyProfileFragment;
import org.wordpress.android.ui.prefs.ReleaseNotesActivity;
import org.wordpress.android.ui.prefs.SiteSettingsFragment;
import org.wordpress.android.ui.prefs.SiteSettingsInterface;
import org.wordpress.android.ui.prefs.SiteSettingsTagDetailFragment;
import org.wordpress.android.ui.prefs.SiteSettingsTagListActivity;
import org.wordpress.android.ui.prefs.notifications.NotificationsSettingsFragment;
import org.wordpress.android.ui.publicize.PublicizeAccountChooserListAdapter;
import org.wordpress.android.ui.publicize.PublicizeButtonPrefsFragment;
import org.wordpress.android.ui.publicize.PublicizeDetailFragment;
import org.wordpress.android.ui.publicize.PublicizeListActivity;
import org.wordpress.android.ui.publicize.PublicizeListFragment;
import org.wordpress.android.ui.publicize.PublicizeWebViewFragment;
import org.wordpress.android.ui.publicize.adapters.PublicizeConnectionAdapter;
import org.wordpress.android.ui.publicize.adapters.PublicizeServiceAdapter;
import org.wordpress.android.ui.quickstart.QuickStartFragment;
import org.wordpress.android.ui.reader.ReaderCommentListActivity;
import org.wordpress.android.ui.reader.ReaderPostDetailFragment;
import org.wordpress.android.ui.reader.ReaderPostListFragment;
import org.wordpress.android.ui.reader.ReaderPostPagerActivity;
import org.wordpress.android.ui.reader.adapters.ReaderBlogAdapter;
import org.wordpress.android.ui.reader.adapters.ReaderCommentAdapter;
import org.wordpress.android.ui.reader.adapters.ReaderPostAdapter;
import org.wordpress.android.ui.reader.adapters.ReaderUserAdapter;
import org.wordpress.android.ui.reader.services.update.ReaderUpdateLogic;
import org.wordpress.android.ui.reader.views.ReaderLikingUsersView;
import org.wordpress.android.ui.reader.views.ReaderSiteHeaderView;
import org.wordpress.android.ui.reader.views.ReaderTagHeaderView;
import org.wordpress.android.ui.reader.views.ReaderWebView;
import org.wordpress.android.ui.stats.StatsAbstractFragment;
import org.wordpress.android.ui.stats.StatsActivity;
import org.wordpress.android.ui.stats.StatsConnectJetpackActivity;
import org.wordpress.android.ui.stats.StatsWidgetConfigureActivity;
import org.wordpress.android.ui.stats.StatsWidgetConfigureAdapter;
import org.wordpress.android.ui.stats.StatsWidgetProvider;
import org.wordpress.android.ui.stats.service.StatsServiceLogic;
import org.wordpress.android.ui.stockmedia.StockMediaPickerActivity;
import org.wordpress.android.ui.suggestion.adapters.SuggestionAdapter;
import org.wordpress.android.ui.themes.ThemeBrowserActivity;
import org.wordpress.android.ui.themes.ThemeBrowserFragment;
import org.wordpress.android.ui.uploads.MediaUploadHandler;
import org.wordpress.android.ui.uploads.PostUploadHandler;
import org.wordpress.android.ui.uploads.UploadService;
import org.wordpress.android.util.HtmlToSpannedConverter;
import org.wordpress.android.util.WPWebViewClient;
import org.wordpress.android.util.image.getters.WPCustomImageGetter;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { ApplicationModule.class, AppConfigModule.class, ReleaseBaseModule.class, ReleaseOkHttpClientModule.class, ReleaseNetworkModule.class, LegacyModule.class, ReleaseToolsModule.class, AndroidSupportInjectionModule.class, ViewModelModule.class, // isComment
LoginAnalyticsModule.class, LoginFragmentModule.class, LoginServiceModule.class, SupportModule.class, ThreadModule.class })
public interface isClassOrIsInterface extends AndroidInjector<WordPress> {

    @Override
    void isMethod(WordPress isParameter);

    void isMethod(WPMainActivity isParameter);

    void isMethod(SiteCreationService isParameter);

    void isMethod(UploadService isParameter);

    void isMethod(MediaUploadHandler isParameter);

    void isMethod(PostUploadHandler isParameter);

    void isMethod(LoginActivity isParameter);

    void isMethod(LoginEpilogueActivity isParameter);

    void isMethod(LoginEpilogueFragment isParameter);

    void isMethod(LoginMagicLinkInterceptActivity isParameter);

    void isMethod(SignupEpilogueFragment isParameter);

    void isMethod(UsernameChangerFullScreenDialogFragment isParameter);

    void isMethod(SiteCreationActivity isParameter);

    void isMethod(SiteCreationCategoryFragment isParameter);

    void isMethod(SiteCreationThemeFragment isParameter);

    void isMethod(SiteCreationThemeLoaderFragment isParameter);

    void isMethod(SiteCreationThemeAdapter isParameter);

    void isMethod(SiteCreationSiteDetailsFragment isParameter);

    void isMethod(SiteCreationDomainFragment isParameter);

    void isMethod(SiteCreationDomainLoaderFragment isParameter);

    void isMethod(SiteCreationDomainAdapter isParameter);

    void isMethod(StatsWidgetConfigureActivity isParameter);

    void isMethod(StatsWidgetConfigureAdapter isParameter);

    void isMethod(StatsActivity isParameter);

    void isMethod(JetpackConnectionResultActivity isParameter);

    void isMethod(StatsConnectJetpackActivity isParameter);

    void isMethod(StatsAbstractFragment isParameter);

    void isMethod(StatsServiceLogic isParameter);

    void isMethod(StatsWidgetProvider isParameter);

    void isMethod(GCMMessageService isParameter);

    void isMethod(GCMRegistrationIntentService isParameter);

    void isMethod(DeepLinkingIntentReceiverActivity isParameter);

    void isMethod(ShareIntentReceiverActivity isParameter);

    void isMethod(ShareIntentReceiverFragment isParameter);

    void isMethod(AddQuickPressShortcutActivity isParameter);

    void isMethod(HelpActivity isParameter);

    void isMethod(CommentDetailFragment isParameter);

    void isMethod(EditCommentActivity isParameter);

    void isMethod(CommentAdapter isParameter);

    void isMethod(CommentsListFragment isParameter);

    void isMethod(CommentsActivity isParameter);

    void isMethod(CommentsDetailActivity isParameter);

    void isMethod(MeFragment isParameter);

    void isMethod(MyProfileActivity isParameter);

    void isMethod(MyProfileFragment isParameter);

    void isMethod(AccountSettingsFragment isParameter);

    void isMethod(MySiteFragment isParameter);

    void isMethod(SitePickerActivity isParameter);

    void isMethod(SitePickerAdapter isParameter);

    void isMethod(SiteSettingsFragment isParameter);

    void isMethod(SiteSettingsInterface isParameter);

    void isMethod(BlogPreferencesActivity isParameter);

    void isMethod(AppSettingsFragment isParameter);

    void isMethod(PeopleManagementActivity isParameter);

    void isMethod(PeopleListFragment isParameter);

    void isMethod(PersonDetailFragment isParameter);

    void isMethod(RoleChangeDialogFragment isParameter);

    void isMethod(PeopleInviteFragment isParameter);

    void isMethod(RoleSelectDialogFragment isParameter);

    void isMethod(PlansActivity isParameter);

    void isMethod(MediaBrowserActivity isParameter);

    void isMethod(MediaGridFragment isParameter);

    void isMethod(MediaPreviewActivity isParameter);

    void isMethod(MediaPreviewFragment isParameter);

    void isMethod(MediaSettingsActivity isParameter);

    void isMethod(PhotoPickerActivity isParameter);

    void isMethod(StockMediaPickerActivity isParameter);

    void isMethod(SiteSettingsTagListActivity isParameter);

    void isMethod(SiteSettingsTagDetailFragment isParameter);

    void isMethod(PublicizeListActivity isParameter);

    void isMethod(PublicizeWebViewFragment isParameter);

    void isMethod(PublicizeDetailFragment isParameter);

    void isMethod(PublicizeListFragment isParameter);

    void isMethod(PublicizeButtonPrefsFragment isParameter);

    void isMethod(EditPostActivity isParameter);

    void isMethod(EditPostSettingsFragment isParameter);

    void isMethod(EditPostPreviewFragment isParameter);

    void isMethod(PostSettingsTagsActivity isParameter);

    void isMethod(PostPreviewActivity isParameter);

    void isMethod(PostPreviewFragment isParameter);

    void isMethod(PostsListActivity isParameter);

    void isMethod(PostListFragment isParameter);

    void isMethod(HistoryListFragment isParameter);

    void isMethod(HistoryAdapter isParameter);

    void isMethod(HistoryDetailContainerFragment isParameter);

    void isMethod(NotificationsListFragment isParameter);

    void isMethod(NotificationsSettingsFragment isParameter);

    void isMethod(NotificationsDetailActivity isParameter);

    void isMethod(NotificationsProcessingService isParameter);

    void isMethod(NotificationsPendingDraftsReceiver isParameter);

    void isMethod(NotificationsDetailListFragment isParameter);

    void isMethod(ReaderCommentListActivity isParameter);

    void isMethod(ReaderUpdateLogic isParameter);

    void isMethod(ReaderPostDetailFragment isParameter);

    void isMethod(ReaderPostListFragment isParameter);

    void isMethod(ReaderCommentAdapter isParameter);

    void isMethod(ReaderPostAdapter isParameter);

    void isMethod(PlanFragment isParameter);

    void isMethod(ReaderSiteHeaderView isParameter);

    void isMethod(ReaderTagHeaderView isParameter);

    void isMethod(ReaderLikingUsersView isParameter);

    void isMethod(ReaderWebView isParameter);

    void isMethod(ReaderPostPagerActivity isParameter);

    void isMethod(ReaderBlogAdapter isParameter);

    void isMethod(ReleaseNotesActivity isParameter);

    void isMethod(WPWebViewActivity isParameter);

    void isMethod(WPWebViewClient isParameter);

    void isMethod(ThemeBrowserActivity isParameter);

    void isMethod(NotesAdapter isParameter);

    void isMethod(ThemeBrowserFragment isParameter);

    void isMethod(MediaDeleteService isParameter);

    void isMethod(SelectCategoriesActivity isParameter);

    void isMethod(ReaderUserAdapter isParameter);

    void isMethod(AddCategoryFragment isParameter);

    void isMethod(HtmlToSpannedConverter isParameter);

    void isMethod(PluginBrowserActivity isParameter);

    void isMethod(ActivityLogListActivity isParameter);

    void isMethod(ActivityLogListFragment isParameter);

    void isMethod(ActivityLogDetailFragment isParameter);

    void isMethod(PluginListFragment isParameter);

    void isMethod(PluginDetailActivity isParameter);

    void isMethod(SuggestionAdapter isParameter);

    void isMethod(WordPressGlideModule isParameter);

    void isMethod(QuickStartFragment isParameter);

    void isMethod(MediaGridAdapter isParameter);

    void isMethod(PagesFragment isParameter);

    void isMethod(PageListFragment isParameter);

    void isMethod(SearchListFragment isParameter);

    void isMethod(PageParentFragment isParameter);

    void isMethod(WPCustomImageGetter isParameter);

    void isMethod(PublicizeAccountChooserListAdapter isParameter);

    void isMethod(PublicizeConnectionAdapter isParameter);

    void isMethod(PublicizeServiceAdapter isParameter);

    void isMethod(JetpackRemoteInstallFragment isParameter);

    // isComment
    @Component.Builder
    interface isClassOrIsInterface {

        @BindsInstance
        AppComponent.Builder isMethod(Application isParameter);

        AppComponent isMethod();
    }
}
