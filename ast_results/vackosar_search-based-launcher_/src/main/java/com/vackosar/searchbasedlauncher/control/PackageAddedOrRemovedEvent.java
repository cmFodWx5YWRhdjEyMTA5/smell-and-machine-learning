// isComment
package com.vackosar.searchbasedlauncher.control;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.inject.Inject;
import roboguice.context.event.OnCreateEvent;
import roboguice.context.event.OnDestroyEvent;
import roboguice.event.EventManager;
import roboguice.event.Observes;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface {

    @Inject
    private EventManager isVariable;

    @Inject
    private Activity isVariable;

    private BroadcastReceiver isVariable;

    private IntentFilter isMethod() {
        IntentFilter isVariable = new IntentFilter();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }

    private BroadcastReceiver isMethod() {
        return new BroadcastReceiver() {

            @Override
            public void isMethod(Context isParameter, Intent isParameter) {
                isNameExpr.isMethod(new PackageAddedOrRemovedEvent());
            }
        };
    }

    public void isMethod(@Observes OnCreateEvent isParameter) {
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr, isMethod());
    }

    public void isMethod(@Observes OnDestroyEvent isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
