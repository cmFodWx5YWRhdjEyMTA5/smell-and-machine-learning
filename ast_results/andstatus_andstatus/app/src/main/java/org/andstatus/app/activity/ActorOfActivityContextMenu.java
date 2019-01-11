// isComment
package org.andstatus.app.activity;

import android.support.annotation.NonNull;
import org.andstatus.app.note.NoteEditorContainer;
import org.andstatus.app.actor.ActorViewItem;
import org.andstatus.app.view.MyContextMenu;

public class isClassOrIsInterface extends org.andstatus.app.actor.ActorContextMenu {

    public isConstructor(NoteEditorContainer isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    protected ActorViewItem isMethod(ActivityViewItem isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }
}
