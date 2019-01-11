// isComment
package com.samebits.beacon.locator.injection.component;

import android.app.Application;
import com.samebits.beacon.locator.action.ActionExecutor;
import com.samebits.beacon.locator.data.DataManager;
import com.samebits.beacon.locator.injection.module.ApplicationModule;
import org.altbeacon.beacon.BeaconManager;
import javax.inject.Singleton;
import dagger.Component;

/**
 * isComment
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface isClassOrIsInterface {

    Application isMethod();

    DataManager isMethod();

    BeaconManager isMethod();

    ActionExecutor isMethod();
}
