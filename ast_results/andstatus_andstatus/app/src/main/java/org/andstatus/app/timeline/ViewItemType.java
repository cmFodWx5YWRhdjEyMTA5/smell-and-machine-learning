// isComment
package org.andstatus.app.timeline;

import android.support.annotation.NonNull;
import org.andstatus.app.activity.ActivityViewItem;
import org.andstatus.app.note.ConversationViewItem;
import org.andstatus.app.note.NoteViewItem;
import org.andstatus.app.service.QueueData;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.actor.ActorViewItem;

public enum ViewItemType {

    ACTIVITY(isNameExpr.isFieldAccessExpr),
    NOTE(isNameExpr.isFieldAccessExpr),
    ACTOR(isNameExpr.isFieldAccessExpr),
    CONVERSATION(isNameExpr.isFieldAccessExpr),
    COMMANDS_QUEUE(isNameExpr.isFieldAccessExpr),
    UNKNOWN(isNameExpr.isFieldAccessExpr);

    final ViewItem isVariable;

    isConstructor(ViewItem isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    static ViewItemType isMethod(@NonNull TimelineType isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr;
        }
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            default:
                return isNameExpr;
        }
    }
}
