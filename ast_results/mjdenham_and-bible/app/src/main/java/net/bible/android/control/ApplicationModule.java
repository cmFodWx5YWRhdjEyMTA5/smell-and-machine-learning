// isComment
package net.bible.android.control;

import net.bible.android.common.resource.AndroidResourceProvider;
import net.bible.android.common.resource.ResourceProvider;
import net.bible.android.control.download.DownloadControl;
import net.bible.android.control.download.DownloadQueue;
import net.bible.android.control.email.Emailer;
import net.bible.android.control.email.EmailerImpl;
import net.bible.android.control.event.ABEventBus;
import net.bible.android.control.event.EventManager;
import net.bible.android.control.page.window.ActiveWindowPageManagerProvider;
import net.bible.android.control.page.window.WindowControl;
import net.bible.service.download.RepoFactory;
import net.bible.service.font.FontControl;
import net.bible.service.sword.SwordDocumentFacade;
import java.util.concurrent.Executors;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    @Provides
    @ApplicationScope
    public DownloadControl isMethod(SwordDocumentFacade isParameter, RepoFactory isParameter) {
        return new DownloadControl(new DownloadQueue(isNameExpr.isMethod(), isNameExpr), isNameExpr, isNameExpr.isMethod(), isNameExpr);
    }

    @Provides
    @ApplicationScope
    public ActiveWindowPageManagerProvider isMethod(WindowControl isParameter) {
        return isNameExpr;
    }

    @Provides
    @ApplicationScope
    public ResourceProvider isMethod(AndroidResourceProvider isParameter) {
        return isNameExpr;
    }

    @Provides
    @ApplicationScope
    public EventManager isMethod() {
        return isNameExpr.isMethod();
    }

    @Provides
    @ApplicationScope
    public Emailer isMethod(EmailerImpl isParameter) {
        return isNameExpr;
    }
}
