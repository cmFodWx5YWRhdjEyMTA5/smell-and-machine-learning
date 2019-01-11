// isComment
package de.danoeh.antennapod.config;

import de.danoeh.antennapod.core.DBTasksCallbacks;
import de.danoeh.antennapod.core.preferences.UserPreferences;
import de.danoeh.antennapod.core.storage.APDownloadAlgorithm;
import de.danoeh.antennapod.core.storage.AutomaticDownloadAlgorithm;
import de.danoeh.antennapod.core.storage.EpisodeCleanupAlgorithm;

public class isClassOrIsInterface implements DBTasksCallbacks {

    @Override
    public AutomaticDownloadAlgorithm isMethod() {
        return new APDownloadAlgorithm();
    }

    @Override
    public EpisodeCleanupAlgorithm isMethod() {
        return isNameExpr.isMethod();
    }
}
