// isComment
package com.samebits.beacon.locator.injection.component;

import com.samebits.beacon.locator.data.DataManager;
import com.samebits.beacon.locator.injection.UserScope;
import com.samebits.beacon.locator.injection.module.DataModule;
import dagger.Component;

@UserScope
@Component(dependencies = ApplicationComponent.class, modules = { DataModule.class })
public interface isClassOrIsInterface {

    void isMethod(DataManager isParameter);
}
