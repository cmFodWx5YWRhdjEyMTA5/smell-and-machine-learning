// isComment
package com.vrem.wifianalyzer;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static com.vrem.wifianalyzer.InstrumentedUtils.pauseShort;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void isMethod() {
        isMethod();
        new Navigation().isMethod();
        isMethod();
    }

    @Test
    public void isMethod() {
        isMethod();
        new Scanner().isMethod();
        isMethod();
    }

    @Test
    public void isMethod() {
        isMethod();
        new Filter().isMethod();
        isMethod();
    }
}
