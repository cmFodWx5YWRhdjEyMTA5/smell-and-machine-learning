// isComment
package com.github.rtyley.android.sherlock.roboguice.activity;

import roboguice.RoboGuice;
import roboguice.activity.event.OnActivityResultEvent;
import roboguice.activity.event.OnConfigurationChangedEvent;
import roboguice.activity.event.OnContentChangedEvent;
import roboguice.activity.event.OnCreateEvent;
import roboguice.activity.event.OnDestroyEvent;
import roboguice.activity.event.OnNewIntentEvent;
import roboguice.activity.event.OnPauseEvent;
import roboguice.activity.event.OnRestartEvent;
import roboguice.activity.event.OnResumeEvent;
import roboguice.activity.event.OnStartEvent;
import roboguice.activity.event.OnStopEvent;
import roboguice.event.EventManager;
import roboguice.inject.ContentViewListener;
import roboguice.inject.RoboInjector;
import roboguice.util.RoboContext;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockListActivity;
import com.google.inject.Inject;
import com.google.inject.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface extends SherlockListActivity implements RoboContext {

    protected EventManager isVariable;

    protected HashMap<Key<?>, Object> isVariable = new HashMap<Key<?>, Object>();

    @Inject
    ContentViewListener // isComment
    isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        final RoboInjector isVariable = isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(EventManager.class);
        isNameExpr.isMethod(this);
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(new OnCreateEvent(isNameExpr));
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(new OnRestartEvent());
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(new OnStartEvent());
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(new OnResumeEvent());
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(new OnPauseEvent());
    }

    @Override
    protected void isMethod(Intent isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(new OnNewIntentEvent());
    }

    @Override
    protected void isMethod() {
        try {
            isNameExpr.isMethod(new OnStopEvent());
        } finally {
            super.isMethod();
        }
    }

    @Override
    protected void isMethod() {
        try {
            isNameExpr.isMethod(new OnDestroyEvent());
        } finally {
            try {
                isNameExpr.isMethod(this);
            } finally {
                super.isMethod();
            }
        }
    }

    @Override
    public void isMethod(Configuration isParameter) {
        final Configuration isVariable = isMethod().isMethod();
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(new OnConfigurationChangedEvent(isNameExpr, isNameExpr));
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this).isMethod(this);
        isNameExpr.isMethod(new OnContentChangedEvent());
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(new OnActivityResultEvent(isNameExpr, isNameExpr, isNameExpr));
    }

    @Override
    public Map<Key<?>, Object> isMethod() {
        return isNameExpr;
    }
}
