// isComment
package org.geometerplus.android.fbreader.config;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class isClassOrIsInterface extends Service {

    private ConfigInterface.Stub isVariable;

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new SQLiteConfig(this);
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            // isComment
            isNameExpr = null;
        }
        super.isMethod();
    }
}
