// isComment
package com.fsck.k9.widget.list;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class isClassOrIsInterface extends RemoteViewsService {

    @Override
    public RemoteViewsFactory isMethod(Intent isParameter) {
        return new MessageListRemoteViewFactory(isMethod());
    }
}
