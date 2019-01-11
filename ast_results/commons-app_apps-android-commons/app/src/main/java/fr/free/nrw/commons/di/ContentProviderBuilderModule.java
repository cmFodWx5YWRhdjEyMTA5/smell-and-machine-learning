// isComment
package fr.free.nrw.commons.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import fr.free.nrw.commons.bookmarks.locations.BookmarkLocationsContentProvider;
import fr.free.nrw.commons.bookmarks.pictures.BookmarkPicturesContentProvider;
import fr.free.nrw.commons.category.CategoryContentProvider;
import fr.free.nrw.commons.contributions.ContributionsContentProvider;
import fr.free.nrw.commons.explore.recentsearches.RecentSearchesContentProvider;
import fr.free.nrw.commons.modifications.ModificationsContentProvider;

@Module
@SuppressWarnings({ "isStringConstant", "isStringConstant" })
public abstract class isClassOrIsInterface {

    @ContributesAndroidInjector
    abstract ContributionsContentProvider isMethod();

    @ContributesAndroidInjector
    abstract ModificationsContentProvider isMethod();

    @ContributesAndroidInjector
    abstract CategoryContentProvider isMethod();

    @ContributesAndroidInjector
    abstract RecentSearchesContentProvider isMethod();

    @ContributesAndroidInjector
    abstract BookmarkPicturesContentProvider isMethod();

    @ContributesAndroidInjector
    abstract BookmarkLocationsContentProvider isMethod();
}
