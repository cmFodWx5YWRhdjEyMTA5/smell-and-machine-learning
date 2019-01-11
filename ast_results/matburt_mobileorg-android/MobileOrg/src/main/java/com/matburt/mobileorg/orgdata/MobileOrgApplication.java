// isComment
package com.matburt.mobileorg.orgdata;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.matburt.mobileorg.services.SyncService;
import com.matburt.mobileorg.synchronizers.DropboxSynchronizer;
import com.matburt.mobileorg.synchronizers.NullSynchronizer;
import com.matburt.mobileorg.synchronizers.SDCardSynchronizer;
import com.matburt.mobileorg.synchronizers.SSHSynchronizer;
import com.matburt.mobileorg.synchronizers.Synchronizer;
import com.matburt.mobileorg.synchronizers.UbuntuOneSynchronizer;
import com.matburt.mobileorg.synchronizers.WebDAVSynchronizer;

public class isClassOrIsInterface extends Application {

    private static MobileOrgApplication isVariable;

    public static Context isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = this;
        isNameExpr.isMethod(this);
        isMethod();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
    }

    public void isMethod() {
        String isVariable = isNameExpr.isMethod(isMethod()).isMethod("isStringConstant", "isStringConstant");
        Context isVariable = isMethod();
        if (isNameExpr.isMethod("isStringConstant"))
            isNameExpr.isMethod(new WebDAVSynchronizer(isNameExpr));
        else if (isNameExpr.isMethod("isStringConstant"))
            isNameExpr.isMethod(new SDCardSynchronizer(isNameExpr));
        else if (isNameExpr.isMethod("isStringConstant"))
            isNameExpr.isMethod(new DropboxSynchronizer(isNameExpr));
        else if (isNameExpr.isMethod("isStringConstant"))
            isNameExpr.isMethod(new UbuntuOneSynchronizer(isNameExpr));
        else if (isNameExpr.isMethod("isStringConstant"))
            isNameExpr.isMethod(new SSHSynchronizer(isNameExpr));
        else
            isNameExpr.isMethod(new NullSynchronizer(isNameExpr));
    }
}
