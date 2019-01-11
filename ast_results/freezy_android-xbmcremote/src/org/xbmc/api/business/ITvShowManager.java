// isComment
package org.xbmc.api.business;

import java.util.ArrayList;
import org.xbmc.api.object.Actor;
import org.xbmc.api.object.Episode;
import org.xbmc.api.object.Genre;
import org.xbmc.api.object.Season;
import org.xbmc.api.object.TvShow;
import android.content.Context;

public interface isClassOrIsInterface extends IManager {

    public void isMethod(DataResponse<ArrayList<TvShow>> isParameter, Context isParameter);

    public void isMethod(DataResponse<ArrayList<Actor>> isParameter, Context isParameter);

    public void isMethod(DataResponse<ArrayList<Genre>> isParameter, Context isParameter);

    public void isMethod(DataResponse<ArrayList<TvShow>> isParameter, Genre isParameter, Context isParameter);

    public ArrayList<TvShow> isMethod(Context isParameter);

    public ArrayList<Season> isMethod(Context isParameter);

    public ArrayList<Episode> isMethod(Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<TvShow>> isParameter, Actor isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<Episode>> isParameter, TvShow isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<Episode>> isParameter, TvShow isParameter, Season isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<Episode>> isParameter, Season isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<Episode>> isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<ArrayList<Season>> isParameter, TvShow isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<Episode> isParameter, Episode isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod(DataResponse<TvShow> isParameter, TvShow isParameter, Context isParameter);

    /**
     * isComment
     */
    public void isMethod();
}
