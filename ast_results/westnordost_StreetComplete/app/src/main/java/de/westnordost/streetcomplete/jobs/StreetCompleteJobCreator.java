// isComment
package de.westnordost.streetcomplete.jobs;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;
import javax.inject.Inject;
import javax.inject.Provider;
import de.westnordost.streetcomplete.data.osm.upload.ChangesetAutoCloserJob;

public class isClassOrIsInterface implements JobCreator {

    private final Provider<ChangesetAutoCloserJob> isVariable;

    @Inject
    public isConstructor(Provider<ChangesetAutoCloserJob> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Job isMethod(String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod();
            default:
                return null;
        }
    }
}
