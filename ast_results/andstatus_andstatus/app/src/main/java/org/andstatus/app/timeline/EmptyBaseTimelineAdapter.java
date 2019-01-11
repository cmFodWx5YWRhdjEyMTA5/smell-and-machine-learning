// isComment
package org.andstatus.app.timeline;

import android.view.View;
import android.view.ViewGroup;
import org.andstatus.app.context.MyContext;
import org.andstatus.app.timeline.meta.Timeline;
import java.util.Collections;

/**
 * isComment
 */
public class isClassOrIsInterface<T extends ViewItem<T>> extends BaseTimelineAdapter<T> {

    public static final EmptyBaseTimelineAdapter isVariable = new EmptyBaseTimelineAdapter();

    private isConstructor() {
        super(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        return null;
    }
}
