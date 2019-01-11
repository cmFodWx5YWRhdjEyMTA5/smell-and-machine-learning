// isComment
package org.wordpress.android.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import org.wordpress.android.ui.JetpackRemoteInstallViewModel;
import org.wordpress.android.ui.reader.viewmodels.ReaderPostListViewModel;
import org.wordpress.android.viewmodel.ViewModelFactory;
import org.wordpress.android.viewmodel.ViewModelKey;
import org.wordpress.android.viewmodel.activitylog.ActivityLogDetailViewModel;
import org.wordpress.android.viewmodel.activitylog.ActivityLogViewModel;
import org.wordpress.android.viewmodel.history.HistoryViewModel;
import org.wordpress.android.viewmodel.pages.PageListViewModel;
import org.wordpress.android.viewmodel.pages.PageParentViewModel;
import org.wordpress.android.viewmodel.pages.PagesViewModel;
import org.wordpress.android.viewmodel.pages.SearchListViewModel;
import org.wordpress.android.viewmodel.plugins.PluginBrowserViewModel;
import org.wordpress.android.viewmodel.posts.PostListViewModel;
import org.wordpress.android.viewmodel.quickstart.QuickStartViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class isClassOrIsInterface {

    @Binds
    @IntoMap
    @ViewModelKey(PluginBrowserViewModel.class)
    abstract ViewModel isMethod(PluginBrowserViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(ActivityLogViewModel.class)
    abstract ViewModel isMethod(ActivityLogViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(ActivityLogDetailViewModel.class)
    abstract ViewModel isMethod(ActivityLogDetailViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(PagesViewModel.class)
    abstract ViewModel isMethod(PagesViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(SearchListViewModel.class)
    abstract ViewModel isMethod(SearchListViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(PageListViewModel.class)
    abstract ViewModel isMethod(PageListViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(PageParentViewModel.class)
    abstract ViewModel isMethod(PageParentViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(ReaderPostListViewModel.class)
    abstract ViewModel isMethod(ReaderPostListViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(JetpackRemoteInstallViewModel.class)
    abstract ViewModel isMethod(JetpackRemoteInstallViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(QuickStartViewModel.class)
    abstract ViewModel isMethod(QuickStartViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel.class)
    abstract ViewModel isMethod(HistoryViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(PostListViewModel.class)
    abstract ViewModel isMethod(PostListViewModel isParameter);

    @Binds
    abstract ViewModelProvider.Factory isMethod(ViewModelFactory isParameter);
}
