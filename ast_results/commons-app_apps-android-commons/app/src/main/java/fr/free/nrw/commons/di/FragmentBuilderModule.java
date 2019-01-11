// isComment
package fr.free.nrw.commons.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import fr.free.nrw.commons.bookmarks.locations.BookmarkLocationsFragment;
import fr.free.nrw.commons.bookmarks.pictures.BookmarkPicturesFragment;
import fr.free.nrw.commons.category.CategoryImagesListFragment;
import fr.free.nrw.commons.category.SubCategoryListFragment;
import fr.free.nrw.commons.contributions.ContributionsFragment;
import fr.free.nrw.commons.contributions.ContributionsListFragment;
import fr.free.nrw.commons.explore.categories.SearchCategoryFragment;
import fr.free.nrw.commons.explore.images.SearchImageFragment;
import fr.free.nrw.commons.explore.recentsearches.RecentSearchesFragment;
import fr.free.nrw.commons.media.MediaDetailFragment;
import fr.free.nrw.commons.media.MediaDetailPagerFragment;
import fr.free.nrw.commons.nearby.NearbyFragment;
import fr.free.nrw.commons.nearby.NearbyListFragment;
import fr.free.nrw.commons.nearby.NearbyMapFragment;
import fr.free.nrw.commons.nearby.NoPermissionsFragment;
import fr.free.nrw.commons.settings.SettingsFragment;

@Module
@SuppressWarnings({ "isStringConstant", "isStringConstant" })
public abstract class isClassOrIsInterface {

    @ContributesAndroidInjector
    abstract ContributionsListFragment isMethod();

    @ContributesAndroidInjector
    abstract MediaDetailFragment isMethod();

    @ContributesAndroidInjector
    abstract MediaDetailPagerFragment isMethod();

    @ContributesAndroidInjector
    abstract NearbyListFragment isMethod();

    @ContributesAndroidInjector
    abstract NearbyMapFragment isMethod();

    @ContributesAndroidInjector
    abstract NoPermissionsFragment isMethod();

    @ContributesAndroidInjector
    abstract SettingsFragment isMethod();

    @ContributesAndroidInjector
    abstract CategoryImagesListFragment isMethod();

    @ContributesAndroidInjector
    abstract SubCategoryListFragment isMethod();

    @ContributesAndroidInjector
    abstract SearchImageFragment isMethod();

    @ContributesAndroidInjector
    abstract SearchCategoryFragment isMethod();

    @ContributesAndroidInjector
    abstract RecentSearchesFragment isMethod();

    @ContributesAndroidInjector
    abstract ContributionsFragment isMethod();

    @ContributesAndroidInjector
    abstract NearbyFragment isMethod();

    @ContributesAndroidInjector
    abstract BookmarkPicturesFragment isMethod();

    @ContributesAndroidInjector
    abstract BookmarkLocationsFragment isMethod();
}
