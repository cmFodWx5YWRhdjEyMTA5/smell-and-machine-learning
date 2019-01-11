// isComment
package com.madgag.agit.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.inject.Inject;
import roboguice.inject.ContextScopedProvider;
import roboguice.service.RoboService;

public class isClassOrIsInterface extends RoboService {

    @Inject
    ContextScopedProvider<SyncAdapter> isVariable;

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod(this).isMethod();
    }
}
