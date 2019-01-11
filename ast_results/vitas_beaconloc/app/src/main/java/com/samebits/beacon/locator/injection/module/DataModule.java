// isComment
package com.samebits.beacon.locator.injection.module;

import android.content.Context;
import com.samebits.beacon.locator.data.DbStoreService;
import com.samebits.beacon.locator.data.StoreService;
import com.samebits.beacon.locator.injection.UserScope;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    private Context isVariable;

    public isConstructor(Context isParameter) {
        isNameExpr = isNameExpr;
    }

    @Provides
    @UserScope
    StoreService isMethod() {
        return new DbStoreService(isNameExpr);
    }
}
