// isComment
package org.ebookdroid.ui.library;

import org.ebookdroid.common.settings.books.Bookmark;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import org.emdev.common.filesystem.FileSystemScanner;

public interface isClassOrIsInterface extends FileSystemScanner.ProgressListener {

    Context isMethod();

    Activity isMethod();

    void isMethod(File isParameter);

    void isMethod(Uri isParameter, Bookmark isParameter);

    void isMethod(String isParameter, ImageView isParameter, int isParameter);
}
