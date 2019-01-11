// isComment
package org.flyve.inventory.agent;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;
import android.widget.ListView;
import org.flyve.inventory.agent.core.home.Home;
import org.flyve.inventory.agent.core.home.HomeModel;
import org.flyve.inventory.agent.core.home.HomeSchema;
import org.flyve.inventory.agent.ui.ActivityMain;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<ActivityMain> isVariable = new ActivityTestRule<>(ActivityMain.class);

    @Test
    public void isMethod() {
        Home.Presenter isVariable = isMethod(Home.Presenter.class);
        HomeModel isVariable = new HomeModel(isNameExpr);
        ListView isVariable = isMethod(ListView.class);
        Activity isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        Home.Presenter isVariable = isMethod(Home.Presenter.class);
        HomeModel isVariable = new HomeModel(isNameExpr);
        KeyEvent isVariable = new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        Activity isVariable = isNameExpr.isMethod();
        HomeSchema isVariable = new HomeSchema("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
