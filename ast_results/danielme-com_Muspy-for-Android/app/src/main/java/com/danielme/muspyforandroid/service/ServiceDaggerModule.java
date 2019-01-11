// isComment
package com.danielme.muspyforandroid.service;

import com.danielme.muspyforandroid.repository.rest.coverartarchive.CoverResource;
import com.danielme.muspyforandroid.repository.rest.muspy.resources.ArtistResource;
import com.danielme.muspyforandroid.repository.rest.muspy.resources.ReleaseResource;
import com.danielme.muspyforandroid.repository.rest.muspy.resources.UserResource;
import com.danielme.muspyforandroid.service.impl.ArtistServiceImpl;
import com.danielme.muspyforandroid.service.impl.ReleaseServiceImpl;
import com.danielme.muspyforandroid.service.impl.UserServiceImpl;
import com.securepreferences.SecurePreferences;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    ArtistService isMethod(ArtistResource isParameter, com.danielme.muspyforandroid.repository.rest.musicbrainz.resources.ArtistResource isParameter, UserService isParameter) {
        return new ArtistServiceImpl(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    ReleaseService isMethod(ReleaseResource isParameter, com.danielme.muspyforandroid.repository.rest.musicbrainz.resources.ReleaseResource isParameter, UserService isParameter, CoverResource isParameter) {
        return new ReleaseServiceImpl(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    UserService isMethod(SecurePreferences isParameter, UserResource isParameter, com.danielme.muspyforandroid.repository.rest.lastfm.resources.UserResource isParameter) {
        return new UserServiceImpl(isNameExpr, isNameExpr, isNameExpr);
    }
}
