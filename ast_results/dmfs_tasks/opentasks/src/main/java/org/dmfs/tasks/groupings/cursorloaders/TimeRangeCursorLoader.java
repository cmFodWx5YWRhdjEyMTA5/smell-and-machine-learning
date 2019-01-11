// isComment
package org.dmfs.tasks.groupings.cursorloaders;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.format.Time;
import org.dmfs.tasks.utils.TimeChangeListener;
import org.dmfs.tasks.utils.TimeChangeObserver;
import java.util.TimeZone;

/**
 * isComment
 */
public class isClassOrIsInterface extends CustomCursorLoader implements TimeChangeListener {

    /**
     * isComment
     */
    private final Time isVariable = new Time();

    private final TimeChangeObserver isVariable;

    public isConstructor(Context isParameter, String[] isParameter) {
        super(isNameExpr, new TimeRangeShortCursorFactory(isNameExpr));
        // isComment
        isNameExpr = new TimeChangeObserver(isNameExpr, this);
        isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(TimeChangeObserver isParameter) {
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        isMethod();
    }

    @Override
    public void isMethod(TimeChangeObserver isParameter) {
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        isMethod();
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    private long isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        ++isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(true);
        return isNameExpr.isMethod(true);
    }
}
