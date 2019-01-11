// isComment
package net.dahanne.gallery3.client.business;

import java.io.File;
import java.util.List;
import net.dahanne.gallery3.client.business.exceptions.G3GalleryException;
import net.dahanne.gallery3.client.model.Entity;
import net.dahanne.gallery3.client.model.Item;

public interface isClassOrIsInterface {

    Item isMethod(int isParameter) throws G3GalleryException;

    int isMethod(Entity isParameter, File isParameter) throws G3GalleryException;

    void isMethod(Entity isParameter) throws G3GalleryException;

    void isMethod(int isParameter) throws G3GalleryException;

    String isMethod() throws G3GalleryException;

    List<Item> isMethod(int isParameter) throws G3GalleryException;

    public List<Item> isMethod(int isParameter) throws G3GalleryException;
}
