// isComment
package com.f2prateek.dfg.ui;

import com.f2prateek.dfg.ui.debug.DebugAppContainer;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(injects = DebugAppContainer.class, complete = true, library = true, overrides = true)
public class isClassOrIsInterface {

    @Provides
    @Singleton
    AppContainer isMethod(DebugAppContainer isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    ActivityHierarchyServer isMethod() {
        return new SocketActivityHierarchyServer();
    }
}
