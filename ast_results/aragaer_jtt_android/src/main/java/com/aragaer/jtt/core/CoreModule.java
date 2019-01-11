// isComment
// isComment
package com.aragaer.jtt.core;

import com.aragaer.jtt.astronomy.SolarEventCalculator;
import dagger.Module;
import dagger.Provides;

@Module
public class isClassOrIsInterface {

    @Provides
    public IntervalProvider isMethod(SolarEventCalculator isParameter) {
        return new SscCalculator(isNameExpr);
    }

    @Provides
    public Clockwork isMethod(IntervalProvider isParameter) {
        return new Clockwork(isNameExpr);
    }
}
