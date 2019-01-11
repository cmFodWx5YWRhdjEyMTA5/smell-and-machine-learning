// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.content.Context;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import io.github.hidroh.materialistic.appwidget.WidgetConfigActivity;
import io.github.hidroh.materialistic.widget.FavoriteRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.MultiPageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.PopupMenu;
import io.github.hidroh.materialistic.widget.SinglePageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.StoryRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.SubmissionRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.ThreadPreviewRecyclerViewAdapter;

@Module(injects = { AboutActivity.class, AskActivity.class, BestActivity.class, ComposeActivity.class, FavoriteActivity.class, FeedbackActivity.class, ItemActivity.class, JobsActivity.class, ListActivity.class, LoginActivity.class, NewActivity.class, OfflineWebActivity.class, PopularActivity.class, ReleaseNotesActivity.class, SearchActivity.class, SettingsActivity.class, ShowActivity.class, SubmitActivity.class, ThreadPreviewActivity.class, UserActivity.class, WidgetConfigActivity.class, FavoriteFragment.class, ItemFragment.class, ListFragment.class, WebFragment.class, FavoriteRecyclerViewAdapter.class, SinglePageItemRecyclerViewAdapter.class, StoryRecyclerViewAdapter.class, SubmissionRecyclerViewAdapter.class, MultiPageItemRecyclerViewAdapter.class, ThreadPreviewRecyclerViewAdapter.class }, library = true, complete = true)
class isClassOrIsInterface {

    @Provides
    public PopupMenu isMethod() {
        return new PopupMenu.Impl();
    }

    @Provides
    @Singleton
    public CustomTabsDelegate isMethod() {
        return new CustomTabsDelegate();
    }

    @Provides
    @Singleton
    public KeyDelegate isMethod() {
        return new KeyDelegate();
    }

    @Provides
    @Singleton
    public ActionViewResolver isMethod() {
        return new ActionViewResolver();
    }

    @Provides
    public AlertDialogBuilder isMethod() {
        return new AlertDialogBuilder.Impl();
    }

    @SuppressLint("isStringConstant")
    @Provides
    @Singleton
    public ResourcesProvider isMethod(Context isParameter) {
        return isParameter -> isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
