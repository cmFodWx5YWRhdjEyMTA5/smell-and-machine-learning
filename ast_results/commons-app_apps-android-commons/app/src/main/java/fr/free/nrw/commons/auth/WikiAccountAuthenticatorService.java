// isComment
package fr.free.nrw.commons.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import fr.free.nrw.commons.di.CommonsDaggerService;

public class isClassOrIsInterface extends CommonsDaggerService {

    @Nullable
    private AbstractAccountAuthenticator isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new WikiAccountAuthenticator(this);
    }

    @Nullable
    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr == null ? null : isNameExpr.isMethod();
    }
}
