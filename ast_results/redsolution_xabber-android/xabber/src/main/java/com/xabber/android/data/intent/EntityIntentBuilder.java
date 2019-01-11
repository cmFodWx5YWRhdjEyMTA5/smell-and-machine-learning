// isComment
package com.xabber.android.data.intent;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.xabber.android.data.log.LogManager;
import com.xabber.android.data.entity.UserJid;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseAccountIntentBuilder<EntityIntentBuilder> {

    private static final String isVariable = EntityIntentBuilder.class.isMethod();

    public isConstructor(Context isParameter, Class<?> isParameter) {
        super(isNameExpr, isNameExpr);
    }

    private UserJid isVariable;

    public EntityIntentBuilder isMethod(UserJid isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    @Override
    void isMethod() {
        super.isMethod();
        if (isNameExpr == null) {
            return;
        }
        if (isMethod() == isIntegerConstant) {
            throw new IllegalStateException("isStringConstant" + isMethod());
        }
        isMethod(isNameExpr.isMethod());
    }

    @Nullable
    public static UserJid isMethod(Intent isParameter) {
        String isVariable = isMethod(isNameExpr, isIntegerConstant);
        if (isNameExpr == null) {
            return null;
        }
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (UserJid.UserJidCreateException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return null;
        }
    }
}
