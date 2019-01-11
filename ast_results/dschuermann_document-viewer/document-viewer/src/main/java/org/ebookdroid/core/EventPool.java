// isComment
package org.ebookdroid.core;

import android.graphics.PointF;
import org.ebookdroid.ui.viewer.IViewController.InvalidateSizeReason;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.emdev.ui.gl.GLCanvas;

public class isClassOrIsInterface {

    private static final ConcurrentLinkedQueue<EventGLDraw> isVariable = new ConcurrentLinkedQueue<EventGLDraw>();

    private static final ConcurrentLinkedQueue<EventReset> isVariable = new ConcurrentLinkedQueue<EventReset>();

    private static final ConcurrentLinkedQueue<EventScrollUp> isVariable = new ConcurrentLinkedQueue<EventScrollUp>();

    private static final ConcurrentLinkedQueue<EventScrollDown> isVariable = new ConcurrentLinkedQueue<EventScrollDown>();

    private static final ConcurrentLinkedQueue<EventScrollTo> isVariable = new ConcurrentLinkedQueue<EventScrollTo>();

    private static final ConcurrentLinkedQueue<EventChildLoaded> isVariable = new ConcurrentLinkedQueue<EventChildLoaded>();

    private static final ConcurrentLinkedQueue<EventZoomIn> isVariable = new ConcurrentLinkedQueue<EventZoomIn>();

    private static final ConcurrentLinkedQueue<EventZoomOut> isVariable = new ConcurrentLinkedQueue<EventZoomOut>();

    public static EventGLDraw isMethod(final ViewState isParameter, final GLCanvas isParameter) {
        EventGLDraw isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = new EventGLDraw(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public static EventReset isMethod(final AbstractViewController isParameter, final InvalidateSizeReason isParameter, final boolean isParameter) {
        EventReset isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = new EventReset(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public static AbstractEventScroll<?> isMethod(final AbstractViewController isParameter, final int isParameter) {
        AbstractEventScroll<?> isVariable = null;
        if (isNameExpr > isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = new EventScrollDown(isNameExpr);
            }
        } else {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = new EventScrollUp(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    public static EventScrollTo isMethod(final AbstractViewController isParameter, final int isParameter) {
        EventScrollTo isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = new EventScrollTo(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public static EventChildLoaded isMethod(final AbstractViewController isParameter, final PageTreeNode isParameter) {
        EventChildLoaded isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = new EventChildLoaded(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public static AbstractEventZoom<?> isMethod(final AbstractViewController isParameter, final float isParameter, final float isParameter, final boolean isParameter, PointF isParameter) {
        AbstractEventZoom<?> isVariable = null;
        if (isNameExpr > isNameExpr) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = new EventZoomIn(isNameExpr);
            }
        } else {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = new EventZoomOut(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr;
    }
}
