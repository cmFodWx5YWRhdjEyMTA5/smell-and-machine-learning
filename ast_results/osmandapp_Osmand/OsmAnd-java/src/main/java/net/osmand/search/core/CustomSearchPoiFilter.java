// isComment
package net.osmand.search.core;

import net.osmand.ResultMatcher;
import net.osmand.binary.BinaryMapIndexReader.SearchPoiTypeFilter;
import net.osmand.data.Amenity;

public interface isClassOrIsInterface extends SearchPoiTypeFilter {

    public String isMethod();

    public Object isMethod();

    public ResultMatcher<Amenity> isMethod(final ResultMatcher<Amenity> isParameter);
}
