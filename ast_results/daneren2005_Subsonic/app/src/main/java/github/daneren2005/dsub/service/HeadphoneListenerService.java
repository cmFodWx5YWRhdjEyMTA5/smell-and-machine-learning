// isComment
package github.daneren2005.dsub.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import github.daneren2005.dsub.receiver.HeadphonePlugReceiver;
import github.daneren2005.dsub.util.Util;

/**
 * isComment
 */
public class isClassOrIsInterface extends Service {

    private HeadphonePlugReceiver isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new HeadphonePlugReceiver();
        isMethod(isNameExpr, new IntentFilter(isNameExpr.isFieldAccessExpr));
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return null;
    }

    @Override
    public int isMethod(Intent isParameter, int isParameter, int isParameter) {
        if (!isNameExpr.isMethod(this)) {
            isMethod();
        }
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        try {
            if (isNameExpr != null) {
                isMethod(isNameExpr);
            }
        } catch (Exception isParameter) {
        // isComment
        }
    }
}
