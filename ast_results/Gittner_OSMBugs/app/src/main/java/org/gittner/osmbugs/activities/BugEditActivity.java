// isComment
package org.gittner.osmbugs.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;
import org.gittner.osmbugs.Helpers.GeoIntentStarter;
import org.gittner.osmbugs.R;
import org.gittner.osmbugs.bugs.Bug;
import org.gittner.osmbugs.bugs.KeeprightBug;
import org.gittner.osmbugs.bugs.MapdustBug;
import org.gittner.osmbugs.bugs.OsmNote;
import org.gittner.osmbugs.bugs.OsmoseBug;
import org.gittner.osmbugs.fragments.KeeprightEditFragment_;
import org.gittner.osmbugs.fragments.MapdustEditFragment_;
import org.gittner.osmbugs.fragments.OsmNoteEditFragment_;
import org.gittner.osmbugs.fragments.OsmoseEditFragment_;
import org.gittner.osmbugs.platforms.Platforms;

@EActivity(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@OptionsMenu(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends AppCompatActivity {

    public static final String isVariable = "isStringConstant";

    @Extra(isNameExpr)
    Bug isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    Toolbar isVariable;

    @AfterViews
    void isMethod() {
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        Fragment isVariable = null;
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod().isMethod((KeeprightBug) isNameExpr).isMethod();
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod().isMethod((OsmoseBug) isNameExpr).isMethod();
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod().isMethod((MapdustBug) isNameExpr).isMethod();
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod().isMethod((OsmNote) isNameExpr).isMethod();
        }
        isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
    }

    @OptionsItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isNameExpr.isMethod(this, isNameExpr.isMethod());
    }

    @OptionsItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isMethod(isNameExpr);
        isMethod();
    }
}
