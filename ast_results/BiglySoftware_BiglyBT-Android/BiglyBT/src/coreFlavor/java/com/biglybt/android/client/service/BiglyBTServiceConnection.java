// isComment
package com.biglybt.android.client.service;

import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;
import com.biglybt.android.client.BiglyBTApp;
import com.biglybt.android.client.CorePrefs;
import com.biglybt.android.client.session.SessionManager;
import com.biglybt.util.Thunk;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.*;
import android.util.Log;

class isClassOrIsInterface implements ServiceConnection, IBinder.DeathRecipient {

    @Thunk
    final WeakReference<BiglyBTServiceInitImpl> isVariable;

    @Thunk
    IBinder isVariable;

    private BiglyBTServiceIncomingHandler isVariable;

    private Messenger isVariable;

    public isConstructor(BiglyBTServiceInitImpl isParameter) {
        this.isFieldAccessExpr = new WeakReference<>(isNameExpr);
    }

    @Override
    public void isMethod() {
        BiglyBTServiceInitImpl isVariable = isNameExpr.isMethod();
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
        BiglyBTServiceInitImpl isVariable = isNameExpr.isMethod();
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
            isNameExpr = new BiglyBTServiceIncomingHandler(isNameExpr);
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
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(this);
        } else {
            // isComment
            try {
                isNameExpr.isMethod().isMethod(this);
            } catch (Throwable isParameter) {
            }
        }
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod("isStringConstant");
        }
    }

    @Override
    public void isMethod(ComponentName isParameter) {
        BiglyBTServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isFieldAccessExpr = null;
        }
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod(this, isIntegerConstant);
            } catch (NoSuchElementException isParameter) {
            }
            isNameExpr = null;
        }
    }

    public void isMethod(Message isParameter) throws RemoteException {
        BiglyBTServiceInitImpl isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
