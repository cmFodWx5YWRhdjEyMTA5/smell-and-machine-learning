// isComment
package com.xabber.android.data.intent;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.xabber.android.data.log.LogManager;
import com.xabber.android.data.entity.AccountJid;
import org.jxmpp.stringprep.XmppStringprepException;

class isClassOrIsInterface<T extends BaseAccountIntentBuilder<?>> extends SegmentIntentBuilder<T> {

    private static final String isVariable = BaseAccountIntentBuilder.class.isMethod();

    private AccountJid isVariable;

    public isConstructor(Context isParameter, Class<?> isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    public T isMethod(AccountJid isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return (T) this;
    }

    @Override
    void isMethod() {
        super.isMethod();
        if (isNameExpr == null) {
            return;
        }
        if (isMethod() != isIntegerConstant) {
            throw new IllegalStateException("isStringConstant" + isMethod());
        }
        isMethod(isNameExpr.isMethod());
    }

    @Nullable
    public static AccountJid isMethod(Intent isParameter) {
        try {
            String isVariable = isMethod(isNameExpr, isIntegerConstant);
            if (isNameExpr != null) {
                return isNameExpr.isMethod(isNameExpr);
            }
        } catch (XmppStringprepException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return null;
    }
}
