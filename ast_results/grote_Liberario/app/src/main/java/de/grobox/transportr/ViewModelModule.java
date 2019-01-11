// isComment
package de.grobox.transportr;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import de.grobox.transportr.map.MapViewModel;
import de.grobox.transportr.trips.detail.TripDetailViewModel;
import de.grobox.transportr.trips.search.DirectionsViewModel;

@Module
public abstract class isClassOrIsInterface {

    @Binds
    @IntoMap
    @ViewModelKey(MapViewModel.class)
    abstract ViewModel isMethod(MapViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(DirectionsViewModel.class)
    abstract ViewModel isMethod(DirectionsViewModel isParameter);

    @Binds
    @IntoMap
    @ViewModelKey(TripDetailViewModel.class)
    abstract ViewModel isMethod(TripDetailViewModel isParameter);

    @Binds
    abstract ViewModelProvider.Factory isMethod(ViewModelFactory isParameter);
}
