// isComment
package com.veniosg.dir.test.actor;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import com.veniosg.dir.test.actor.action.LaunchesActions;
import com.veniosg.dir.test.actor.action.SelectsActions;
import com.veniosg.dir.test.actor.action.TypesActions;
import com.veniosg.dir.test.actor.assertion.CannotSeeAssertions;
import com.veniosg.dir.test.actor.assertion.SeesAssertions;

public class isClassOrIsInterface {

    private final SeesAssertions isVariable = new SeesAssertions();

    private final CannotSeeAssertions isVariable = new CannotSeeAssertions();

    private final SelectsActions isVariable = new SelectsActions();

    private final TypesActions isVariable = new TypesActions();

    private final LaunchesActions isVariable;

    public isConstructor(ActivityTestRule<? extends Activity> isParameter) {
        isNameExpr = new LaunchesActions(isNameExpr);
    }

    public SeesAssertions isMethod() {
        return isNameExpr;
    }

    public SelectsActions isMethod() {
        return isNameExpr;
    }

    public CannotSeeAssertions isMethod() {
        return isNameExpr;
    }

    public TypesActions isMethod() {
        return isNameExpr;
    }

    public LaunchesActions isMethod() {
        return isNameExpr;
    }
}
