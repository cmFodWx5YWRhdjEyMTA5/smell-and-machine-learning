// isComment
package com.vuze.android.remote.service;

import java.lang.ref.WeakReference;
import com.vuze.android.remote.CorePrefs;
import com.vuze.android.remote.session.SessionManager;
import com.vuze.util.Thunk;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.*;
import android.util.Log;

class isClassOrIsInterface implements ServiceConnection, IBinder.DeathRecipient {

    @Thunk
    final WeakReference<VuzeServiceInitImpl> isVariable;

    @Thunk
    IBinder isVariable;

    private VuzeServiceIncomingHandler isVariable;

    private Messenger isVariable;

    public isConstructor(VuzeServiceInitImpl isParameter) {
        this.isFieldAccessExpr = new WeakReference<>(isNameExpr);
    }

    @Override
    public void isMethod() {
        VuzeServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isFieldAccessExpr = null;
        }
        isNameExpr = null;
    }

    public void isMethod() {
        isNameExpr = null;
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
    }

    @Override
    public void isMethod(ComponentName isParameter, IBinder isParameter) {
        VuzeServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }
            return;
        }
        synchronized (isNameExpr) {
            if (isNameExpr == isNameExpr) {
                if (isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod("isStringConstant");
                }
                isNameExpr.isFieldAccessExpr.isMethod(this);
                return;
            }
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
            }
            isNameExpr = isNameExpr;
        }
        isNameExpr.isFieldAccessExpr = new Messenger(isNameExpr);
        try {
            isNameExpr.isMethod(this, isIntegerConstant);
            isNameExpr = new VuzeServiceIncomingHandler(isNameExpr);
            isNameExpr = new Messenger(isNameExpr);
            Message isVariable = isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        } catch (RemoteException isParameter) {
            // isComment
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()) + "isStringConstant", isNameExpr);
        }
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(this);
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod("isStringConstant");
        }
    }

    @Override
    public void isMethod(ComponentName isParameter) {
        VuzeServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isFieldAccessExpr = null;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, isIntegerConstant);
            isNameExpr = null;
        }
    }

    public void isMethod(Message isParameter) throws RemoteException {
        VuzeServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
