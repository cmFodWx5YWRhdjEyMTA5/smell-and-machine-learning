// isComment
package net.osmand.plus.resources;

import java.util.List;
import net.osmand.Location;
import net.osmand.ResultMatcher;
import net.osmand.binary.BinaryMapIndexReader.SearchPoiTypeFilter;
import net.osmand.data.Amenity;

public interface isClassOrIsInterface {

    public void isMethod();

    public boolean isMethod(double isParameter, double isParameter);

    public boolean isMethod(int isParameter, int isParameter, int isParameter, int isParameter);

    /**
     * isComment
     */
    List<Amenity> isMethod(int isParameter, int isParameter, int isParameter, int isParameter, int isParameter, SearchPoiTypeFilter isParameter, ResultMatcher<Amenity> isParameter);

    List<Amenity> isMethod(List<Location> isParameter, double isParameter, SearchPoiTypeFilter isParameter, ResultMatcher<Amenity> isParameter);
}
