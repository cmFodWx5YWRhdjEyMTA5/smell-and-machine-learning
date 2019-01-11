// isComment
package org.xbmc.api.data;

import java.util.ArrayList;
import org.xbmc.api.business.INotifiableManager;
import org.xbmc.api.object.Actor;
import org.xbmc.api.object.Episode;
import org.xbmc.api.object.Genre;
import org.xbmc.api.object.ICoverArt;
import org.xbmc.api.object.Season;
import org.xbmc.api.object.TvShow;
import android.graphics.Bitmap;

public interface isClassOrIsInterface extends IClient {

    public ArrayList<TvShow> isMethod(INotifiableManager isParameter, int isParameter, String isParameter, boolean isParameter);

    public ArrayList<Actor> isMethod(INotifiableManager isParameter);

    public ArrayList<Genre> isMethod(INotifiableManager isParameter);

    /**
     * isComment
     */
    public ArrayList<TvShow> isMethod(INotifiableManager isParameter, Genre isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<TvShow> isMethod(INotifiableManager isParameter, Actor isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Episode> isMethod(INotifiableManager isParameter, TvShow isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Episode> isMethod(INotifiableManager isParameter, Season isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Episode> isMethod(INotifiableManager isParameter, TvShow isParameter, Season isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Episode> isMethod(INotifiableManager isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Episode> isMethod(INotifiableManager isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Season> isMethod(INotifiableManager isParameter, TvShow isParameter, boolean isParameter);

    /**
     * isComment
     */
    public ArrayList<Season> isMethod(INotifiableManager isParameter, int isParameter, String isParameter, boolean isParameter);

    /**
     * isComment
     */
    public Bitmap isMethod(INotifiableManager isParameter, ICoverArt isParameter, int isParameter);

    /**
     * isComment
     */
    public Episode isMethod(INotifiableManager isParameter, Episode isParameter);

    /**
     * isComment
     */
    public TvShow isMethod(INotifiableManager isParameter, TvShow isParameter);
}
