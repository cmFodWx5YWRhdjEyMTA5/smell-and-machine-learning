// isComment
package org.ebookdroid.ui.viewer;

import org.ebookdroid.common.settings.types.PageAlign;
import org.ebookdroid.core.EventGLDraw;
import org.ebookdroid.core.Page;
import org.ebookdroid.core.ViewState;
import org.ebookdroid.core.events.ZoomListener;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.WorkerThread;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.emdev.ui.progress.IProgressIndicator;

public interface isClassOrIsInterface extends ZoomListener {

    @WorkerThread
    void isMethod(IProgressIndicator isParameter);

    void isMethod();

    /*isComment*/
    void isMethod(int isParameter);

    void isMethod(int isParameter, float isParameter, float isParameter);

    void isMethod(int isParameter, RectF isParameter, boolean isParameter);

    RectF isMethod(PageAlign isParameter, float isParameter, int isParameter, int isParameter);

    void isMethod(InvalidateSizeReason isParameter, Page isParameter);

    int isMethod();

    int isMethod(ViewState isParameter, int isParameter, int isParameter);

    int isMethod();

    void isMethod(int isParameter);

    void isMethod();

    void isMethod(ViewState isParameter);

    void isMethod(PageAlign isParameter);

    /*isComment*/
    IActivityController isMethod();

    IView isMethod();

    void isMethod();

    void isMethod();

    public static enum InvalidateSizeReason {

        INIT, LAYOUT, PAGE_ALIGN, PAGE_LOADED
    }

    boolean isMethod(boolean isParameter, boolean isParameter, Rect isParameter, Rect isParameter);

    Rect isMethod();

    boolean isMethod(Page isParameter, ViewState isParameter, RectF isParameter);

    boolean isMethod(MotionEvent isParameter);

    void isMethod(int isParameter, final int isParameter);

    boolean isMethod(final KeyEvent isParameter);

    void isMethod();

    void isMethod(EventGLDraw isParameter);

    void isMethod(ViewState isParameter, Page isParameter);

    void isMethod();

    void isMethod();
}
