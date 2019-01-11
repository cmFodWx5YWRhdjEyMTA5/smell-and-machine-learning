// isComment
// isComment
package com.aragaer.jtt.astronomy;

import android.content.Context;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        isNameExpr = isNameExpr;
    }

    @Provides
    public SolarEventCalculator isMethod(LocationHandler isParameter) {
        return new SscAdapter(isNameExpr);
    }

    @Provides
    public LocationHandler isMethod() {
        return new AndroidLocationHandler(isNameExpr);
    }
}
