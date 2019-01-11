// isComment
package com.nilhcem.hostseditor;

import android.app.Application;
import android.content.Context;
import com.nilhcem.hostseditor.core.dagger.DaggerHostsEditorComponent;
import com.nilhcem.hostseditor.core.dagger.HostsEditorComponent;
import com.nilhcem.hostseditor.core.dagger.HostsEditorModule;
import com.nilhcem.hostseditor.core.log.ReleaseTree;
import timber.log.Timber;

public class isClassOrIsInterface extends Application {

    private HostsEditorComponent isVariable;

    public static HostsEditorApplication isMethod(Context isParameter) {
        return (HostsEditorApplication) isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
        isMethod();
    }

    public HostsEditorComponent isMethod() {
        return isNameExpr;
    }

    private void isMethod() {
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new Timber.DebugTree());
        } else {
            isNameExpr.isMethod(new ReleaseTree());
        }
    }

    private void isMethod() {
        isNameExpr = isNameExpr.isMethod().isMethod(new HostsEditorModule()).isMethod();
    }
}
