// isComment
package de.grobox.transportr;

import javax.inject.Singleton;
import dagger.Component;
import de.grobox.transportr.data.TestDbModule;
import de.grobox.transportr.map.MapActivityTest;
import de.grobox.transportr.networks.PickTransportNetworkActivityTest;
import de.grobox.transportr.trips.TripsTest;

@Singleton
@Component(modules = { TestModule.class, TestDbModule.class })
public interface isClassOrIsInterface extends AppComponent {

    void isMethod(PickTransportNetworkActivityTest isParameter);

    void isMethod(MapActivityTest isParameter);

    void isMethod(TripsTest isParameter);
}
