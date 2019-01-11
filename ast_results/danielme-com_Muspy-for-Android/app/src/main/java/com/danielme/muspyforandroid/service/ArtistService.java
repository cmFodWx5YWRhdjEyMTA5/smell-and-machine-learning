// isComment
package com.danielme.muspyforandroid.service;

import com.danielme.muspyforandroid.exceptions.HttpStatusException;
import com.danielme.muspyforandroid.model.Artist;
import com.danielme.muspyforandroid.model.ArtistMb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface isClassOrIsInterface {

    enum IMPORT_RESULT {

        SUCCESS, ERROR, PENDING
    }

    ArrayList<Artist> isMethod() throws IOException;

    ArtistMb isMethod(String isParameter, int isParameter, int isParameter) throws IOException, HttpStatusException;

    boolean isMethod(String isParameter) throws IOException;

    boolean isMethod(String isParameter) throws IOException;

    List<Artist> isMethod(ArtistMb isParameter);

    IMPORT_RESULT isMethod(String isParameter, String isParameter, String isParameter) throws IOException;
}
