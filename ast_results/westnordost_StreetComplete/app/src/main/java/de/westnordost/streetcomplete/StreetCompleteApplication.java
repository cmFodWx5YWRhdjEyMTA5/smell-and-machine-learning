// isComment
package de.westnordost.streetcomplete;

import android.app.Application;
import com.evernote.android.job.JobManager;
import com.squareup.leakcanary.LeakCanary;
import java.util.concurrent.FutureTask;
import javax.inject.Inject;
import de.westnordost.countryboundaries.CountryBoundaries;
import de.westnordost.streetcomplete.jobs.StreetCompleteJobCreator;
import de.westnordost.streetcomplete.tangram.TangramQuestSpriteSheetCreator;

public class isClassOrIsInterface extends Application {

    @Inject
    FutureTask<CountryBoundaries> isVariable;

    @Inject
    TangramQuestSpriteSheetCreator isVariable;

    @Inject
    StreetCompleteJobCreator isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr.isMethod(this)) {
            // isComment
            return;
        }
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod().isMethod(this);
        isNameExpr.isMethod(this).isMethod(isNameExpr);
        isMethod();
    }

    /**
     * isComment
     */
    private void isMethod() {
        // isComment
        new Thread(() -> isNameExpr.isMethod()).isMethod();
        // isComment
        new Thread(isNameExpr).isMethod();
    }
}
