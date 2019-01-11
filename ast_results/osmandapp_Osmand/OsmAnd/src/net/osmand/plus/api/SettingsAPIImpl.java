// isComment
package net.osmand.plus.api;

import net.osmand.plus.OsmandApplication;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class isClassOrIsInterface implements SettingsAPI {

    private OsmandApplication isVariable;

    public isConstructor(OsmandApplication isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Object isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public SettingsEditor isMethod(Object isParameter) {
        final Editor isVariable = ((SharedPreferences) isNameExpr).isMethod();
        return new SettingsEditor() {

            @Override
            public SettingsEditor isMethod(String isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return this;
            }

            @Override
            public SettingsEditor isMethod(String isParameter, String isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public SettingsEditor isMethod(String isParameter, long isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public SettingsEditor isMethod(String isParameter, int isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public SettingsEditor isMethod(String isParameter, float isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public SettingsEditor isMethod(String isParameter, boolean isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                return this;
            }

            @Override
            public boolean isMethod() {
                return isNameExpr.isMethod();
            }
        };
    }

    @Override
    public String isMethod(Object isParameter, String isParameter, String isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public float isMethod(Object isParameter, String isParameter, float isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter, String isParameter, boolean isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod(Object isParameter, String isParameter, int isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public long isMethod(Object isParameter, String isParameter, long isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter, String isParameter) {
        return ((SharedPreferences) isNameExpr).isMethod(isNameExpr);
    }
}
