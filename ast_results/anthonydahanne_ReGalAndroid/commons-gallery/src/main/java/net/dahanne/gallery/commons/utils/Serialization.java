// isComment
package net.dahanne.gallery.commons.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import net.dahanne.gallery.commons.model.Album;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static byte[] isMethod(Album isParameter) throws SerializationException {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        try {
            ObjectOutputStream isVariable = new ObjectOutputStream(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        } catch (IOException isParameter) {
            throw new SerializationException(isNameExpr);
        }
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public static Album isMethod(byte[] isParameter) throws SerializationException {
        Album isVariable = null;
        try {
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            ObjectInputStream isVariable = new ObjectInputStream(isNameExpr);
            isNameExpr = (Album) isNameExpr.isMethod();
            isNameExpr.isMethod();
        } catch (StreamCorruptedException isParameter) {
            throw new SerializationException(isNameExpr);
        } catch (IOException isParameter) {
            throw new SerializationException(isNameExpr);
        } catch (ClassNotFoundException isParameter) {
            throw new SerializationException(isNameExpr);
        }
        return isNameExpr;
    }
}
