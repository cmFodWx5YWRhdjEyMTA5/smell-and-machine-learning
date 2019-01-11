// isComment
package de.jurihock.voicesmith.services;

import android.content.Intent;
import android.os.IBinder;
import de.jurihock.voicesmith.AAF;
import de.jurihock.voicesmith.io.AudioDevice;
import de.jurihock.voicesmith.threads.AudioThread;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AudioService {

    // isComment
    // isComment
    private AAF isVariable = null;

    public AAF isMethod() {
        return isNameExpr;
    }

    public void isMethod(AAF isParameter) {
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
        return new ServiceBinder<AafService>(this);
    }
}
