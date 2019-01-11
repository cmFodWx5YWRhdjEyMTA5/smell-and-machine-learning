// isComment
package org.andstatus.app.activity;

import android.support.annotation.NonNull;
import org.andstatus.app.timeline.TimelineData;
import org.andstatus.app.timeline.ViewItem;
import org.andstatus.app.actor.ActorViewItem;

class isClassOrIsInterface extends TimelineDataWrapper<ActorViewItem> {

    isConstructor(TimelineData<ActivityViewItem> isParameter) {
        super(isNameExpr);
    }

    @NonNull
    @Override
    public ActorViewItem isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod();
    }

    @Override
    public int isMethod(long isParameter) {
        if (isNameExpr != isIntegerConstant) {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                ActivityViewItem isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod().isMethod() == isNameExpr) {
                    return isNameExpr;
                } else if (isNameExpr.isMethod()) {
                    for (ViewItem isVariable : isNameExpr.isMethod()) {
                        if (((ActivityViewItem) isNameExpr).isMethod().isMethod() == isNameExpr) {
                            return isNameExpr;
                        }
                    }
                }
            }
        }
        return -isIntegerConstant;
    }
}
