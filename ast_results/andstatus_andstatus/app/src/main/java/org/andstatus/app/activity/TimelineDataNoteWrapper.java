// isComment
package org.andstatus.app.activity;

import android.support.annotation.NonNull;
import org.andstatus.app.note.NoteViewItem;
import org.andstatus.app.timeline.TimelineData;
import org.andstatus.app.timeline.ViewItem;

class isClassOrIsInterface extends TimelineDataWrapper<NoteViewItem> {

    isConstructor(TimelineData<ActivityViewItem> isParameter) {
        super(isNameExpr);
    }

    @NonNull
    @Override
    public NoteViewItem isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
    }

    @Override
    public int isMethod(long isParameter) {
        int isVariable = -isIntegerConstant;
        if (isNameExpr != isIntegerConstant) {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                ActivityViewItem isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isFieldAccessExpr.isMethod() == isNameExpr) {
                    return isNameExpr;
                } else if (isNameExpr.isMethod()) {
                    for (ViewItem isVariable : isNameExpr.isMethod()) {
                        if (((ActivityViewItem) isNameExpr).isFieldAccessExpr.isMethod() == isNameExpr) {
                            return isNameExpr;
                        }
                    }
                }
            }
        }
        return -isIntegerConstant;
    }
}
