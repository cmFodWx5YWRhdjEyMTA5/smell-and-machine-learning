// isComment
package org.totschnig.myexpenses.di;

import org.totschnig.myexpenses.util.CurrencyFormatter;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    CurrencyFormatter isMethod() {
        return isNameExpr.isMethod();
    }
}
