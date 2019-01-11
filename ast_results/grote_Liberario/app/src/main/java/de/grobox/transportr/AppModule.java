// isComment
package de.grobox.transportr;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import de.grobox.transportr.data.locations.LocationDao;
import de.grobox.transportr.data.locations.LocationRepository;
import de.grobox.transportr.data.searches.SearchesDao;
import de.grobox.transportr.data.searches.SearchesRepository;
import de.grobox.transportr.map.GpsController;
import de.grobox.transportr.networks.TransportNetworkManager;
import de.grobox.transportr.settings.SettingsManager;

@Module(includes = ViewModelModule.class)
class isClassOrIsInterface {

    private final TransportrApplication isVariable;

    isConstructor(TransportrApplication isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Provides
    TransportrApplication isMethod() {
        return isNameExpr;
    }

    @Provides
    @Singleton
    SettingsManager isMethod() {
        return new SettingsManager(isNameExpr.isMethod());
    }

    @Provides
    @Singleton
    TransportNetworkManager isMethod(SettingsManager isParameter) {
        return new TransportNetworkManager(isNameExpr);
    }

    @Provides
    @Singleton
    LocationRepository isMethod(LocationDao isParameter, TransportNetworkManager isParameter) {
        return new LocationRepository(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    SearchesRepository isMethod(SearchesDao isParameter, LocationDao isParameter, TransportNetworkManager isParameter) {
        return new SearchesRepository(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    GpsController isMethod() {
        return new GpsController(isNameExpr.isMethod());
    }
}
