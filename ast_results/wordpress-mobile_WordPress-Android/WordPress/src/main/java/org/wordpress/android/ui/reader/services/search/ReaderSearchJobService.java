// isComment
package org.wordpress.android.ui.reader.services.search;

import android.app.job.JobParameters;
import android.app.job.JobService;
import org.wordpress.android.ui.reader.services.ServiceCompletionListener;
import org.wordpress.android.util.AppLog;
import static org.wordpress.android.ui.reader.services.search.ReaderSearchServiceStarter.ARG_OFFSET;
import static org.wordpress.android.ui.reader.services.search.ReaderSearchServiceStarter.ARG_QUERY;

public class isClassOrIsInterface extends JobService implements ServiceCompletionListener {

    private ReaderSearchLogic isVariable;

    @Override
    public boolean isMethod(JobParameters isParameter) {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod(isNameExpr)) {
            String isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            int isVariable = isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return true;
    }

    @Override
    public boolean isMethod(JobParameters isParameter) {
        isMethod(isNameExpr, true);
        return true;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new ReaderSearchLogic(this);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        super.isMethod();
    }

    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isMethod((JobParameters) isNameExpr, true);
    }
}
