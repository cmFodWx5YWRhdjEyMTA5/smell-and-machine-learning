// isComment
// isComment
package com.aragaer.jtt.mechanics;

import javax.inject.Singleton;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import com.aragaer.jtt.core.Clockwork;
import com.aragaer.jtt.core.IntervalProvider;

@Module
public class isClassOrIsInterface {

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        isNameExpr = isNameExpr;
    }

    @Singleton
    @Provides
    public Ticker isMethod(Clockwork isParameter, Announcer isParameter) {
        return new AndroidTicker(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    public Announcer isMethod(IntervalProvider isParameter) {
        return new AndroidAnnouncer(isNameExpr, isNameExpr);
    }
}
