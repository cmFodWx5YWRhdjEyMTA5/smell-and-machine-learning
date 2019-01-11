// isComment
package com.danielme.muspyforandroid;

import com.danielme.muspyforandroid.repository.rest.coverartarchive.CovertArchiveApiDaggerModule;
import com.danielme.muspyforandroid.repository.rest.lastfm.LastfmApiDaggerModule;
import com.danielme.muspyforandroid.repository.rest.musicbrainz.MusicBrainzApiDaggerModule;
import com.danielme.muspyforandroid.repository.rest.muspy.MuspyApiDaggerModule;
import com.danielme.muspyforandroid.service.ServiceDaggerModule;
import com.danielme.muspyforandroid.ui.activities.ArtistDetailActivity;
import com.danielme.muspyforandroid.ui.activities.HomeActivity;
import com.danielme.muspyforandroid.ui.activities.LaunchActivity;
import com.danielme.muspyforandroid.ui.activities.LoginActivity;
import com.danielme.muspyforandroid.ui.activities.RegisterActivity;
import com.danielme.muspyforandroid.ui.activities.ReleaseActivity;
import com.danielme.muspyforandroid.ui.activities.ResetActivity;
import com.danielme.muspyforandroid.ui.activities.WelcomeActivity;
import com.danielme.muspyforandroid.ui.fragments.AccountFragment;
import com.danielme.muspyforandroid.ui.fragments.ArtistReleasesFragment;
import com.danielme.muspyforandroid.ui.fragments.LastfmFragment;
import com.danielme.muspyforandroid.ui.fragments.MyArtistsFragment;
import com.danielme.muspyforandroid.ui.fragments.ReleaseFragment;
import com.danielme.muspyforandroid.ui.fragments.ReleasesFragment;
import com.danielme.muspyforandroid.ui.fragments.SearchArtistFragment;
import com.danielme.muspyforandroid.ui.recyclerview.GenericRecyclerViewFragment;
import com.danielme.muspyforandroid.widget.WidgetIntentService;
import com.danielme.muspyforandroid.widget.WidgetProvider;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = { ApplicationDaggerModule.class, MuspyApiDaggerModule.class, LastfmApiDaggerModule.class, MusicBrainzApiDaggerModule.class, ServiceDaggerModule.class, CovertArchiveApiDaggerModule.class })
public interface isClassOrIsInterface {

    void isMethod(HomeActivity isParameter);

    void isMethod(LaunchActivity isParameter);

    void isMethod(ArtistDetailActivity isParameter);

    void isMethod(WidgetIntentService isParameter);

    void isMethod(LoginActivity isParameter);

    void isMethod(ResetActivity isParameter);

    void isMethod(RegisterActivity isParameter);

    void isMethod(AccountFragment isParameter);

    void isMethod(LastfmFragment isParameter);

    void isMethod(ReleasesFragment isParameter);

    void isMethod(ArtistReleasesFragment isParameter);

    void isMethod(MyArtistsFragment isParameter);

    void isMethod(ReleaseFragment isParameter);

    void isMethod(SearchArtistFragment isParameter);

    void isMethod(ReleaseActivity isParameter);

    void isMethod(GenericRecyclerViewFragment isParameter);

    void isMethod(WidgetProvider isParameter);

    void isMethod(WelcomeActivity isParameter);
}
