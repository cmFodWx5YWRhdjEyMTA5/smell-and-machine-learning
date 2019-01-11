// isComment
package org.totschnig.myexpenses.test.espresso;

import android.support.annotation.NonNull;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.BackupRestoreActivity;
import org.totschnig.myexpenses.activity.CsvImportActivity;
import org.totschnig.myexpenses.activity.GrisbiImport;
import org.totschnig.myexpenses.activity.ManageCategories;
import org.totschnig.myexpenses.activity.ManageCurrencies;
import org.totschnig.myexpenses.activity.ManageMethods;
import org.totschnig.myexpenses.activity.ManageParties;
import org.totschnig.myexpenses.activity.ManageSyncBackends;
import org.totschnig.myexpenses.activity.MyPreferenceActivity;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.activity.QifImport;
import org.totschnig.myexpenses.activity.RoadmapVoteActivity;
import org.totschnig.myexpenses.model.ContribFeature;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.instanceOf;

public class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public final IntentsTestRule<MyPreferenceActivity> isVariable = new IntentsTestRule<>(MyPreferenceActivity.class, true, true);

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(ManageCategories.class.isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(ManageParties.class.isMethod()));
    }

    @NonNull
    private Matcher<View> isMethod() {
        return isMethod(RecyclerView.class);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(ManageMethods.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(GrisbiImport.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))), isMethod()));
        isMethod(isMethod(QifImport.class.isMethod()));
    }

    @Test
    public void isMethod() throws InterruptedException {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))), isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(CsvImportActivity.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(BackupRestoreActivity.class.isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant")), isMethod()));
        isMethod(isMethod(BackupRestoreActivity.class.isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant")), isMethod()));
        isMethod(isMethod(BackupRestoreActivity.class.isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(ManageSyncBackends.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(RoadmapVoteActivity.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isMethod(isMethod(ManageCurrencies.class.isMethod()));
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
