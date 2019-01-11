// isComment
package com.eleybourn.bookcatalogue.backup;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.eleybourn.bookcatalogue.database.SerializationUtils.DeserializationException;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    public enum BackupEntityType {

        Cover,
        Books,
        Info,
        Database,
        Preferences,
        BooklistStyle
    }

    /**
     * isComment
     */
    public String isMethod();

    /**
     * isComment
     */
    BackupEntityType isMethod();

    /**
     * isComment
     */
    InputStream isMethod() throws IOException;

    /**
     * isComment
     */
    void isMethod(File isParameter) throws IOException;

    /**
     * isComment
     */
    void isMethod(File isParameter) throws IOException;

    /**
     * isComment
     */
    public Bundle isMethod() throws IOException;

    /**
     * isComment
     */
    public void isMethod(SharedPreferences isParameter) throws IOException;

    /**
     * isComment
     */
    public Serializable isMethod() throws IOException, DeserializationException;

    /**
     * isComment
     */
    public Date isMethod();
}
