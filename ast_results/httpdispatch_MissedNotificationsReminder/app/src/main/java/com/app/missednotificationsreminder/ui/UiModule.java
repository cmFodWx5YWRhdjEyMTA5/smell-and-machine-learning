// isComment
package com.app.missednotificationsreminder.ui;

import com.app.missednotificationsreminder.ui.activity.ApplicationsSelectionActivity;
import com.app.missednotificationsreminder.ui.activity.SettingsActivity;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module(injects = { SettingsActivity.class, ApplicationsSelectionActivity.class }, complete = true, library = true)
public final class isClassOrIsInterface {

    @Provides
    @Singleton
    AppContainer isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    ActivityHierarchyServer isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
