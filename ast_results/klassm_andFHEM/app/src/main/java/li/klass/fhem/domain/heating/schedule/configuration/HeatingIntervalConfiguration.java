// isComment
package li.klass.fhem.domain.heating.schedule.configuration;

import li.klass.fhem.domain.heating.schedule.interval.BaseHeatingInterval;

public interface isClassOrIsInterface<INTERVAL extends BaseHeatingInterval<INTERVAL>> {

    INTERVAL isMethod();

    int isMethod();

    HeatingConfiguration.NumberOfIntervalsType isMethod();
}
