// isComment
package de.jurihock.voicesmith.services;

import android.content.Intent;
import android.os.IBinder;
import de.jurihock.voicesmith.DAFX;
import de.jurihock.voicesmith.io.AudioDevice;
import de.jurihock.voicesmith.threads.AudioThread;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AudioService {

    // isComment
    // isComment
    private DAFX isVariable = null;

    public DAFX isMethod() {
        return isNameExpr;
    }

    public void isMethod(DAFX isParameter) {
        if (this.isFieldAccessExpr == isNameExpr)
            return;
        if (isMethod()) {
            isMethod(true);
            this.isFieldAccessExpr = isNameExpr;
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant" + isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod(isMethod()));
            isMethod();
        } else {
            // isComment
            isMethod(true);
            this.isFieldAccessExpr = isNameExpr;
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant" + isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod(isMethod()));
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @Override
    protected AudioThread isMethod(AudioDevice isParameter, AudioDevice isParameter) {
        return isNameExpr.isMethod(this, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return new ServiceBinder<DafxService>(this);
    }
}
