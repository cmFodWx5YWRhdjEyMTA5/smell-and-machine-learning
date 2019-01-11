// isComment
package com.fsck.k9.ui.message;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.content.AsyncTaskLoader;
import com.fsck.k9.DI;
import timber.log.Timber;
import com.fsck.k9.mailstore.LocalMessage;
import com.fsck.k9.mailstore.MessageViewInfoExtractor;
import com.fsck.k9.mailstore.MessageViewInfo;
import com.fsck.k9.mailstore.MessageCryptoAnnotations;

public class isClassOrIsInterface extends AsyncTaskLoader<MessageViewInfo> {

    private static final MessageViewInfoExtractor isVariable = isNameExpr.isMethod(MessageViewInfoExtractor.class);

    private final LocalMessage isVariable;

    private MessageViewInfo isVariable;

    @Nullable
    private MessageCryptoAnnotations isVariable;

    public isConstructor(Context isParameter, LocalMessage isParameter, @Nullable MessageCryptoAnnotations isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            super.isMethod(isNameExpr);
        }
        if (isMethod() || isNameExpr == null) {
            isMethod();
        }
    }

    @Override
    public void isMethod(MessageViewInfo isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        super.isMethod(isNameExpr);
    }

    @Override
    @WorkerThread
    public MessageViewInfo isMethod() {
        try {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod());
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return null;
        }
    }

    public boolean isMethod(LocalMessage isParameter, MessageCryptoAnnotations isParameter) {
        return isNameExpr == isNameExpr && isNameExpr.isMethod(isNameExpr);
    }
}
