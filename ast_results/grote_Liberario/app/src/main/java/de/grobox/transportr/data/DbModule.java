// isComment
package de.grobox.transportr.data;

import androidx.room.Room;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import de.grobox.transportr.TransportrApplication;
import de.grobox.transportr.data.locations.LocationDao;
import de.grobox.transportr.data.searches.SearchesDao;

@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    Db isMethod(TransportrApplication isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(), Db.class, isNameExpr.isFieldAccessExpr).isMethod();
    }

    @Provides
    @Singleton
    LocationDao isMethod(Db isParameter) {
        return isNameExpr.isMethod();
    }

    @Provides
    @Singleton
    SearchesDao isMethod(Db isParameter) {
        return isNameExpr.isMethod();
    }
}
