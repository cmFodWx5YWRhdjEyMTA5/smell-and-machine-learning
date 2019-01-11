// isComment
package com.f2prateek.dfg;

import android.app.Application;
import android.content.Context;
import android.view.WindowManager;
import android.widget.Toast;
import com.f2prateek.dfg.model.Device;
import com.f2prateek.dfg.prefs.FirstRun;
import com.f2prateek.dfg.ui.ActivityHierarchyServer;
import com.f2prateek.ln.DebugLn;
import com.f2prateek.ln.Ln;
import com.f2prateek.rx.preferences.Preference;
import com.segment.analytics.Analytics;
import com.squareup.otto.Bus;
import dagger.ObjectGraph;
import hugo.weaving.DebugLog;
import javax.inject.Inject;
import static com.f2prateek.dfg.Utils.isStorageAvailable;

public class isClassOrIsInterface extends Application {

    ObjectGraph isVariable;

    @Inject
    ActivityHierarchyServer isVariable;

    @Inject
    Bus isVariable;

    @Inject
    WindowManager isVariable;

    @Inject
    DeviceProvider isVariable;

    @Inject
    @FirstRun
    Preference<Boolean> isVariable;

    @Inject
    Analytics isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        isMethod();
        isMethod(isNameExpr);
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(this));
        }
        if (!isMethod()) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            isNameExpr.isMethod("isStringConstant");
        }
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod("isStringConstant");
            Device isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(new Events.DefaultDeviceUpdated(isNameExpr));
            }
            isNameExpr.isMethod(true);
        }
    }

    @DebugLog
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(this));
        isNameExpr.isMethod(this);
    }

    public static DFGApplication isMethod(Context isParameter) {
        return (DFGApplication) isNameExpr.isMethod();
    }

    public void isMethod(Object isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
