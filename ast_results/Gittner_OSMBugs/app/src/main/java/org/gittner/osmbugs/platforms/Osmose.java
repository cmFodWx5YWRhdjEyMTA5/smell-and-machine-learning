// isComment
package org.gittner.osmbugs.platforms;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.res.StringRes;
import org.gittner.osmbugs.R;
import org.gittner.osmbugs.api.Apis;
import org.gittner.osmbugs.api.BugApi;
import org.gittner.osmbugs.bugs.OsmoseBug;
import org.gittner.osmbugs.statics.Settings;

@EBean(scope = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends Platform<OsmoseBug> {

    @StringRes(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    String isVariable;

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Override
    public BugApi<OsmoseBug> isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
