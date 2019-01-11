// isComment
package com.owncloud.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.nextcloud.android.sso.InputStreamBinder;

public class isClassOrIsInterface extends Service {

    private InputStreamBinder isVariable;

    @Override
    public IBinder isMethod(Intent isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new InputStreamBinder(this);
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Intent isParameter) {
        return super.isMethod(isNameExpr);
    }
}
