// isComment
package com.veniosg.dir.test.actor.assertion;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.veniosg.dir.android.activity.SearchActivity;
import com.veniosg.dir.android.util.FileUtils;
import com.veniosg.dir.mvvm.model.FileHolder;
import java.io.File;
import static android.content.Intent.ACTION_SEARCH;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasType;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.core.AllOf.allOf;

public class isClassOrIsInterface {

    public void isMethod(File isParameter) {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isMethod(new FileHolder(isNameExpr, null, null))), isMethod(isMethod(String.class))));
    }

    public void isMethod(File isParameter) {
        isMethod(isMethod(isMethod(isNameExpr), isMethod(new ComponentName("isStringConstant", SearchActivity.class.isMethod())), isMethod(new Uri.Builder().isMethod(isNameExpr.isMethod()).isMethod())));
    }
}
