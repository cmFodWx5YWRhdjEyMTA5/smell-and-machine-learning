// isComment
package com.concentricsky.android.khanacademy.app;

import android.app.Activity;
import android.os.Bundle;
import com.concentricsky.android.khanacademy.data.KADataService;
import com.concentricsky.android.khanacademy.data.KADataService.ServiceUnavailableException;
import com.concentricsky.android.khanacademy.data.KADataServiceProviderImpl;
import com.concentricsky.android.khanacademy.util.ObjectCallback;

public abstract class isClassOrIsInterface extends Activity implements KADataService.Provider {

    public static final String isVariable = KADataServiceProviderActivityBase.class.isMethod();

    private KADataServiceProviderImpl isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = new KADataServiceProviderImpl(this);
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = null;
        super.isMethod();
    }

    // isComment
    @Override
    public KADataService isMethod() throws ServiceUnavailableException {
        return isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod(ObjectCallback<KADataService> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(ObjectCallback<KADataService> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
