// isComment
package net.dahanne.gallery.commons.remote;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import net.dahanne.gallery.commons.model.Album;
import net.dahanne.gallery.commons.model.Picture;

public interface isClassOrIsInterface {

    /**
     * isComment
     */
    public abstract void isMethod() throws ImpossibleToLoginException;

    /**
     * isComment
     */
    public abstract int isMethod(String isParameter, int isParameter, String isParameter, String isParameter, String isParameter) throws GalleryConnectionException;

    /**
     * isComment
     */
    public abstract int isMethod(String isParameter, int isParameter, File isParameter, String isParameter, String isParameter, String isParameter) throws GalleryConnectionException;

    /**
     * isComment
     */
    public abstract InputStream isMethod(String isParameter) throws GalleryConnectionException;

    /**
     * isComment
     */
    public Collection<Picture> isMethod(int isParameter) throws GalleryConnectionException;

    /**
     * isComment
     */
    public abstract Map<Integer, Album> isMethod(String isParameter) throws GalleryConnectionException;

    /**
     * isComment
     */
    public abstract Album isMethod(int isParameter) throws GalleryConnectionException;
}
