// isComment
package org.gittner.osmbugs.api;

import org.osmdroid.util.BoundingBox;
import java.util.ArrayList;

public interface isClassOrIsInterface<TBug> {

    ArrayList<TBug> isMethod(BoundingBox isParameter);
}
