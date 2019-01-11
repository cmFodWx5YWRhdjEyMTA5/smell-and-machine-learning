// isComment
package com.app.missednotificationsreminder;

import com.jakewharton.u2020.data.DebugDataModule;
import com.app.missednotificationsreminder.di.qualifiers.IsInstrumentationTest;
import com.app.missednotificationsreminder.ui.DebugUiModule;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module(addsTo = ApplicationModule.class, includes = { DebugUiModule.class, DebugDataModule.class }, overrides = true)
public final class isClassOrIsInterface {

    // isComment
    // isComment
    static boolean isVariable = true;

    @Provides
    @Singleton
    @IsInstrumentationTest
    boolean isMethod() {
        return isNameExpr;
    }
}
