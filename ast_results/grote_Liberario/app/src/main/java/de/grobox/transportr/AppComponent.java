// isComment
package de.grobox.transportr;

import javax.inject.Singleton;
import dagger.Component;
import de.grobox.transportr.data.DbModule;
import de.grobox.transportr.favorites.locations.HomePickerDialogFragment;
import de.grobox.transportr.favorites.locations.WorkPickerDialogFragment;
import de.grobox.transportr.locations.LocationFragment;
import de.grobox.transportr.map.MapActivity;
import de.grobox.transportr.map.MapFragment;
import de.grobox.transportr.settings.SettingsFragment;
import de.grobox.transportr.trips.detail.TripDetailActivity;
import de.grobox.transportr.trips.detail.TripDetailFragment;
import de.grobox.transportr.trips.detail.TripMapFragment;
import de.grobox.transportr.trips.search.DirectionsActivity;
import de.grobox.transportr.trips.search.DirectionsFragment;
import de.grobox.transportr.trips.search.TripsFragment;

@Singleton
@Component(modules = { AppModule.class, DbModule.class })
public interface isClassOrIsInterface {

    void isMethod(TransportrActivity isParameter);

    void isMethod(MapActivity isParameter);

    void isMethod(DirectionsActivity isParameter);

    void isMethod(TripDetailActivity isParameter);

    void isMethod(MapFragment isParameter);

    void isMethod(LocationFragment isParameter);

    void isMethod(de.grobox.transportr.map.SavedSearchesFragment isParameter);

    void isMethod(de.grobox.transportr.trips.search.SavedSearchesFragment isParameter);

    void isMethod(DirectionsFragment isParameter);

    void isMethod(TripsFragment isParameter);

    void isMethod(TripMapFragment isParameter);

    void isMethod(TripDetailFragment isParameter);

    void isMethod(SettingsFragment isParameter);

    void isMethod(HomePickerDialogFragment isParameter);

    void isMethod(WorkPickerDialogFragment isParameter);
}
