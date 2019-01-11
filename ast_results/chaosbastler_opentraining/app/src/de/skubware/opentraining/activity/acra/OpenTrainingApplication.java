// isComment
package de.skubware.opentraining.activity.acra;

import org.acra.*;
import org.acra.annotation.*;
import android.app.Application;
import de.skubware.opentraining.BuildConfig;
import de.skubware.opentraining.R;

@ReportsCrashes(// isComment
formKey = "isStringConstant", mode = isNameExpr.isFieldAccessExpr, resDialogText = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, // isComment
resDialogCommentPrompt = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, // isComment
resDialogOkToast = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends Application {

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        if (!isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(this);
            // isComment
            isNameExpr.isMethod().isMethod(new ACRACrashReportMailer());
        }
    }
}
