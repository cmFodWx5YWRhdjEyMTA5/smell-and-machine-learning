// isComment
package org.ebookdroid.ui.viewer;

import org.ebookdroid.common.settings.books.BookSettings;
import org.ebookdroid.core.DecodeService;
import org.ebookdroid.core.models.DecodingProgressModel;
import org.ebookdroid.core.models.DocumentModel;
import org.ebookdroid.core.models.SearchModel;
import org.ebookdroid.core.models.ZoomModel;
import android.app.Activity;
import android.content.Context;
import org.emdev.ui.actions.IActionController;

public interface isClassOrIsInterface extends IActionController<ViewerActivity> {

    Context isMethod();

    Activity isMethod();

    BookSettings isMethod();

    DecodeService isMethod();

    DocumentModel isMethod();

    SearchModel isMethod();

    IView isMethod();

    IViewController isMethod();

    IActionController<?> isMethod();

    ZoomModel isMethod();

    DecodingProgressModel isMethod();

    void isMethod(int isParameter, float isParameter, float isParameter, boolean isParameter);

    void isMethod(Runnable isParameter);
}
