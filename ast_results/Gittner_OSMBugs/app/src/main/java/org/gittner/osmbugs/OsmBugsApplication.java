// isComment
package org.gittner.osmbugs;

import android.app.Application;
import org.androidannotations.annotations.EApplication;
import org.gittner.osmbugs.api.Apis;
import org.gittner.osmbugs.platforms.Platforms;
import org.gittner.osmbugs.statics.Images;
import org.gittner.osmbugs.statics.Settings;
import org.osmdroid.config.Configuration;
import timber.log.Timber;

@EApplication
public class isClassOrIsInterface extends Application {

    @Override
    public void isMethod() {
        super.isMethod();
        /*isComment*/
        isNameExpr.isMethod(new Timber.DebugTree());
        /*isComment*/
        isNameExpr.isMethod(this);
        /*isComment*/
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        /*isComment*/
        /*isComment*/
        isNameExpr.isMethod().isMethod(isMethod());
        /*isComment*/
        int isVariable = isNameExpr.isMethod();
        while (isNameExpr < isNameExpr.isFieldAccessExpr) {
            ++isNameExpr;
            if (isNameExpr == isIntegerConstant) {
                /*isComment*/
                isNameExpr.isMethod(isIntegerConstant);
            }
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
