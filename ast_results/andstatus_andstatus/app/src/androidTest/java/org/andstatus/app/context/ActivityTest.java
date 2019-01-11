// isComment
package org.andstatus.app.context;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.apache.geode.test.junit.ConditionalIgnore;
import org.apache.geode.test.junit.rules.ConditionalIgnoreRule;
import org.junit.Rule;

/**
 * isComment
 */
@ConditionalIgnore(condition = NoScreenSupport.class)
public abstract class isClassOrIsInterface<T extends Activity> {

    @Rule
    public ConditionalIgnoreRule isVariable = new ConditionalIgnoreRule();

    @Rule
    public ActivityTestRule<T> isVariable = new ActivityTestRule<T>(isMethod()) {

        @Override
        protected Intent isMethod() {
            return isNameExpr.this.isMethod();
        }
    };

    protected abstract Class<T> isMethod();

    protected Intent isMethod() {
        return null;
    }

    protected T isMethod() {
        return isNameExpr.isMethod();
    }

    protected Instrumentation isMethod() {
        return isNameExpr.isMethod();
    }
}
