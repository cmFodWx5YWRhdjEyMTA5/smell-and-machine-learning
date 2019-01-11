// isComment
package com.samebits.beacon.locator.injection.module;

import android.app.Application;
import android.content.Context;
import com.samebits.beacon.locator.action.ActionExecutor;
import com.samebits.beacon.locator.data.DataManager;
import org.altbeacon.beacon.BeaconManager;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    protected final Application isVariable;

    public isConstructor(Application isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Provides
    @Singleton
    Application isMethod() {
        return this.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    public Context isMethod() {
        return this.isFieldAccessExpr;
    }

    @Provides
    @Singleton
    DataManager isMethod() {
        return new DataManager(this.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    ActionExecutor isMethod() {
        return new ActionExecutor(this.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    public BeaconManager isMethod() {
        BeaconManager isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        return isNameExpr;
    }
}
