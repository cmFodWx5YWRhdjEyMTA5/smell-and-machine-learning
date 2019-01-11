// isComment
package org.xbmc.api.business;

import java.util.ArrayList;
import org.xbmc.api.object.FileLocation;
import org.xbmc.api.type.DirectoryMask;
import android.content.Context;

/**
 * isComment
 */
public interface isClassOrIsInterface extends IManager {

    /**
     * isComment
     */
    public void isMethod(final DataResponse<String> isParameter, final int isParameter, final Context isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<ArrayList<FileLocation>> isParameter, final int isParameter, final Context isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<ArrayList<FileLocation>> isParameter, final String isParameter, final DirectoryMask isParameter, final int isParameter, final int isParameter, final Context isParameter, final int isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<ArrayList<FileLocation>> isParameter, final String isParameter, final Context isParameter, final int isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<Integer> isParameter, final int isParameter, final Context isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<Boolean> isParameter, final int isParameter, final Context isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<Boolean> isParameter, final int isParameter, final int isParameter, final Context isParameter);

    /**
     * isComment
     */
    public void isMethod(final DataResponse<Boolean> isParameter, final int isParameter, final boolean isParameter, final Context isParameter);
}
