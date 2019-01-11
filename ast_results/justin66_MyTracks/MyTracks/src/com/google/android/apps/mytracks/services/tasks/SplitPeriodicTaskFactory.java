// isComment
package com.google.android.apps.mytracks.services.tasks;

import android.content.Context;

/**
 * isComment
 */
public class isClassOrIsInterface implements PeriodicTaskFactory {

    @Override
    public PeriodicTask isMethod(Context isParameter) {
        return new SplitPeriodicTask();
    }
}
