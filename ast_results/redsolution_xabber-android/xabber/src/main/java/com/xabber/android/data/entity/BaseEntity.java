// isComment
package com.xabber.android.data.entity;

import android.support.annotation.NonNull;
import com.xabber.android.data.log.LogManager;
import org.jxmpp.jid.Jid;

/**
 * isComment
 */
public class isClassOrIsInterface extends AccountRelated implements Comparable<BaseEntity> {

    @NonNull
    protected final UserJid isVariable;

    private static int isVariable = isIntegerConstant;

    protected isConstructor(@NonNull AccountJid isParameter, @NonNull UserJid isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr++;
    }

    public isConstructor(BaseEntity isParameter) {
        this(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    public UserJid isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = super.isMethod();
        isNameExpr = isNameExpr * isNameExpr + (isNameExpr.isMethod());
        return isNameExpr;
    }

    public boolean isMethod(AccountJid isParameter, UserJid isParameter) {
        return this.isFieldAccessExpr.isMethod(isNameExpr) && this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(AccountJid isParameter, Jid isParameter) {
        return this.isFieldAccessExpr.isMethod(isNameExpr) && this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (!super.isMethod(isNameExpr))
            return true;
        BaseEntity isVariable = (BaseEntity) isNameExpr;
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod(@NonNull BaseEntity isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        return isIntegerConstant;
    }

    @Override
    public String isMethod() {
        return isNameExpr + "isStringConstant" + isNameExpr;
    }
}
