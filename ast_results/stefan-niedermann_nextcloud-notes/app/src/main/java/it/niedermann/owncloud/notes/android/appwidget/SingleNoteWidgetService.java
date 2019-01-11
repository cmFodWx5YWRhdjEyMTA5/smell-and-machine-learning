// isComment
package it.niedermann.owncloud.notes.android.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class isClassOrIsInterface extends RemoteViewsService {

    @Override
    public RemoteViewsFactory isMethod(Intent isParameter) {
        return new SingleNoteWidgetFactory(this.isMethod(), isNameExpr);
    }
}
