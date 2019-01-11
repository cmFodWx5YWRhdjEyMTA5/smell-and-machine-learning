// isComment
package com.gimranov.zandy.app;

import android.app.Instrumentation;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.orchestrator.callback.OrchestratorCallback;
import android.support.test.orchestrator.listeners.OrchestrationRunListener;
import android.support.test.runner.AndroidJUnit4;
import com.gimranov.zandy.app.data.Database;
import com.gimranov.zandy.app.test.*;
import com.gimranov.zandy.app.test.BuildConfig;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface {

    @Rule
    public IntentsTestRule<MainActivity> isVariable = new IntentsTestRule<MainActivity>(MainActivity.class) {

        @Override
        protected void isMethod() {
            super.isMethod();
            SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
            isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod();
        }
    };

    @Before
    public void isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod();
    }

    @After
    public void isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Before
    @After
    public void isMethod() {
        Database isVariable = new Database(isMethod());
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod())));
    }
}
