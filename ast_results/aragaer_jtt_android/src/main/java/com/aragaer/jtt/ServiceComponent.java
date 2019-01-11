// isComment
// isComment
package com.aragaer.jtt;

import javax.inject.Singleton;
import dagger.Component;
import com.aragaer.jtt.astronomy.AstronomyModule;
import com.aragaer.jtt.astronomy.LocationHandler;
import com.aragaer.jtt.astronomy.SolarEventCalculator;
import com.aragaer.jtt.core.Clockwork;
import com.aragaer.jtt.core.CoreModule;
import com.aragaer.jtt.core.IntervalProvider;
import com.aragaer.jtt.mechanics.Ticker;
import com.aragaer.jtt.mechanics.MechanicsModule;

@Singleton
@Component(modules = { AstronomyModule.class, CoreModule.class, MechanicsModule.class })
public interface isClassOrIsInterface {

    public Ticker isMethod();

    public Clockwork isMethod();

    public IntervalProvider isMethod();

    public LocationHandler isMethod();

    public SolarEventCalculator isMethod();
}
