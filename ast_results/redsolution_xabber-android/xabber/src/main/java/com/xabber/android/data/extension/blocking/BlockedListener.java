// isComment
package com.xabber.android.data.extension.blocking;

import com.xabber.android.data.entity.AccountJid;
import com.xabber.android.data.entity.UserJid;
import com.xabber.android.data.log.LogManager;
import org.jivesoftware.smackx.blocking.JidsBlockedListener;
import org.jxmpp.jid.Jid;
import java.util.List;

class isClassOrIsInterface implements JidsBlockedListener {

    private static final String isVariable = BlockedListener.class.isMethod();

    private AccountJid isVariable;

    public isConstructor(AccountJid isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(List<Jid> isParameter) {
        for (Jid isVariable : isNameExpr) {
            try {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            } catch (UserJid.UserJidCreateException isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr);
    }
}
