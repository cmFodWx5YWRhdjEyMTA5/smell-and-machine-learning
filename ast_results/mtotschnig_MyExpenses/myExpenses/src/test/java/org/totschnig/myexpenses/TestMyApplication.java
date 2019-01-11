// isComment
package org.totschnig.myexpenses;

import android.support.annotation.NonNull;
import org.totschnig.myexpenses.di.AppComponent;
import org.totschnig.myexpenses.di.DaggerAppComponent;
import org.totschnig.myexpenses.di.UiModule;
import org.totschnig.myexpenses.testutils.MockAppModule;

public class isClassOrIsInterface extends MyApplication {

    @NonNull
    @Override
    protected AppComponent isMethod() {
        return isNameExpr.isMethod().isMethod(new MockAppModule(this)).isMethod(new UiModule()).isMethod();
    }

    @Override
    public void isMethod() {
    }
}
