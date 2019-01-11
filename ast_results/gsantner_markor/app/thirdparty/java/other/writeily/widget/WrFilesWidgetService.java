// isComment
package other.writeily.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class isClassOrIsInterface extends RemoteViewsService {

    @Override
    public RemoteViewsFactory isMethod(Intent isParameter) {
        return (new WrFilesWidgetFactory(isMethod(), isNameExpr));
    }
}
