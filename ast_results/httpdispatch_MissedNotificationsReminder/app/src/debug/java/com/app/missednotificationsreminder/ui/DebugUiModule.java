// isComment
package com.app.missednotificationsreminder.ui;

import com.app.missednotificationsreminder.di.qualifiers.IsInstrumentationTest;
import com.app.missednotificationsreminder.ui.debug.DebugAppContainer;
import com.jakewharton.u2020.ui.debug.DebugView;
import com.jakewharton.u2020.ui.debug.SocketActivityHierarchyServer;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module(injects = { DebugAppContainer.class, DebugView.class }, complete = true, library = true, overrides = true)
public class isClassOrIsInterface {

    @Provides
    @Singleton
    AppContainer isMethod(DebugAppContainer isParameter, @IsInstrumentationTest boolean isParameter) {
        // isComment
        return isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr;
    }

    @Provides
    @Singleton
    ActivityHierarchyServer isMethod() {
        return new SocketActivityHierarchyServer();
    }
}
