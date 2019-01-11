// isComment
package org.mozilla.osmdroid;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public interface isClassOrIsInterface {

    String isMethod(string isParameter);

    /**
     * isComment
     */
    String isMethod(string isParameter, Object... isParameter);

    Bitmap isMethod(bitmap isParameter);

    /**
     * isComment
     */
    Drawable isMethod(bitmap isParameter);

    /**
     * isComment
     */
    float isMethod();

    public static enum string {

        // isComment
        mapnik,
        cyclemap,
        public_transport,
        cloudmade_small,
        cloudmade_standard,
        mapquest_osm,
        mapquest_aerial,
        bing,
        mapbox,
        // isComment
        fiets_nl,
        base_nl,
        roads_nl,
        // isComment
        unknown,
        format_distance_meters,
        format_distance_kilometers,
        format_distance_miles,
        format_distance_nautical_miles,
        format_distance_feet,
        online_mode,
        offline_mode,
        my_location,
        compass,
        map_mode
    }

    public static enum bitmap {

        /**
         * isComment
         */
        unknown,
        center,
        direction_arrow,
        marker_default,
        marker_default_focused_base,
        navto_small,
        next,
        previous,
        person,
        /**
         * isComment
         */
        ic_menu_offline,
        ic_menu_mylocation,
        ic_menu_compass,
        ic_menu_mapmode
    }
}
