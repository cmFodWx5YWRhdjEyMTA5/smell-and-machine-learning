// isComment
package de.grobox.transportr.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import de.grobox.transportr.data.locations.FavoriteLocation;
import de.grobox.transportr.data.locations.HomeLocation;
import de.grobox.transportr.data.locations.LocationDao;
import de.grobox.transportr.data.locations.WorkLocation;
import de.grobox.transportr.data.searches.SearchesDao;
import de.grobox.transportr.data.searches.StoredSearch;

@Database(version = isIntegerConstant, entities = { FavoriteLocation.class, HomeLocation.class, WorkLocation.class, StoredSearch.class })
@TypeConverters(Converters.class)
public abstract class isClassOrIsInterface extends RoomDatabase {

    public static final String isVariable = "isStringConstant";

    public abstract LocationDao isMethod();

    public abstract SearchesDao isMethod();
}
